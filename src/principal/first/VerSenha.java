package principal.first;

import principal.base.Salvar;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.List;
import javax.swing.DefaultListModel;

@SuppressWarnings("unchecked")
public class VerSenha extends javax.swing.JPanel {
    private Salvar salvar=new Salvar();
    private List<String> senhas;
    private DefaultListModel mod;

    public VerSenha() {
        initComponents();
        setSenhas();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alterarD = new principal.second.Alterar();
        excluirD = new principal.second.Excluir();
        buscarCampo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCampo = new javax.swing.JList<>();
        senhaLabel = new javax.swing.JLabel();
        mostraLabel = new javax.swing.JLabel();
        excluirBotao = new javax.swing.JLabel();
        copiarBotao = new javax.swing.JLabel();
        alterarBotao = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        alterarD.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                alterarDWindowClosed(evt);
            }
        });

        excluirD.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                excluirDWindowClosed(evt);
            }
        });

        setBackground(java.awt.Color.black);
        setMaximumSize(new java.awt.Dimension(300, 250));
        setMinimumSize(new java.awt.Dimension(300, 250));
        setPreferredSize(new java.awt.Dimension(300, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscarCampo.setBackground(java.awt.Color.black);
        buscarCampo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        buscarCampo.setForeground(java.awt.Color.lightGray);
        buscarCampo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        buscarCampo.setSelectedTextColor(java.awt.Color.white);
        buscarCampo.setSelectionColor(java.awt.Color.blue);
        buscarCampo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarCampoMouseClicked(evt);
            }
        });
        buscarCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarCampoKeyReleased(evt);
            }
        });
        add(buscarCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 210, 30));

        jScrollPane1.setBackground(java.awt.Color.darkGray);
        jScrollPane1.setForeground(java.awt.Color.red);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        listaCampo.setBackground(java.awt.Color.black);
        listaCampo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, java.awt.Color.gray));
        listaCampo.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        listaCampo.setForeground(java.awt.Color.white);
        listaCampo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaCampo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaCampo.setSelectionBackground(java.awt.Color.gray);
        listaCampo.setSelectionForeground(java.awt.Color.white);
        listaCampo.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaCampoValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaCampo);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 290, 110));

        senhaLabel.setBackground(java.awt.Color.black);
        senhaLabel.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        senhaLabel.setForeground(java.awt.Color.white);
        senhaLabel.setText("SENHA:");
        add(senhaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 60, 20));

        mostraLabel.setBackground(java.awt.Color.black);
        mostraLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mostraLabel.setForeground(java.awt.Color.white);
        mostraLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostraLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, java.awt.Color.gray));
        mostraLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(mostraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 200, 20));

        excluirBotao.setBackground(java.awt.Color.black);
        excluirBotao.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        excluirBotao.setForeground(java.awt.Color.white);
        excluirBotao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        excluirBotao.setText("Excluir");
        excluirBotao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, java.awt.Color.gray));
        excluirBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excluirBotao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excluirBotaoMouseClicked(evt);
            }
        });
        add(excluirBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 60, 20));

        copiarBotao.setBackground(java.awt.Color.black);
        copiarBotao.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        copiarBotao.setForeground(java.awt.Color.white);
        copiarBotao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copiarBotao.setText("Copiar");
        copiarBotao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, java.awt.Color.gray));
        copiarBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        copiarBotao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                copiarBotaoMouseClicked(evt);
            }
        });
        add(copiarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 60, 20));

        alterarBotao.setBackground(java.awt.Color.black);
        alterarBotao.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        alterarBotao.setForeground(java.awt.Color.white);
        alterarBotao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alterarBotao.setText("Alterar");
        alterarBotao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, java.awt.Color.gray));
        alterarBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alterarBotao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alterarBotaoMouseClicked(evt);
            }
        });
        add(alterarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 60, 20));

        titulo.setBackground(java.awt.Color.black);
        titulo.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        titulo.setForeground(java.awt.Color.white);
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titulo.setText("Senhas Salvas");
        titulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 120, -1));

        jLabel1.setBackground(java.awt.Color.black);
        jLabel1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.lightGray);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Buscar:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 60, 30));
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void listaCampoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaCampoValueChanged
        try{
        desativar(true);        
        salvar.setPesquisar(listaCampo.getSelectedValue());
        
        salvar.cd.clarear(salvar.buscar().get(0).split("=")[1]);
        mostraLabel.setText(salvar.cd.getValor2());
        }
        catch(IndexOutOfBoundsException e){desativar(false);}
        catch(NullPointerException e){desativar(false);}
    }//GEN-LAST:event_listaCampoValueChanged

    private void excluirBotaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirBotaoMouseClicked
        if(evt.getButton()==1)
        ativarDialogo(excluirD);        
    }//GEN-LAST:event_excluirBotaoMouseClicked

    private void buscarCampoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarCampoKeyReleased
        desativar(false);
        salvar.setPesquisar(buscarCampo.getText());
        mod=new DefaultListModel();
        try{
        salvar.buscar().forEach(s->mod.addElement(s.split("=| - |- ")[0]));
        }catch(NullPointerException e){}
        listaCampo.setModel(mod);
        
    }//GEN-LAST:event_buscarCampoKeyReleased

    private void buscarCampoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarCampoMouseClicked
        desativar(false);
        buscarCampo.setText("");
        buscarCampo.setForeground(Color.white);
    }//GEN-LAST:event_buscarCampoMouseClicked

    private void copiarBotaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_copiarBotaoMouseClicked
        if(evt.getButton()==1){
        StringSelection ss=new StringSelection(mostraLabel.getText());
        Clipboard cb=Toolkit.getDefaultToolkit().getSystemClipboard();
        cb.setContents(ss, null);
        }
    }//GEN-LAST:event_copiarBotaoMouseClicked

    private void alterarBotaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alterarBotaoMouseClicked
        if(evt.getButton()==1){
        alterarD.setNovaSenha_AD();
        ativarDialogo(alterarD);
        }
    }//GEN-LAST:event_alterarBotaoMouseClicked

    private void alterarDWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_alterarDWindowClosed
        if(!alterarD.getNovaSenha().equals("")){
        alterarSenha();
        }
    }//GEN-LAST:event_alterarDWindowClosed

    private void excluirDWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_excluirDWindowClosed
        if(excluirD.isValidade()){
            excluirSenha();
        }
    }//GEN-LAST:event_excluirDWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alterarBotao;
    private principal.second.Alterar alterarD;
    private javax.swing.JTextField buscarCampo;
    private javax.swing.JLabel copiarBotao;
    private javax.swing.JLabel excluirBotao;
    private principal.second.Excluir excluirD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaCampo;
    private javax.swing.JLabel mostraLabel;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private void setSenhas() {
        this.senhas=salvar.preSalvamento();
    }
    
    public void desativar(boolean a){
        senhaLabel.setVisible(a);
        mostraLabel.setVisible(a);
        excluirBotao.setVisible(a);
        copiarBotao.setVisible(a);
        alterarBotao.setVisible(a);
    }
    
    public void encheLista(){
        
        listaCampo.setModel(new DefaultListModel<>());
        buscarCampo.setText("");
        setSenhas();
        mod=new DefaultListModel();
        senhas.forEach(s-> mod.addElement(s.split("=")[0]));
        listaCampo.setModel(mod);
    }
    
    private void ativarDialogo(javax.swing.JDialog jd){
        jd.getContentPane().setBackground(Color.darkGray);
        jd.setSize(240,160);
         jd.setLocationRelativeTo(null);
         jd.setVisible(true);
    }
    
    public void alterarSenha(){
        salvar.setNome(listaCampo.getSelectedValue());
        salvar.setValor(alterarD.getNovaSenha());
        salvar.alterar(salvar.cd.esconder(salvar.buscar().get(0)));
        encheLista();      
        this.requestFocus();
        desativar(false);
}
    
    public void excluirSenha(){
        salvar.setPesquisar(listaCampo.getSelectedValue());
        salvar.removerSenha(salvar.cd.esconder(salvar.buscar().get(0)));
        encheLista();      
        this.requestFocus();
    }
    
}
