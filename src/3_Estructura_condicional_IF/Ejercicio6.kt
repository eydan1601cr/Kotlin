package `3_Estructura_condicional_IF`

fun main () {
    print("ingrese primer valor:")
    val valor1: Int = readln().toInt()
    print("ingrese segundo valor:")
    val valor2 = readln().toInt()
    if (valor1 > valor2) {
        print("el mayor valor es $valor1")
    }
    else {
        print("el mayor valor es $valor2")
    }
}