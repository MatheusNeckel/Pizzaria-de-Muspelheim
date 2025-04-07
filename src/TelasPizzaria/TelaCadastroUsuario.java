package TelasPizzaria;

import Usuarios.Usuarios;
import Usuarios.UsuariosDAO;
import javax.swing.JOptionPane;

public class TelaCadastroUsuario extends javax.swing.JFrame {

    public TelaCadastroUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        pnlPizzariadeMuspelheim = new javax.swing.JPanel();
        lblPizzariadeMuspelheim = new javax.swing.JLabel();
        lblCadastrarUsuario = new javax.swing.JLabel();
        lblNomeUsuario = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        lblTipoUsuario = new javax.swing.JLabel();
        cmbTipoUsuario = new javax.swing.JComboBox<>();
        btnLimpar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        imgPizza2 = new javax.swing.JLabel();
        imgPizza = new javax.swing.JLabel();
        imgMuspelheim = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuário");

        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar.setBackground(new java.awt.Color(204, 204, 255));
        btnVoltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgVoltar (1).png")); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        btnVoltar.getAccessibleContext().setAccessibleDescription("Botão para voltar para a página anterior");

        pnlPizzariadeMuspelheim.setBackground(new java.awt.Color(255, 255, 0));
        pnlPizzariadeMuspelheim.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPizzariadeMuspelheim.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        lblPizzariadeMuspelheim.setText("Pizzaria de Muspelheim");
        pnlPizzariadeMuspelheim.add(lblPizzariadeMuspelheim, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        lblCadastrarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCadastrarUsuario.setText("Cadastrar Usuário");
        pnlPizzariadeMuspelheim.add(lblCadastrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        lblNomeUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNomeUsuario.setText("Nome de Usuário:");
        pnlPizzariadeMuspelheim.add(lblNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        txtNomeUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUsuarioActionPerformed(evt);
            }
        });
        pnlPizzariadeMuspelheim.add(txtNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 260, -1));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEmail.setText("Email:");
        pnlPizzariadeMuspelheim.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnlPizzariadeMuspelheim.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 260, -1));

        lblSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSenha.setText("Senha:");
        pnlPizzariadeMuspelheim.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnlPizzariadeMuspelheim.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 260, -1));

        lblTipoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTipoUsuario.setText("Escolha o tipo de usuário:");
        pnlPizzariadeMuspelheim.add(lblTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        cmbTipoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Pizzaiolo", "Gerente", " Maître", "Bartender" }));
        pnlPizzariadeMuspelheim.add(cmbTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 260, -1));

        btnLimpar.setBackground(new java.awt.Color(255, 51, 0));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        pnlPizzariadeMuspelheim.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, -1));

        btnCadastrar.setBackground(new java.awt.Color(0, 255, 0));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        pnlPizzariadeMuspelheim.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        pnlPrincipal.add(pnlPizzariadeMuspelheim, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 540, 500));

        imgPizza2.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgPizza.png")); // NOI18N
        pnlPrincipal.add(imgPizza2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 100, -1));

        imgPizza.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgPizza.png")); // NOI18N
        pnlPrincipal.add(imgPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        imgMuspelheim.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgMuspelheim (2).png")); // NOI18N
        pnlPrincipal.add(imgMuspelheim, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -30, 840, 530));

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

    private void txtNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUsuarioActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Usuarios usuarios = new Usuarios();
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        boolean status;
        int resposta = 0;
        
        usuarios.setNome(txtNomeUsuario.getText());
        usuarios.setEmail(txtEmail.getText());
        usuarios.setSenha(txtSenha.getText());
        usuarios.setTipoDeUsuario((String) cmbTipoUsuario.getSelectedItem());
        
        status = usuariosDAO.conectar();
        
        if (!status) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!");
        } else {
            resposta = usuariosDAO.cadastrar(usuarios);
            if (resposta == 1) {
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso.");
                txtNomeUsuario.setText("");
                txtEmail.setText("");
                txtSenha.setText("");
                cmbTipoUsuario.setSelectedItem("Nenhum");
            } else if (resposta == 1062) {
                JOptionPane.showMessageDialog(null, "Este usuário já foi cadastrado.");
        } else {
                JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar o usuário!");
        }
        usuariosDAO.desconectar();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNomeUsuario.setText("");
        txtEmail.setText("");
        txtSenha.setText("");
        cmbTipoUsuario.setSelectedItem("Nenhum");
    }//GEN-LAST:event_btnLimparActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbTipoUsuario;
    private javax.swing.JLabel imgMuspelheim;
    private javax.swing.JLabel imgPizza;
    private javax.swing.JLabel imgPizza2;
    private javax.swing.JLabel lblCadastrarUsuario;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblPizzariadeMuspelheim;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTipoUsuario;
    private javax.swing.JPanel pnlPizzariadeMuspelheim;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
