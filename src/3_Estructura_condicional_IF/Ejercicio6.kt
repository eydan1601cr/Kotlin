package `3_Estructura_condicional_IF`

    fun main() {
    print("Ingrese el primer valor:")
    val v1: Int = readln().toInt()
    print("Ingrese segundo Valor")
    val v2 = readln().toInt()
    if (v1 > v2) {
        print("El mayor valor es $v1")
    }
    else{
    print("El mayor valor es $v2")
    }