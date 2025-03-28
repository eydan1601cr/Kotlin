package `3_Estructura_condicional_IF`

    fun main(){
        print("Ingrese el primer valor:")
        val valor1 = readln().toInt()
        print("Ingrese el segundo valor:")
        val valor2 = readln().toInt()
        if (valor1 < valor2){
        val suma = valor1 + valor2
        val resta = valor1 - valor2
        println("La suma de los dos valores es: $suma")
        println("La resta de los dos valores es. $resta")

        } else {
        val producto = valor1 * valor2
        val division = valor1 / valor2
        println("La producto de los 2 valores es: $producto ")
        println("La division de los 2 valorers es: $division")

    }