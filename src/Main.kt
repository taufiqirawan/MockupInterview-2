fun main(){

    print("Masukan nama : ")
    val namaPlayer = readLine().toString()
    println("$namaPlayer vs Computer")
    println("-----------------------")

    val presenter = Presenter()
    val listNumber = mutableListOf(0,1,2,3,4,5,6,7,8,9)
    var round = 0
    var scorePlayer = 0
    var scoreComputer = 0

    do {
        print("$namaPlayer masukan tebakan : ")
        val tebakPlayer = readLine()?.toInt()

        val tebakKomputer = listNumber.random()
        println("Tebakan Computer : $tebakKomputer")

        val nomorAcak = listNumber.random()
        println("Nomor Acak : $nomorAcak")

        val selisihPlayer = presenter.selisih(tebakPlayer!!,nomorAcak)
        val selisihComputer = presenter.selisih(tebakKomputer,nomorAcak)

        val winner = presenter.getWinner(selisihPlayer,selisihComputer,namaPlayer)

        println("selisih $namaPlayer : $selisihPlayer")
        println("selisih Computer : $selisihComputer")
        println("Hasil : $winner")
        println("-----------------------")

        if (winner == "$namaPlayer Win"){
            scorePlayer ++
        }else if (winner == "Computer Win"){
            scoreComputer ++
        }

        round ++
    }while (round < 3)

    println("Score $namaPlayer : $scorePlayer")
    println("Score Computer : $scoreComputer")
    if (scorePlayer > scoreComputer){
        println("$namaPlayer Win")
    }else if (scoreComputer > scorePlayer){
        println("Computer Win")
    }

}