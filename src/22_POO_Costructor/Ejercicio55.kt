package `22_POO_Costructor`

class persona constructor(nombre : String, edad: Int){
    var nombre: String = nombre
    var edad: Int = edad

    fun imprimir(){
        println("nombre:$nombre y tiene una edad de $edad")
    }

    fun esMayorEedad(){
        if (edad>= 18)
            println("es mayor de edad $nombre")
        else
            println("no es mayor de edad")
    }
}

fun main() {
    val persona1: persona
    persona1 = persona("juan",12)
    persona1.imprimir()
    persona1.esMayorEedad()
}