/*Given below data in a List
Question: Find two successive email from the same person on the list.
Take tom@gmail.com and tom@yahoo.com  as the same person.
Hint : use below case classed to construct object:
  case class Message(id:AnyRef,message:String)
  case class Email(emailId:String,domain:String)
Use recursion and pattern matching

val listOfMessages = List(
      List("abc@yahoo.com","Hi I am here"),
      List("tom@gmail.com","Message Text 2"),
      List("harry@gmail.com","Message Text 4"),
      List("7868797979","Message Text 5"),
      List("tom@yahoo.com","Message Tet 6"),
      List("lisa@rediff.com","Message Text 3"),
      List("lisa@yahoo.com","Message Text 7"),
      List("6876868786","Message Text 9"),
      List("abc@yahoo.com","Message Text 10"),
      List("abc@yahoo.com","Message Text 11")
    )
*/



package lectures.part1Basics.excercises_train

import sun.rmi.rmic.iiop.IDLNames

object succesiveEmail  {

  case class Email(emailId: String, domain: String)

  case class Message(id: AnyRef, text: String)

  def main(args: Array[String]): Unit = {
    val listOfMessages = List(
      List("abc@yahoo.com", "Hi I am here"),
      List("tom@gmail.com", "Message Text 2"),
      List("harry@gmail.com", "Message Text 4"),
      List("7868797979", "Message Text 5"),
      List("tom@yahoo.com", "Message Tet 6"),
      List("lisa@rediff.com", "Message Text 3"),
      List("lisa@yahoo.com", "Message Text 7"),
      List("6876868786", "Message Text 9"),
      List("abc@yahoo.com", "Message Text 10"),
      List("abc@yahoo.com", "Message Text 11")
    )


    val idnames = listOfMessages.filter(x => x(0).contains("@"))
    val ids = idnames.map(m => Message(Email(m(0).split("@")(0), m(0).split("@")(1)), m(1)))

    def matchsuccess(mailidnames: List[Any]): List[Any] = {
      mailidnames match {
        case Nil => Nil
        case Message(Email(id1, _), _) :: Message(Email(id2, _), _) :: _ if (id1 == id2) => id1 :: matchsuccess(mailidnames.tail)
        case _ => matchsuccess(mailidnames.tail)
      }

    }
    println(matchsuccess(ids))


  }


}


