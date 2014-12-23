package controllers

import play.api.mvc._
import play.api.mvc.Flash

object Application extends Controller {

  val test = Flash(Map("1" -> "success"))
  def index = Action { implicit request =>
    Ok(views.html.index(test))
  }
}
