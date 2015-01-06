package controllers

import play.api.i18n.Messages
import play.api.mvc._
import play.api.mvc.Flash
import play.api.data.Form
import play.api.data.Forms.{mapping, number, text, optional}
import models.Employee

object Employees extends Controller {

  private val employeeForm: Form[Employee] = Form(
    mapping(
      "id" -> number.verifying("validation.id.duplicate", Employee.findById(_).isEmpty),
      "name" -> text,
      "email" -> text,
      "twitterHandle" -> optional(text)
    ) (Employee.apply)(Employee.unapply)
  )

  /**
   * CREATE
   */
  def createEmployee = Action { implicit request =>
    employeeForm.bindFromRequest.fold(
      formWithErrors => Redirect(routes.Employees.showEmployees).flashing(Flash(Map("error" -> "Form submission was invalid."))),
      validatedForm => {
        val newEmployee = models.Employee(validatedForm.id,validatedForm.name, validatedForm.email, validatedForm.twitterHandle)
        Employee.create(newEmployee)
        Redirect(routes.Employees.showEmployees).flashing(Flash(Map("success" -> "The list has been updated."))) }
    )
  }

  def addEmployee() = Action { implicit request =>
    Ok(views.html.createEmployeeForm(employeeForm))
  }

  /**
   * READ
   */
  def showEmployees = Action { implicit request =>
    val employees = Employee.findAll

    Ok(views.html.employees(employees))
  }

  def showEmployee(id: Int) = Action { implicit request =>
    Employee.findById(id).map { employee =>
      Ok(views.html.profile(employee))
    }.getOrElse(NotFound)
  }

  /**
   * UPDATE
   */
  def editEmployee(id: Int) = Action { implicit request =>
    Employee.findById(id).map { employee =>
      Ok(views.html.editEmployeeForm(employeeForm))
    }.getOrElse(NotFound)
  }
/*
  def edit(id: Long) = Action {
    Computer.findById(id).map { computer =>
      Ok(html.editForm(id, computerForm.fill(computer)))
    }.getOrElse(NotFound)
  }
  */

  /**
   * DELETE
   */
  def removeEmployee() = Action { implicit request =>
    Ok("Remove")
  }
}
