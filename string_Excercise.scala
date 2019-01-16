//Given a String from readLine.
val name:String = scala.io.StdIn.readLine("Name : ")
//(a) Get a version of the String with all the spaces removed.
val name1:String = "ABBAVARAM LIJI THA  R E D DY  "
val spacetrim = (x:String) => (x.replaceAll("\\s",""))
spacetrim(name1)
//or
name1.filterNot((x:Char) => (x.isWhitespace))
name1.filter((x:Char) => !(x.isWhitespace))
//(b) Get a version of the String with all vowels removed.
val vowels = Set('a','e','i','o','u','A','E','I','O','U')
name1.filter((x:Char) => !(vowels.contains(x)))
//c) Split off the first word of the String. Write code that gives you a (String, String)
// where the first element is everything up to the first space in str and the second one is everything else.
name1.split(" ",2)
//(d) Convert to a sequence that has the integer values of each of the characters in str.
val new_str = name1.toIndexedSeq
//(e) Write code that will take a sequence of Int, like the one you just made, and give you back a String. 
// (Note that if you get a sequence of Char you can use mkString to get a simple Stringfrom it.)
val final_str = new_str.mkString.filter((x:Char) => !x.isWhitespace)


/*
name1: String = ABBAVARAM LIJI THA  R E D DY  
spacetrim: String => String = $Lambda$3064/270664479@3cbf8206
res4: String = ABBAVARAMLIJITHAREDDY

res5: String = ABBAVARAMLIJITHAREDDY
res6: String = ABBAVARAMLIJITHAREDDY

vowels: scala.collection.immutable.Set[Char] = Set(E, e, u, U, A, a, I, i, O, o)
res7: String = BBVRM LJ TH  R  D DY  


res8: Array[String] = Array(ABBAVARAM, LIJI THA  R E D DY  )

new_str: scala.collection.immutable.IndexedSeq[Char] = Vector(A, B, B, A, V, A, R, A, M,  , L, I, J, I,  , T, H, A,  ,  , R,  , E,  , D,  , D, Y,  ,  )


final_str: String = ABBAVARAMLIJITHAREDDY

