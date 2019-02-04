//Usng tail recurrssion

def toBinary(n: Int): String = {
def binary(acc: String, n: Int): String = {
    n match {
      case 0 | 1 => n+acc
      case _ => binary((n % 2)+acc, (n / 2))
    }
  }
  binary("",n)
}

toBinary(9)



//With out recurrssion
//Integer to Binary

var number = 100
var bin = 0
var rem =1
var i = 1
while ( number > 0)
  {
    rem = number%2
    number = number/2
    bin = bin+(i*rem)
    i=i*10

  }
println(bin)
