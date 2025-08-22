/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Poder(val nombre: String)

class Personaje(
    val nombre: String,
    val genero: String,
    val poderes: List<Poder>
)

data class Pelicula(
    val nombre: String,
    val casaProductora: String,
    val anioEstreno: Int,
    val genero: String,
    val personaje: Personaje
)

fun mostrarPelicula(pelicula: Pelicula) {
    println("Nombre de la Película: ${pelicula.nombre}")
    println("Casa productora: ${pelicula.casaProductora}")
    println("Año de Estreno: ${pelicula.anioEstreno}")
    println("Género: ${pelicula.genero}")
    println("Personaje: ${pelicula.personaje.nombre} (${pelicula.personaje.genero})")
    println("Poderes/Habilidades:")
    pelicula.personaje.poderes.forEachIndexed { index, poder ->
        println("   ${index + 1}. ${poder.nombre}")
    }
}

fun main() {
    println("Ejemplo del registro de una pelicula:")

    val poder1 = Poder("wolfwalkers")
    val poder2 = Poder("Cazadora")

    val personajeEjemplo = Personaje(
        nombre = "Robyn",
        genero = "Femenino",
        poderes = listOf(poder1, poder2)
    )

    val peliculaEjemplo = Pelicula(
        nombre = "Wolfwalkers: Espíritu de lobo",
        casaProductora = "Cartoon Saloon",
        anioEstreno = 2020,
        genero = "Animación",
        personaje = personajeEjemplo
    )

    mostrarPelicula(peliculaEjemplo)

    println("\nAhora ya sabe cómo registrar una película. Por favor ingrese una película")

    // Registro de película
    print("Nombre de la Película: ")
    val nombrePelicula = readLine() ?: "Sin nombre"

    print("Casa productora: ")
    val casaProductora = readLine() ?: "Desconocida"

    print("Año de Estreno: ")
    val anioEstreno = readLine()?.toIntOrNull() ?: 0

    print("Género: ")
    val genero = readLine() ?: "Sin género"

    print("Nombre del personaje: ")
    val nombrePersonaje = readLine() ?: "Desconocido"

    print("Género del personaje: ")
    val generoPersonaje = readLine() ?: "Sin especificar"

    print("Habilidad/Poder principal: ")
    val habilidad1 = Poder(readLine() ?: "Ninguno")

    print("Segunda Habilidad/Poder: ")
    val habilidad2 = Poder(readLine() ?: "Ninguno")

    val personajeUsuario = Personaje(
        nombre = nombrePersonaje,
        genero = generoPersonaje,
        poderes = listOf(habilidad1, habilidad2)
    )

    val peliculaUsuario = Pelicula(
        nombre = nombrePelicula,
        casaProductora = casaProductora,
        anioEstreno = anioEstreno,
        genero = genero,
        personaje = personajeUsuario
    )

    println("\nPelícula registrada:")
    mostrarPelicula(peliculaUsuario)
}
