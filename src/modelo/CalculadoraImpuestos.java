package modelo;

import java.time.Year;

public class CalculadoraImpuestos {

    public double calcularImpuesto(Vehiculo vehiculo) {

        double tarifa;

        // Definir tarifa según tipo de uso
        if (vehiculo.getTipoUso().equalsIgnoreCase("Particular")) {
            tarifa = 0.015; // 1.5%
        } else {
            tarifa = 0.02; // 2%
        }

        double impuesto = vehiculo.getAvaluo() * tarifa;

        // Calcular antigüedad
        int anioActual = Year.now().getValue();
        int antiguedad = anioActual - vehiculo.getAnio();

        // Si tiene más de 10 años, descuento del 10%
        if (antiguedad > 10) {
            impuesto = impuesto * 0.9;
        }

        return impuesto;
    }
}