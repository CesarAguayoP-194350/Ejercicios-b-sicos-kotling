/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner

enum class EstadosBebes{
    despierto,
    llorando,
    dormido,
    comiendo,
    cagado_y_miado,
    viendo_paw_patrol,
    tieso,
    DigiEvoluciona,
    Camina,
    Nada,
    Acaricia_al_Perro,
    Radioactivo,
    Gema_Verde,
    Bandana_del_Dragon
}

class Bebe(
    var nombre: String,
    var hambre: Int,
    var pañal_lleno: Int,
    var sueño: Int,
    var Perro: Int = 0,
    var jaron: Int = 0,
    var Gema_v: Int = 0,
    var Carretera: Int = 0,
    var Pisina: Int = 0,
    var Fraso_Desconosido: Int = 0,
    var benda: Int = 0,
    var estado: EstadosBebes = EstadosBebes.despierto
){
    fun alimentar(){
        estado = EstadosBebes.comiendo
    }
    fun dormir(){
        if((estado == EstadosBebes.despierto || estado == EstadosBebes.comiendo) && sueño > 49){
            sueño = 0
            estado = EstadosBebes.dormido
        }
    }
    
    fun despiertar(){
        if(estado == EstadosBebes.dormido){
            estado = EstadosBebes.despierto
        }
    }
    
    fun despiertar_con_agua(){
        if(estado == EstadosBebes.tieso){
            estado = EstadosBebes.tieso
        }
    }
    
    fun Perro_de_Calle(){
        estado = EstadosBebes.Acaricia_al_Perro
    }
    
    fun Apagar_la_tele(){
        estado = EstadosBebes.llorando
    }
    
    fun Revisar_el_panal(){
        estado = EstadosBebes.cagado_y_miado
    }
    
    fun Ver_el_televisor(){
        estado = EstadosBebes.viendo_paw_patrol
    }
    
     fun Jarron_extrano_en_la_mesa(){
        estado = EstadosBebes.DigiEvoluciona
    }
    
    fun Sacar_al_bebe(){
        estado = EstadosBebes.Camina
    }
    
     fun Llevar_al_bebe_a_la_pisina(){
        estado = EstadosBebes.Nada
    }
    
    fun botella_extrana_en_la_sala(){
        estado = EstadosBebes.Radioactivo
    }
    
     fun bajar_piedra_brillante_del_estante(){
        estado = EstadosBebes.Gema_Verde
    }
    
    fun Sacar_la_reliquia_familiar(){
        estado = EstadosBebes.Bandana_del_Dragon
    }

    fun actualizar_estado(){
        when(estado){
            EstadosBebes.despierto ->{
                sueño += 5
                hambre += 5
                pañal_lleno +=3
            }
            
            EstadosBebes.comiendo ->{
                hambre -= 40
            }
            
            else -> {
                
            }
        }
    }
    
    fun picar_con_un_palo(): String{
        return estado_actual()
    }
    
    fun estado_actual(): String{
        when(estado){
            EstadosBebes.despierto -> {
                return "Él bebe esta despierto."
            }
            
            EstadosBebes.tieso -> {
                return "Estoy muerto."
            }
            
            EstadosBebes.dormido -> {
                return "Estoy dormido."
            }
            
            EstadosBebes.comiendo -> {
                return "Él bebe esta comiendo papilla de alta calidad."
            }
            
            EstadosBebes.cagado_y_miado -> {
                return "Él bebe se hiso del baño. Te toca cambiarle el pañal."
            }
            
            EstadosBebes.viendo_paw_patrol -> {
                return "Él bebe esta viendo paw patrol. No me hace caso sí que le apago la tele."
            }
            
            EstadosBebes.llorando -> {
                return "Él bebe no para de llorar desde que le apague la televisión."
            }
            
            //------------------Nuevas caracteristicas para el Bebe----------------------
            
            EstadosBebes.DigiEvoluciona -> {
                return "Él bebe agarro un jarrón extraño. EL jarrón esta empezando a brillar. BEBE ultra digimon a... Niñomon el terror de los padres solteros."
            }
            
            EstadosBebes.Camina -> {
                return "Él bebe está dando sus primeros pasos."
            }
            
            EstadosBebes.Nada -> {
                return "Él bebe está en la piscina con su chaleca salva vidas."
            }
            
            EstadosBebes.Acaricia_al_Perro -> {
                return "Él bebe está acariciando a un perro grade de la calle. Ahora es parte de la manada."
            }
            
            EstadosBebes.Radioactivo -> {
                return "Él bebe tiro un frasco con un líquido verde. Él bebe empieza a mutar. Él bebe ahora es verde, le salió una cola de dinosaurio, al bebe le salieron escamas en la espalda, él bebe voló sobre mí y bolo un auto con su rallo láser."
            }
            
            EstadosBebes.Gema_Verde -> {
                return "Él bebe agarro una gema verde. Es kryptonita y él bebe se ve muy débil."
            }
            
            EstadosBebes.Bandana_del_Dragon -> {
                return "Él bebe se pone una bandana en la frente. Ahora él bebe sabe kun fu."
            }
            
            else -> {
                return "No identifico el estado del bebe"
            }
        }
    }
}

fun main(){
    val scanner = Scanner(System.`in`)
    val JackieShieras = Bebe("Jackie Shieras", 50, 10, 70)
    
   var salir = false
    while(!salir){
        println("\nHola, Bienvenidos padres primerizos bienvenido. En este programa veremos que tan responsable eres a la hora de cuidar a un bebe, Por favor elegia la actividad que deseas hacer con él Bebe y despues selecciona la opcion de Ver estado actual para que sepas que esta haciendo el bebe.")
        println("\nMenú del Bebé")
        println("1. Alimentar")
        println("2. Dormir")
        println("3. Despertar")
        println("4. Despiertar con un baso de agua")
        println("5. Perro de Calle")
        println("6. Apagar la televisión")
        println("7. Revisar el pañal del Bebe")
        println("8. Ver la televisión")
        println("9. Darle al bebe el jarron extrano de la mesa")
        println("10. Sacar al bebe a la calle")
        println("11. Sacar al bebe a la pisina")
        println("12. Darle al bebe la extraña botella de la sala")
        println("13. Darle al bebe la extraña gema del estante")
        println("14. Darle al bebe la reliquia familiar")
        println("15. Ver estado actual")
        println("16. Salir")

        when(scanner.nextInt()){ 
            1 -> JackieShieras.alimentar()
            2 -> JackieShieras.dormir()
            3 -> JackieShieras.despiertar()
            4 -> JackieShieras.despiertar_con_agua()
            5 -> JackieShieras.Perro_de_Calle()
            6 -> JackieShieras.Apagar_la_tele()
            7 -> JackieShieras.Revisar_el_panal()
            8 -> JackieShieras.Ver_el_televisor()
            9 -> JackieShieras.Jarron_extrano_en_la_mesa()
            10 -> JackieShieras.Sacar_al_bebe()
            11 -> JackieShieras.Llevar_al_bebe_a_la_pisina()
            12 -> JackieShieras.botella_extrana_en_la_sala()
            13 -> JackieShieras.bajar_piedra_brillante_del_estante()
            14 -> JackieShieras.Sacar_la_reliquia_familiar()
            15 -> println(JackieShieras.estado_actual())
            16 -> salir = true
            else -> println("Opción no válida. Por favor buelvalo a intentar")
        }
    }
}

/*
1. Enumeración (enum class EstadosBebes)
Aquí defines todos los posibles estados en los que puede estar el bebé.
Ejemplos: dormido, comiendo, Radioactivo, Bandana_del_Dragon...
Esto funciona como una lista de constantes, muy útil para controlar estados sin tener que usar texto suelto.

2. Clase Bebe
Aquí describes cómo es un bebé en tu programa.
•	Tiene atributos básicos: nombre, hambre, sueño, pañal_lleno.
•	Tiene un estado actual (estado) que empieza como despierto.
Dentro de la clase creaste funciones que cambian su estado. Cuando llamas a alimentar(), el bebé pasa a estar en el estado comiendo.

3. Acciones del bebé
Tienes muchas funciones que simulan actividades:
•	alimentar() → cambia el estado a comiendo.
•	dormir() → si estaba despierto o comiendo y tenía mucho sueño, pasa a dormido.
•	despiertar() → si está dormido, pasa a despierto.
•	Apagar_la_tele() → pasa a llorando.
•	Perro_de_Calle() → pasa a Acaricia_al_Perro.
•	botella_extrana_en_la_sala() → pasa a Radioactivo.
•	etc.
Cada acción está ligada con un estado del enum.

4. actualizar_estado()
Aquí está la interactividad:
•	Se muestra un menú con opciones.
•	El usuario escribe un número.
•	Según el número, se ejecuta una acción del bebé.
•	El programa se repite hasta que elijas 16. Salir.
Ejemplo de interacción:
Menú del Bebé
1. Alimentar
2. Dormir
 7. Flujo general del programa
1.	Se crea un bebé llamado Jackie Shieras.
2.	El programa entra en un ciclo (while) mostrando un menú.
3.	Tú eliges qué hacer con el bebé.
4.	Cada acción cambia el estado del bebé.
5.	Cuando pides “Ver estado actual”, imprime la descripción correspondiente.
6.	Puedes seguir jugando hasta que elijas “Salir”.
*/
