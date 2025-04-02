fun main() {
    println("Welcome to the  club entry system")
    print("Enter your age: ")
    val age = readLine()?.toIntOrNull()

    if (age == null){
        println("Invalid input.Please enter a valid age.")
        return
    }

    if (age <= 18){
        println("Sorry you are not allowed to enter the club.")
        return
    }
    println("Are you a member? (yes/no)")
    val isamember = readln()?.trim()?.lowercase()

    if (isamember == "yes"){
        println("Are you a VIP?(yes/no)")
        val isaVIP = readLine()?. trim()?.lowercase()
    }
   if( isaVIP == "yes"){
       println("Welcome! you have the VIP lounge acess. ")
   }else{
       print("Please enter your member number")
       val memberNumber = readLine()
       println("Drinks have a discount, member $memberNumber")
   }

}