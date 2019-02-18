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



  //listOfMessages.flatMap(x => Message(Email(x(0).split("@"))))
 val emailids =  listOfMessages.filter(x => x(0).contains("@")).map(y => y(0).split("@")(0))


def matchsuccess(emailids:List[String]) : List[String] =  {
  emailids match {
    case Nil => Nil
    case f :: s :: _ if(f == s)  => f :: matchsuccess(emailids.tail)
    case _ => matchsuccess(emailids.tail)

  }
}

matchsuccess(emailids)
//x.map(y => y:::y)

//Array to tuple
val x = Array("liji","tha")
(x(0),x(1))

