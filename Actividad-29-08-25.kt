/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Interfaz principal
interface Habilidad {
    var nombre: String
    var activo: Boolean
    var descripcion: String?

    fun activar(): Boolean {
        return if (activo) {
            false
        } else {
            activo = true
            true
        }
    }

    fun desactivar(): Boolean {
        return if (!activo) {
            false
        } else {
            activo = false
            true
        }
    }
}

// Interfaz de agrupación
interface Habilidades {
    var capacidades: MutableList<Habilidad>

    fun activar_capacidad(nombre: String): Boolean {
        for (capacidad in capacidades) {
            if (capacidad.nombre == nombre) {
                return capacidad.activar()
            }
        }
        return false
    }

    fun agregar_capacidad(capacidad_nueva: Habilidad) {
        capacidades.add(capacidad_nueva)
    }

    fun descripcion(): String {
        var lista_de_capacidades = "${capacidades.size}:"
        for (capacidad in capacidades) {
            lista_de_capacidades += " ${capacidad.nombre},"
        }
        return lista_de_capacidades.trimEnd(',')
    }
}

// Clase de poderes
class SuperPoder(
    override var nombre: String,
    override var activo: Boolean,
    override var descripcion: String?
) : Habilidad

// Clases que usan habilidades
class Bebe : Habilidades {
    override var capacidades: MutableList<Habilidad> = mutableListOf()
}

class Zorro : Habilidades {
    override var capacidades: MutableList<Habilidad> = mutableListOf()
}

// Main
fun main() {
    val poder = SuperPoder("Rayos Laser", false, "Una entidad con rayos láser")
    val poder_2 = SuperPoder("Volar", false, "La habilidad de volar")
    val poder_3 = SuperPoder("SuperFuerza", false, "La capacidad de tener mucha fuerza")

    val bebe = Bebe()
    val zorito_de_firefox = Zorro()

    bebe.agregar_capacidad(poder)
    bebe.agregar_capacidad(poder_2)
    bebe.agregar_capacidad(poder_3)

    bebe.activar_capacidad(poder.nombre)

    zorito_de_firefox.agregar_capacidad(poder)
    zorito_de_firefox.agregar_capacidad(poder_2)
    zorito_de_firefox.agregar_capacidad(poder_3)

    println("Los poderes del bebé son ${bebe.descripcion()}")
    println("Los poderes del zorro son ${zorito_de_firefox.descripcion()}")
    
    //println("Tipo de dato de ${bebe::class.qualifiedName}")
    //println("Tipo de dato de ${numero::class.qualifiedName}")
}

    
//Usar Compasision

/*
Correguir el codigo y agregarle mas poderes o funciones al bebe y al zorro
*/