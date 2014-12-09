package controllers

import models.Employee
import play.api.mvc._

object Employees extends Controller {

  def showEmployees = Action { implicit request =>

    val employees = Employee.findAll

    Ok(views.html.employees(employees))
  }

  def showEmployee(id: Int) = Action { implicit request =>

    Employee.findById(id).map { employee =>
      Ok(views.html.profile(employee))
    }.getOrElse(NotFound)
  }

  def editEmployee = Action {
    Ok("editEmployee")
  }
}