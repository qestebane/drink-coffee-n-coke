fun main() {
    
    val age = 8 * 365
    val name = "Isabel"
    val border = "'-._,-'"
    val timesToRepeat = 3

    printBorder(border, timesToRepeat)
    println("Happy Birthday, ${name}")
    printBorder(border, timesToRepeat)

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

 fun printBorder(border: String, timesToRepeat: Int){
    repeat(timesToRepeat) {
        print(border)
    }
  println()
}

