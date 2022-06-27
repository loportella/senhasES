package principal.second;

import java.awt.Color;

public class Alterar extends javax.swing.JDialog {
    private String novaSenha;
    
    public Alterar() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nsL_AD = new javax.swing.JLabel();
        novaSenha_AD = new javax.swing.JTextField();
        alterarBt_AD = new javax.swing.JLabel();
        cancelarBt_AD = new javax.swing.JLabel();
        msg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar senha");
        setBackground(java.awt.Color.darkGray);
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nsL_AD.setBackground(java.awt.Color.darkGray);
        nsL_AD.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        nsL_AD.setForeground(java.awt.Color.white);
        nsL_AD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nsL_AD.setText("Nova senha:");
        nsL_AD.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(nsL_AD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));

        novaSenha_AD.setBackground(java.awt.Color.darkGray);
        novaSenha_AD.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        novaSenha_AD.setForeground(java.awt.Color.white);
        novaSenha_AD.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(novaSenha_AD, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 110, -1));

        alterarBt_AD.setBackground(java.awt.Color.darkGray);
        alterarBt_AD.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        alterarBt_AD.setForeground(java.awt.Color.white);
        alterarBt_AD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alterarBt_AD.setText("Alterar");
        alterarBt_AD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, java.awt.Color.gray));
        alterarBt_AD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alterarBt_AD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alterarBt_ADMouseClicked(evt);
            }
        });
        getContentPane().add(alterarBt_AD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 60, 20));

        cancelarBt_AD.setBackground(java.awt.Color.darkGray);
        cancelarBt_AD.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelarBt_AD.setForeground(java.awt.Color.white);
        cancelarBt_AD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelarBt_AD.setText("Cancelar");
        cancelarBt_AD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, java.awt.Color.gray));
        cancelarBt_AD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarBt_AD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarBt_ADMouseClicked(evt);
            }
        });
        getContentPane().add(cancelarBt_AD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 70, 20));

        msg.setBackground(java.awt.Color.darkGray);
        msg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        msg.setForeground(java.awt.Color.white);
        msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 20));

        setSize(new java.awt.Dimension(245, 167));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void alterarBt_ADMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alterarBt_ADMouseClicked
        if(evt.getButton()==1){
        if(!novaSenha_AD.getText().equals("")){
            setNovaSenha(novaSenha_AD.getText());
            this.dispose();
        }else{ 
            msg.setText("Preencha a nova senha !");
            msg.setForeground(Color.red);
        }
        }
    }//GEN-LAST:event_alterarBt_ADMouseClicked

    private void cancelarBt_ADMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBt_ADMouseClicked
        if(evt.getButton()==1){
        setNovaSenha("");
        this.dispose();
        }
    }//GEN-LAST:event_cancelarBt_ADMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alterarBt_AD;
    private javax.swing.JLabel cancelarBt_AD;
    private javax.swing.JLabel msg;
    private javax.swing.JTextField novaSenha_AD;
    private javax.swing.JLabel nsL_AD;
    // End of variables declaration//GEN-END:variables

    public String getNovaSenha() {
        return novaSenha;
    }

    public void setNovaSenha(String novaSenha) {
        this.novaSenha = novaSenha;
    }

public void setNovaSenha_AD(){
    this.msg.setText("");
    this.novaSenha_AD.setText("");
}
}
