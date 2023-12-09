/*2. Print messages
Tell your friends what you learned in this pathway.

Can you write a main() function that prints these messages on four separate lines?

Use the val keyword when the value doesn't change. 
Use the var keyword when the value can change.
When you define a function, you define the parameters that can be passed to it. 
When you call a function, you pass arguments for the parameters. */

//solution:
fun main() {
    println("Use the val keyword when the value doesn't change. \n Use the var keyword when the value can change.\n When you define a function, you define the parameters that can be passed to it.\n When you call a function, you pass arguments for the parameters.")

}

/*3. Fix compile error
This program prints a message that notifies the user that they received a chat message from a friend.


fun main() { 
    println("New chat message from a friend'}
}
Can you figure out the root cause of the compile errors in this program and fix them?
Does the code use appropriate symbols to indicate the open and close of the string and function argument? */

//Solution:
fun main() { 
    println("New chat message from a friend")
}


/*4. String templates
This program informs users about the upcoming promotional sale on a particular item. It has a string template, which relies on the discountPercentage variable for the percent discount and the item variable for the item on sale. However, there are compilation errors in the code.


fun main() {
    val discountPercentage: Int = 0
    val offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
} */

//solution:
fun main() {
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
}


/*5. String concatenation
This program displays the total party size. There are adults and kids at the party. The numberOfAdults variable holds the number of adults at the party and the numberOfKids variable holds the number of kids.


fun main() {
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
} */

//solution:
fun main() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}


/*6. Message formatting
This program displays the total salary that an employee receives this month. The total salary is divided in two parts: the baseSalary variable, which the employee receives every month, and the bonusAmount variable, which is an additional bonus awarded to the employee.


fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
} */

//solution:

fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $$totalSalary (additional bonus).")
}

/*7. Implement basic math operations
In this exercise, you write a program that performs basic math operations and prints the output.

Step 1
This main() function contains one compile error:


fun main() {
    val firstNumber = 10
    val secondNumber = 5
    
    println("$firstNumber + $secondNumber = $result")
}
Can you fix the error so that the program prints this output?

10 + 5 = 15
Step 2
The code works, but the logic for adding two numbers is located within the result variable, making your code less flexible to reuse. Instead, you can extract the addition operation into an add() function so that the code is reusable. To do this, update your code with the code listed below. Notice that the code now introduces a new val called thirdNumber and prints the result of this new variable with firstNumber.


fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

// Define add() function below this line
Can you define the add() function so that the program prints this output?

10 + 5 = 15
10 + 8 = 18
Step 3
Now you have a reusable function to add two numbers.

Can you implement the subtract() function the same way you implemented the add() function? Modify the main() function as well to use the subtract() function so you can verify that it works as expected.*/

//solution:

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)
    val subresult1 = sub(result, firstNumber)
    val subresult2 = sub(anotherResult, result, secondNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    println("$result - $firstNumber = $subresult1")
    println("$anotherResult - $result - $secondNumber = $subresult2")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun sub(result: Int, number1: Int, number2: Int = 0): Int {
    return result - number1 - number2
}
