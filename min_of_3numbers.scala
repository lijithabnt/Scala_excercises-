//two functions that takes four numbers and returns the smallest.
// The first can use min, but the second can not

val reuturnSmallest = (x:Int,y:Int,w:Int,z:Int) => math.min(z,math.min(w,math.min(x,y)))
reuturnSmallest(3434,907,144,20)

//Fucntion Without using min
val returnSmall ={ (x:Int,y:Int,w:Int,z:Int) =>
   if(x < y && x < w && x<z) {
     x
   }
   else if(y<w && y<z && y<x) {
     y
   }
   else if(w<z && w<x && w<y) {
     w
   }
    else{
     z
   }
}

returnSmall(4,9,17,3)

//Method with out using Min
def returnSmall1(x:Int,y:Int,w:Int,z:Int) = {
  if(x < y && x < w && x<z) {
    x
  }
  else if(y<w && y<z && y<x) {
    y
  }
  else if(w<z && w<x && w<y) {
    w
  }
  else{
    z
  }
}

returnSmall1(4,9,17,3)
