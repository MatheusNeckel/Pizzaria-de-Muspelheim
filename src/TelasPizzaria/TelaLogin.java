package TelasPizzaria;

import Usuarios.Usuarios;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlTeladeFundo = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        imgPizza = new javax.swing.JLabel();
        imgPizza2 = new javax.swing.JLabel();
        imgPizzariadeMuspelheim = new javax.swing.JLabel();
        imgKratosComPizza = new javax.swing.JLabel();
        imgMuspelheim = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        jcbLembrarLogin = new javax.swing.JCheckBox();
        lblEsqueceuaSenha = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        lblNaoTemConta = new javax.swing.JLabel();
        lblMensagemdeErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");

        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTeladeFundo.setBackground(new java.awt.Color(255, 153, 0));
        pnlTeladeFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar.setBackground(new java.awt.Color(204, 204, 255));
        btnVoltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgVoltar (1).png")); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        pnlTeladeFundo.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        btnVoltar.getAccessibleContext().setAccessibleDescription("Botão para voltar para a página anterior");

        imgPizza.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgPizza.png")); // NOI18N
        pnlTeladeFundo.add(imgPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        imgPizza2.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgPizza.png")); // NOI18N
        pnlTeladeFundo.add(imgPizza2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, -1));

        imgPizzariadeMuspelheim.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgPizzariadeMuspelheim (5).png")); // NOI18N
        pnlTeladeFundo.add(imgPizzariadeMuspelheim, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        imgKratosComPizza.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgKratosComPizza.png")); // NOI18N
        pnlTeladeFundo.add(imgKratosComPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 310, -1));

        imgMuspelheim.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgMuspelheim (5).png")); // NOI18N
        pnlTeladeFundo.add(imgMuspelheim, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlPrincipal.add(pnlTeladeFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 510));

        pnlLogin.setBackground(new java.awt.Color(255, 255, 0));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblLogin.setText("Login");
        pnlLogin.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 60, -1));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setText("Email:");
        pnlLogin.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnlLogin.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 200, -1));

        lblSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSenha.setText("Senha:");
        pnlLogin.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnlLogin.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 200, -1));

        jcbLembrarLogin.setText("Lembrar meu login");
        jcbLembrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbLembrarLoginActionPerformed(evt);
            }
        });
        pnlLogin.add(jcbLembrarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        lblEsqueceuaSenha.setText("Esqueceu a senha?");
        pnlLogin.add(lblEsqueceuaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        btnLimpar.setBackground(new java.awt.Color(255, 51, 0));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        pnlLogin.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        btnEntrar.setBackground(new java.awt.Color(0, 255, 0));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnEntrar.setText("ENTRAR");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        pnlLogin.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        lblNaoTemConta.setText("Não tem uma conta? Cadastre-se");
        lblNaoTemConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNaoTemContaMouseClicked(evt);
            }
        });
        pnlLogin.add(lblNaoTemConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));
        pnlLogin.add(lblMensagemdeErro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        pnlPrincipal.add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 240, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbLembrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbLembrarLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbLembrarLoginActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        Usuarios usuarios = new Usuarios();

        usuarios.setEmail(txtEmail.getText());
        usuarios.setSenha(txtSenha.getText());

        TelaMenuInicial telaMenuInicial = new TelaMenuInicial();
        telaMenuInicial.setVisible(true);
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtEmail.setText("");
        txtSenha.setText("");
        jcbLembrarLogin.setSelected(false);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void lblNaoTemContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNaoTemContaMouseClicked
        TelaCadastroUsuario telaCadastroUsuario = new TelaCadastroUsuario();
        telaCadastroUsuario.setVisible(true);
    }//GEN-LAST:event_lblNaoTemContaMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel imgKratosComPizza;
    private javax.swing.JLabel imgMuspelheim;
    private javax.swing.JLabel imgPizza;
    private javax.swing.JLabel imgPizza2;
    private javax.swing.JLabel imgPizzariadeMuspelheim;
    private javax.swing.JCheckBox jcbLembrarLogin;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEsqueceuaSenha;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblMensagemdeErro;
    private javax.swing.JLabel lblNaoTemConta;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlTeladeFundo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
