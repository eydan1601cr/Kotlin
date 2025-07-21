package `22_POO_Costructor`

class persona2 (var nombre : String,var edad: Int){

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
    persona1 = persona("juan",30)
    persona1.imprimir()
    persona1.esMayorEedad()
}