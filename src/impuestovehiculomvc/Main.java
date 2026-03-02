package impuestovehiculomvc;

import vista.VentanaPrincipal;
import controlador.ImpuestoController;

public class Main {

    public static void main(String[] args) {

        VentanaPrincipal vista = new VentanaPrincipal();
        new ImpuestoController(vista);

        vista.setVisible(true);
    }
}