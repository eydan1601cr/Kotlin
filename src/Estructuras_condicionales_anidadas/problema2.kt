package Estructuras_condicionales_anidadas
/*
Confeccionar un programa que permita cargar un número entero positivo de hasta
 tres cifras y muestreun mensaje indicando
 si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el número de cifras es mayor.
 */
fun main() {
   print("el total de preguntas")
    val pregunta = readln().toInt()
    print("ponga las preguntas correctas")
    val correctas = readln().toInt()
    val porcen = (correctas / pregunta ) * 100
    print("el porcentaje es $porcen")
    if (porcen >= 90)
        print("maximo")
    else if (porcen >= 75)
        print("bueno")
    else if (porcen >= 50)
        print("regular")
    else
        print("muy mal")

}