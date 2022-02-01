//Noah Anderson
fun main() {
    //initialize arrays of answers and questions, as well as the other variables used
    val answers = arrayOf("5280", "Water", "Venus", "Chicago", "Washington")
    val questions = arrayOf("How many feet are in a mile?", "What is the common name for the chemical element" +
                    " H2O?", "What is the closest planet to Earth?", "What city is famous for its giant metal " +
                    "bean?", "What is the only U.S. state to be named after a president?")
    var userInput: String
    var score = 0
    var questionNumber = 1

    println("Quiz time! Answer each question as it is asked to you. spelling matters, but lower/uppercase" +
            "does not!")
    //loop of printing out each question in array questions, and asking the user for input
    for (i in 0 until questions.size){
        println("Question $questionNumber.")
        println(questions[i])
        questionNumber++
        print("Input your answer here: ")
        //converts userInput to lowercase, then capitalizes the first letter to match the style of strings in
        //the array answers
        userInput = readLine()!!.toString().lowercase()
        userInput = userInput.replaceFirstChar{it.uppercase()}

        //checks if userInput is the correct answer
        if(userInput == answers[i]){
            score++
        }
        println("")
    }
    //tells the user game over and prints the score
    println("Game over! you got $score out of 5 correct!")
}