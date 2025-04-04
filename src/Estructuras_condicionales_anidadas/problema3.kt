package Estructuras_condicionales_anidadas

/*
Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total
 de preguntas que se le realizaron y la cantidad de preguntas que contestó correctamente. Se pide confeccionar
 un programa que ingrese los dos datos por teclado e informe el nivel del mismo según el porcentaje de respuestas
 correctas que ha obtenido, y sabiendo que:
	Nivel máximo: Porcentaje >= 90%.
	Nivel medio: Porcentaje >= 75% y < 90%.
	Nivel regular:	Porcentaje >= 50% y 75%.
	Fuera de nivel:Porcentaje < 50%.

 */
fun main() {
    print("total de preguntas:")
    val preguntas = readln().toInt()
    print("preguntas correctas:")
    val correc = readln(). toDouble()
    val porcen= (correc / preguntas) * 100
    print ("el porcentaje es: $porcen ")
    if (porcen >= 90 )
        print(" maximo ")
    else if (porcen >= 75)
        print(" medio ")
    else if (porcen >= 50)
        print(" regular ")
    else
        print(" fuera de nivel  ")

}