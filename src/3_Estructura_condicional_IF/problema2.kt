package `3_Estructura_condicional_IF`

/*
Se ingresa por teclado un número entero comprendido entre 1 y 99, mostrar un mensaje
 indicando si el número tiene uno o dos dígitos.
(Tener en cuenta que condición debe cumplirse para tener
 dos dígitos, un número entero)
 */
    fun main() {
    print("Ingrese un numero del 1 al 99")
    val v1 = readln().toInt()
    if (v1 > 9 ) {
        print("tiene 2 dijito")
    }
    else{
        print("tiene 1 dijito")
    }








}