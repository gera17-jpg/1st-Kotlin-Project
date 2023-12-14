/*Gmail has a feature that sends a notification to the user whenever a login attempt is made on a new device.

In this exercise, you write a program that displays a message to users with this message template:

There's a new sign-in request on operatingSystem for your Google Account emailId.

You need to implement a function that accepts an operatingSystem parameter and an emailId parameter, constructs a message in the given format, and returns the message.*/

fun main(){
   val firstUserEmailId = "user_one@gmail.com"

    println(displayMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

fun displayMessage(operatingSystem:String ="unknown Os",emailId:String):String{
    val message = "There's a new sign-in request on ${operatingSystem} for your Google Account ${emailId}"
    return(message)
}



