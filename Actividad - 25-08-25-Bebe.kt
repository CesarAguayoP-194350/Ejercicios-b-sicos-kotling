/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
enum class EstadosBebes{
    despierto,
    llorando,
    dormido,
    comiendo,
    cagado_y_miado,
    viendo_paw_patrol,
    tieso
}

class Bebe(
    var nombre: String,
    var hambre: Int,
    var pañal_lleno: Int,
    var sueño: Int,
    var estado: EstadosBebes = EstadosBebes.despierto
){
    fun alimentar(){
        //hambre -=25
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
                return "El bebe esta despierto"
            }
            
            EstadosBebes.tieso -> {
                return "Estoy muerto"
            }
            
            EstadosBebes.dormido -> {
                return "Estoy dormido"
            }
            
            else -> {
                return "No identifico el estado del bebe"
            }
        }
    }
}

fun main(){
    val JackieShieras = Bebe("Jackie Shieras", 50, 10, 70)
    
    JackieShieras.actualizar_estado()
    println("El estado del bebe es ${JackieShieras.estado_actual()}")
    JackieShieras.dormir()
    println("El estado del bebe es ${JackieShieras.estado_actual()}")
    JackieShieras.despiertar_con_agua()
    println("El estado del bebe es ${JackieShieras.estado_actual()}")
    JackieShieras.alimentar()
    println("El estado del bebe es ${JackieShieras.estado_actual()}")
}
