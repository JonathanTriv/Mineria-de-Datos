open class Cuenta {

    var saldo = 50000.0
    var numeroDeConsignaciones:Int? = null
    var numeroDeRetiros:Int? = null
    var tasaAnual =  0.0
    var ComisionMensual = 0.0
    var totalConsignaciones = 0.0
    var totalRetiros = 0.0
    var interes = 0.0

    constructor()
    constructor(
        saldo: Double,
        numeroDeConsignaciones: Int?,
        numeroDeRetiros: Int?,
        tasaAnual: Double,
        ComisionMensual: Double,
        totalConsignaciones: Double,
        totalRetiros: Double,
        interes: Double
    ) {
        this.saldo = saldo
        this.numeroDeConsignaciones = numeroDeConsignaciones
        this.numeroDeRetiros = numeroDeRetiros
        this.tasaAnual = tasaAnual
        this.ComisionMensual = ComisionMensual
        this.totalConsignaciones = totalConsignaciones
        this.totalRetiros = totalRetiros
        this.interes = interes
    }


    open fun consignar(cantidad:Double) {
        saldo += cantidad
        numeroDeConsignaciones = (numeroDeConsignaciones?.inc() ?: 1)
        totalConsignaciones += cantidad
        println("El saldo ahora es de: $saldo")
    }
    open fun retirar(cantidad: Double){
        if (cantidad > saldo){
            println("No hay sufucintes fondos para retirar")
        }else{
            saldo -= cantidad
            numeroDeRetiros = (numeroDeRetiros?.inc() ?: 1)
            totalRetiros += cantidad
            println("El saldo ahora es de: $saldo")
        }
    }
    fun calcularInteres(){
        interes = saldo * 0.012
        ComisionMensual = saldo * 0.04
        tasaAnual = saldo * 0.128
        saldo += interes
        saldo -= ComisionMensual + tasaAnual

    }

    open fun extractoMensual(){
        calcularInteres()

        println("La cantidad de consignaciones a la cuenta fueron: $numeroDeConsignaciones")
        println("La cantidad de retiros a la cuenta fueron: $numeroDeRetiros")
        println("El total de dinero cosignado a la cuenta fueron: $totalConsignaciones")
        println("El total de dinero retirado de la cuenta fueron: $totalRetiros")
        println("La comision mensual de la cuenta es de: $ComisionMensual")
        println("La tasa anual de la cuenta es de: $tasaAnual")
        println("El interes mensual de la cuenta es de: $interes")

    }

}