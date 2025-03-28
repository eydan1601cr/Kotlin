package `3_Estructura_condicional_IF`

fun main() {
    print("ingrese el sueldo del empleado:")
    val sueldo: Double = readln().toDouble()

    if (sueldo > 3000) {
        println("Debe pagar impuesto")
    }


}