fun main() {
    val age = 24
    val layers = 5
    val timesToRepeat = age+2;

   
     // Let's print a cake!
    printCakeCandles(age)
    printCakeTop(timesToRepeat)
    printCakeBottom(layers,timesToRepeat)
    // Finish cake
    
}
fun printCakeCandles(age: Int){
    print(" ")
    repeat(age){
        print(",")      
    }
    println()
    print(" ")
    repeat(age){            
         print("|")
    } 
    println()   
}

fun printCakeTop(timesToRepeat: Int){
   repeat(timesToRepeat){
       print("=") 
   }
   println()
}
fun printCakeBottom(layers: Int, timesToRepeat: Int) {
   repeat(layers){
       repeat(timesToRepeat){
           print("@")
       }
       println()
   }
} 

