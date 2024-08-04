fun main() {
    // Formatação de strings:

    // concatenação
    val frase:String ="Kotlin é uma linguaguem";
    val caracteristica:String = "Incrivel !!!";

    println("Sim, $frase $caracteristica")

    // mostras uma frase em varias linhas
    val palavras = """jsljflsfsl
        | sfdfsfsfaf
        | asdfsafsfs
        | asfdadsafsaafs
        | sfdfsdafsdafdsfds
    """.trimMargin()

    println(palavras);
}