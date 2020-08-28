fun main(){

//    println("Masukan nama : ")
//    val namaPlayer = readLine().toString()
//    println("Tebak nomor : ")
//    val tebakPlayer = readLine()?.toInt()
//
//    val namaComputer = "Computer"
//    val listNumber = mutableListOf(0,1,2,3,4,5,6,7,8,9)
//    val random = listNumber.random()
//    val tebakKomputer = random
//
//    println("Nama Player : $namaPlayer")
//    println("Tebakan Player : $tebakPlayer")
//    println("Nama Komputer : $namaComputer")
//    println("Tebakan Komputer : $tebakKomputer")
//
//    val nomorRandom = listNumber.random()
//    println("Nomor Tebakan : $nomorRandom")
//
//    val scorePlayer1 = 0
//    val scoreKomputer = 0
//
//    if (tebakPlayer == nomorRandom){
//        scorePlayer1 + 1
//    }else if (tebakKomputer == nomorRandom){
//        scoreKomputer + 1
//    }else{
//        println("Tidak sama cari nilai terdekat")
//    }
//
//    println("Score Pemain : $scorePlayer1")
//    println("Score Komputer : $scoreKomputer")


    val listNumberCoba = mutableListOf(0,1,2,3,4,5,6,7,8,9)

    println("tebak 1 :")
    val tebakPlayer1 = readLine()?.toInt()
    println("tebak 2 :")
    val tebakPlayer2 = readLine()?.toInt()

    val random = listNumberCoba.random()
    val tebakKomputer = random
    println("tebak nomor :$tebakKomputer")

    var selisih1 = 0
    var selisih2 = 0

    selisih1 = if (tebakPlayer1!! < tebakKomputer){
        tebakKomputer.minus(tebakPlayer1)
    }else{
        tebakPlayer1.minus(tebakKomputer)
    }

    selisih2 = if (tebakPlayer2!! < tebakKomputer) {
        tebakKomputer.minus(tebakPlayer2)
    }else {
        tebakPlayer2.minus(tebakKomputer)
    }


    println("selisih 1 : $selisih1")
    println("selisih 2 : $selisih2")

    if (tebakPlayer1 == tebakKomputer || selisih1!! < selisih2!!){
        println("Player 1 Win")
    }else if (tebakPlayer2 == tebakKomputer || selisih2!! < selisih1!!){
        print("Player 2 Win")
    }





}