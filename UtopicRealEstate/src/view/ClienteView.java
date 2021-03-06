/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Angelo PC
 */
public class ClienteView extends javax.swing.JFrame {

    /**
     * Creates new form ClienteView
     */
    public ClienteView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        PriceSlider = new javax.swing.JSlider();
        jLabel8 = new javax.swing.JLabel();
        MaxPriceLabel = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        PriceDisplay = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDePropiedades = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CerrarSesionButton = new javax.swing.JButton();
        UserLoginGreetingLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(178, 60, 58));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(178, 60, 58));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-Manager(1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Clientes.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Especificaciones:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setText("Modalidad:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel5.setText("Provincia:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel6.setText("Tipo de Propiedad:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jLabel7.setText("Precio:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cualquiera", "San Jose", "Cartago", "Alajuela", "Heredia", "Guanacaste", "Limón", "Puntarenas" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 82, 100, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cualquiera", "Venta", "Alquiler" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 32, 100, -1));

        PriceSlider.setBackground(new java.awt.Color(255, 255, 255));
        PriceSlider.setForeground(new java.awt.Color(0, 0, 0));
        PriceSlider.setMajorTickSpacing(100000);
        PriceSlider.setMaximum(1000000);
        PriceSlider.setMinorTickSpacing(50000);
        PriceSlider.setPaintTicks(true);
        PriceSlider.setSnapToTicks(true);
        PriceSlider.setToolTipText("");
        PriceSlider.setValue(0);
        PriceSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                PriceDisplay.setText(String.valueOf(PriceSlider.getValue()) + "$");
            }
        });
        PriceSlider.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                PriceSliderCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jPanel2.add(PriceSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 82, 163, -1));

        jLabel8.setText("0$");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 82, -1, -1));

        MaxPriceLabel.setText("1000000$");
        jPanel2.add(MaxPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 82, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cualquiera", "Casa", "Edificio de Apartamentos", "Lote", "Centro Comercial" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        jButton1.setBackground(new java.awt.Color(178, 60, 58));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 136, -1, -1));

        PriceDisplay.setText("0$");
        jPanel2.add(PriceDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 82, -1, -1));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Sin Limite de Precio");
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 660, 170));

        TablaDePropiedades.setAutoCreateRowSorter(true);
        TablaDePropiedades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(2), "Alajuela", "Alquiler", "Edificio de Apartamentos",  new Double(1000000.0)},
                { new Integer(1), "San José", "Venta", "Casa",  new Double(10000.0)}
            },
            new String [] {
                "# de Lote", "Provincia", "Modalidad", "Tipo", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaDePropiedades.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaDePropiedades.setGridColor(new java.awt.Color(211, 79, 78));
        TablaDePropiedades.setInheritsPopupMenu(true);
        TablaDePropiedades.setSelectionBackground(new java.awt.Color(178, 60, 58));
        TablaDePropiedades.getTableHeader().setReorderingAllowed(false);
        TablaDePropiedades.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(TablaDePropiedades);
        TablaDePropiedades.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (TablaDePropiedades.getColumnModel().getColumnCount() > 0) {
            TablaDePropiedades.getColumnModel().getColumn(0).setResizable(false);
            TablaDePropiedades.getColumnModel().getColumn(1).setResizable(false);
            TablaDePropiedades.getColumnModel().getColumn(2).setResizable(false);
            TablaDePropiedades.getColumnModel().getColumn(3).setResizable(false);
            TablaDePropiedades.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 580, 170));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Mostrar Interés");
        jButton2.setToolTipText("");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, -1, -1));

        jButton3.setText("Consultar");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, 110, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ConsultarFichaPropiedadIcon.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, 50, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/MostrarInteresIcon.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 50, 40));

        CerrarSesionButton.setBackground(new java.awt.Color(255, 255, 255));
        CerrarSesionButton.setText("Cerrar Sesión");
        jPanel1.add(CerrarSesionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        UserLoginGreetingLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(UserLoginGreetingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 560, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if(jComboBox2.getSelectedIndex() == 0){
            //Venta
            PriceSlider.setMaximum(1000000);
            PriceSlider.setMajorTickSpacing(100000);
            PriceSlider.setMinorTickSpacing(50000);
            if(!jCheckBox1.isSelected()){
            MaxPriceLabel.setText("1000000$");
            }
        }
        else if(jComboBox2.getSelectedIndex() == 1){
            //Alquiler
            PriceSlider.setMaximum(100000);
            PriceSlider.setMajorTickSpacing(10000);
            PriceSlider.setMinorTickSpacing(5000);
            if(!jCheckBox1.isSelected()){
            MaxPriceLabel.setText("100000$");
            }
           
        } 
        jPanel2.repaint();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void PriceSliderCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_PriceSliderCaretPositionChanged

    }//GEN-LAST:event_PriceSliderCaretPositionChanged

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        if(jCheckBox1.isSelected()){
            PriceSlider.setEnabled(false);
            PriceDisplay.setText("Sin Limite");
        }
        else{
            PriceSlider.setEnabled(true);
            PriceDisplay.setText(PriceSlider.getValue() +"$");
        }
    }//GEN-LAST:event_jCheckBox1StateChanged

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
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSesionButton;
    private javax.swing.JLabel MaxPriceLabel;
    private javax.swing.JLabel PriceDisplay;
    private javax.swing.JSlider PriceSlider;
    private javax.swing.JTable TablaDePropiedades;
    private javax.swing.JLabel UserLoginGreetingLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
