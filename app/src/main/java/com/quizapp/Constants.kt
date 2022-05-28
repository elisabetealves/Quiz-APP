package com.quizapp

import com.quizapp.R


object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "A qual país pertence esta bandeira?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Austrália",
            "Armênia", "Austria", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "A qual país pertence esta bandeira?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Austrália", "Armênia", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "A qual país pertence esta bandeira?",
            R.drawable.ic_flag_of_brazil,
            "Bielorrússia", "Belize",
            "Brunei", "Brasil", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "A qual país pertence esta bandeira?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Bélgica",
            "Barbados", "Belize", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "A qual país pertence esta bandeira?",
            R.drawable.ic_flag_of_fiji,
            "Gabão", "França",
            "Fiji", "Finlândia", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "A qual país pertence esta bandeira?",
            R.drawable.ic_flag_of_germany,
            "Alemanhã", "Georgia",
            "Grecia", "Nenhuma das alternativas", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "A qual país pertence esta bandeira?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egito",
            "Dinamarca", "Etiópia", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "A qual país pertence esta bandeira?",
            R.drawable.ic_flag_of_india,
            "Irlanda", "Irã",
            "Hungria", "India", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "A qual país pertence esta bandeira?",
            R.drawable.ic_flag_of_new_zealand,
            "Austrália", "Nova Zelândia",
            "Tuvalu", "Estados Unidos", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "A qual país pertence esta bandeira?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordão",
            "Sudão", "Palestina", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}