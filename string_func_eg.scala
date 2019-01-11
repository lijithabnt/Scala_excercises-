
//REPL mode working with strings
/*In the REPL, declare a variable with the type String that has the name str.
  toUpperCase 
  trim
  substring – This method takes two Int arguments.
  replace – This method can be called with two Char arguments or two String arguments.
*/

val new_var = (name:String) => {
  (name
  ,name.toLowerCase
  ,name.toUpperCase
  ,name.substring(7,14)
  ,name.replace('e','M'))
}
new_var("Abbavaram Lijitha Reddy")
