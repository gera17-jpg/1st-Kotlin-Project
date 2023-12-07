fun main() {
    println(greeting("Rover", 8.00))
    

}

fun greeting(name : String , time : Double) : String {
    val message = "Good morning $name !"
    val currentTime = "It is now $time"
    return "$message $currentTime"
}