fun main() {
    val age = 8 * 365
    val name = "Isabel"

    printBorder()
    println("Happy Birthday, ${name}")
    printBorder()
    
     // Let's print a cake!
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")

    // This prints an empty line.
    println("")
    println("You are ${age} days old, ${name}")
    println("${age} days old is the very best age to celebrate!")

}

 fun printBorder(){
   println("=======================")
 }
