package principal.first;

import principal.base.Salvar;
import java.awt.Color;
import java.awt.Cursor;

public class SalvarSenhas extends javax.swing.JPanel {
    private Salvar salvar=new Salvar();
    
    public SalvarSenhas() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        senhaLabel = new javax.swing.JLabel();
        nomeLabel1 = new javax.swing.JLabel();
        senhaCampo = new javax.swing.JTextField();
        nomeCampo = new javax.swing.JTextField();
        msg = new javax.swing.JLabel();
        salvarBotao = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();

        setBackground(java.awt.Color.black);
        setMaximumSize(new java.awt.Dimension(300, 250));
        setMinimumSize(new java.awt.Dimension(300, 250));
        setPreferredSize(new java.awt.Dimension(300, 250));
        setLayout(null);

        senhaLabel.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        senhaLabel.setForeground(new java.awt.Color(255, 255, 255));
        senhaLabel.setText("Senha:");
        senhaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(senhaLabel);
        senhaLabel.setBounds(30, 130, 70, 30);

        nomeLabel1.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        nomeLabel1.setForeground(new java.awt.Color(255, 255, 255));
        nomeLabel1.setText("Serviço:");
        nomeLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(nomeLabel1);
        nomeLabel1.setBounds(30, 92, 70, 30);

        senhaCampo.setBackground(new java.awt.Color(0, 0, 0));
        senhaCampo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        senhaCampo.setForeground(new java.awt.Color(255, 255, 255));
        senhaCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaCampoActionPerformed(evt);
            }
        });
        add(senhaCampo);
        senhaCampo.setBounds(110, 130, 150, 30);

        nomeCampo.setBackground(new java.awt.Color(0, 0, 0));
        nomeCampo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nomeCampo.setForeground(new java.awt.Color(255, 255, 255));
        nomeCampo.setOpaque(false);
        add(nomeCampo);
        nomeCampo.setBounds(110, 90, 150, 30);

        msg.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(msg);
        msg.setBounds(30, 60, 230, 20);

        salvarBotao.setBackground(java.awt.Color.black);
        salvarBotao.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        salvarBotao.setForeground(java.awt.Color.white);
        salvarBotao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salvarBotao.setText("Salvar");
        salvarBotao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, java.awt.Color.gray));
        salvarBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salvarBotao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarBotaoMouseClicked(evt);
            }
        });
        add(salvarBotao);
        salvarBotao.setBounds(190, 170, 70, 26);

        titulo.setBackground(java.awt.Color.black);
        titulo.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        titulo.setForeground(java.awt.Color.white);
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titulo.setText("Salvar senha");
        titulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(titulo);
        titulo.setBounds(190, 10, 110, 25);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarBotaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarBotaoMouseClicked
        if(nomeCampo.getText().equals("")||senhaCampo.getText().equals("")){
            msg.setText("Preencha os campos");
            msg.setForeground(Color.red);
        }else{
            //SALVAR SENHA
            salvar.setNome(nomeCampo.getText());
            salvar.setValor(senhaCampo.getText());
            if(salvar.novaSenha()){
                msg.setText( "Senha de "+"( " +nomeCampo.getText()+" )"+" foi salva !");
                msg.setForeground(Color.green);
                nomeCampo.setText("");
                senhaCampo.setText("");
                this.requestFocus();
            }else{
                msg.setText(nomeCampo.getText()+" já foi salvo");
                msg.setForeground(Color.red);
            }
        }msg.setCursor(new Cursor(Cursor.TEXT_CURSOR) {
    });
    }//GEN-LAST:event_salvarBotaoMouseClicked

    public void limparCampos(){
        nomeCampo.setText("");
        senhaCampo.setText("");
        msg.setText("");
    }
    
    private void senhaCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaCampoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel msg;
    private javax.swing.JTextField nomeCampo;
    private javax.swing.JLabel nomeLabel1;
    private javax.swing.JLabel salvarBotao;
    private javax.swing.JTextField senhaCampo;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
