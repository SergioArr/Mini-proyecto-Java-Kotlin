package com.sergio.evaluacion1

abstract class Empleado(val sueldoBruto: Double) {
    abstract fun calcularLiquido(): Double
}

class EmpleadoHonorarios(montoBruto: Double) : Empleado(montoBruto) {
    override fun calcularLiquido(): Double {
        val retencion = sueldoBruto * 0.13
        return sueldoBruto - retencion
    }
}

class EmpleadoRegular(montoBruto: Double) : Empleado(montoBruto) {
    override fun calcularLiquido(): Double {
        val retencion = sueldoBruto * 0.20
        return sueldoBruto - retencion
    }
}
