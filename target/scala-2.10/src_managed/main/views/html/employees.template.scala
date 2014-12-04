
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
    <div class="container">
        <h1>Employees</h1>
        <table class="table table-striped table-condensed col-xs-6">
            <tr>
                <th class="col-xs-2">Name</th>
                <th class="col-xs-2">Email</th>
                <th class="col-xs-1">Twitter Handle</th>
            </tr>
            """),_display_(Seq[Any](/*12.14*/for(employee <- employees) yield /*12.40*/ {_display_(Seq[Any](format.raw/*12.42*/("""
                <tr>
                    <td class="col-xs-2"><a href=employees/"""),_display_(Seq[Any](/*14.61*/employee/*14.69*/.id)),format.raw/*14.72*/(""">"""),_display_(Seq[Any](/*14.74*/employee/*14.82*/.name)),format.raw/*14.87*/("""</a></td>
                    <td class="col-xs-2">"""),_display_(Seq[Any](/*15.43*/employee/*15.51*/.email)),format.raw/*15.57*/("""</td>
                    <td class="col-xs-1">"""),_display_(Seq[Any](/*16.43*/employee/*16.51*/.twitterHandle)),format.raw/*16.65*/("""</td>
                </tr>
            """)))})),format.raw/*18.14*/("""
        </table>
    </div>
""")))})),format.raw/*21.2*/("""
"""))}
    }
    
    def render(employees:List[Employee]): play.api.templates.HtmlFormat.Appendable = apply(employees)
    
    def f:((List[Employee]) => play.api.templates.HtmlFormat.Appendable) = (employees) => apply(employees)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 04 16:04:39 CET 2014
                    SOURCE: /Users/rene/Documents/workspace/LunaList/app/views/employees.scala.html
                    HASH: b40a1c6eec21a6accf1f0e25ba847f1019ccfc34
                    MATRIX: 568->1|689->28|726->31|751->48|790->50|1151->375|1193->401|1233->403|1351->485|1368->493|1393->496|1431->498|1448->506|1475->511|1563->563|1580->571|1608->577|1692->625|1709->633|1745->647|1818->688|1879->718
                    LINES: 19->1|22->1|24->3|24->3|24->3|33->12|33->12|33->12|35->14|35->14|35->14|35->14|35->14|35->14|36->15|36->15|36->15|37->16|37->16|37->16|39->18|42->21
                    -- GENERATED --
                */
            