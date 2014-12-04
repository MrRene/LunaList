package controllers

import models.Employee
import play.api.mvc._

object Employees extends Controller {

  def employees = Action { implicit request =>

    val employees = Employee.findAll

      Ok(views.html.employees(employees))
  }

}