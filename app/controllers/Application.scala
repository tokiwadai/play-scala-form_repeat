package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc._
import views._

@Singleton
class Application @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(html.index())
  }
}