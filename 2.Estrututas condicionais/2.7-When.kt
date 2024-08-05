//When (switch case):

fun operacao (a:Int, b:Int, c:String): Int{

    when (c) {
        //case
        "soma" -> {
            //codigo
            return a + b;
        }

        "subtracao" -> {
            return a - b;
        }

        "multlicacao" -> {
            return a * b;
        }

        "divisao" -> {
            return a / b;
        }

        else -> {
            //Defult
            return 0;
        }
    }
}

fun main() {

    val n1 = operacao(a= 10, b= 10, c ="soma");
    val n2 = operacao(a= 10, b= 10, c ="subtracao");
    val n3 = operacao(a= 10, b= 10, c ="multlicacao");
    val n4 = operacao(a= 10, b= 10, c ="divisao");

    println(n1);
    println(n2);
    println(n3);
    println(n4);
}