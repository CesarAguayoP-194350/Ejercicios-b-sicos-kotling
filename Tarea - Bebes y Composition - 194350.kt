/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Interfaz principal de habilidades
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
        return "${capacidades.size}: " + 
            capacidades.joinToString(", ") { it.nombre }
    }
}

// Clase de poderes
class SuperPoder(
    override var nombre: String,
    override var activo: Boolean,
    override var descripcion: String?
) : Habilidad

// Nuevas interfaces para composición
interface Personalidad {
    val tipo: String
}

interface AlimentoFavorito {
    val alimento: String
}

interface JugueteFavorito {
    val juguete: String
}

// Implementación la composición al bebé
class Bebe(
    var personalidad: Personalidad,
    var alimentoFavorito: AlimentoFavorito,
    var jugueteFavorito: JugueteFavorito
) : Habilidades {
    override var capacidades: MutableList<Habilidad> = mutableListOf()

    fun descripcionCompleta(): String {
        return """
            Una Personalidad: ${personalidad.tipo}
            Su Alimento favorito: ${alimentoFavorito.alimento}
            Su Juguete favorito: ${jugueteFavorito.juguete}
            Sus Habilidades: ${descripcion()}
        """.trimIndent()
    }
}

// Clase Zorro solo con habilidades
class Zorro : Habilidades {
    override var capacidades: MutableList<Habilidad> = mutableListOf()
}

// Main
fun main() {
    val poder = SuperPoder("Rayos Laser", false, "Una entidad con rayos láser")
    val poder_2 = SuperPoder("Volar", false, "La habilidad de volar")
    val poder_3 = SuperPoder("SuperFuerza", false, "La capacidad de tener mucha fuerza")

    // Objetos para composición
    val alegre = object : Personalidad {
        override val tipo = "Alegre"
    }
    val leche = object : AlimentoFavorito {
        override val alimento = "Leche"
    }
    val sonaja = object : JugueteFavorito {
        override val juguete = "Sonaja"
    }

    val bebe = Bebe(alegre, leche, sonaja)
    val zorito = Zorro()

    bebe.agregar_capacidad(poder)
    bebe.agregar_capacidad(poder_2)
    bebe.agregar_capacidad(poder_3)
    bebe.activar_capacidad(poder.nombre)

    zorito.agregar_capacidad(poder)
    zorito.agregar_capacidad(poder_2)

    println("El BEBÉ es:")
    println(bebe.descripcionCompleta())
    println("\nEl ZORRO Puede hacer:")
    println("Habilidades: ${zorito.descripcion()}")
}


/*Cambios que realise al codigo

Agregué tres interfaces nuevas: Personalidad, AlimentoFavorito, JugueteFavorito.

Las implementé con objetos anónimos (object : ... {}) al crear el Bebe.

El Bebe ahora usa composición: guarda referencias a esos objetos.

descripcionCompleta() muestra todo junto (rasgos + habilidades).
*/