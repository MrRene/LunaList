// @SOURCE:/Users/rene/Documents/workspace/LunaList/conf/routes
// @HASH:0a47ec82bbe4d03c8c67801d662f042b1099ff37
// @DATE:Thu Dec 04 15:37:10 CET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:11
class ReverseAssets {
    

// @LINE:11
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:8
// @LINE:7
class ReverseEmployees {
    

// @LINE:7
def showEmployees(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "employees")
}
                                                

// @LINE:8
def showEmployee(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "employees/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:11
class ReverseAssets {
    

// @LINE:11
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:8
// @LINE:7
class ReverseEmployees {
    

// @LINE:7
def showEmployees : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Employees.showEmployees",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employees"})
      }
   """
)
                        

// @LINE:8
def showEmployee : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Employees.showEmployee",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employees/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:11
class ReverseAssets {
    

// @LINE:11
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:8
// @LINE:7
class ReverseEmployees {
    

// @LINE:7
def showEmployees(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Employees.showEmployees(), HandlerDef(this, "controllers.Employees", "showEmployees", Seq(), "GET", """""", _prefix + """employees""")
)
                      

// @LINE:8
def showEmployee(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Employees.showEmployee(id), HandlerDef(this, "controllers.Employees", "showEmployee", Seq(classOf[Int]), "GET", """""", _prefix + """employees/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    