/*The pedometer is an electronic device that counts the number of steps taken. Nowadays, almost all mobile phones, smart watches, and fitness gear come with pedometers built into them. The health and fitness app uses built-in pedometers to calculate the number of steps taken. This function calculates the number of calories that the user burns based on the user's number of steps.

Can you rename the functions, function parameters, and variables in this program based on best practices?*/

fun main() {
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories") 
}

fun pedometerStepsToCalories(numberOfSteps:Int): Double {
    val caloriesBurnedforEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedforEachStep
    return totalCaloriesBurned
}