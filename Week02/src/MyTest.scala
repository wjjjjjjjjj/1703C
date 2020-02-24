import scala.collection.mutable.ArrayBuffer


object MyTest {
  def main(args: Array[String]): Unit = {
//    countdown(10)
    
//    var buffer=ArrayBuffer(1,5,4,6,9,8,0,3,2)
//    sorf(buffer)
//    println(buffer)
    
     var buffer=ArrayBuffer(1, -10, -2, 7, 9, 8, -23, -34, 89)
     dou(buffer)
     println(buffer)
    
  }
  
  def dou(buffer:ArrayBuffer[Int]): Unit = {
    for(i <- 0 to buffer.size-1;j <- 0 to buffer.size-2-i){
      
      if(buffer(j)>buffer(j+1)){
        var temp=buffer(j)
        buffer(j)=buffer(j+1)
        buffer(j+1)=temp
      }
      if(buffer(j)<0){
        
        var temp=buffer(j+1)
        buffer(j+1)=buffer(j)
        buffer(j)=temp
      }
    }
  }
  
  def sorf(buffer:ArrayBuffer[Int]): Unit = {
    for(i <- 0 to buffer.size-1;j <- 0 to buffer.size-2-i){
      
      if(buffer(j)>buffer(j+1)){
        var temp=buffer(j)
        buffer(j)=buffer(j+1)
        buffer(j+1)=temp
      }
    }
  }
  
  
  def countdown(n:Int): Unit = {
    for(i <- 0 to n reverse) if(i!=0)print(i+",") else print(i)
  }
  
  
  
  
}