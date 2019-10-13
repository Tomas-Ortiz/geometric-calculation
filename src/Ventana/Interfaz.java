package Ventana;

import java.awt.Color;
import java.awt.Image;
import java.util.LinkedList;    //librerías utilizadas
import java.util.Queue;
import java.util.Stack;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Interfaz extends javax.swing.JFrame {

    private String ang = "", nombre_mayor;
    private float resultado = 0, text1 = 0, text2 = 0, text3 = 0, resp1 = 0, resp2 = 0;
    private Queue hist = new LinkedList();  //cola para guardar los resultados
    //la lista doblemente enlazada utiliza los métodos de la queue, queue es una clase abstracta
    //se utiliza LinkedList ya que es más rápida que un arraylist en cuanto a añadir o remover elementos
    private Stack<DatosUsuario> punt = new Stack(); //stack parametrizado para guardar los puntajes
    private int mayor = 0;
    private boolean flag, en_leccion = false, intercalar = false, exc = false;

    DatosUsuario jug;   //se declara el objeto jug, para guardar información del jugador 

    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null); //no se establece una localizacion relativa (posicion fija)

        DeshabilitarAngulos();
        DeshabilitarInicio();
        DeshabilitarLeccion();

        LabelAltura.setText("Base");  //se habilitan/deshabilitan algunos componentes al inicio
        LabelProfundidad.setText("Altura");
        DeshabilitarPrimeroTextoyLabel();
        HabilitarTercerTextoyLabel();

        jScrollPane1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContenedorFiguras = new javax.swing.ButtonGroup();
        ContenedorCalcular = new javax.swing.ButtonGroup();
        ContenedorAngulos = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        BotCalcular = new javax.swing.JButton();
        LabelProfundidad = new javax.swing.JLabel();
        LabelBase = new javax.swing.JLabel();
        BotModoLeccion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        TercerTexto = new javax.swing.JTextField();
        PrimerTexto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        LabelImagenFigura = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BotBorrar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        RbAngulo = new javax.swing.JRadioButton();
        Separador2 = new javax.swing.JSeparator();
        RbPerimetro = new javax.swing.JRadioButton();
        RbDiagonal = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        BotSalir = new javax.swing.JButton();
        BtMostrarHistorial = new javax.swing.JButton();
        RbRadio = new javax.swing.JRadioButton();
        RbVolumen = new javax.swing.JRadioButton();
        RbSuperficie = new javax.swing.JRadioButton();
        RbDiametro = new javax.swing.JRadioButton();
        RbAnguloA = new javax.swing.JRadioButton();
        RbAnguloB = new javax.swing.JRadioButton();
        RbAnguloC = new javax.swing.JRadioButton();
        SegundoTexto = new javax.swing.JTextField();
        LabelAltura = new javax.swing.JLabel();
        Figuras = new javax.swing.JComboBox<>();
        RbCentro = new javax.swing.JRadioButton();
        LbRespuesta = new javax.swing.JLabel();
        TextoRespuesta1 = new javax.swing.JTextField();
        TextoRespuesta2 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        SeparadorVertical = new javax.swing.JSeparator();
        Separador1 = new javax.swing.JSeparator();
        LbAciertos = new javax.swing.JLabel();
        LbJugador = new javax.swing.JLabel();
        LbPuntaje = new javax.swing.JLabel();
        BotPuntaje = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaHistorial = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 600, 10));

        BotCalcular.setBackground(new java.awt.Color(255, 255, 255));
        BotCalcular.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BotCalcular.setText("Calcular");
        BotCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(BotCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 130, 40));

        LabelProfundidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelProfundidad.setText("Profundidad");
        getContentPane().add(LabelProfundidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 80, 23));

        LabelBase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelBase.setText("Base");
        getContentPane().add(LabelBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 50, 20));

        BotModoLeccion.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        BotModoLeccion.setText("Modo lección");
        BotModoLeccion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotModoLeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotModoLeccionActionPerformed(evt);
            }
        });
        getContentPane().add(BotModoLeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 449, 130, 30));

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 3, 24)); // NOI18N
        jLabel4.setText("ANÁLISIS GEOMÉTRICO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 330, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("Seleccione una figura:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 160, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 600, 10));
        getContentPane().add(TercerTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 383, 100, -1));
        getContentPane().add(PrimerTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 383, 100, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 120, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -10, 140, 80));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, -10, 140, 80));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, -10, 140, 80));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, -10, 140, 80));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, -10, 140, 80));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -10, 140, 80));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, -10, 140, 80));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, -10, 140, 80));

        LabelImagenFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rectangulo.png"))); // NOI18N
        LabelImagenFigura.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(LabelImagenFigura, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 145, 240, 130));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, -10, 140, 80));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 110, 70));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, -10, 80, 80));

        BotBorrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotBorrar.setText("Limpiar valores");
        BotBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(BotBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 110, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 600, 10));

        ContenedorCalcular.add(RbAngulo);
        RbAngulo.setText("Ángulo");
        RbAngulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbAnguloActionPerformed(evt);
            }
        });
        getContentPane().add(RbAngulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        Separador2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 481, 600, 10));

        ContenedorCalcular.add(RbPerimetro);
        RbPerimetro.setText("Perímetro");
        RbPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbPerimetroActionPerformed(evt);
            }
        });
        getContentPane().add(RbPerimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 80, -1));

        ContenedorCalcular.add(RbDiagonal);
        RbDiagonal.setText("Diagonal");
        RbDiagonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbDiagonalActionPerformed(evt);
            }
        });
        getContentPane().add(RbDiagonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Calcular:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 305, -1, -1));

        BotSalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotSalir.setText("Salir");
        BotSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BotSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 90, 30));

        BtMostrarHistorial.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        BtMostrarHistorial.setText("Mostrar historial");
        BtMostrarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMostrarHistorialActionPerformed(evt);
            }
        });
        getContentPane().add(BtMostrarHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 419, 130, 30));

        ContenedorCalcular.add(RbRadio);
        RbRadio.setText("Radio");
        RbRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbRadioActionPerformed(evt);
            }
        });
        getContentPane().add(RbRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        ContenedorCalcular.add(RbVolumen);
        RbVolumen.setText("Volumen");
        RbVolumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbVolumenActionPerformed(evt);
            }
        });
        getContentPane().add(RbVolumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        ContenedorCalcular.add(RbSuperficie);
        RbSuperficie.setText("Superficie");
        RbSuperficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbSuperficieActionPerformed(evt);
            }
        });
        getContentPane().add(RbSuperficie, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        ContenedorCalcular.add(RbDiametro);
        RbDiametro.setText("Diámetro");
        RbDiametro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbDiametroActionPerformed(evt);
            }
        });
        getContentPane().add(RbDiametro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        ContenedorAngulos.add(RbAnguloA);
        RbAnguloA.setSelected(true);
        RbAnguloA.setText("Ángulo A");
        RbAnguloA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbAnguloAActionPerformed(evt);
            }
        });
        getContentPane().add(RbAnguloA, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 485, -1, -1));

        ContenedorAngulos.add(RbAnguloB);
        RbAnguloB.setText("Ángulo B");
        getContentPane().add(RbAnguloB, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 485, -1, -1));

        ContenedorAngulos.add(RbAnguloC);
        RbAnguloC.setText("Ángulo C");
        getContentPane().add(RbAnguloC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 485, -1, -1));

        SegundoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SegundoTextoActionPerformed(evt);
            }
        });
        getContentPane().add(SegundoTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 383, 100, -1));

        LabelAltura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelAltura.setText("Altura");
        getContentPane().add(LabelAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 60, 23));

        Figuras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "     Rectángulo", "      Triángulo", "      Cuadrado", "  Circunferencia" }));
        Figuras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FigurasActionPerformed(evt);
            }
        });
        getContentPane().add(Figuras, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 103, 120, 30));

        ContenedorCalcular.add(RbCentro);
        RbCentro.setText("Centro");
        RbCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbCentroActionPerformed(evt);
            }
        });
        getContentPane().add(RbCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));

        LbRespuesta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LbRespuesta.setText("Escriba su respuesta");
        getContentPane().add(LbRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 130, 20));

        TextoRespuesta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoRespuesta1ActionPerformed(evt);
            }
        });
        getContentPane().add(TextoRespuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 70, 25));

        TextoRespuesta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoRespuesta2ActionPerformed(evt);
            }
        });
        getContentPane().add(TextoRespuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 70, 25));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 600, 10));

        SeparadorVertical.setForeground(new java.awt.Color(0, 0, 0));
        SeparadorVertical.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(SeparadorVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 10, 50));

        Separador1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 413, 600, 10));

        LbAciertos.setText("Aciertos:");
        getContentPane().add(LbAciertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 100, 20));

        LbJugador.setText("Jugador:");
        getContentPane().add(LbJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 120, 20));

        LbPuntaje.setText("Puntaje:");
        getContentPane().add(LbPuntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 110, 20));

        BotPuntaje.setText("Puntajes");
        BotPuntaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotPuntajeActionPerformed(evt);
            }
        });
        getContentPane().add(BotPuntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 485, 80, 20));

        TablaHistorial.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "                   Historial"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaHistorial);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 190, 120));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/13.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 70, 600, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotModoLeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotModoLeccionActionPerformed

        //se intercala la ejecución de codigo, para que el boton sea "dinámico"
        if (intercalar == false) {  //intercalar se inicliaza con false, la primera siempre ingresa al primer if
            en_leccion = true;

            BotBorrarActionPerformed(evt);
            DeshabilitarAngulos();
            HabilitarLeccion(); //se habilitan los componentes del boton "Leccion"
            BotCalcular.setText("Comprobar");
            String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");

            if (nombre != null) {   //Si se ha ingresado el nombre y no ha puesto cancelar entonces

                jug = new DatosUsuario(nombre); //se instancia el objeto jug y se pasa por parámetro el nombre

                LbJugador.setText("Jugador: " + jug.getNombre());   //Nombre, puntaje y aciertos del jugador
                LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                BotModoLeccion.setText("Salir modo lección"); //El boton es dinámico, cambia según el estado
                intercalar = true;

                if (RbCentro.isSelected()) {
                    TextoRespuesta2.setVisible(true);
                }

            } else {    //si se ha pulsado cancelar o la cruz, entonces
                DeshabilitarLeccion();
                BotCalcular.setText("Calcular");
                en_leccion = false;
            }
        } else {
            DeshabilitarLeccion(); //si se aprieta por 2da vez el boton, entonces
            BotBorrarActionPerformed(evt);
            BotCalcular.setText("Calcular");
            en_leccion = false;
            BotModoLeccion.setText("Modo lección");
            intercalar = false;
        }


    }//GEN-LAST:event_BotModoLeccionActionPerformed

    private void BotCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotCalcularActionPerformed

        //se obtiene TablaHistorial como modelo de tabla por defecto
        DefaultTableModel tabla = (DefaultTableModel) TablaHistorial.getModel();

        //Se controla según lo que esté visible en pantalla
        if (PrimerTexto.isVisible() && SegundoTexto.isVisible() && TercerTexto.isVisible()) {

            PosibleError.error_vacio = 0;  //se reinician las variables estáticas
            PosibleError.error_for = 0;
            PosibleError.ControlarExcepcion(PrimerTexto, "Float");//Se controlan las posibles excepciones de los TextBox
            PosibleError.ControlarExcepcion(SegundoTexto, "Float");
            PosibleError.ControlarExcepcion(TercerTexto, "Float");

        } else if (!PrimerTexto.isVisible() && SegundoTexto.isVisible() && TercerTexto.isVisible()) {

            PosibleError.error_vacio = 0;
            PosibleError.error_for = 0;
            PosibleError.ControlarExcepcion(SegundoTexto, "Float");
            PosibleError.ControlarExcepcion(TercerTexto, "Float");

        } else if (!PrimerTexto.isVisible() && SegundoTexto.isVisible() && !TercerTexto.isVisible()) {

            PosibleError.error_vacio = 0;
            PosibleError.error_for = 0;
            PosibleError.ControlarExcepcion(SegundoTexto, "Float");

        }

        if (TextoRespuesta1.isVisible() && TextoRespuesta2.isVisible()) {
            //Si está en modo lección, también se controlan las excepcioenes

            PosibleError.ControlarExcepcion(TextoRespuesta1, "Float");
            PosibleError.ControlarExcepcion(TextoRespuesta2, "Float");

        } else if (TextoRespuesta1.isVisible() && !TextoRespuesta2.isVisible()) {
            PosibleError.ControlarExcepcion(TextoRespuesta1, "Float");
        }

        if (PosibleError.error_vacio > 0 || PosibleError.error_for > 0) { //Si existe algun error de formato o de vacio 
            if (PosibleError.error_vacio > 0) {
                JOptionPane.showMessageDialog(null, "  Error, complete los campos faltantes.", " Advertencia", JOptionPane.WARNING_MESSAGE);
            }
            if (PosibleError.error_for > 0) {
                JOptionPane.showMessageDialog(null, "  Error, ingrese valores numéricos.", " Advertencia", JOptionPane.WARNING_MESSAGE);

            }

        } else {  //Si no existen errores (error_vacio==0 && error_for==0) se calcula 

            exc = false;    //se reincia la bandera para controlar la excepcion propia

            if (TextoRespuesta1.isVisible() && !TextoRespuesta2.isVisible()) {
                resp1 = Float.parseFloat(TextoRespuesta1.getText());
            } else if (TextoRespuesta1.isVisible() && TextoRespuesta2.isVisible()) {
                resp1 = Float.parseFloat(TextoRespuesta1.getText());
                resp2 = Float.parseFloat(TextoRespuesta2.getText()); //Se convierten los textosResuestas según lo seleccionado
            }

            switch (Figuras.getSelectedIndex()) {   //según la figura seleccionada se ejecutará un case 

                case 0:   //Rectangulo

                    text2 = Float.parseFloat(SegundoTexto.getText()); //En principio solo se convierten dos TextBox
                    text3 = Float.parseFloat(TercerTexto.getText());

                    Rectangulo r = new Rectangulo();    //se instancia el objeto de la clase rectangulo
                    if (RbSuperficie.isSelected()) {
                        try {
                            resultado = r.CalcularSuperficie(text2, text3); //Se llama al método y el resultado se almacena en el atributo
                        } catch (ExcepcionPropia e) {
                            e.mostrarMensaje();
                            exc = true;
                        }
                        if (exc != true) {
                            if (en_leccion == true) {   //Si está en lección, el resultado se redondea a un decimal

                                resultado = Math.round(resultado * 10.0f) / 10.0f;

                                if (resp1 == resultado) {   //Si la respuesta coincide con el resultado, entonces

                                    jug.setPuntaje(jug.getPuntaje() + 10);  //Se suman 10 puntos y un acierto al jugador
                                    jug.setAciertos(jug.getAciertos() + 1);

                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));  //Se actualizan los labels
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has acertado! \n Tu resultado fue " + resp1 + "\n La superficie es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                } else {    //Si la respuesta es errónea entonces
                                    jug.setPuntaje(jug.getPuntaje() - 5);   //se restan 5 puntos
                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has fallado! \n Tu resultado fue " + resp1 + "\n La superficie es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                }

                            } else {    //Si no está en modo lección, simplemente se muestra el resultado
                                JOptionPane.showMessageDialog(null, " La superficie es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }

                    } else if (RbPerimetro.isSelected()) {

                        try {
                            resultado = r.CalcularPeri(text2, text3);
                        } catch (ExcepcionPropia e) {
                            e.mostrarMensaje();
                            exc = true;
                        }
                        if (exc != true) {
                            if (en_leccion == true) {

                                resultado = Math.round(resultado * 10.0f) / 10.0f;

                                if (resp1 == resultado) {

                                    jug.setPuntaje(jug.getPuntaje() + 10);
                                    jug.setAciertos(jug.getAciertos() + 1);

                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has acertado! \n Tu resultado fue " + resp1 + "\n El perímetro es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    jug.setPuntaje(jug.getPuntaje() - 5);
                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has fallado! \n Tu resultado fue " + resp1 + "\n El perimetro es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, " El perímetro es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    } else if (RbVolumen.isSelected()) {

                        text1 = Float.parseFloat(PrimerTexto.getText());
                        try {
                            resultado = r.CalcularVolumen(text1, text2, text3);
                        } catch (ExcepcionPropia e) {
                            e.mostrarMensaje();
                            exc = true;
                        }
                        if (exc != true) {

                            if (en_leccion == true) {

                                resultado = Math.round(resultado * 10.0f) / 10.0f;

                                if (resp1 == resultado) {

                                    jug.setPuntaje(jug.getPuntaje() + 10);
                                    jug.setAciertos(jug.getAciertos() + 1);

                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has acertado! \n Tu resultado fue " + resp1 + "\n El volumen es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    jug.setPuntaje(jug.getPuntaje() - 5);
                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has fallado! \n Tu resultado fue " + resp1 + "\n El volumen es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, " El volumen es " + resultado + " cm3", " Resultado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }

                    } else if (RbDiagonal.isSelected()) {
                        try {
                            resultado = r.CalcularDiagonal(text2, text3);
                        } catch (ExcepcionPropia e) {
                            e.mostrarMensaje();
                            exc = true;
                        }
                        if (exc != true) {

                            if (en_leccion == true) {

                                resultado = Math.round(resultado * 10.0f) / 10.0f;

                                if (resp1 == resultado) {

                                    jug.setPuntaje(jug.getPuntaje() + 10);
                                    jug.setAciertos(jug.getAciertos() + 1);

                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has acertado! \n Tu resultado fue " + resp1 + "\n La diagonal es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    jug.setPuntaje(jug.getPuntaje() - 5);
                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has fallado! \n Tu resultado fue " + resp1 + "\n La diagonal es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, " La diagonal es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                    if (exc != true) {
                        hist.add(r); //Se almacena el objeto r de tipo Rectángulo, que contiene el resultado según lo seleccionado
                    }
                    break;

                case 1:  //Triangulo

                    text2 = Float.parseFloat(SegundoTexto.getText());
                    text3 = Float.parseFloat(TercerTexto.getText());

                    Triangulo t = new Triangulo();

                    if (RbAngulo.isSelected()) {
                        if (RbAnguloA.isSelected()) {
                            ang = "AnguloA";
                        } else if (RbAnguloB.isSelected()) {
                            ang = "AnguloB";
                        } else if (RbAnguloC.isSelected()) {
                            ang = "AnguloC";
                        }

                        text1 = Float.parseFloat(PrimerTexto.getText());

                        try {
                            resultado = t.CalcularAngulo(ang, text1, text2, text3);
                        } catch (ExcepcionPropia e) {
                            e.mostrarMensaje();
                            exc = true;
                        }
                        if (exc != true) {
                            if (en_leccion == true) {

                                resultado = Math.round(resultado * 10.0f) / 10.0f;

                                if (resp1 == resultado) {

                                    jug.setPuntaje(jug.getPuntaje() + 10);
                                    jug.setAciertos(jug.getAciertos() + 1);

                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has acertado! \n Tu resultado fue " + resp1 + "\n El ángulo es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    jug.setPuntaje(jug.getPuntaje() - 5);
                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has fallado! \n Tu resultado fue " + resp1 + "\n El ángulo es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, " El ángulo es " + resultado + "°", " Resultado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    } else if (RbPerimetro.isSelected()) {
                        text1 = Float.parseFloat(PrimerTexto.getText());
                        try {
                            resultado = t.CalcularPeri(text1, text2, text3);
                        } catch (ExcepcionPropia e) {
                            e.mostrarMensaje();
                            exc = true;
                        }
                        if (exc != true) {
                            if (en_leccion == true) {

                                resultado = Math.round(resultado * 10.0f) / 10.0f;

                                if (resp1 == resultado) {

                                    jug.setPuntaje(jug.getPuntaje() + 10);
                                    jug.setAciertos(jug.getAciertos() + 1);

                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has acertado! \n Tu resultado fue " + resp1 + "\n El perímetro es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    jug.setPuntaje(jug.getPuntaje() - 5);
                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has fallado! \n Tu resultado fue " + resp1 + "\n El perimetro es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, " El perímetro es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    } else if (RbSuperficie.isSelected()) {
                        try {
                            resultado = t.CalcularSuperficie(text2, text3);
                        } catch (ExcepcionPropia e) {
                            e.mostrarMensaje();
                            exc = true;
                        }
                        if (exc != true) {

                            if (en_leccion == true) {

                                resultado = Math.round(resultado * 10.0f) / 10.0f;

                                if (resp1 == resultado) {

                                    jug.setPuntaje(jug.getPuntaje() + 10);
                                    jug.setAciertos(jug.getAciertos() + 1);

                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has acertado! \n Tu resultado fue " + resp1 + "\n La superficie es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    jug.setPuntaje(jug.getPuntaje() - 5);
                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has fallado! \n Tu resultado fue " + resp1 + "\n La superficie es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, " La superficie es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                    if (exc != true) {
                        hist.add(t);
                    }

                    break;

                case 2:     //Cuadrado

                    text2 = Float.parseFloat(SegundoTexto.getText());

                    Cuadrado c = new Cuadrado();
                    if (RbSuperficie.isSelected()) {

                        try {
                            resultado = c.CalcularSuperficie(text2);
                        } catch (ExcepcionPropia e) {
                            e.mostrarMensaje();
                            exc = true;
                        }
                        if (exc != true) {
                            if (en_leccion == true) {

                                resultado = Math.round(resultado * 10.0f) / 10.0f;

                                if (resp1 == resultado) {

                                    jug.setPuntaje(jug.getPuntaje() + 10);
                                    jug.setAciertos(jug.getAciertos() + 1);

                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has acertado! \n Tu resultado fue " + resp1 + "\n La superficie es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    jug.setPuntaje(jug.getPuntaje() - 5);
                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has fallado! \n Tu resultado fue " + resp1 + "\n La Superficie es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, " La superficie es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    } else if (RbPerimetro.isSelected()) {

                        try {
                            resultado = c.CalcularPeri(text2);
                        } catch (ExcepcionPropia e) {
                            e.mostrarMensaje();
                            exc = true;
                        }
                        if (exc != true) {
                            if (en_leccion == true) {

                                resultado = Math.round(resultado * 10.0f) / 10.0f;

                                if (resp1 == resultado) {

                                    jug.setPuntaje(jug.getPuntaje() + 10);
                                    jug.setAciertos(jug.getAciertos() + 1);

                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has acertado! \n Tu resultado fue " + resp1 + "\n El perímetro es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    jug.setPuntaje(jug.getPuntaje() - 5);
                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has fallado! \n Tu resultado fue " + resp1 + "\n El perimetro es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, " El perímetro es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }

                    } else if (RbDiagonal.isSelected()) {

                        try {
                            resultado = c.CalcularDiagonal(text2);
                        } catch (ExcepcionPropia e) {
                            e.mostrarMensaje();
                            exc = true;
                        }
                        if (exc != true) {
                            if (en_leccion == true) {

                                resultado = Math.round(resultado * 10.0f) / 10.0f;

                                if (resp1 == resultado) {

                                    jug.setPuntaje(jug.getPuntaje() + 10);
                                    jug.setAciertos(jug.getAciertos() + 1);

                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has acertado! \n Tu resultado fue " + resp1 + "\n La diagonal es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    jug.setPuntaje(jug.getPuntaje() - 5);
                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has fallado! \n Tu resultado fue " + resp1 + "\n La diagonal es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, " La diagonal es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }

                    } else if (RbCentro.isSelected()) {
                        try {
                            c.CalcularCentro(text2);
                        } catch (ExcepcionPropia e) {
                            e.mostrarMensaje();
                            exc = true;
                        }
                        if (exc != true) {

                            if (en_leccion == true) {

                                c.x = Math.round(c.x * 10.0f) / 10.0f;
                                c.y = Math.round(c.y * 10.0f) / 10.0f;

                                if (resp1 == c.x && resp2 == c.y) {

                                    jug.setPuntaje(jug.getPuntaje() + 10);
                                    jug.setAciertos(jug.getAciertos() + 1);

                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has acertado! \n Tu resultado fue (" + resp1 + "," + resp2 + ")" + "\n El centro es (" + c.x + "," + c.y + ")", " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    jug.setPuntaje(jug.getPuntaje() - 5);
                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has fallado! \n Tu resultado fue (" + resp1 + "," + resp2 + ")" + "\n El centro es (" + c.x + "," + c.y + ")", " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, " El centro es (" + c.x + "," + c.y + ")", " Resultado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                    if (exc != true) {
                        hist.add(c);
                    }

                    break;

                case 3:     //Circunferencia

                    text2 = Float.parseFloat(SegundoTexto.getText());

                    Circunferencia cir = new Circunferencia();
                    
                    if (RbSuperficie.isSelected()) {
                        try {
                            resultado = cir.CalcularSuperficie(text2);
                        } catch (ExcepcionPropia e) {
                            e.mostrarMensaje();
                            exc = true;
                        }
                        if (exc != true) {
                            if (en_leccion == true) {

                                resultado = Math.round(resultado * 10.0f) / 10.0f;

                                if (resp1 == resultado) {

                                    jug.setPuntaje(jug.getPuntaje() + 10);
                                    jug.setAciertos(jug.getAciertos() + 1);

                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has acertado! \n Tu resultado fue " + resp1 + "\n La superficie es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    jug.setPuntaje(jug.getPuntaje() - 5);
                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has fallado! \n Tu resultado fue " + resp1 + "\n La superficie es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, " La superficie es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }

                    } else if (RbRadio.isSelected()) {

                        try {
                            resultado = cir.CalcularRadio(text2);
                        } catch (ExcepcionPropia e) {
                            e.mostrarMensaje();
                            exc = true;
                        }
                        if (exc != true) {
                            if (en_leccion == true) {

                                resultado = Math.round(resultado * 10.0f) / 10.0f;

                                if (resp1 == resultado) {

                                    jug.setPuntaje(jug.getPuntaje() + 10);
                                    jug.setAciertos(jug.getAciertos() + 1);

                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has acertado! \n Tu resultado fue " + resp1 + "\n El radio es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    jug.setPuntaje(jug.getPuntaje() - 5);
                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has fallado! \n Tu resultado fue " + resp1 + "\n El radio es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, " El radio es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    } else if (RbPerimetro.isSelected()) {
                        try {

                            resultado = cir.CalcularPeri(text2);
                        } catch (ExcepcionPropia e) {
                            e.mostrarMensaje();
                            exc = true;
                        }
                        if (exc != true) {
                            if (en_leccion == true) {

                                resultado = Math.round(resultado * 10.0f) / 10.0f;

                                if (resp1 == resultado) {

                                    jug.setPuntaje(jug.getPuntaje() + 10);
                                    jug.setAciertos(jug.getAciertos() + 1);

                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has acertado! \n Tu resultado fue " + resp1 + "\n El perímetro es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    jug.setPuntaje(jug.getPuntaje() - 5);
                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has fallado! \n Tu resultado fue " + resp1 + "\n El perímetro es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, " El perímetro es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }

                    } else if (RbDiametro.isSelected()) {
                        try {
                            resultado = cir.CalcularDiametro(text2);
                        } catch (ExcepcionPropia e) {
                            e.mostrarMensaje();
                            exc = true;
                        }
                        if (exc != true) {
                            if (en_leccion == true) {

                                resultado = Math.round(resultado * 10.0f) / 10.0f;

                                if (resp1 == resultado) {

                                    jug.setPuntaje(jug.getPuntaje() + 10);
                                    jug.setAciertos(jug.getAciertos() + 1);

                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has acertado! \n Tu resultado fue " + resp1 + "\n El diámetro es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    jug.setPuntaje(jug.getPuntaje() - 5);
                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has fallado! \n Tu resultado fue " + resp1 + "\n El diámetro es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, " El diámetro es " + resultado, " Resultado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }

                    } else if (RbCentro.isSelected()) {
                        text3 = Float.parseFloat(TercerTexto.getText());
                        try {
                            cir.CalcularCentro(text2, text3);
                        } catch (ExcepcionPropia e) {
                            e.mostrarMensaje();
                            exc = true;
                        }
                        if (exc != true) {
                            if (en_leccion == true) {

                                cir.x = Math.round(cir.x * 10.0f) / 10.0f;
                                cir.y = Math.round(cir.y * 10.0f) / 10.0f;

                                if (resp1 == cir.x && resp2 == cir.y) {

                                    jug.setPuntaje(jug.getPuntaje() + 10);
                                    jug.setAciertos(jug.getAciertos() + 1);

                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has acertado! \n Tu resultado fue (" + resp1 + "," + resp2 + ")" + "\n El centro es (" + cir.x + "," + cir.y + ")", " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    jug.setPuntaje(jug.getPuntaje() - 5);
                                    LbPuntaje.setText("Puntaje: " + Integer.toString(jug.getPuntaje()));
                                    LbAciertos.setText("Aciertos: " + Integer.toString(jug.getAciertos()));

                                    JOptionPane.showMessageDialog(null, " ¡Has fallado! \n Tu resultado fue (" + resp1 + "," + resp2 + ")" + "\n El centro es (" + cir.x + "," + cir.y + ")", " Resultado", JOptionPane.INFORMATION_MESSAGE);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, " El centro es (" + cir.x + "," + cir.y + ")", " Resultado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                    if (exc != true) {
                        hist.add(cir);
                    }

                    break;

                default:

                    break;

            }

            if (jScrollPane1.isVisible()) { //Si la tabla está visible mientras se calcula, entonces

                RemoverFilas(); //Se remueven todas las filas para evitar que se dupliquen los datos

                DatosUsuario.MostrarHistorial((LinkedList) hist, 0, tabla, jScrollPane1); //Se muestra el historial
            }

            if (en_leccion) {   //Si está en modo lección, entonces se almacena el objeto jug de tipo DatosUsuario en la pila
                punt.add(jug);  //El objeto contiene los puntajes de los jugadores

                if (punt.peek().getPuntaje() > mayor) { //Se obtiene el último puntaje obtenido
                    mayor = punt.peek().getPuntaje(); //Si el puntaje es mayor que el anterior, entonces se establece como puntaje mayor
                    nombre_mayor = punt.peek().getNombre(); //se establece el nombre del jugador que obtuvo mayor puntaje
                }
            }
        }

    }//GEN-LAST:event_BotCalcularActionPerformed

    private void BotBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotBorrarActionPerformed

        PrimerTexto.setText(null);  //se borran los contenidos de las cajas de texto
        SegundoTexto.setText(null);
        TercerTexto.setText(null);
        TextoRespuesta1.setText(null);
        TextoRespuesta2.setText(null);

        PrimerTexto.setBackground(Color.white);
        SegundoTexto.setBackground(Color.white); //Se limpian, para indicar que no hay ningún error
        TercerTexto.setBackground(Color.white);
        TextoRespuesta1.setBackground(Color.white);
        TextoRespuesta2.setBackground(Color.white);


    }//GEN-LAST:event_BotBorrarActionPerformed

    private void BotSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotSalirActionPerformed
        System.exit(0);     //Se cierra el programa
    }//GEN-LAST:event_BotSalirActionPerformed

    private void RbAnguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbAnguloActionPerformed
        HabilitarAngulos();

        if (Figuras.getSelectedIndex() == 1) {    //Triangulo
            LabelBase.setText("Lado 1");
            LabelAltura.setText("Lado 2");
            LabelProfundidad.setText("Lado 3");
            HabilitarPrimeroTextoyLabel();
            HabilitarSegundoTextoyLabel();
            HabilitarTercerTextoyLabel();
        }

    }//GEN-LAST:event_RbAnguloActionPerformed

    private void RbSuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbSuperficieActionPerformed
        DeshabilitarAngulos();
        if (Figuras.getSelectedIndex() == 2) {    //Cuadrado
            LabelAltura.setText("Lado");
            DeshabilitarPrimeroTextoyLabel();
            HabilitarSegundoTextoyLabel();
            DeshabilitarTercerTextoyLabel();

        }
        if (Figuras.getSelectedIndex() == 0 || Figuras.getSelectedIndex() == 1) {   //Rectangulo y Triangulo
            DeshabilitarPrimeroTextoyLabel();
            LabelAltura.setText("Base");
            LabelProfundidad.setText("Altura");
            HabilitarSegundoTextoyLabel();
            HabilitarTercerTextoyLabel();

        }

        if (Figuras.getSelectedIndex() == 3) {    //Circunferencia
            DeshabilitarPrimeroTextoyLabel();
            LabelAltura.setText("Radio");
            HabilitarSegundoTextoyLabel();
            DeshabilitarTercerTextoyLabel();

        }

        if (en_leccion == true) {   //Para calcular la superficie solo se necesita un dato (1 textbox habilitado)
            TextoRespuesta1.setVisible(true);
            TextoRespuesta2.setVisible(false);
        }

    }//GEN-LAST:event_RbSuperficieActionPerformed

    private void RbPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbPerimetroActionPerformed
        DeshabilitarAngulos();

        if (Figuras.getSelectedIndex() == 2) {    //Cuadrado

            LabelAltura.setText("Lado");
            DeshabilitarPrimeroTextoyLabel();
            HabilitarSegundoTextoyLabel();
            DeshabilitarTercerTextoyLabel();
        }

        if (Figuras.getSelectedIndex() == 0) {    //Rectangulo
            DeshabilitarPrimeroTextoyLabel();
            LabelAltura.setText("Base");
            LabelProfundidad.setText("Altura");
            HabilitarSegundoTextoyLabel();
            HabilitarTercerTextoyLabel();
        }

        if (Figuras.getSelectedIndex() == 1) {    //Triangulo
            LabelBase.setText("Lado 1");
            LabelAltura.setText("Lado 2");
            LabelProfundidad.setText("Lado 3");
            HabilitarPrimeroTextoyLabel();
            HabilitarSegundoTextoyLabel();
            HabilitarTercerTextoyLabel();
        }

        if (Figuras.getSelectedIndex() == 3) {    //Circunferencia
            DeshabilitarPrimeroTextoyLabel();
            LabelAltura.setText("Radio");
            HabilitarSegundoTextoyLabel();
            DeshabilitarTercerTextoyLabel();
        }

        if (en_leccion == true) {
            TextoRespuesta1.setVisible(true);
            TextoRespuesta2.setVisible(false);
        }

    }//GEN-LAST:event_RbPerimetroActionPerformed

    private void RbRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbRadioActionPerformed
        DeshabilitarAngulos();

        if (Figuras.getSelectedIndex() == 3) {    //Circunferencia
            DeshabilitarPrimeroTextoyLabel();
            LabelAltura.setText("Perímetro");
            HabilitarSegundoTextoyLabel();
            DeshabilitarTercerTextoyLabel();
        }
        if (en_leccion == true) {
            TextoRespuesta1.setVisible(true);
            TextoRespuesta2.setVisible(false);
        }


    }//GEN-LAST:event_RbRadioActionPerformed

    private void RbVolumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbVolumenActionPerformed
        DeshabilitarAngulos();

        if (Figuras.getSelectedIndex() == 0) {    //Rectangulo
            HabilitarPrimeroTextoyLabel();
            HabilitarSegundoTextoyLabel();
            LabelBase.setText("Base");
            LabelAltura.setText("Altura");
            HabilitarSegundoTextoyLabel();
            LabelProfundidad.setText("Profundidad");
            HabilitarTercerTextoyLabel();
        }

        if (en_leccion == true) {
            TextoRespuesta1.setVisible(true);
            TextoRespuesta2.setVisible(false);
        }
    }//GEN-LAST:event_RbVolumenActionPerformed

    private void RbDiagonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbDiagonalActionPerformed
        DeshabilitarAngulos();

        if (Figuras.getSelectedIndex() == 2) {    //Cuadrado
            DeshabilitarPrimeroTextoyLabel();
            LabelAltura.setText("Lado");
            HabilitarSegundoTextoyLabel();
            DeshabilitarTercerTextoyLabel();
        }

        if (Figuras.getSelectedIndex() == 0) {    //Rectangulo
            DeshabilitarPrimeroTextoyLabel();
            LabelAltura.setText("Base");
            LabelProfundidad.setText("Altura");
            HabilitarSegundoTextoyLabel();
            HabilitarTercerTextoyLabel();
        }

        if (en_leccion == true) {
            TextoRespuesta1.setVisible(true);
            TextoRespuesta2.setVisible(false);
        }
    }//GEN-LAST:event_RbDiagonalActionPerformed

    private void RbDiametroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbDiametroActionPerformed
        DeshabilitarAngulos();

        if (Figuras.getSelectedIndex() == 3) {    //Circunferencia
            DeshabilitarPrimeroTextoyLabel();
            LabelAltura.setText("Radio");
            HabilitarSegundoTextoyLabel();
            DeshabilitarTercerTextoyLabel();
        }

        if (en_leccion == true) {
            TextoRespuesta1.setVisible(true);
            TextoRespuesta2.setVisible(false);
        }
    }//GEN-LAST:event_RbDiametroActionPerformed

    private void RbAnguloAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbAnguloAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbAnguloAActionPerformed

    private void FigurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FigurasActionPerformed

        switch (Figuras.getSelectedIndex()) {
            //Rectangulo
            case 0: {
                DeshabilitarAngulos();
                RbRadio.setEnabled(false);
                RbDiagonal.setEnabled(true);
                RbVolumen.setEnabled(true); //Se habilitan y deshabilitan algunos cálculos, cajas de texto y labels
                RbAngulo.setEnabled(false);
                RbDiametro.setEnabled(false);
                RbCentro.setEnabled(false);
                RbSuperficie.setSelected(true);
                DeshabilitarPrimeroTextoyLabel();
                LabelAltura.setText("Base");
                LabelProfundidad.setText("Altura");
                HabilitarSegundoTextoyLabel();
                HabilitarTercerTextoyLabel();
                ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/rectangulo.png"));    //Se especifica la ruta del archivo y se obtiene la imagen 
                ImageIcon imagen = new ImageIcon(icono.getImage().getScaledInstance(LabelImagenFigura.getWidth(), LabelImagenFigura.getHeight(), Image.SCALE_DEFAULT));
                LabelImagenFigura.setIcon(imagen);      //El tamaño de la imagen se establece según el tamaño del label
                //Se establece la imgen de un rectángulo en el label visible
                break;
            }
            //Triángulo
            case 1: {
                RbRadio.setEnabled(false);
                RbDiagonal.setEnabled(false);
                RbVolumen.setEnabled(false);
                RbAngulo.setEnabled(true);
                RbCentro.setEnabled(false);
                RbSuperficie.setSelected(true);
                DeshabilitarPrimeroTextoyLabel();
                LabelAltura.setText("Base");
                LabelProfundidad.setText("Altura");
                HabilitarSegundoTextoyLabel();
                HabilitarTercerTextoyLabel();
                DeshabilitarAngulos();
                ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/Tria.png"));
                ImageIcon imagen = new ImageIcon(icono.getImage().getScaledInstance(LabelImagenFigura.getWidth(), LabelImagenFigura.getHeight(), Image.SCALE_DEFAULT));
                LabelImagenFigura.setIcon(imagen);
                break;
            }
            //cuadrado
            case 2: {
                DeshabilitarAngulos();
                RbRadio.setEnabled(false);
                RbDiagonal.setEnabled(true);
                RbVolumen.setEnabled(false);
                RbAngulo.setEnabled(false);
                RbDiametro.setEnabled(false);
                RbCentro.setEnabled(true);
                RbSuperficie.setSelected(true);
                LabelAltura.setText("Lado");
                DeshabilitarPrimeroTextoyLabel();
                HabilitarSegundoTextoyLabel();
                DeshabilitarTercerTextoyLabel();
                ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/cuadrado.png"));
                ImageIcon imagen = new ImageIcon(icono.getImage().getScaledInstance(LabelImagenFigura.getWidth(), LabelImagenFigura.getHeight(), Image.SCALE_DEFAULT));
                LabelImagenFigura.setIcon(imagen);
                break;
            }
            //Circunferencia
            case 3: {
                DeshabilitarAngulos();
                RbRadio.setEnabled(true);
                RbVolumen.setEnabled(false);
                RbDiagonal.setEnabled(false);
                RbAngulo.setEnabled(true);
                RbDiametro.setEnabled(true);
                RbPerimetro.setEnabled(true);
                RbAngulo.setEnabled(false);
                RbCentro.setEnabled(true);
                RbSuperficie.setSelected(true);
                DeshabilitarPrimeroTextoyLabel();
                LabelAltura.setText("Radio");
                HabilitarSegundoTextoyLabel();
                DeshabilitarTercerTextoyLabel();
                ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/circulo.png"));
                ImageIcon imagen = new ImageIcon(icono.getImage().getScaledInstance(LabelImagenFigura.getWidth(), LabelImagenFigura.getHeight(), Image.SCALE_DEFAULT));
                LabelImagenFigura.setIcon(imagen);
                break;
            }
            default:
                break;
        }

    }//GEN-LAST:event_FigurasActionPerformed

    private void RbCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbCentroActionPerformed

        if (Figuras.getSelectedIndex() == 3) {  //circunferencia
            DeshabilitarAngulos();
            DeshabilitarPrimeroTextoyLabel();
            HabilitarSegundoTextoyLabel();
            HabilitarTercerTextoyLabel();

            LabelAltura.setText("D");
            LabelProfundidad.setText("E");

        } else if (Figuras.getSelectedIndex() == 2) {   //cuadrado
            DeshabilitarAngulos();
            DeshabilitarPrimeroTextoyLabel();
            HabilitarSegundoTextoyLabel();
            DeshabilitarTercerTextoyLabel();

            LabelAltura.setText("Lado");
        }

        if (en_leccion == true) {   //Si está en modo lección y comprobar el centro, se requieren dos datos (x,y)
            TextoRespuesta1.setVisible(true);
            TextoRespuesta2.setVisible(true);
        }


    }//GEN-LAST:event_RbCentroActionPerformed

    private void BtMostrarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMostrarHistorialActionPerformed

        DefaultTableModel tabla = (DefaultTableModel) TablaHistorial.getModel();

        if (hist.isEmpty()) {   //Si la cola está vacia quiere decir que no se ha calculado nada
            JOptionPane.showMessageDialog(null, "No hay datos para mostrar.", " Aviso ", JOptionPane.WARNING_MESSAGE);

        } else {    //Se hace el botón dinámico, según lo que el usuario tenga seleccionado

            if (jScrollPane1.isVisible()) {
                BtMostrarHistorial.setText("Mostrar historial");
                jScrollPane1.setVisible(false);
            } else {
                BtMostrarHistorial.setText("Ocultar historial");
                jScrollPane1.setVisible(true);
            }

            RemoverFilas(); //Antes de mostrar el historial, se limpia la tabla, removiendo las filas

            DatosUsuario.MostrarHistorial((LinkedList) hist, 0, tabla, jScrollPane1);

        }
    }//GEN-LAST:event_BtMostrarHistorialActionPerformed

    private void SegundoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SegundoTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SegundoTextoActionPerformed

    private void TextoRespuesta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoRespuesta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoRespuesta2ActionPerformed

    private void TextoRespuesta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoRespuesta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoRespuesta1ActionPerformed

    private void BotPuntajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotPuntajeActionPerformed

        jug.MostrarPuntaje(punt, mayor, nombre_mayor);  //Se pasa por parametros la pila y los datos que se van a mostrar

    }//GEN-LAST:event_BotPuntajeActionPerformed

    private void HabilitarAngulos() {
        RbAnguloA.setEnabled(true);
        RbAnguloB.setEnabled(true);
        RbAnguloC.setEnabled(true);
    }

    private void DeshabilitarAngulos() {
        RbAnguloA.setEnabled(false);
        RbAnguloB.setEnabled(false);
        RbAnguloC.setEnabled(false);
    }

    private void HabilitarPrimeroTextoyLabel() {

        LabelBase.setVisible(true);
        PrimerTexto.setVisible(true);
    }

    private void HabilitarSegundoTextoyLabel() {

        LabelAltura.setVisible(true);
        SegundoTexto.setVisible(true);

    }

    private void HabilitarTercerTextoyLabel() {

        LabelProfundidad.setVisible(true);
        TercerTexto.setVisible(true);

    }

    private void DeshabilitarPrimeroTextoyLabel() {

        LabelBase.setVisible(false);
        PrimerTexto.setVisible(false);

    }

    private void DeshabilitarSegundoTextoyLabel() {

        LabelAltura.setVisible(false);
        SegundoTexto.setVisible(false);

    }

    private void DeshabilitarTercerTextoyLabel() {

        LabelProfundidad.setVisible(false);
        TercerTexto.setVisible(false);
    }

    private void DeshabilitarInicio() {

        RbSuperficie.setSelected(true);
        RbRadio.setEnabled(false);
        RbAngulo.setEnabled(false);
        RbDiametro.setEnabled(false);
        RbCentro.setEnabled(false);

    }

    private void DeshabilitarLeccion() {
        LbRespuesta.setVisible(false);
        TextoRespuesta1.setVisible(false);
        TextoRespuesta2.setVisible(false);
        SeparadorVertical.setVisible(false);
        Separador1.setVisible(false);
        Separador2.setVisible(false);
        LbJugador.setVisible(false);
        LbAciertos.setVisible(false);
        LbPuntaje.setVisible(false);
        BotPuntaje.setVisible(false);

    }

    private void HabilitarLeccion() {

        LbRespuesta.setVisible(true);
        TextoRespuesta1.setVisible(true);
        TextoRespuesta2.setVisible(false);
        SeparadorVertical.setVisible(true);
        Separador1.setVisible(true);
        Separador2.setVisible(true);
        LbJugador.setVisible(true);
        LbAciertos.setVisible(true);
        LbPuntaje.setVisible(true);
        BotPuntaje.setVisible(true);

    }

    public void RemoverFilas() {    //Método público, porque tiene que ser utilizado por otra clase
        DefaultTableModel tabla = (DefaultTableModel) TablaHistorial.getModel();

        while (tabla.getRowCount() > 0) {   //Mientras hayan filas en la tabla, borrar siempre la primera fila
            tabla.removeRow(0);
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotBorrar;
    private javax.swing.JButton BotCalcular;
    private javax.swing.JButton BotModoLeccion;
    private javax.swing.JButton BotPuntaje;
    private javax.swing.JButton BotSalir;
    private javax.swing.JButton BtMostrarHistorial;
    private javax.swing.ButtonGroup ContenedorAngulos;
    private javax.swing.ButtonGroup ContenedorCalcular;
    private javax.swing.ButtonGroup ContenedorFiguras;
    private javax.swing.JComboBox<String> Figuras;
    private javax.swing.JLabel LabelAltura;
    private javax.swing.JLabel LabelBase;
    private javax.swing.JLabel LabelImagenFigura;
    private javax.swing.JLabel LabelProfundidad;
    private javax.swing.JLabel LbAciertos;
    private javax.swing.JLabel LbJugador;
    private javax.swing.JLabel LbPuntaje;
    private javax.swing.JLabel LbRespuesta;
    private javax.swing.JTextField PrimerTexto;
    private javax.swing.JRadioButton RbAngulo;
    private javax.swing.JRadioButton RbAnguloA;
    private javax.swing.JRadioButton RbAnguloB;
    private javax.swing.JRadioButton RbAnguloC;
    private javax.swing.JRadioButton RbCentro;
    private javax.swing.JRadioButton RbDiagonal;
    private javax.swing.JRadioButton RbDiametro;
    private javax.swing.JRadioButton RbPerimetro;
    private javax.swing.JRadioButton RbRadio;
    private javax.swing.JRadioButton RbSuperficie;
    private javax.swing.JRadioButton RbVolumen;
    private javax.swing.JTextField SegundoTexto;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JSeparator SeparadorVertical;
    private javax.swing.JTable TablaHistorial;
    private javax.swing.JTextField TercerTexto;
    private javax.swing.JTextField TextoRespuesta1;
    private javax.swing.JTextField TextoRespuesta2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
