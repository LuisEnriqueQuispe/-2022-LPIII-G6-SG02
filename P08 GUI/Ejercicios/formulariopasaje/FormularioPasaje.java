package formulariopasaje;

import java.awt.Checkbox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FormularioPasaje extends JFrame implements ActionListener {

    JLabel eti1, eti2, eti3, eti4, eti5, eti6, eti7, eti8, eti9;
    JTextField nombres, documento_identidad;
    JFormattedTextField fecha_viaje;
    JButton blanquear, grabar;
    Checkbox audifonos, manta, revista;
    JRadioButton piso1, piso2; // 1er o 2do
    JComboBox origen_destino;
    JComboBox calidad_servicio;
    JPanel panel;

    public FormularioPasaje() {
        eti1 = new JLabel("Compra de pasajes");
        eti1.setBounds(20, 30, 200, 20);
        eti2 = new JLabel("Nombres ");
        eti2.setBounds(40, 80, 180, 20);
        eti3 = new JLabel("DNI");
        eti3.setBounds(40, 100, 180, 20);
        eti4 = new JLabel("Fecha");
        eti4.setBounds(40, 120, 180, 20);
        eti5 = new JLabel("Limpiar formulario ");
        eti5.setBounds(40, 140, 180, 20);
        eti6 = new JLabel("Servicios opcionales");
        eti6.setBounds(40, 180, 180, 20);
        eti7 = new JLabel("Piso ");
        eti7.setBounds(40, 280, 180, 20);
        eti8 = new JLabel("Origen - Destino ");
        eti8.setBounds(40, 340, 180, 20);
        eti9 = new JLabel("Calidad de servicio ");
        eti9.setBounds(40, 380, 180, 20);
        nombres = new JTextField();
        nombres.setBounds(100, 80, 180, 20);
        documento_identidad = new JTextField();
        documento_identidad.setBounds(100, 100, 180, 20);
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        fecha_viaje = new JFormattedTextField(df);
        fecha_viaje.setBounds(100, 120, 180, 20);
        blanquear = new JButton();
        blanquear.setBounds(100, 160, 180, 20);
        blanquear.setText("Borrar");
        audifonos = new Checkbox();
        audifonos.setBounds(100, 200, 180, 20);
        audifonos.setLabel("Audífonos");
        manta = new Checkbox();
        manta.setBounds(100, 220, 180, 20);
        manta.setLabel("Manta");
        revista = new Checkbox();
        revista.setBounds(100, 240, 180, 20);
        revista.setLabel("Revista");
        piso1 = new JRadioButton("1er piso");
        piso1.setBounds(100, 300, 180, 20);
        piso2 = new JRadioButton("2do piso");
        piso2.setBounds(100, 320, 180, 20);
        origen_destino = new JComboBox();
        origen_destino.setBounds(100, 360, 180, 20);
        origen_destino.addItem("Arequipa - Lima");
        origen_destino.addItem("Arequipa - Cuzco");
        calidad_servicio = new JComboBox();
        calidad_servicio.setBounds(100, 420, 180, 20);
        calidad_servicio.addItem("Económico");
        calidad_servicio.addItem("Standard");
        calidad_servicio.addItem("VIP");
        grabar = new JButton();
        grabar.setBounds(100, 460, 180, 20);
        grabar.setText("Grabar");
        panel = new JPanel();
        panel.setLayout(null);
        panel.add(eti1);
        panel.add(eti2);
        panel.add(nombres);
        panel.add(eti3);
        panel.add(documento_identidad);
        panel.add(eti4);
        panel.add(fecha_viaje);
        panel.add(eti5);
        panel.add(blanquear);
        panel.add(eti6);
        panel.add(audifonos);
        panel.add(manta);
        panel.add(revista);
        panel.add(eti7);
        panel.add(piso1);
        panel.add(piso2);
        panel.add(eti8);
        panel.add(origen_destino);
        panel.add(eti9);
        panel.add(calidad_servicio);
        panel.add(grabar);
        add(panel);
        setSize(500, 800);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
    }

    public static void main(String[] args) {
        FormularioPasaje f = new FormularioPasaje();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
