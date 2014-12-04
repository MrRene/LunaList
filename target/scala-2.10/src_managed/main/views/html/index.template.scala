
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""

"""),_display_(Seq[Any](/*3.2*/main("Index")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
<h1>Home</h1>
        <p>This little app lists our twitter handles. Click "Employees" to view.</p>
""")))})),format.raw/*6.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 04 14:20:11 CET 2014
                    SOURCE: /Users/rene/Documents/workspace/LunaList/app/views/index.scala.html
                    HASH: 8c120d5817846dcf7931e97c6006d1e9943ff1cd
                    MATRIX: 549->1|644->3|681->6|702->19|741->21|872->122
                    LINES: 19->1|22->1|24->3|24->3|24->3|27->6
                    -- GENERATED --
                */
            