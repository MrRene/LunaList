
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
object employees extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Employee],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(employees: List[Employee]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.29*/("""

"""),_display_(Seq[Any](/*3.2*/main("Employees")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
    <h1>Employees</h1>
    <table class="table table-striped table-condensed col-xs-6">
        <tr>
            <th class="col-xs-2">Name</th>
            <th class="col-xs-2">Email</th>
            <th class="col-xs-1">Twitter Handle</th>
        </tr>
        """),_display_(Seq[Any](/*11.10*/for(employee <- employees) yield /*11.36*/ {_display_(Seq[Any](format.raw/*11.38*/("""
            <tr>
                <td class="col-xs-2">"""),_display_(Seq[Any](/*13.39*/employee/*13.47*/.name)),format.raw/*13.52*/("""</td>
                <td class="col-xs-2">"""),_display_(Seq[Any](/*14.39*/employee/*14.47*/.email)),format.raw/*14.53*/("""</td>
                <td class="col-xs-1">"""),_display_(Seq[Any](/*15.39*/employee/*15.47*/.twitterHandle)),format.raw/*15.61*/("""</td>
            </tr>
        """)))})),format.raw/*17.10*/("""
    </table>
""")))})),format.raw/*19.2*/("""
"""))}
    }
    
    def render(employees:List[Employee]): play.api.templates.HtmlFormat.Appendable = apply(employees)
    
    def f:((List[Employee]) => play.api.templates.HtmlFormat.Appendable) = (employees) => apply(employees)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 04 14:20:11 CET 2014
                    SOURCE: /Users/rene/Documents/workspace/LunaList/app/views/employees.scala.html
                    HASH: afcb47819ae96d14f4210fd055d152f5f2b2b848
                    MATRIX: 568->1|689->28|726->31|751->48|790->50|1091->315|1133->341|1173->343|1265->399|1282->407|1309->412|1389->456|1406->464|1434->470|1514->514|1531->522|1567->536|1632->569|1678->584
                    LINES: 19->1|22->1|24->3|24->3|24->3|32->11|32->11|32->11|34->13|34->13|34->13|35->14|35->14|35->14|36->15|36->15|36->15|38->17|40->19
                    -- GENERATED --
                */
            