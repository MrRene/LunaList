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

  def showEmployees = Action { implicit request =>

    val employees = Employee.findAll

    Ok(views.html.employees(employees))
  }

  def showEmployee(id: Int) = Action { implicit request =>

    Employee.findById(id).map { employee =>
      Ok(views.html.profile(employee))
    }.getOrElse(NotFound)
  }

  def saveEmployee = Action { implicit request =>
    employeeForm.bindFromRequest.fold(
      formWithErrors => Redirect(routes.Employees.showEmployees).flashing(Flash(Map("error" -> "Try again"))),
      validatedForm => {
        val newEmployee = models.Employee(validatedForm.id,validatedForm.name, validatedForm.email, validatedForm.twitterHandle)
        Employee.add(newEmployee)
        Redirect(routes.Employees.showEmployees).flashing(Flash(Map("success" -> "updated"))) }
    )
  }

  def addEmployee = Action { implicit request =>
    Ok(views.html.employeeForm(employeeForm))
  }

  def removeEmployee = Action { implicit request =>
    Ok("Remove")
  }

  def editEmployee = Action { implicit request =>
    Ok(views.html.employeeForm(employeeForm))
  }
/*
  def newEmployee = Action { implicit request =>
    val employeeForm = if (flash.get("error").isDefined)
      employeeForm.bind(flash.data)
    else
      employeeForm

    Ok(views.html.employeeForm)
  }
 */
}
