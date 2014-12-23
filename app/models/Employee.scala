package models

case class Employee(id: Int, name: String, email: String, twitterHandle: Option[String])

object Employee {

    var employees = Set(
      Employee(1,"Rene van der Horst","rene.van.der.horst@lunatech.com",None),
      Employee(2,"Sander Ufkes","sander.ufkes@lunatech.com",None),
      Employee(3,"Thomas Meijer","thomas.meijer@lunatech.com",Some("@TM")),
      Employee(4,"Erik Bakker","erik.bakker@lunatech.com",Some("@EB")),
      Employee(5,"Wolfert de Kraker","wolfert.de.kraker@lunatech.com",Some("@WdK")),
      Employee(6,"Nicolas Leroux","nicolas.leroux@lunatech.com",Some("@LR"))
    )

  def findAll = employees.toList.sortBy(_.id)
  def findById(id: Int) = employees.find(_.id == id)
  def removeById(id: Int) { employees --= findById(id) }
  def update(id: Int) { employees ++= findById(id) }
  def add(employee: Employee) { employees += employee }
}
