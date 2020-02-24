import scala.collection.mutable.ArrayBuffer


object Test {
  def main(args: Array[String]): Unit = {
//    countdown0(10)
    
//    var buffer=ArrayBuffer(10,5,6,8,0,7);
//    bubbleSort(buffer);
//    println(buffer);
    
    
    
  }
  
  def countdown(n:Int): Unit = {
    for(i <- 0 to n reverse) if (i!=0) println(i + ",") else println(i + "")
  }
  
   def countdown0(n:Int){
    (0 to n).reverse.mkString(",").foreach(print)
  }
   
   def bubbleSort(buffer:ArrayBuffer[Int]): Unit = {
     for(i <- 0 to buffer.size-1; j <- 0 until buffer.size-1-i){
       if (buffer(j)<buffer(j+1)) {
         var temp=buffer(j)
         buffer(j)=buffer(j+1)
         buffer(j+1)=temp
       }
     }
   }
   
   def someMethod(array:Array[Int]):Array[Int]= {
     val buffer1 = new ArrayBuffer[Int]()
     val buffer2 = new ArrayBuffer[Int]()
     array.foreach((i) => {
//       if (i >= 0) buff1 += i;
//       else buff2 += i;
     })
     (buffer1 ++ buffer2).toArray
   }
   
  
}