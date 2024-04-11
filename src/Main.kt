fun main() {
    val options = arrayOf(
        "Rock", "Paper", "Scissors"
    )
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
}

fun getGameChoice(optionsParameter: Array<String>) {
    optionsParameter[(Math.random() * optionsParameter.size).toInt()]
}

fun getUserChoice(optionsParameter: Array<String>): String {
    //Checks if user's choice is valid
    var isValidChoice = false
    var userChoice = ""
    //Loop until user enters a valid choice
    while (!isValidChoice){
        //Ask user for their choice
        print("Please enter one of the following:")
        for (item in optionsParameter) print(" $item")
        println(".")
        //Read the User's input
        val userInput = readLine()
        //Validate the user input
        if (userInput != null && userInput in optionsParameter) {
            isValidChoice = true
            userChoice = userInput
        }
        //If the user choice is invalid, inform the user
        if (!isValidChoice) println("You must a enter a valid choice.")
    }
    return userChoice
}