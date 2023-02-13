/*
    Una clase es el componente básico de la programación orientado a objetos.
    Una clase representa una entidad que tiene propiedades y puede realizar alguna acción.
    La palabra clave class se utiliza para declarar una clase en Kotlin.
    Una clase se utiliza para crear instancias u objetos del tipo de clase.
 */
fun main() {
    /*
        Para crear una instancia, será necesario
        llamar a la clase por su nombre con sus parametro
        primario
     */
    val llamadaAClase = MiClaseDos(1)
    llamadaAClase.test()

}

class MiClase //Declaración minima valida

//Una clase puede tener propiedades o variables y métodos
//Hay otro tipos de clases en Kotlin de las que hablaremos más adelante
//abstract, inline, sealed, etc.
class MiClaseDos(val id: Int) //Clases con constructor primario
{
    var name: String = "Maria" //Parámetro
    fun test(){ //Método
        println("Esto es un aprueba")
    }
}


