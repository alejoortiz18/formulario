/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.awt.Color;

/**
 *
 * @author rortiz
 */
public final class JFpagFinal extends javax.swing.JFrame {

    static Datos datos;
    //static boolean pregunta1;    
    //static boolean pregunta2;

    static Persona usuario;
    boolean ganop1;    
    boolean ganop2;    
    boolean ganop3;   
    boolean ganop4;
    boolean ganop5;

    Notas nota;
  
 //================== CONSTRUCTOR ====================================   
    public JFpagFinal(Persona user,Datos dato) {
        initComponents();
        usuario = user;
        LblNombre.setText("Hola "+usuario._Nombre+ ", este es su resultado."); 
        datos = dato;
        nota = new Notas();
        cargarDatosEnVista();
    }

//====================== METODOS ====================================    
   public void cargarDatosEnVista(){
      cargarPuntoUno();
      cargarPuntoDos();
      cargarPuntoTres();
      cargarPuntoCuatro();
      cargarPuntoCinco();
      cargarNotaFin();
   }
   
   public void cargarPuntoUno()
   {
     boolean respuesta = nota.ifGano(datos.Pregunta1_1, datos.Pregunta1_2);
     if(respuesta){
         LblRespuesta1.setText("20%");
         LblRespuesta1.setForeground(Color.GREEN);
     }else{
         LblRespuesta1.setText("X");
         LblRespuesta1.setForeground(Color.RED);
     }
    ChkPreg1.setBackground(Color.GREEN);
    ChkPreg2.setBackground(Color.GREEN);
    ChkPreg3.setBackground(Color.RED);
    ChkPreg4.setBackground(Color.RED);
    
    if(datos.Pregunta1_1){
        ChkPreg1.setSelected(datos.Pregunta1_1);
    }else{
        ChkPreg1.setSelected(datos.Pregunta1_1);
    }
    if(datos.Pregunta1_2){
        ChkPreg2.setSelected(datos.Pregunta1_2);
    }else{
        ChkPreg2.setSelected(datos.Pregunta1_2);
    }   
    if(datos.Pregunta1_3){
        ChkPreg3.setSelected(datos.Pregunta1_3);
    }else{
        ChkPreg3.setSelected(datos.Pregunta1_3);
    } 
    if(datos.Pregunta1_4){
        ChkPreg4.setSelected(datos.Pregunta1_4);
    }else{
        ChkPreg4.setSelected(datos.Pregunta1_4);
    }  
    ganop1=respuesta;
   }
    
    public void cargarPuntoDos()
    {
        boolean result = nota.ifGano(datos.Pregunta2_3);
        if(result){
         LblRespuesta2.setText("20%");
         LblRespuesta2.setForeground(Color.GREEN);
        }else{
            LblRespuesta2.setText("X");
            LblRespuesta2.setForeground(Color.RED);
        }
        Rbt1P2.setBackground(Color.RED);
        Rbt2P2.setBackground(Color.RED);
        Rbt3P2.setBackground(Color.RED);
        Rbt4P2.setBackground(Color.GREEN);
        
        if(datos.Pregunta2_1){
            Rbt1P2.setSelected(datos.Pregunta2_1);
        }
        if(datos.Pregunta2_2){
            Rbt2P2.setSelected(datos.Pregunta2_2);
        }
        if(datos.Pregunta2_3){
            Rbt3P2.setSelected(datos.Pregunta2_3);
        }
        if(datos.Pregunta2_4){
            Rbt4P2.setSelected(datos.Pregunta2_4);
        }
        ganop2 =result;
    }
    
    public void cargarPuntoTres()
    {
        boolean result = nota.ifGano(datos.Pregunta3_3);
        if(result){
         LblRespuesta3.setText("20%");
         LblRespuesta3.setForeground(Color.GREEN);
        }else{
            LblRespuesta3.setText("X");
            LblRespuesta3.setForeground(Color.RED);
        }
        
        ChkOpt1P3.setBackground(Color.RED);
        ChkOpt2P3.setBackground(Color.RED);
        ChkOpt3P3.setBackground(Color.GREEN);
        ChkOpt4P3.setBackground(Color.RED);
        
        if(datos.Pregunta3_1){
            ChkOpt1P3.setSelected(datos.Pregunta3_1);
        }
        if(datos.Pregunta3_2){
            ChkOpt2P3.setSelected(datos.Pregunta3_2);
        }
        if(datos.Pregunta3_3){
            ChkOpt3P3.setSelected(datos.Pregunta3_3);
        }
        if(datos.Pregunta3_4){
            ChkOpt4P3.setSelected(datos.Pregunta3_4);
        }
        ganop3=result;
    }
    
    public void cargarPuntoCuatro()
    {
        boolean respuesta = nota.ifGano(datos.p4SelectInt, datos.p4SelectFloat,datos.p4SelectDouble,datos.p4SelectString);
        if(respuesta){
            LblRespuesta4.setText("25%");
            LblRespuesta4.setForeground(Color.GREEN);
        }else{
            LblRespuesta4.setText("X");
            LblRespuesta4.setForeground(Color.RED);
        }
        LblIntP4.setBackground(Color.GREEN);
        LblFloatP4.setBackground(Color.GREEN);
        LbldoubleP4.setBackground(Color.GREEN);
        LblStringP4.setBackground(Color.GREEN);        
        LblNumericP4.setBackground(Color.RED);
        LblMoneyP4.setBackground(Color.RED);
        
        if(datos.p4SelectInt){
            LblIntP4.setSelected(datos.p4SelectInt);
        }
        if(datos.p4SelectFloat){
            LblFloatP4.setSelected(datos.p4SelectFloat);
        }
        if(datos.p4SelectDouble){
            LbldoubleP4.setSelected(datos.p4SelectDouble);
        }
        if(datos.p4SelectString){
            LblStringP4.setSelected(datos.p4SelectString);
        }
        if(datos.p4SelectNumeric){
            LblNumericP4.setSelected(datos.p4SelectNumeric);
        }
        if(datos.p4SelectMoney){
            LblMoneyP4.setSelected(datos.p4SelectMoney);
        }
        ganop4=respuesta;
    }
    
    public void cargarPuntoCinco()
    {
        boolean respuesta =  nota.ifGano(datos.pregunta5_1, datos.pregunta5_2, datos.pregunta5_3, datos.pregunta5_4, datos.pregunta5_5);
        if(respuesta){
            LblRespuesta5.setText("15%");
            LblRespuesta5.setForeground(Color.GREEN);
        }else{
            LblRespuesta5.setText("X");
            LblRespuesta5.setForeground(Color.RED);
        }
        lblp5_1.setText(datos.pregunta5_1);        
        lblp5_2.setText(datos.pregunta5_2);
        lblp5_3.setText(datos.pregunta5_3);
        lblp5_4.setText(datos.pregunta5_4);
        lblp5_5.setText(datos.pregunta5_5);

        if("1".equals(datos.pregunta5_1)){
            ChkOpt1P5.setSelected(true);
            lblp5_1.setForeground(Color.GREEN);
            ChkOpt1P5.setBackground(Color.GREEN);
        }else{
            ChkOpt1P5.setSelected(false);
            lblp5_1.setForeground(Color.RED);
            ChkOpt1P5.setBackground(Color.RED);
        }
        
        if("2".equals(datos.pregunta5_2)){
            ChkOpt2P5.setSelected(true);
            ChkOpt2P5.setBackground(Color.GREEN);
            lblp5_2.setForeground(Color.GREEN);
        }else{
            ChkOpt2P5.setSelected(false);
            ChkOpt2P5.setBackground(Color.RED);
            lblp5_2.setForeground(Color.RED);
        }
        
        if("3".equals(datos.pregunta5_3)){
            ChkOpt3P5.setSelected(true);
            ChkOpt3P5.setBackground(Color.GREEN);
            lblp5_3.setForeground(Color.GREEN);
        }else{
            ChkOpt3P5.setSelected(false);
            ChkOpt3P5.setBackground(Color.RED);
            lblp5_3.setForeground(Color.RED);
        }
        
        if("4".equals(datos.pregunta5_4)){
            ChkOpt4P5.setSelected(true);
            ChkOpt4P5.setBackground(Color.GREEN);
            lblp5_4.setForeground(Color.GREEN);
        }else{
            ChkOpt4P5.setSelected(false);
            ChkOpt4P5.setBackground(Color.RED);
            lblp5_4.setForeground(Color.RED);
        }
        
        if("5".equals(datos.pregunta5_5)){
            ChkOpt5P5.setSelected(true);
            ChkOpt5P5.setBackground(Color.GREEN);
            lblp5_5.setForeground(Color.GREEN);
        }else{
            ChkOpt5P5.setSelected(false);
            ChkOpt5P5.setBackground(Color.RED);
            lblp5_5.setForeground(Color.RED);
        }
      ganop5=respuesta;
    }
    
    public void cargarNotaFin(){
        int notaMaxima = 5;
        double porcentajeCalificado =0, nota1=20, nota2=20, nota3=20, nota4=25, nota5=15, notaFinal=0;        
        if(ganop1){porcentajeCalificado+=nota1;}        
        if(ganop2){porcentajeCalificado+=nota2;}
        if(ganop3){porcentajeCalificado+=nota3;}
        if(ganop4){porcentajeCalificado+=nota4;}
        if(ganop5){porcentajeCalificado+=nota5;}
        
        notaFinal = (porcentajeCalificado * notaMaxima)/100;
      
        LblNotaFin.setText(Double.toString(notaFinal));
    }
    
    
//======================TERMINA LOS METODOS ====================================  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LblNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ChkPreg1 = new javax.swing.JCheckBox();
        ChkPreg3 = new javax.swing.JCheckBox();
        ChkPreg2 = new javax.swing.JCheckBox();
        ChkPreg4 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        Rbt1P2 = new javax.swing.JRadioButton();
        Rbt2P2 = new javax.swing.JRadioButton();
        Rbt3P2 = new javax.swing.JRadioButton();
        Rbt4P2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        ChkOpt3P3 = new javax.swing.JCheckBox();
        ChkOpt4P3 = new javax.swing.JCheckBox();
        ChkOpt1P3 = new javax.swing.JCheckBox();
        ChkOpt2P3 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ChkOpt3P5 = new javax.swing.JCheckBox();
        ChkOpt1P5 = new javax.swing.JCheckBox();
        ChkOpt2P5 = new javax.swing.JCheckBox();
        ChkOpt4P5 = new javax.swing.JCheckBox();
        ChkOpt5P5 = new javax.swing.JCheckBox();
        LblRespuesta1 = new javax.swing.JLabel();
        LblRespuesta2 = new javax.swing.JLabel();
        LblRespuesta3 = new javax.swing.JLabel();
        LblRespuesta4 = new javax.swing.JLabel();
        LblIntP4 = new javax.swing.JCheckBox();
        LblFloatP4 = new javax.swing.JCheckBox();
        LbldoubleP4 = new javax.swing.JCheckBox();
        LblStringP4 = new javax.swing.JCheckBox();
        LblNumericP4 = new javax.swing.JCheckBox();
        LblMoneyP4 = new javax.swing.JCheckBox();
        LblRespuesta5 = new javax.swing.JLabel();
        lblp5_4 = new javax.swing.JLabel();
        lblp5_1 = new javax.swing.JLabel();
        lblp5_5 = new javax.swing.JLabel();
        lblp5_2 = new javax.swing.JLabel();
        lblp5_3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LblNotaFin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("RESULTADOS");

        LblNombre.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Pregunta 1 - 20%");

        ChkPreg1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ChkPreg1.setText("for(int i=5;i>=1;i--){ System.out.println(i); } ");
        ChkPreg1.setEnabled(false);
        ChkPreg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkPreg1ActionPerformed(evt);
            }
        });

        ChkPreg3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ChkPreg3.setText("for(int i=1;i>=5;i++){ System.out.println(i); } ");
        ChkPreg3.setEnabled(false);

        ChkPreg2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ChkPreg2.setText("for(int i=5;i>0;i--){ System.out.println(i); } ");
        ChkPreg2.setEnabled(false);

        ChkPreg4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ChkPreg4.setText("for(int i=5;i>=5;i--){System.out.println(i); } ");
        ChkPreg4.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Pregunta 2 - 20%");

        Rbt1P2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Rbt1P2.setText("12");
        Rbt1P2.setEnabled(false);

        Rbt2P2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Rbt2P2.setText("10");
        Rbt2P2.setEnabled(false);

        Rbt3P2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Rbt3P2.setText("Un error en tiempo de ejecución");
        Rbt3P2.setEnabled(false);

        Rbt4P2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Rbt4P2.setText("Ninguna de las anteriores.");
        Rbt4P2.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Pregunta 5 - 15%");

        ChkOpt3P3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ChkOpt3P3.setText("C) Error al dividir por cero");
        ChkOpt3P3.setEnabled(false);
        ChkOpt3P3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkOpt3P3ActionPerformed(evt);
            }
        });

        ChkOpt4P3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ChkOpt4P3.setText("D) Ninguno d ellos anteriores");
        ChkOpt4P3.setEnabled(false);
        ChkOpt4P3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkOpt4P3ActionPerformed(evt);
            }
        });

        ChkOpt1P3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ChkOpt1P3.setText("A) División exitosa, el resultado es 0;");
        ChkOpt1P3.setEnabled(false);
        ChkOpt1P3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkOpt1P3ActionPerformed(evt);
            }
        });

        ChkOpt2P3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ChkOpt2P3.setText("B) División exitosa, el resultado es 1;");
        ChkOpt2P3.setEnabled(false);
        ChkOpt2P3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkOpt2P3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Pregunta 3 - 20%");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Pregunta 4 - 25%");

        ChkOpt3P5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ChkOpt3P5.setText("Instancia de Clase (3)");
        ChkOpt3P5.setEnabled(false);

        ChkOpt1P5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ChkOpt1P5.setText("Un Lenguaje de programación (1)");
        ChkOpt1P5.setEnabled(false);

        ChkOpt2P5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ChkOpt2P5.setText("Características de Java (2)");
        ChkOpt2P5.setEnabled(false);

        ChkOpt4P5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ChkOpt4P5.setText("Wait (4)");
        ChkOpt4P5.setEnabled(false);

        ChkOpt5P5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ChkOpt5P5.setText("Palabra Reservada (5)");
        ChkOpt5P5.setEnabled(false);

        LblRespuesta1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblRespuesta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblRespuesta1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LblRespuesta1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LblRespuesta2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LblRespuesta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblRespuesta2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LblRespuesta2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LblRespuesta3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LblRespuesta3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblRespuesta3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LblRespuesta3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LblRespuesta4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblRespuesta4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblRespuesta4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LblRespuesta4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LblIntP4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblIntP4.setText("Int");
        LblIntP4.setEnabled(false);

        LblFloatP4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblFloatP4.setText("Float");
        LblFloatP4.setEnabled(false);

        LbldoubleP4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LbldoubleP4.setText("double");
        LbldoubleP4.setEnabled(false);

        LblStringP4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblStringP4.setText("String");
        LblStringP4.setEnabled(false);

        LblNumericP4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblNumericP4.setText("Numeric");
        LblNumericP4.setEnabled(false);

        LblMoneyP4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblMoneyP4.setText("Money");
        LblMoneyP4.setEnabled(false);

        LblRespuesta5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblRespuesta5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblRespuesta5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LblRespuesta5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblp5_4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        lblp5_1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        lblp5_5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        lblp5_2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        lblp5_3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("NOTAL FINAL");

        LblNotaFin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblNotaFin.setForeground(new java.awt.Color(0, 0, 153));
        LblNotaFin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblNotaFin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LblNotaFin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblStringP4)
                        .addGap(38, 38, 38)
                        .addComponent(LblNumericP4)
                        .addGap(29, 29, 29)
                        .addComponent(LblMoneyP4)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jLabel7)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Rbt1P2)
                                .addGap(40, 40, 40)
                                .addComponent(Rbt2P2)
                                .addGap(18, 18, 18)
                                .addComponent(Rbt3P2)
                                .addGap(18, 18, 18)
                                .addComponent(Rbt4P2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChkOpt1P3)
                                    .addComponent(ChkOpt3P3)
                                    .addComponent(LblIntP4)
                                    .addComponent(ChkOpt1P5))
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChkOpt2P3)
                                    .addComponent(ChkOpt4P3)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(97, 97, 97)
                                    .addComponent(lblp5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblp5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(153, 153, 153)
                                            .addComponent(lblp5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(66, 66, 66))
                                        .addComponent(ChkOpt5P5, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ChkPreg2)
                                        .addComponent(ChkPreg1))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ChkPreg3)
                                        .addComponent(ChkPreg4))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblp5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(lblp5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ChkOpt3P5)
                            .addComponent(ChkOpt4P5))
                        .addGap(189, 189, 189)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblRespuesta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblRespuesta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblRespuesta3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblRespuesta4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblRespuesta5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblNotaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(LblFloatP4)
                            .addGap(26, 26, 26)
                            .addComponent(LbldoubleP4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ChkOpt2P5)
                        .addGap(73, 73, 73)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(LblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LblNotaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChkPreg3)
                            .addComponent(ChkPreg1))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChkPreg2)
                            .addComponent(ChkPreg4)))
                    .addComponent(LblRespuesta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Rbt1P2)
                            .addComponent(Rbt2P2)
                            .addComponent(Rbt3P2)
                            .addComponent(Rbt4P2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(LblRespuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(LblRespuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ChkOpt1P3)
                                    .addComponent(ChkOpt2P3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChkOpt4P3)
                                    .addComponent(ChkOpt3P3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ChkOpt2P5)
                                .addComponent(ChkOpt4P5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LblIntP4)
                                        .addComponent(LblFloatP4)
                                        .addComponent(LbldoubleP4)
                                        .addComponent(LblStringP4)
                                        .addComponent(LblNumericP4)
                                        .addComponent(LblMoneyP4))
                                    .addComponent(LblRespuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblp5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addComponent(LblRespuesta5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(ChkOpt3P5)
                                                            .addComponent(ChkOpt1P5, javax.swing.GroupLayout.Alignment.TRAILING))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(lblp5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(16, 16, 16)
                                                        .addComponent(ChkOpt5P5)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(lblp5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(31, 31, 31)))))
                        .addComponent(lblp5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblp5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChkPreg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkPreg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkPreg1ActionPerformed

    private void ChkOpt3P3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkOpt3P3ActionPerformed
        if(ChkOpt3P3.isSelected()){
            ChkOpt1P3.setEnabled(false);
            ChkOpt2P3.setEnabled(false);
            ChkOpt4P3.setEnabled(false);
        }else{
            ChkOpt1P3.setEnabled(true);
            ChkOpt2P3.setEnabled(true);
            ChkOpt4P3.setEnabled(true);
        }
    }//GEN-LAST:event_ChkOpt3P3ActionPerformed

    private void ChkOpt4P3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkOpt4P3ActionPerformed
        if(ChkOpt4P3.isSelected()){
            ChkOpt1P3.setEnabled(false);
            ChkOpt2P3.setEnabled(false);
            ChkOpt3P3.setEnabled(false);
        }else{
            ChkOpt1P3.setEnabled(true);
            ChkOpt2P3.setEnabled(true);
            ChkOpt3P3.setEnabled(true);
        }
    }//GEN-LAST:event_ChkOpt4P3ActionPerformed

    private void ChkOpt1P3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkOpt1P3ActionPerformed
        if(ChkOpt1P3.isSelected()){
            ChkOpt2P3.setEnabled(false);
            ChkOpt3P3.setEnabled(false);
            ChkOpt4P3.setEnabled(false);
        }else{
            ChkOpt2P3.setEnabled(true);
            ChkOpt3P3.setEnabled(true);
            ChkOpt4P3.setEnabled(true);
        }

    }//GEN-LAST:event_ChkOpt1P3ActionPerformed

    private void ChkOpt2P3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkOpt2P3ActionPerformed
        if(ChkOpt2P3.isSelected()){
            ChkOpt1P3.setEnabled(false);
            ChkOpt3P3.setEnabled(false);
            ChkOpt4P3.setEnabled(false);
        }else{
            ChkOpt1P3.setEnabled(true);
            ChkOpt3P3.setEnabled(true);
            ChkOpt4P3.setEnabled(true);
        }

    }//GEN-LAST:event_ChkOpt2P3ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFpagFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFpagFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFpagFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFpagFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFpagFinal(usuario,datos).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChkOpt1P3;
    private javax.swing.JCheckBox ChkOpt1P5;
    private javax.swing.JCheckBox ChkOpt2P3;
    private javax.swing.JCheckBox ChkOpt2P5;
    private javax.swing.JCheckBox ChkOpt3P3;
    private javax.swing.JCheckBox ChkOpt3P5;
    private javax.swing.JCheckBox ChkOpt4P3;
    private javax.swing.JCheckBox ChkOpt4P5;
    private javax.swing.JCheckBox ChkOpt5P5;
    private javax.swing.JCheckBox ChkPreg1;
    private javax.swing.JCheckBox ChkPreg2;
    private javax.swing.JCheckBox ChkPreg3;
    private javax.swing.JCheckBox ChkPreg4;
    private javax.swing.JCheckBox LblFloatP4;
    private javax.swing.JCheckBox LblIntP4;
    private javax.swing.JCheckBox LblMoneyP4;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JLabel LblNotaFin;
    private javax.swing.JCheckBox LblNumericP4;
    private javax.swing.JLabel LblRespuesta1;
    private javax.swing.JLabel LblRespuesta2;
    private javax.swing.JLabel LblRespuesta3;
    private javax.swing.JLabel LblRespuesta4;
    private javax.swing.JLabel LblRespuesta5;
    private javax.swing.JCheckBox LblStringP4;
    private javax.swing.JCheckBox LbldoubleP4;
    private javax.swing.JRadioButton Rbt1P2;
    private javax.swing.JRadioButton Rbt2P2;
    private javax.swing.JRadioButton Rbt3P2;
    private javax.swing.JRadioButton Rbt4P2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblp5_1;
    private javax.swing.JLabel lblp5_2;
    private javax.swing.JLabel lblp5_3;
    private javax.swing.JLabel lblp5_4;
    private javax.swing.JLabel lblp5_5;
    // End of variables declaration//GEN-END:variables
}
