/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
enum class TiposDeEspectro{
    a, 
    b, 
    c, 
    licantropo, 
    vampiro,
}

enum class tipos imagenes{
    jpeg,
    jpg,
    png,
    
}

interface Compaño{
var nombre_amigo: String?
    fun establecer_compañero(nombre: String): Boolean
    
    fun platicar_del_compañero(): String{
        return "MI mejor amigo es ${nombre_amigo}" //Esto es un cuerpo opcional
    }
}

open class Animal(
    var especie: String,
    var cantidad_de_Piernas: Int, 
    var Cantidad_de_Ojos: Int
    ){
    var descripcion: String = ""
    var quien_establece_descripcion: String = ""
        fun establecer_descripcion_de_especie(descripcion: String, segun: String){
            this.descripcion = descripcion
            this.quien_establece_descripcion = segun
        }
    }

class Ornitorrinco(var nombre: String, especie: String):
    Animal(especie, 2, 2){
        fun saludar(): String{
            return "Hola, soy ${nombre} y soy de la especie ${especie}. "
        }
        fun establecer_descripcion(descripcion: String, segun: String): Boolean{
            if (!quien_establece_descripcion.isEmpty()){
                return false
            }
            super.establecer_descripcion_de_especie(descripcion, segun)
            return true
        }
    }
    
interface Compañero{
    
}
    
class Amigo(
    var nombre: String,
    var nombre_amigo: String,
    especie: String): Animal(especie, 8, 8), compañero{
    
        override fun establecer_compañero(nombre: String): Boolean{
            if(nombre_amigo == enum){
                nombre_amigo = nombre
                return true
            }
            return false
        }
        override fun platicar_del_compañero(): String{
        return "mi ammigoooooooooo no muertooooo esssss ${nombre_amigo}"
    }
}
    
    
class Fantasma(
    var nombre: String,
    var tipo_espectro: String,
    var poseiendo_un_cuerp: Boolean = false
): compañero{
    override var nombre_amigo: String? = null

    override fun establecer_compañero(nombre: String): Boolean{
            if(nombre_amigo == enum){
                nombre_amigo = nombre
                return true
            }
            return false
        }
}
        
fun main(){
    val animal_local = Ornitorrinco("Perry", "Mamifero")
    
    val amigo_local = Amigo("Pepe", "Amfibio")
    
    val amigo_de_amigo_local = Amigo("Willy", "Mamifero")
    
    val fantasma_local = Fantasma("La Carrera de Neil Gaiman", TiposDeEspectro.a)
    
    val tipo_espectro = ("archivos.JPEG", tipo: TiposImagenes.jpeg)
    if(tipo_espectro == TipoImagne ){
        println("")
    }
    
    if(fantasma_local.espectro == TiposDeEspectro.a){
        print("Este fantasma de tipo A, significa que se puede ver trasparente y no intervine")
    }
    
    var arreglo_de_fauna_con_amigo = arrayOf(amigo_lacal, amigo_local.nombre)
    
    
    amigo_local.establecer_compañero(amigo_de_amigo_local.nombre)
    println(amigo_local.platicar_del_compañero())
    
    
    print(animal_local. saludar())
    if (animal_local. establecer_descripcion("Mamifero semidesarrollado", "Cart")){
        print("Se logro estableser la descripcion. ")
    }
    else{
        print("No se logro estableser la descripcion. ")
    }
    
    print(animal_local. descripcion)
}
