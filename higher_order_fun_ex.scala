//Passing computing as a argument along with 3 numbers
val compute = (f:(Int,Int)=>Int,x:Int,y:Int,z:Int) => f(f(x,y),z)
compute((a:Int,b:Int)=>a+b,4,5,6)
compute((a:Int,b:Int)=>a-b,4,5,6)

//pass 2 functions and do square/cube and another func operator +,- and passing 3 numbers
val compute1 = (f:(Int,Int)=>Int,g:(Int)=>Int,x:Int,y:Int,z:Int) => f(f(g(x),g(y)),g(z))
compute1((a:Int,b:Int)=>a*b,(c:Int)=>c*c,2,3,4)
compute1((a:Int,b:Int)=>a+b,(c:Int)=>c*c,2,3,4)
