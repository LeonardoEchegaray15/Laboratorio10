/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFramesLab10;

import java.util.List;
import javax.swing.DefaultListModel;

import java.util.ArrayList;

/**
 *
 * @author Leonardo
 */
public class JFrameRegistroElect extends javax.swing.JFrame {

    
    private List<Plancha> planchas;
    private List<Licuadora> licuadoras;
    private List<Waflera> wafleras;
    
    private DefaultListModel<String> modelo;

    
    
    
 
     //----------------------------------------------------------------------------------------------------------------------------------------------------------
    public JFrameRegistroElect() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        planchas = new ArrayList<>(); 
        licuadoras=new ArrayList<>(); 
        wafleras =new ArrayList<>(); 
        modelo = new DefaultListModel<>();
        lstElectrodomesticos.setModel(modelo);
    }
     //----------------------------------------------------------------------------------------------------------------------------------------------------------
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAgregarPlancha = new javax.swing.JButton();
        btnAgregarLicuadora = new javax.swing.JButton();
        btnAgregarWaflera = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstElectrodomesticos = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarPlancha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosLab10/Group 4.png"))); // NOI18N
        btnAgregarPlancha.setBorder(null);
        btnAgregarPlancha.setContentAreaFilled(false);
        btnAgregarPlancha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPlanchaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarPlancha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        btnAgregarLicuadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosLab10/Group 2 (3).png"))); // NOI18N
        btnAgregarLicuadora.setBorder(null);
        btnAgregarLicuadora.setContentAreaFilled(false);
        btnAgregarLicuadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLicuadoraActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarLicuadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        btnAgregarWaflera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosLab10/Group 3 (2).png"))); // NOI18N
        btnAgregarWaflera.setBorder(null);
        btnAgregarWaflera.setContentAreaFilled(false);
        btnAgregarWaflera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarWafleraActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarWaflera, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

        jScrollPane1.setBorder(null);

        lstElectrodomesticos.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(lstElectrodomesticos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 330, 270));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosLab10/REGISTRAR ELECTRODOMESTICOS.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosLab10/Rectangle 5.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosLab10/Rectangle 10.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //----------------------------------------------------------------------------------------------------------------------------------------------------------
    private void btnAgregarPlanchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPlanchaActionPerformed

        JFramePlancha IrPlancha = new JFramePlancha(this);
        IrPlancha.setLocationRelativeTo(this);
        IrPlancha.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarPlanchaActionPerformed

    private void btnAgregarLicuadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLicuadoraActionPerformed

        JFrameLicuadora IrLicuadora = new JFrameLicuadora(this);
        IrLicuadora.setLocationRelativeTo(this);
        IrLicuadora.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarLicuadoraActionPerformed

    private void btnAgregarWafleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarWafleraActionPerformed

        JFrameWaflera IrWaflera = new JFrameWaflera(this);
        IrWaflera.setLocationRelativeTo(this);
        IrWaflera.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarWafleraActionPerformed
   //----------------------------------------------------------------------------------------------------------------------------------------------------------
    
    
    
     //----------------------------------------------------------------------------------------------------------------------------------------------------------
     public void agregarNuevaPlancha(Plancha plancha){
        planchas.add(plancha);
        modelo.addElement(plancha.GetTexto());
    }
      //----------------------------------------------------------------------------------------------------------------------------------------------------------
       public void agregarNuevaLicuadora(Licuadora licuadora){
        licuadoras.add(licuadora);
         modelo.addElement(licuadora.GetTexto());
    }
        //----------------------------------------------------------------------------------------------------------------------------------------------------------
         public void agregarNuevaWaflera(Waflera waflera){
        wafleras.add(waflera);
        modelo.addElement(waflera.GetTexto());
    }
      //----------------------------------------------------------------------------------------------------------------------------------------------------------

        
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
            java.util.logging.Logger.getLogger(JFrameRegistroElect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameRegistroElect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameRegistroElect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameRegistroElect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameRegistroElect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarLicuadora;
    private javax.swing.JButton btnAgregarPlancha;
    private javax.swing.JButton btnAgregarWaflera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstElectrodomesticos;
    // End of variables declaration//GEN-END:variables
}
