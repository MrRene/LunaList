
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
        <title>LunaList | """),_display_(Seq[Any](/*6.28*/pageName)),format.raw/*6.36*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.54*/routes/*7.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*7.103*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">
        <script src=""""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*10.74*/("""" type="text/javascript"></script>
    </head>
    <body>
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
        """),_display_(Seq[Any](/*26.10*/content)),format.raw/*26.17*/("""
        <div class="footer">
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
                    DATE: Thu Dec 04 15:05:19 CET 2014
                    SOURCE: /Users/rene/Documents/workspace/LunaList/app/views/main.scala.html
                    HASH: bf17f8ee182877c81c8343e56465df5f8fb91cfd
                    MATRIX: 560->1|687->34|785->97|814->105|911->167|925->173|990->216|1081->272|1095->278|1150->312|1246->373|1260->379|1313->411|1374->436|1389->442|1456->487|2094->1089|2123->1096
                    LINES: 19->1|22->1|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|47->26|47->26
                    -- GENERATED --
                */
            