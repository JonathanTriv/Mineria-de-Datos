import java.lang.Exception
import kotlin.system.exitProcess

fun main() {

    var opc = 0
    val ca = CuentaDeAhorros()
    val cc = CuentaCorriente()

    do {
        try {

            println("Menu Cuentas")
            println("1. Cuenta de ahorros")
            println("2. Cuenta Corriente")
            println("3. salir")
            opc = readln().toInt()

        }catch (e: Exception){
            println("Digitaste un tipo de dato incorrecto solo permiten numeros enteros. ${e.message}")
        }

        when(opc){
            1->{
                var opc1 = 0
                println("Saldo de la cuenta: ${ca.saldo}")

                do {
                    try {
                        println("Cuenta de Ahorros")
                        println("1. Consignar")
                        println("2. Retirar")
                        println("3. Extracto Mensual")
                        println("4. Salir")
                        opc1 = readln().toInt()
                        ca.EstadoDeCuenta()

                    }catch (e: Exception){
                        println("Digitaste un tipo de dato incorrecto solo permiten numeros enteros. ${e.message}")

                    }

                    if (ca.activa != false){
                        when(opc1){
                            1->{
                                println("Digita la cantidad de consignar: ")
                                val consignacion = readln().toDouble()
                                ca.consignar(consignacion)
                            }
                            2->{
                                println("Digita la cantidad a retirar: ")
                                val retiro = readln().toDouble()
                                ca.retirar(retiro)
                            }
                            3->{
                                ca.extractoMensual()
                            }
                            4-> {
                                println("Saliendo....")
                                break
                            }
                        }
                    }else{
                        println("Su cuenta fue desactivada ya que contaba con menos de $1000")
                        break
                    }


                }while (opc1 in 0..4)
            }
            2->{
                var opc2 = 0
                println("Saldo de la cuenta: ${cc.saldo}")
                do {
                    try {
                        println("Cuenta Corriente")
                        println("1. Consignar")
                        println("2. Retirar")
                        println("3. Extracto Mensual")
                        println("4. Salir")
                        opc2 = readln().toInt()
                    }catch (e: Exception){
                        println("Digitaste un tipo de dato incorrecto solo permiten numeros enteros. ${e.message}")
                    }

                    when(opc2){
                        1->{
                            println("Digita la cantidad de consignar: ")
                            val consignacion = readln().toDouble()
                            cc.consignar(consignacion)
                        }
                        2->{
                            println("Digita la cantidad a retirar: ")
                            val retiro = readln().toDouble()
                            cc.retirar(retiro)
                        }
                        3->{
                            cc.extractoMensual()
                        }
                        4-> {
                            println("Saliendo....")
                            break
                        }

                    }

                }while (opc2 in 0..4)
            }
            3-> exitProcess(0)

        }
    }while (opc in 0..3)
}