//exponential
def exponential(n:Int,x:Int):Int = {
  if(x==0){
    return 1
  }
  else{
    n*exponential(n,x-1)
  }
}
exponential(4,9)
