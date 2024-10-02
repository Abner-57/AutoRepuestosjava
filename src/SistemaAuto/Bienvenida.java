import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Scanner;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Bienvenida extends JFrame implements ActionListener {
  private JTextField textfield1;
  private JLabel label1, label2, label3, label4, label5;
  private JButton boton1;
  public static String texto = "";  

  public Bienvenida(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Bienvenido");
    getContentPane().setBackground(new Color(0,0,0));
    setIconImage(new ImageIcon("C:\\Users\\PC\\Documents\\NetBeansProjects\\AutoRepuesto\\img\\coche.png").getImage());
    
    ImageIcon imagen = new ImageIcon("C:\\Users\\PC\\Documents\\NetBeansProjects\\AutoRepuesto\\img\\auto_logo.png");
    label1 = new JLabel(imagen);
    label1.setBounds(25,40,300,150);
    add(label1);
    

    label2 = new JLabel("SISTEMA CONTROL VACACIONAL");
    label2.setBounds(35,200,300,30);
    label2.setFont(new Font("Andale Mono", 3, 16));
    label2.setForeground(new Color(255,255,255));
    add(label2);

    label3 = new JLabel("Nombre de usuario");
    label3.setBounds(45,250,200,30);
    label3.setFont(new Font("Andale Mono", 1, 12));
    label3.setForeground(new Color(255,255,255));
    add(label3);

    label4 = new JLabel(" © 2024 AUTOREPUESTOS GRT ");
    label4.setBounds(85,400,300,30);
    label4.setFont(new Font("Andale Mono", 1, 12));
    label4.setForeground(new Color(255,255,255));
    add(label4);
    label4 = new JLabel(" - Abner Sac - Programacion II - Seccion A -");
    label4.setBounds(50,415,300,30);
    label4.setFont(new Font("Andale Mono", 1, 12));
    label4.setForeground(new Color(255,255,255));
    add(label4);

    textfield1 = new JTextField ();
    textfield1.setBounds(45,280,255,25);
    textfield1.setBackground(new Color(224,224,224));
    textfield1.setFont(new Font("Andale Mono", 1, 14));
    textfield1.setForeground(new Color(0,0,0));
    add(textfield1);

    boton1 = new JButton("Ingresar ->");
    boton1.setBounds(45,320,110,30);
    boton1.setBackground(new Color(192,192,192));
    boton1.setFont(new Font("Andale Mono", 1, 14));
    boton1.setForeground(new Color(255,255,255));
    boton1.addActionListener(this);
    add(boton1);
  }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton1){
       texto = textfield1.getText().trim();
       if(texto.equals("")){
         JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre de usuario");
       } else {
         JOptionPane.showMessageDialog(null, " * Bienvenido " + texto + " * ");
         Condiciones ventanaCondiciones = new Condiciones();
         ventanaCondiciones.setBounds(0,0,600,390);
         ventanaCondiciones.setVisible(true);
         ventanaCondiciones.setResizable(false);
         ventanaCondiciones.setLocationRelativeTo(null);
         this.setVisible(false);
       }
     }
  }

  public static void main(String args[]){
    Bienvenida ventanabienvenida = new Bienvenida();
    ventanabienvenida.setBounds(0,0,350,500);
    ventanabienvenida.setVisible(true);
    ventanabienvenida.setResizable(false);
    ventanabienvenida.setLocationRelativeTo(null);
  }
}
