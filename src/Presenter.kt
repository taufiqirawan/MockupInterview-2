class Presenter {

    fun selisih(number1 : Int, number2 : Int) : Int{
        if (number1 < number2){
            return number2 - number1
        }else {
            return number1 - number2
        }
    }

    fun getWinner(selisihPlayer : Int, selisihComputer : Int, nama : String) : String{
        return when {
            selisihPlayer < selisihComputer -> {
                "$nama Win"
            }
            selisihComputer < selisihPlayer -> {
                "Computer Win"
            }
            else -> {
                "Draw"
            }
        }
    }

}