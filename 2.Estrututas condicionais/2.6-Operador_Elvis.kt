fun main() {
    // Operador Elvis:

    //variavel nula: val Nome: tipo? = null;
    val test: String? = null;
    println(test);

    // se teste for nulo, atribua o valor tal na varaivel op
    val op:String = test ?: "Operador Elvis";
    println(op);
}
