package principal.second;

public class Excluir extends javax.swing.JDialog {
    private boolean validade;
    public Excluir() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        simBtED = new javax.swing.JLabel();
        naoBtED = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Excluir senha");
        setMinimumSize(new java.awt.Dimension(230, 130));
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(java.awt.Color.darkGray);
        jLabel1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Deseja excluir esta senha ?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 210, 30));

        simBtED.setBackground(java.awt.Color.darkGray);
        simBtED.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        simBtED.setForeground(java.awt.Color.white);
        simBtED.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        simBtED.setText("Sim");
        simBtED.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, java.awt.Color.gray));
        simBtED.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simBtED.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simBtEDMouseClicked(evt);
            }
        });
        getContentPane().add(simBtED, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 60, 30));

        naoBtED.setBackground(java.awt.Color.darkGray);
        naoBtED.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        naoBtED.setForeground(java.awt.Color.white);
        naoBtED.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        naoBtED.setText("Não");
        naoBtED.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, java.awt.Color.gray));
        naoBtED.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        naoBtED.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                naoBtEDMouseClicked(evt);
            }
        });
        getContentPane().add(naoBtED, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 60, 30));

        setSize(new java.awt.Dimension(244, 167));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void simBtEDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simBtEDMouseClicked
        if(evt.getButton()==1){
        setValidade(true);
        this.dispose();
        }
    }//GEN-LAST:event_simBtEDMouseClicked

    private void naoBtEDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_naoBtEDMouseClicked
        if(evt.getButton()==1){
        setValidade(false);
        this.dispose();
        }
    }//GEN-LAST:event_naoBtEDMouseClicked

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel naoBtED;
    private javax.swing.JLabel simBtED;
    // End of variables declaration//GEN-END:variables

    public boolean isValidade() {
        return validade;
    }

    public void setValidade(boolean validade) {
        this.validade = validade;
    }

}
