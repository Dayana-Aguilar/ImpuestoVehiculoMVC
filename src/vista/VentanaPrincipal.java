package vista;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    public JTextField txtMarca = new JTextField(10);
    public JTextField txtModelo = new JTextField(10);
    public JTextField txtAnio = new JTextField(10);
    public JTextField txtCilindraje = new JTextField(10);
    public JTextField txtAvaluo = new JTextField(10);

    public JComboBox<String> comboTipoUso = new JComboBox<>(new String[]{"Particular", "Publico"});

    public JButton btnCalcular = new JButton("Calcular Impuesto");

    public JLabel lblResultado = new JLabel("Resultado: ");

    public VentanaPrincipal() {

        setTitle("Cálculo de Impuesto Vehicular");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(8, 2));

        add(new JLabel("Marca:"));
        add(txtMarca);

        add(new JLabel("Modelo:"));
        add(txtModelo);

        add(new JLabel("Año:"));
        add(txtAnio);

        add(new JLabel("Cilindraje:"));
        add(txtCilindraje);

        add(new JLabel("Avalúo:"));
        add(txtAvaluo);

        add(new JLabel("Tipo de Uso:"));
        add(comboTipoUso);

        add(new JLabel(""));
        add(btnCalcular);

        add(new JLabel(""));
        add(lblResultado);
    }
}