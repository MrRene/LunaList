
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(pageName: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.35*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>LunaList | """),_display_(Seq[Any](/*7.28*/pageName)),format.raw/*7.36*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*9.103*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        <div class="container">
            <nav class="navbar navbar-default" role="navigation">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="http://www.lunatech.com">
                            <img alt="LT" src="...">
                        </a>
                    </div>
                    <ul class="nav navbar-nav">
                        <li><a href="/">Home</a></li>
                        <li><a href="/employees">Employees</a></li>
                    </ul>
                </div>
            </nav>
            """),_display_(Seq[Any](/*28.14*/content)),format.raw/*28.21*/("""
        </div>
    </body>
</html>
"""))}
    }
    
    def render(pageName:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(pageName)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (pageName) => (content) => apply(pageName)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 04 14:20:12 CET 2014
                    SOURCE: /Users/rene/Documents/workspace/LunaList/app/views/main.scala.html
                    HASH: d082952cf638820d67109af08c413bde94b85827
                    MATRIX: 560->1|687->34|786->98|815->106|912->168|926->174|981->208|1072->264|1086->270|1151->313|1248->374|1263->380|1317->412|1378->437|1393->443|1460->488|2186->1178|2215->1185
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|49->28|49->28
                    -- GENERATED --
                */
            