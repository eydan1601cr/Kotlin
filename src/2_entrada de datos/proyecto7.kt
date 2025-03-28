package `2_entrada de datos`

/*
se debe desarallar un programa que pida el ingreso del
precio de un articulo y la cantidad que lleva el cliente y
mostrar lo que debe abonar el comprador
 */

fun main() {
    print("ingrese el precio de producto:")
    val precio: Double = readln().toDouble()
    print("Ingrese la cantidad de productos:")
    val cantidad: Int = readln().toInt()
    val total: Double = precio * cantidad
    println("El total a pagar es $total")

}