class CuentaDeAhorros : Cuenta {

    var activa:Boolean? = true

    constructor() : super()
    constructor(
        saldo: Double,
        numeroDeConsignaciones: Int?,
        numeroDeRetiros: Int?,
        tasaAnual: Double,
        ComisionMensual: Double,
        totalConsignaciones: Double,
        totalRetiros: Double,
        interes: Double,
        activa: Boolean?
    ) : super(
        saldo,
        numeroDeConsignaciones,
        numeroDeRetiros,
        tasaAnual,
        ComisionMensual,
        totalConsignaciones,
        totalRetiros,
        interes
    ) {
        this.activa = activa
    }


    fun EstadoDeCuenta(){
        if (saldo < 1000){
            activa = false
        }
    }

    override fun consignar(cantidad:Double){
        super.consignar(cantidad)
    }
    override fun retirar(cantidad:Double){
        super.retirar(cantidad)
    }

    override fun extractoMensual(){
        println("Cuenta de ahorros")
        println("El saldo de su cuenta de ahorros sin Intereses y Comisiones es de: $saldo")
        super.extractoMensual()
        println("El saldo de su cuenta de ahorros es de: $saldo")

    }


}