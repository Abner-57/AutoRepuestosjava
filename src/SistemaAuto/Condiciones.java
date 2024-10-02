import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Condiciones extends JFrame implements ActionListener, ChangeListener  {
    
    private JLabel label1, label2;
    private JCheckBox check1;
    private JButton boton1, boton2;
    private JScrollPane scrollpane1; 
    private JTextArea textarea1;
    String nombre = "";

    public Condiciones() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Terminos y condiciones");
        getContentPane().setBackground(new Color(0,0,0));
        setIconImage(new ImageIcon("C:\\Users\\PC\\Documents\\NetBeansProjects\\AutoRepuesto\\img\\coche.png").getImage());


        // Obtiene el nombre de la clase Bienvenida
        Bienvenida ventanaBienvenida = new Bienvenida();
        nombre = ventanaBienvenida.texto;

        // Si el nombre está vacío, solicita al usuario que lo ingrese por consola
        if (nombre.isEmpty()) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Por favor, ingresa tu nombre: ");
            nombre = scanner.nextLine();
            scanner.close(); // Cerrar el scanner después de su uso
        }

        label1 = new JLabel(" - TÉRMINOS Y CONDICIONES DE USO - ");
        label1.setBounds(160, 5, 280, 30);
        label1.setFont(new Font("Andale Mono", 1, 14));
        label1.setForeground(new Color(255, 255, 255));
        add(label1);

        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setFont(new Font("Andale Mono", 0, 9));   
        textarea1.setText("\n\n          TERMINOS Y CONDICIONES DE USO DE NUESTRO PROGRAMA " +
                    "\n\n          A.  PROHIBIDA SU VENTA O DISTRIBUCI�N SIN AUTORIZACI�N DE EMPRESA AUTOREPUESTOS GRT " +
                    "\n           B.  SE PROHIBE LA ALTERACION DEL CODIGO FUNETE Y EL DISEÑO DE LAS INTERFACES GRAFICAS DE LA APP " +
                    "\n           C.  LA EMPRESA AUTOREPUESTOS GRT NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                    "\n\n         AUTOREPUESTOS GRT NO SE HACE RESPONSABLE DEL MAL USO DE ESTA APLICACION, NI DE LAS DECISIONES " +
                    "\n           TOMADAS BASADAS EN LOS CALCULOS PROPORCIONADOS POR EL SOFTWARE, LA RESPONSABILIDAD DEL USO  " + 
                    "\n           RECAE EXCLUSIVAMENTE EN EL USUARIO " +
                    "\n           AL UTILIZAR ESTE PROGRAMA, USTED ACEPTA LOS TERMINOS Y CONDICIONES AQUI EXPUESTOS. SI NO ESTA " + 
                    "\n\n          DE ACUERDO CON LOS TERMINOS, LE PEDIMOS QUE NO UTILICE EL PROGRAMA " + 
                    "\n            " + 
                    "\n            PARA MAS INFORMACION SOBRE NOS PRODUCTOS O SERVICIOS, O TINES PREGUNTAS SOBRE EL USO " +
                    "\n            DE ESTE PROGRAMA, POR FAVOR CONTACTANOS A TRAVES DEL CORREO ELECTRONICO: " +
                    "\n            autorepuestosgtGRT@gmail.com ");
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10, 40, 575, 200);
        add(scrollpane1);   

        check1 = new JCheckBox("Yo " + nombre + " acepto");
        check1.setBounds(10, 250, 250, 30);
        check1.setBackground(new Color(0,0,0));
        check1.setFont(new Font("Arial", 1, 14));
        check1.setForeground(new Color(255, 255, 255));
        check1.addChangeListener(this);
        add(check1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10, 290, 100, 30);
        boton1.setBackground( new Color(192, 192, 192));
        boton1.setFont(new Font("Andale Mono", 1, 12));
        boton1.setForeground(new Color(0, 0, 0));
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);

        boton2 = new JButton("No Acepto");
        boton2.setBounds(120, 290, 100, 30);
        boton2.setBackground(new Color(192, 192, 192));
        boton2.setFont(new Font("Arial", 1, 12));
        boton2.setForeground(new Color(0, 0, 0));
        boton2.addActionListener(this);
        boton2.setEnabled(true);
        add(boton2);

    ImageIcon imagenOriginal = new ImageIcon("C:\\Users\\PC\\Documents\\NetBeansProjects\\AutoRepuesto\\img\\auto_logo.png");
    Image imagenEscalada = imagenOriginal.getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH);
    ImageIcon imagen = new ImageIcon(imagenEscalada);
    label2 = new JLabel(imagen); 
    label2.setBackground(new Color(0,0,0));
    int labelX = 590 - 200 - 10;  
    int labelY = 360 - 100 - 10; 
    label2.setBounds(labelX, labelY, 200, 100);  
    add(label2);  
    }

    public void stateChanged(ChangeEvent e) {
        boton1.setEnabled(check1.isSelected());
        boton2.setEnabled(!check1.isSelected());
    } 

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            Principal ventanaPrincipal = new Principal();
            ventanaPrincipal.setBounds(0, 0, 530, 650);
            ventanaPrincipal.setVisible(true);
            ventanaPrincipal.setResizable(false);
            ventanaPrincipal.setLocationRelativeTo(null);
            this.setVisible(false);
        } else if (e.getSource() == boton2) {
            Bienvenida ventanabienvenida = new Bienvenida();
            ventanabienvenida.setBounds(0, 0, 350, 450);
            ventanabienvenida.setVisible(true);
            ventanabienvenida.setResizable(false);
            ventanabienvenida.setLocationRelativeTo(null);
            this.setVisible(false);   
        } 
    }

    public static void main(String args[]) {
        Condiciones ventanalicencia = new Condiciones();
        ventanalicencia.setBounds(0, 0, 600, 390);
        ventanalicencia.setVisible(true);
        ventanalicencia.setResizable(false);
        ventanalicencia.setLocationRelativeTo(null);
    }
}
