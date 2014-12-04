
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
        <div class="container">
            <h1>Home</h1>
            <p>This little app lists our twitter handles. Click "Employees" to view.</p>
        </div>
""")))})),format.raw/*8.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 04 14:53:44 CET 2014
                    SOURCE: /Users/rene/Documents/workspace/LunaList/app/views/index.scala.html
                    HASH: 6c249e0b9820587a9dc1c9fa1ae857aca30a12b2
                    MATRIX: 549->1|644->3|681->6|702->19|741->21|935->185
                    LINES: 19->1|22->1|24->3|24->3|24->3|29->8
                    -- GENERATED --
                */
            