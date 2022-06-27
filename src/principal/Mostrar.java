package principal;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

public class Mostrar extends javax.swing.JFrame {
    private CardLayout card=new CardLayout();
    private List<String> t=new ArrayList<>();
    private boolean selec1=false;
    private boolean selec2=false;
    
    public Mostrar() {
        initComponents();
        getContentPane().setBackground(Color.BLACK);
        card=(CardLayout)(abas.getLayout());
        //card.show(abas, "senhas");
        card.show(abas, "primeiro");
       // System.out.println(System.getProperty("file.encoding"));
       
        

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        abas = new javax.swing.JPanel();
        senhasAba = new principal.first.VerSenha();
        inicio = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        salvarAba = new principal.first.SalvarSenhas();
        senhasBotao = new javax.swing.JButton();
        novaSenhaBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Senhas");
        setBackground(java.awt.Color.black);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.black);
        setMinimumSize(new java.awt.Dimension(450, 250));
        setName("painel"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(450, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        abas.setMaximumSize(new java.awt.Dimension(300, 250));
        abas.setMinimumSize(new java.awt.Dimension(300, 250));
        abas.setName(""); // NOI18N
        abas.setPreferredSize(new java.awt.Dimension(300, 250));
        abas.setLayout(new java.awt.CardLayout());
        abas.add(senhasAba, "senhas");

        inicio.setBackground(java.awt.Color.black);
        inicio.setForeground(java.awt.Color.white);
        inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(java.awt.Color.black);
        jTextArea1.setForeground(java.awt.Color.white);
        jTextArea1.setTabSize(10);
        jTextArea1.setText("\tBEM VINDO !!\nEste programa é um teste pra futuras versões,que \nserão feitas para outros sistemas.\nA cripitografia das senhas e basíca. Por este \nmotivo não se deve ser conciderada um ótimo\nmeio de armazenento de senhas segura.\nProblemas e erros enviar mensagem à pessoa, \nque lhe enviou este arquivo.\n\nOBRIGADO E BOM USO !!\n\nDICAS:\n1 - Caso queira mudar o nome da senha deves-se,\nexclui-la e inseri-la novamente.\n");
        jTextArea1.setCaretPosition(0);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        inicio.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 280, 190));

        abas.add(inicio, "primeiro");

        salvarAba.setForeground(java.awt.Color.white);
        salvarAba.setName("verSenha"); // NOI18N
        abas.add(salvarAba, "salvarSenha");

        getContentPane().add(abas, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 0, 300, -1));

        senhasBotao.setBackground(java.awt.Color.black);
        senhasBotao.setFont(new java.awt.Font("Arial", 2, 17)); // NOI18N
        senhasBotao.setForeground(java.awt.Color.white);
        senhasBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/second/salvas.png"))); // NOI18N
        senhasBotao.setText("Senhas");
        senhasBotao.setAlignmentX(0.3F);
        senhasBotao.setAlignmentY(30.0F);
        senhasBotao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, java.awt.Color.gray));
        senhasBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        senhasBotao.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        senhasBotao.setFocusPainted(false);
        senhasBotao.setFocusable(false);
        senhasBotao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        senhasBotao.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        senhasBotao.setIconTextGap(8);
        senhasBotao.setMargin(null);
        senhasBotao.setVerifyInputWhenFocusTarget(false);
        senhasBotao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                senhasBotaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                senhasBotaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                senhasBotaoMouseExited(evt);
            }
        });
        getContentPane().add(senhasBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, 50));

        novaSenhaBotao.setBackground(java.awt.Color.black);
        novaSenhaBotao.setFont(new java.awt.Font("Arial", 2, 17)); // NOI18N
        novaSenhaBotao.setForeground(java.awt.Color.white);
        novaSenhaBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/second/nov.png"))); // NOI18N
        novaSenhaBotao.setText("Nova senha");
        novaSenhaBotao.setToolTipText("");
        novaSenhaBotao.setAlignmentX(0.5F);
        novaSenhaBotao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, java.awt.Color.gray));
        novaSenhaBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        novaSenhaBotao.setFocusable(false);
        novaSenhaBotao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        novaSenhaBotao.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        novaSenhaBotao.setIconTextGap(0);
        novaSenhaBotao.setMargin(new java.awt.Insets(20, 14, 20, 14));
        novaSenhaBotao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                novaSenhaBotaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                novaSenhaBotaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                novaSenhaBotaoMouseExited(evt);
            }
        });
        getContentPane().add(novaSenhaBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, 50));

        setSize(new java.awt.Dimension(464, 287));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void novaSenhaBotaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novaSenhaBotaoMouseClicked
        if(evt.getButton()==1){
        trocaDeAba();
        card.show(abas, "salvarSenha");
        selecaoCor(novaSenhaBotao);
        setSelec1(false); setSelec2(true);
        }
    }//GEN-LAST:event_novaSenhaBotaoMouseClicked

    private void senhasBotaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senhasBotaoMouseClicked
        
        if(evt.getButton()==1){
        trocaDeAba();
        card.show(abas, "senhas");
        selecaoCor(senhasBotao);
        setSelec1(true); setSelec2(false);
        }
    }//GEN-LAST:event_senhasBotaoMouseClicked

    private void senhasBotaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senhasBotaoMouseEntered
        senhasBotao.setBackground(Color.darkGray);
        senhasBotao.setOpaque(false);
    }//GEN-LAST:event_senhasBotaoMouseEntered

    private void senhasBotaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senhasBotaoMouseExited
        if(isSelec1()){
             senhasBotao.setBackground(Color.gray);
        }else{ senhasBotao.setBackground(Color.black);}
    }//GEN-LAST:event_senhasBotaoMouseExited

    private void novaSenhaBotaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novaSenhaBotaoMouseEntered
        novaSenhaBotao.setBackground(Color.darkGray);
    }//GEN-LAST:event_novaSenhaBotaoMouseEntered

    private void novaSenhaBotaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novaSenhaBotaoMouseExited
        if(isSelec2()){
             novaSenhaBotao.setBackground(Color.gray);
        }else{ novaSenhaBotao.setBackground(Color.black);}
    }//GEN-LAST:event_novaSenhaBotaoMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mostrar().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abas;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton novaSenhaBotao;
    private principal.first.SalvarSenhas salvarAba;
    private principal.first.VerSenha senhasAba;
    private javax.swing.JButton senhasBotao;
    // End of variables declaration//GEN-END:variables

    public void trocaDeAba(){
        senhasAba.encheLista();
        senhasAba.desativar(false);
        salvarAba.limparCampos();
        
        if(isSelec1()){
            senhasBotao.setForeground(Color.white);
            //senhasBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/second/senhas.png")));
        }else if(isSelec2()){
            novaSenhaBotao.setForeground(Color.white);
            //novaSenhaBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/second/nov.png")));
        }
    }
    
    private void selecaoCor(javax.swing.JButton botao){
        if(botao==senhasBotao){
            senhasBotao.setBackground(Color.gray);
           senhasBotao.setForeground(Color.black);
           senhasBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/second/salvas2.png")));
            novaSenhaBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/second/nov.png")));
            novaSenhaBotao.setBackground(Color.black);
        }else{
            senhasBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/second/salvas.png")));
             novaSenhaBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/second/nov2.png")));
            senhasBotao.setBackground(Color.black);
            novaSenhaBotao.setBackground(Color.gray);
            novaSenhaBotao.setForeground(Color.black);
            //novaSenhaBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/principal/second/nov2.png")));
        }
    }

    public boolean isSelec1() {
        return selec1;
    }

    public void setSelec1(boolean selec1) {
        this.selec1 = selec1;
    }

    public boolean isSelec2() {
        return selec2;
    }

    public void setSelec2(boolean selec2) {
        this.selec2 = selec2;
    }

    
}
