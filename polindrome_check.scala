def polindrome_check (in_string : String) : (String,Boolean) = {
 val new_str = in_string.reverse
 if (in_string == new_str) {
  (new_str,true)
 }
 else {
  (new_str,false)
 }
}

polindrome_check ("madam")


//Another way of writing the code

def new_pol(input_str:String ) : (String,Boolean) = (input_str.reverse,input_str == input_str.reverse)
println(new_pol("malayalam")._1,new_pol(input_str = "malayalam")._2)

