package controlador;

import modelo.*;
import vista.VentanaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImpuestoController {

    private VentanaPrincipal vista;
    private CalculadoraImpuestos calculadora;

    public ImpuestoController(VentanaPrincipal vista) {
        this.vista = vista;
        this.calculadora = new CalculadoraImpuestos();

        this.vista.btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularImpuesto();
            }
        });
    }

    private void calcularImpuesto() {
        try {
            String marca = vista.txtMarca.getText();
            String modelo = vista.txtModelo.getText();
            int anio = Integer.parseInt(vista.txtAnio.getText());
            int cilindraje = Integer.parseInt(vista.txtCilindraje.getText());
            double avaluo = Double.parseDouble(vista.txtAvaluo.getText());
            String tipoUso = vista.comboTipoUso.getSelectedItem().toString();

            Vehiculo vehiculo = new Vehiculo(marca, modelo, anio, cilindraje, avaluo, tipoUso);

            double impuesto = calculadora.calcularImpuesto(vehiculo);

            vista.lblResultado.setText("Resultado: $" + impuesto);

        } catch (Exception ex) {
            vista.lblResultado.setText("Error: Verifique los datos ingresados.");
        }
    }
}
