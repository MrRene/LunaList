package models

case class Employee(id: Int, name: String, email: String, twitterHandle: String)

object Employee {

    var employees = Set(
      Employee(1,"Rene van der Horst","rene.van.der.horst@lunatech.com","None"),
      Employee(2,"Sander Ufkes","sander.ufkes@lunatech.com","None"),
      Employee(3,"Thomas Meijer","thomas.meijer@lunatech.com","@TM"),
      Employee(4,"Erik Bakker","erik.bakker@lunatech.com","@EB"),
      Employee(5,"Wolfert de Kraker","wolfert.de.kraker@lunatech.com","@WdK"),
      Employee(6,"Nicolas Leroux","nicolas.leroux@lunatech.com","@LR")
    )

  def findAll = employees.toList.sortBy(_.id)
}
