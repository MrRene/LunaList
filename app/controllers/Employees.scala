package controllers

import play.api.mvc._
import play.api.mvc.Flash
import play.api.data._
import play.api.data.Forms._
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

  def editEmployee = Action { implicit request =>
    val newEmployeeForm = employeeForm.bindFromRequest()

    /*
    newEmployeeForm.fold(

      hasErrors = { form =>
        Redirect(routes.Employees.editEmployee)
      }

    )
    */
    Ok("editEmployee")
  }
}
