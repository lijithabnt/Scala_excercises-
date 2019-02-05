//Write a function to parse boolean value passed as string ,
// default case return false.

def parsebool(inpval :String) = inpval match {
  case "true" => "true"
  case _ | "false" => false
}
parsebool("liji") . //false
parsebool("true") //true
parsebool("false") //false

//or

def checkBoolean(x:String):Option[Boolean] = x match {

    case "true"  => Some(true)
    case "false" => Some(false)
    case _ => None
  }

  checkBoolean("false")

  checkBoolean("khushbu") match {
    case Some(x) => println(s"Found x is a Boolean $x" )
    case None => println(s"Found is a Not a Boolean" )
  }
