
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
object profile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Employee,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(employee: Employee):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.22*/("""

"""),_display_(Seq[Any](/*3.2*/main("profile")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
        <div class="container">
            <div class="row row-centered">
                <table class="table-striped table-condensed col-xs-4 col-centered">
                    <tr>
                        <td>name:</td>
                        <td>"""),_display_(Seq[Any](/*9.30*/employee/*9.38*/.name)),format.raw/*9.43*/("""</td>
                    </tr>
                    <tr>
                        <td>email:</td>
                        <td>"""),_display_(Seq[Any](/*13.30*/employee/*13.38*/.email)),format.raw/*13.44*/("""</td>
                    </tr>
                    <tr>
                        <td>twitter handle:</td>
                        <td>"""),_display_(Seq[Any](/*17.30*/employee/*17.38*/.twitterHandle)),format.raw/*17.52*/("""</td>
                    </tr>
                </table>
            </div>
            <div class="row">
                <br>
                <a href="/employees" type="button" class="btn btn-default">back</a>
            </div>
        </div>
""")))})),format.raw/*26.2*/("""
"""))}
    }
    
    def render(employee:Employee): play.api.templates.HtmlFormat.Appendable = apply(employee)
    
    def f:((Employee) => play.api.templates.HtmlFormat.Appendable) = (employee) => apply(employee)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 04 16:08:09 CET 2014
                    SOURCE: /Users/rene/Documents/workspace/LunaList/app/views/profile.scala.html
                    HASH: 7d4ebc3e9c6293133de8cb3326119d65b6674d72
                    MATRIX: 560->1|674->21|711->24|734->39|773->41|1061->294|1077->302|1103->307|1265->433|1282->441|1310->447|1481->582|1498->590|1534->604|1811->850
                    LINES: 19->1|22->1|24->3|24->3|24->3|30->9|30->9|30->9|34->13|34->13|34->13|38->17|38->17|38->17|47->26
                    -- GENERATED --
                */
            