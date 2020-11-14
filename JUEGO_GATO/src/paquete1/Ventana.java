
package paquete1;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {
    
    boolean estado = true;
    String turno = "X";
    String turno2= "O";
    int contador=0;
    boolean empate = true;
    JLabel arregloLbls []= new JLabel[9];
    
    int  posiblesV [][] =  {
        {0,1,2},
        {3,4,5},
        {6,7,8},
        {0,3,6},
        {1,4,7},
        {2,5,8},
        {0,4,8},
        {2,4,6}
    };
    
    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.llenarArreglo();   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlbl2 = new javax.swing.JLabel();
        jlbl1 = new javax.swing.JLabel();
        jlbl3 = new javax.swing.JLabel();
        jlbl4 = new javax.swing.JLabel();
        jlbl5 = new javax.swing.JLabel();
        jlbl6 = new javax.swing.JLabel();
        jlbl7 = new javax.swing.JLabel();
        jlbl8 = new javax.swing.JLabel();
        jlbl9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jlblTurno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlblPuntajeX = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlblPuntajeO = new javax.swing.JLabel();
        jlblpuntX = new javax.swing.JLabel();
        jlblpuntO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic tac toe ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jlbl2.setBackground(new java.awt.Color(255, 255, 255));
        jlbl2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jlbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl2.setOpaque(true);
        jlbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbl2MousePressed(evt);
            }
        });

        jlbl1.setBackground(new java.awt.Color(255, 255, 255));
        jlbl1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jlbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl1.setOpaque(true);
        jlbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbl1MousePressed(evt);
            }
        });

        jlbl3.setBackground(new java.awt.Color(255, 255, 255));
        jlbl3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jlbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl3.setOpaque(true);
        jlbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbl3MousePressed(evt);
            }
        });

        jlbl4.setBackground(new java.awt.Color(255, 255, 255));
        jlbl4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jlbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl4.setOpaque(true);
        jlbl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbl4MousePressed(evt);
            }
        });

        jlbl5.setBackground(new java.awt.Color(255, 255, 255));
        jlbl5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jlbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl5.setOpaque(true);
        jlbl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbl5MousePressed(evt);
            }
        });

        jlbl6.setBackground(new java.awt.Color(255, 255, 255));
        jlbl6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jlbl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl6.setOpaque(true);
        jlbl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbl6MousePressed(evt);
            }
        });

        jlbl7.setBackground(new java.awt.Color(255, 255, 255));
        jlbl7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jlbl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl7.setOpaque(true);
        jlbl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbl7MousePressed(evt);
            }
        });

        jlbl8.setBackground(new java.awt.Color(255, 255, 255));
        jlbl8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jlbl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl8.setOpaque(true);
        jlbl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbl8MousePressed(evt);
            }
        });

        jlbl9.setBackground(new java.awt.Color(255, 255, 255));
        jlbl9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jlbl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl9.setOpaque(true);
        jlbl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbl9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Volver a jugar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlblTurno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblTurno.setText("Turno de: X");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Marcador");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("X =");

        jlblPuntajeX.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("O =");

        jlblPuntajeO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jlblpuntX.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblpuntX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblpuntX.setText("0");

        jlblpuntO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblpuntO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblpuntO.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlblTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addContainerGap())
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jlblPuntajeO)
                                                    .addGap(2, 2, 2)
                                                    .addComponent(jlblpuntX, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(123, 123, 123))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jlblPuntajeX)
                                                    .addGap(98, 98, 98)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlblpuntO, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(123, 123, 123))))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlblTurno)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jlblpuntX, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jlblpuntO, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jlblPuntajeX)
                        .addGap(34, 34, 34)
                        .addComponent(jlblPuntajeO))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(207, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlbl1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl1MousePressed
        presionar(1);
    }//GEN-LAST:event_jlbl1MousePressed

    private void jlbl2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl2MousePressed
        presionar(2);
    }//GEN-LAST:event_jlbl2MousePressed

    private void jlbl3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl3MousePressed
        presionar(3);
    }//GEN-LAST:event_jlbl3MousePressed

    private void jlbl4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl4MousePressed
        presionar(4);
    }//GEN-LAST:event_jlbl4MousePressed

    private void jlbl5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl5MousePressed
        presionar(5);
    }//GEN-LAST:event_jlbl5MousePressed

    private void jlbl6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl6MousePressed
        presionar(6);
    }//GEN-LAST:event_jlbl6MousePressed

    private void jlbl7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl7MousePressed
        presionar(7);
    }//GEN-LAST:event_jlbl7MousePressed

    private void jlbl8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl8MousePressed
        presionar(8);
    }//GEN-LAST:event_jlbl8MousePressed

    private void jlbl9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl9MousePressed
        presionar(9);
    }//GEN-LAST:event_jlbl9MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for (int i=0; i<arregloLbls.length; i++){
            arregloLbls[i].setText(""); 
        }
        
        turno = turno2;
        if (turno2.equals("O")){
            turno2= "X";
        }
        else{
            turno2= "O";
        }
        empate = true;
        estado = true;
        contador = 0;
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void llenarArreglo (){
        arregloLbls [0] = jlbl1;
        arregloLbls [1] = jlbl2;
        arregloLbls [2] = jlbl3;
        arregloLbls [3] = jlbl4;
        arregloLbls [4] = jlbl5;
        arregloLbls [5] = jlbl6;
        arregloLbls [6] = jlbl7;
        arregloLbls [7] = jlbl8;
        arregloLbls [8] = jlbl9;
    }
    
    public void presionar (int casilla){
        contador++;
        if (arregloLbls[casilla-1].getText().equals ("")&& estado==true){
            
            if (turno.equals("X")){
                arregloLbls[casilla-1].setForeground(Color.red);
            }
            else{
                arregloLbls[casilla-1].setForeground(Color.black);
            }
            arregloLbls[casilla-1].setText(turno);
            
            comprobarGanador();
            cambiarTurno();
            //System.out.println(contador);
            if (contador == 9 && empate == true){
                JOptionPane.showMessageDialog(null, "Empate");
            }
        }
    }
   
    public void cambiarTurno(){
        if (turno.equals("X")){
            turno = "O";  
        }
        else {
            turno = "X";
        } 
        jlblTurno.setText("Turno de:" + turno);
        
    }
   
    public void comprobarGanador(){
        for (int i = 0; i< posiblesV.length;i++){
          
            if(arregloLbls[posiblesV [i][0]].getText().equals("X")&&
                    arregloLbls[posiblesV [i][1]].getText().equals("X")&&
                    arregloLbls[posiblesV[i][2]].getText().equals("X"))
            {   
                empate = false;
                estado=false;
                jlblpuntX.setText(Integer.toString(Integer.parseInt(jlblpuntX.getText())+1));
                JOptionPane.showMessageDialog(null, "¡Felicidades " +turno+ " ganaste!");
            }
            
            else if(arregloLbls[posiblesV [i][0]].getText().equals("O")&&
                    arregloLbls[posiblesV [i][1]].getText().equals("O")&&
                    arregloLbls[posiblesV[i][2]].getText().equals("O"))
            {
                empate= false;
                estado= false;
                jlblpuntO.setText(Integer.toString(Integer.parseInt(jlblpuntO.getText())+1));
                JOptionPane.showMessageDialog(null, "¡Felicidades " +turno+ " ganaste!");
            } 
        }
    }
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlbl1;
    private javax.swing.JLabel jlbl2;
    private javax.swing.JLabel jlbl3;
    private javax.swing.JLabel jlbl4;
    private javax.swing.JLabel jlbl5;
    private javax.swing.JLabel jlbl6;
    private javax.swing.JLabel jlbl7;
    private javax.swing.JLabel jlbl8;
    private javax.swing.JLabel jlbl9;
    private javax.swing.JLabel jlblPuntajeO;
    private javax.swing.JLabel jlblPuntajeX;
    private javax.swing.JLabel jlblTurno;
    private javax.swing.JLabel jlblpuntO;
    private javax.swing.JLabel jlblpuntX;
    // End of variables declaration//GEN-END:variables
}
