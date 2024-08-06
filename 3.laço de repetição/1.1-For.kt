fun main() {
    //For:

    // For dentro de uma variavel;
    val str = "Fernando Cardoso";
    //A cada caracter em string, mostre uma letra.
    for (c in str){
        println("$c ")
    }
    println("-----------------------");

    // i de 0 a 10.
    for (i in 0..10){
        println(i * 2)
    }
    println("-----------------------");

    // 0 a 10 em 2 em 2.
    for (j in 0..10 step 2){
        println(j);
    }
    println("-----------------------");

    //Do maior para o menor.
    for (j in 100 downTo 0){
        print("$j");
    }
}