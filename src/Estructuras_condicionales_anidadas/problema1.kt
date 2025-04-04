package Estructuras_condicionales_anidadas

/*
Se ingresa por teclado un valor entero, mostrar una leyenda
que indique si el número es positivo, nulo(cero) o negativo.
 */
fun main() {
   print("Ingrese un valor")
   val num = readln().toInt()

    val numero  = if (num > 0) "positivo"
    else if  (num < 0) "negativo" else "nulo"
    print("El numero es $num")








}