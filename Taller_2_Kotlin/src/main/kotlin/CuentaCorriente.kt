class CuentaCorriente: Cuenta{

    var sobreGiro = 0.0

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
        sobreGiro: Double
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
        this.sobreGiro = sobreGiro
    }

    override fun consignar(cantidad:Double){
        super.consignar(cantidad)
    }

    override fun retirar(cantidad:Double){
        super.retirar(cantidad)
    }
    override fun extractoMensual(){
        println("Cuenta Corriente")
        println("El saldo de su cuenta corriente sin Intereses y Comisiones es de: $saldo")
        super.extractoMensual()
        println("El saldo de su cuenta corriente es de: $saldo")

    }

}