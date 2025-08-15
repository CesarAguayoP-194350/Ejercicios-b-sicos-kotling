/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import kotlin.random.Random

fun main() {
    var jugarDeNuevo: String

    println("Bienvenido al juego de 'adivinar el número que estoy pensando' ")

    do {
        jugar()

        print("¿Tegustatia jugar otra vez? (s/n): ")
        jugarDeNuevo = readln().trim().lowercase()

    } while (jugarDeNuevo == "s")

    println("¡Gracias por jugar! nos vemos en la proxima vez")
}

fun jugar() {
    val numeroPensado = Random.nextInt(1, 101)
    val maxIntentos = 10
    var intentosRealizados = 0

    println("\nHe pensado un número entre 1 y 100.")
    println("Tienes $maxIntentos intentos para adivinarlo.")

    while (intentosRealizados < maxIntentos) {
        val respuesta = validarNumeroDeEntrada()
        intentosRealizados++

        if (respuesta == numeroPensado) {
            println("¡INCREIBLE!Felicidades, Adivinaste el número en $intentosRealizados intentos.")
            return
        } else if (respuesta < numeroPensado) {
            println("El número que buscas es mayor.")
        } else {
            println("El número que buscas es menor.")
        }

        println("Te quedan ${maxIntentos - intentosRealizados} intentos.\n")
    }

    println("Lo lamente pero se te acabaron los intentos. El número era $numeroPensado. Buena suarte para la proxima")
}

fun validarNumeroDeEntrada(): Int {
    var respuesta: String?
    var respuestaValida: Int?

    while (true) {
        print("Introduce un número entero: ")
        respuesta = readlnOrNull()

        if (respuesta == null) {
            println("No se qué intentas hacer, por favor intenta de nuevo.")
            continue
        }

        respuestaValida = respuesta.toIntOrNull()
        if (respuestaValida == null) {
            println("Eso que introdujiste no es un número válido. Intenta otra vez.")
        } else {
            return respuestaValida
        }
    }
}
