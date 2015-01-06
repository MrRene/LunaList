/**
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this project except in compliance with
 *  the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0.
 *
 */

package controllers

import play.api.mvc._

object Application extends Controller {

  def index = Action { implicit request =>
    Ok(views.html.index())
  }
}
