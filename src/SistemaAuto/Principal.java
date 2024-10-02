import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Principal extends JFrame  {
    // Componentes de la interfaz gráfica
    private JTextField nombre;
    private JTextField apellidoPField;
    private JTextField apellidoMField;
    private JComboBox<String> departamentoCombo;
    private JComboBox<String> antiguedadCombo;
    private JTextArea resultadoArea;
    private JLabel label4, label1,labelUsuario, labelNombre, labelApellidoP, labelApellidoM, labelTitulo, labelDepartamento, labelAntiguedad;
    String nombre2 = "";
    
    
    public Principal() {
      
      
        
        // Configuración de la ventana
        setTitle("Calculadora de Vacaciones");
        setIconImage(new ImageIcon("C:\\Users\\PC\\Documents\\NetBeansProjects\\AutoRepuesto\\img\\coche.png").getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(530, 680); // Tamaño ajustado
        setLayout(null); // Usamos layout absoluto para usar setBounds
        setResizable(false);
        setLocationRelativeTo(null); // Centrar la ventana
        
        Bienvenida ventanaBienvenida = new Bienvenida();
        nombre2 = ventanaBienvenida.texto;
        
        // Imagen ajustada y centrada
        ImageIcon imagen = new ImageIcon("C:\\Users\\PC\\Documents\\NetBeansProjects\\AutoRepuesto\\img\\auto_logo.png");
        label1 = new JLabel(imagen);
        label1.setBounds(110, 10, 320, 150); // Ajustamos la posición y tamaño de la imagen
        add(label1);

        // Título centrado
        labelTitulo = new JLabel(" --- DATOS DEL TRABAJADOR  --- ", SwingConstants.CENTER);
        labelTitulo.setFont(new Font("Andale Mono", Font.BOLD, 16));
        labelTitulo.setForeground(Color.WHITE);
        labelTitulo.setBounds(20, 170, 500, 30); // Ajustar posición y tamaño del título
        add(labelTitulo);
        labelUsuario = new JLabel("  usuario: "+ nombre2 + " ", SwingConstants.CENTER);
        labelUsuario.setFont(new Font("Andale Mono", Font.BOLD, 12));
        labelUsuario.setForeground(Color.WHITE);
        labelUsuario.setBounds(20, 190, 500, 30); // Ajustar posición y tamaño del título
        add(labelUsuario);
        
        //Pie de pagina 
        label4 = new JLabel(" © 2024 AUTOREPUESTOS GRT ", SwingConstants.CENTER);
        label4.setBounds(120,590,300,30);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(new Color(255,255,255));
        add(label4);
        label4 = new JLabel(" - Abner Sac - Programacion II - Seccion A -", SwingConstants.CENTER);
        label4.setBounds(120,610,300,30);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(new Color(255,255,255));
        add(label4);

        // Etiqueta y campo de texto para el nombre
        labelNombre = new JLabel(" Nombre ");
        labelNombre.setFont(new Font("Andale Mono", Font.PLAIN, 14));
        labelNombre.setForeground(Color.WHITE);
        labelNombre.setBounds(50, 220, 150, 30);
        add(labelNombre);

        nombre = new JTextField();
        nombre.setBackground(new Color(224, 224, 224));
        nombre.setFont(new Font("Andale Mono", Font.BOLD, 14));
        nombre.setBounds(50, 250, 200, 30); // Campo de texto ajustado
        add(nombre);

        // Etiqueta y campo de texto para el apellido paterno
        labelApellidoP = new JLabel("Apellido Paterno");
        labelApellidoP.setFont(new Font("Andale Mono", Font.PLAIN, 14));
        labelApellidoP.setForeground(Color.WHITE);
        labelApellidoP.setBounds(280, 220, 150, 30);
        add(labelApellidoP);

        apellidoPField = new JTextField();
        apellidoPField.setBackground(new Color(224, 224, 224));
        apellidoPField.setFont(new Font("Andale Mono", Font.BOLD, 14));
        apellidoPField.setBounds(280, 250, 200, 30); // Campo de texto ajustado
        add(apellidoPField);

        // Etiqueta y campo de texto para el apellido materno
        labelApellidoM = new JLabel("Apellido Materno");
        labelApellidoM.setFont(new Font("Andale Mono", Font.PLAIN, 14));
        labelApellidoM.setForeground(Color.WHITE);
        labelApellidoM.setBounds(50, 290, 150, 30);
        add(labelApellidoM);

        apellidoMField = new JTextField();
        apellidoMField.setBackground(new Color(224, 224, 224));
        apellidoMField.setFont(new Font("Andale Mono", Font.BOLD, 14));
        apellidoMField.setBounds(50, 320, 200, 30); // Campo de texto ajustado
        add(apellidoMField);

        // Etiqueta y combo box para departamento
        labelDepartamento = new JLabel("Departamento");
        labelDepartamento.setFont(new Font("Andale Mono", Font.PLAIN, 14));
        labelDepartamento.setForeground(Color.WHITE);
        labelDepartamento.setBounds(280, 290, 150, 30);
        add(labelDepartamento);

        String[] departamentos = {"","Atención al Cliente", "Departamento de Logística", "Departamento de Gerencia"};
        departamentoCombo = new JComboBox<>(departamentos);
        departamentoCombo.setBounds(280, 320, 200, 30);
        add(departamentoCombo);

        // Etiqueta y combo box para antigüedad
        labelAntiguedad = new JLabel("Antigüedad");
        labelAntiguedad.setFont(new Font("Andale Mono", Font.PLAIN, 14));
        labelAntiguedad.setForeground(Color.WHITE);
        labelAntiguedad.setBounds(50, 360, 150, 30);
        add(labelAntiguedad);

        String[] antiguedades = {" ","1 año de servicio", "2 a 6 años de servicio", "7 años o más de servicio"};
        antiguedadCombo = new JComboBox<>(antiguedades);
        antiguedadCombo.setBounds(50, 390, 200, 30);
        add(antiguedadCombo);

        // Área de texto para mostrar el resultado
        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);
        resultadoArea.setBackground(new Color(224, 224, 224));
        resultadoArea.setFont(new Font("Andale Mono", Font.BOLD, 14));
        JScrollPane scrollPane = new JScrollPane(resultadoArea);
        scrollPane.setBounds(50, 430, 430, 100); // Área de resultados más grande
        add(scrollPane);

        // Botón para calcular vacaciones
        JButton calcularButton = new JButton("Calcular Vacaciones");
        calcularButton.setFont(new Font("Andale Mono", Font.BOLD, 14));
        calcularButton.setBackground(new Color(192, 192, 192));
        calcularButton.setBounds(50, 540, 180, 40); // Botón centrado
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularVacaciones();
            }
        });
        add(calcularButton);

        // Botón para limpiar campos
        JButton limpiarButton = new JButton("Limpiar");
        limpiarButton.setFont(new Font("Andale Mono", Font.BOLD, 14));
        limpiarButton.setBackground(new Color(192, 192, 192));
        limpiarButton.setBounds(270, 540, 90, 40); // Botón centrado
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });
        add(limpiarButton);

        // Botón para regresar
        JButton regresarButton = new JButton("Regresar");
        regresarButton.setFont(new Font("Andale Mono", Font.BOLD, 14));
        regresarButton.setBackground(new Color(192, 192, 192));
        regresarButton.setBounds(370, 540, 100, 40); // Botón centrado
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                regresar();
            }
        });
        add(regresarButton);

        // Fondo personalizado
        getContentPane().setBackground(new Color(0, 0, 0)); // Fondo del JFrame
    }

    public static void main(String[] args) {
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setVisible(true);
    }

    private void calcularVacaciones() {
        String nombreTrabajador = nombre.getText();
        String AP = apellidoPField.getText();
        String AM = apellidoMField.getText();
        String departamento = (String) departamentoCombo.getSelectedItem();
        String antiguedad = (String) antiguedadCombo.getSelectedItem();

        String resultado = calcularVacaciones(nombreTrabajador, AP, AM, departamento, antiguedad);
        resultadoArea.setText(resultado);
    }

    public static String calcularVacaciones(String nombre, String AP, String AM, String departamento, String antiguedad) {
        String resultado = "";

        if (departamento.equals("Atención al Cliente")) {
            if (antiguedad.equals("1 año de servicio")) {
                resultado = "\nEl trabajador " + nombre + " " + AP + " " + AM +
                        "\nquien labora en " + departamento + " con " + antiguedad +
                        "\nrecibe 6 días de vacaciones.";
            } else if (antiguedad.equals("2 a 6 años de servicio")) {
                resultado = "\nEl trabajador " + nombre + " " + AP + " " + AM +
                        "\nquien labora en " + departamento + " con " + antiguedad +
                        "\nrecibe 14 días de vacaciones.";
            } else if (antiguedad.equals("7 años o más de servicio")) {
                resultado = "\nEl trabajador " + nombre + " " + AP + " " + AM +
                        "\nquien labora en " + departamento + " con " + antiguedad +
                        "\nrecibe 20 días de vacaciones.";
            }
        } else if (departamento.equals("Departamento de Logística")) {
            if (antiguedad.equals("1 año de servicio")) {
                resultado = "\nEl trabajador " + nombre + " " + AP + " " + AM +
                        "\nquien labora en " + departamento + " con " + antiguedad +
                        "\nrecibe 7 días de vacaciones.";
            } else if (antiguedad.equals("2 a 6 años de servicio")) {
                resultado = "\nEl trabajador " + nombre + " " + AP + " " + AM +
                        "\nquien labora en " + departamento + " con " + antiguedad +
                        "\nrecibe 15 días de vacaciones.";
            } else if (antiguedad.equals("7 años o más de servicio")) {
                resultado = "\nEl trabajador " + nombre + " " + AP + " " + AM +
                        "\nquien labora en " + departamento + " con " + antiguedad +
                        "\nrecibe 22 días de vacaciones.";
            }
        } else if (departamento.equals("Departamento de Gerencia")) {
            if (antiguedad.equals("1 año de servicio")) {
                resultado = "\nEl trabajador " + nombre + " " + AP + " " + AM +
                        "\nquien labora en " + departamento + " con " + antiguedad +
                        "\nrecibe 10 días de vacaciones.";
            } else if (antiguedad.equals("2 a 6 años de servicio")) {
                resultado = "\nEl trabajador " + nombre + " " + AP + " " + AM +
                        "\nquien labora en " + departamento + " con " + antiguedad +
                        "\nrecibe 20 días de vacaciones.";
            } else if (antiguedad.equals("7 años o más de servicio")) {
                resultado = "\nEl trabajador " + nombre + " " + AP + " " + AM +
                        "\nquien labora en " + departamento + " con " + antiguedad +
                        "\nrecibe 30 días de vacaciones.";
            }
        }

        return resultado;
    }

    private void limpiarCampos() {
        nombre.setText("");
        apellidoPField.setText("");
        apellidoMField.setText("");
        departamentoCombo.setSelectedIndex(0);
        antiguedadCombo.setSelectedIndex(0);
        resultadoArea.setText(""); // Limpiar el área de resultados
    }
    
    private void regresar(){
        Bienvenida ventanabienvenida = new Bienvenida();
            ventanabienvenida.setBounds(0, 0, 350, 450);
            ventanabienvenida.setVisible(true);
            ventanabienvenida.setResizable(false);
            ventanabienvenida.setLocationRelativeTo(null);
            this.setVisible(false);  
    }
}
