package TelasPizzaria;

import java.awt.Color;

public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
        jPanel2.setBackground(new Color(0, 0, 0, 50));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnCadastrar = btnCadastrar = new RoundedButton("btnCadastrar");
        btnEntrar = btnEntrar = new RoundedButton("btnEntrar");
        lblJaTemConta = new javax.swing.JLabel();
        imgPizzariadeMuspelheim = new javax.swing.JLabel();
        imgMuspelheim = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");

        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadastrar.setBackground(new java.awt.Color(255, 255, 0));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCadastrar.setText("CADASTRAR-SE");
        btnCadastrar.setFocusPainted(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        btnEntrar.setBackground(new java.awt.Color(0, 255, 0));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEntrar.setText("ENTRAR");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        lblJaTemConta.setForeground(new java.awt.Color(255, 255, 255));
        lblJaTemConta.setText("Já tem uma conta?");
        jPanel2.add(lblJaTemConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        imgPizzariadeMuspelheim.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgPizzariadeMuspelheim.png")); // NOI18N
        jPanel2.add(imgPizzariadeMuspelheim, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, 170));

        pnlPrincipal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 420));

        imgMuspelheim.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgMuspelheim (2).png")); // NOI18N
        pnlPrincipal.add(imgMuspelheim, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 420));

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

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        TelaCadastroUsuario telaCadastro = new TelaCadastroUsuario();
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel imgMuspelheim;
    private javax.swing.JLabel imgPizzariadeMuspelheim;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblJaTemConta;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
