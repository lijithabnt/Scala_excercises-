//Func0 types
//fun1 (Int) => Int
//fun2 (Int,Int) => Int

//Passing a fucntion inside a function
val fun1 = (x:Int) => x+1
val square = (x:Int) => x*x
val cube = (x:Int) =>square(x)*x
val newfun = (f:Int =>Int,x:Int,y:Int) => f(x) + f(y)
newfun(square,3,4)
newfun((x:Int)=>x*x,4,5)
List(1,2,3).map(square)
(1,34,4)

val fun0 = () => 5
fun0
fun0()

def greet():String = "Hello"
//val g = greet( _ )
val greet1 = ()=>"Hello"
greet1()
greet1


//Returning a function as Return type <<Higher order functions>>
val add1 = (x:Int) => {(y:Int) => x+y} // It takes
val add2 = add1(60)
add2
add2(2)

val str_new = (x:String) => {(y:String) => x+y} // It takes i/p as string and returns Function
val concat_str = str_new("liji")
//str_new()
concat_str("Hello")
str_new("Hi")("lijitha")

//Returning a function as Return type <<Higher order functions example2>>

val modVal = (x:Int) => (y:Int) => (y%x)
val secval = modVal(6)
secval(2)

modVal(6)(2)


//Passing computing as a argument along with 3 numbers
val compute = (f:(Int,Int)=>Int,x:Int,y:Int,z:Int) => f(f(x,y),z)
compute((a:Int,b:Int)=>a+b,4,5,6)
compute((a:Int,b:Int)=>a-b,4,5,6)

//pass 2 functions and do square/cube and another func operator +,- and passing 3 numbers
val compute1 = (f:(Int,Int)=>Int,g:(Int)=>Int,x:Int,y:Int,z:Int) => f(f(g(x),g(y)),g(z))
compute1((a:Int,b:Int)=>a*b,(c:Int)=>c*c,2,3,4)
compute1((a:Int,b:Int)=>a+b,(c:Int)=>c*c,2,3,4)
