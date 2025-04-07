package TelasPizzaria;

import Clientes.Clientes;
import Clientes.ClientesDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class TelaCadastroClientes extends javax.swing.JFrame {

    public TelaCadastroClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        imgPizza2 = new javax.swing.JLabel();
        imgPizza = new javax.swing.JLabel();
        pnlPizzariadeMuspelheim = new javax.swing.JPanel();
        lblPizzariadeMuspelheim = new javax.swing.JLabel();
        lblCadastrarUsuario = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblSobrenome = new javax.swing.JLabel();
        txtSobrenome = new javax.swing.JTextField();
        lblDatadeNascimento = new javax.swing.JLabel();
        txtDatadeNascimento = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        cmbGenero = new javax.swing.JComboBox<>();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblPontodeReferencia = new javax.swing.JLabel();
        txtPontodeReferencia = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        imgMuspelheim = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");

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

        imgPizza2.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgPizza.png")); // NOI18N
        pnlPrincipal.add(imgPizza2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 100, -1));

        imgPizza.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgPizza.png")); // NOI18N
        pnlPrincipal.add(imgPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        pnlPizzariadeMuspelheim.setBackground(new java.awt.Color(255, 255, 0));
        pnlPizzariadeMuspelheim.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPizzariadeMuspelheim.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        lblPizzariadeMuspelheim.setText("Pizzaria de Muspelheim");
        pnlPizzariadeMuspelheim.add(lblPizzariadeMuspelheim, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        lblCadastrarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCadastrarUsuario.setText("Cadastrar Clientes");
        pnlPizzariadeMuspelheim.add(lblCadastrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNome.setText("Nome:");
        pnlPizzariadeMuspelheim.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        pnlPizzariadeMuspelheim.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 260, -1));

        lblSobrenome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSobrenome.setText("Sobrenome:");
        pnlPizzariadeMuspelheim.add(lblSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        txtSobrenome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSobrenomeActionPerformed(evt);
            }
        });
        pnlPizzariadeMuspelheim.add(txtSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 260, -1));

        lblDatadeNascimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDatadeNascimento.setText("Data de Nascimento:");
        pnlPizzariadeMuspelheim.add(lblDatadeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txtDatadeNascimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDatadeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatadeNascimentoActionPerformed(evt);
            }
        });
        pnlPizzariadeMuspelheim.add(txtDatadeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 260, -1));

        lblGenero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblGenero.setText("Gênero:");
        pnlPizzariadeMuspelheim.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        cmbGenero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Masculino", "Feminino", "Prefiro não dizer" }));
        pnlPizzariadeMuspelheim.add(cmbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 260, -1));

        lblTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTelefone.setText("Telefone:");
        pnlPizzariadeMuspelheim.add(lblTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        txtTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        pnlPizzariadeMuspelheim.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 260, -1));

        lblCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCPF.setText("CPF: (Opcional)");
        pnlPizzariadeMuspelheim.add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        txtCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });
        pnlPizzariadeMuspelheim.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 260, -1));

        lblEndereco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEndereco.setText("Endereço:");
        pnlPizzariadeMuspelheim.add(lblEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        txtEndereco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });
        pnlPizzariadeMuspelheim.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 260, -1));

        lblPontodeReferencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPontodeReferencia.setText("Ponto de referência:");
        pnlPizzariadeMuspelheim.add(lblPontodeReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        txtPontodeReferencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPontodeReferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPontodeReferenciaActionPerformed(evt);
            }
        });
        pnlPizzariadeMuspelheim.add(txtPontodeReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 260, -1));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setText("Email:");
        pnlPizzariadeMuspelheim.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnlPizzariadeMuspelheim.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 260, -1));

        lblSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSenha.setText("Senha:");
        pnlPizzariadeMuspelheim.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, -1, -1));

        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnlPizzariadeMuspelheim.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 260, -1));

        btnLimpar.setBackground(new java.awt.Color(255, 51, 0));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        pnlPizzariadeMuspelheim.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, -1, -1));

        btnCadastrar.setBackground(new java.awt.Color(0, 255, 0));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        pnlPizzariadeMuspelheim.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        pnlPrincipal.add(pnlPizzariadeMuspelheim, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 580, 570));

        imgMuspelheim.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgMuspelheim.png")); // NOI18N
        pnlPrincipal.add(imgMuspelheim, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 570));

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

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSobrenomeActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtPontodeReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPontodeReferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPontodeReferenciaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Clientes clientes = new Clientes();
        ClientesDAO clientesDAO = new ClientesDAO();
        boolean status;
        int resposta = 0;

        clientes.setNome(txtNome.getText());
        clientes.setSobrenome(txtSobrenome.getText());
        clientes.setGenero((String) cmbGenero.getSelectedItem());
        clientes.setTelefone(txtTelefone.getText());
        clientes.setCpf(txtCPF.getText());
        clientes.setEndereco(txtEndereco.getText());
        clientes.setPontoReferencia(txtPontodeReferencia.getText());
        clientes.setEmail(txtEmail.getText());
        clientes.setSenha(txtSenha.getText());
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String strData = txtDatadeNascimento.getText();
        
        try {
            Date dataDeNascimento = sdf.parse(strData);

            java.sql.Date sqlDate = new java.sql.Date(dataDeNascimento.getTime());

            clientes.setDataDeNascimento(sqlDate);

        } catch (ParseException ex) {
            System.out.println("Erro ao converter o texto para Date: " + ex.getMessage());
        }
        
        status = clientesDAO.conectar();
        
        if (!status) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!");
        } else {
            resposta = clientesDAO.cadastrar(clientes);
            if (resposta == 1) {
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso.");
                txtNome.setText("");
                txtSobrenome.setText("");
                txtDatadeNascimento.setText("");
                cmbGenero.setSelectedItem("Nenhum");
                txtTelefone.setText("");
                txtCPF.setText("");
                txtEndereco.setText("");
                txtPontodeReferencia.setText("");
                txtEmail.setText("");
                txtSenha.setText("");
            } else if (resposta == 1062) {
                JOptionPane.showMessageDialog(null, "Este cliente já foi cadastrado.");
        } else {
                JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar o cliente!");
        }
        clientesDAO.desconectar();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtDatadeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatadeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatadeNascimentoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaListagemClientes telaClientes = new TelaListagemClientes();
        telaClientes.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");
        txtSobrenome.setText("");
        txtDatadeNascimento.setText("");
        cmbGenero.setSelectedItem("Nenhum");
        txtTelefone.setText("");
        txtCPF.setText("");
        txtEndereco.setText("");
        txtPontodeReferencia.setText("");
        txtEmail.setText("");
        txtSenha.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JLabel imgMuspelheim;
    private javax.swing.JLabel imgPizza;
    private javax.swing.JLabel imgPizza2;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCadastrarUsuario;
    private javax.swing.JLabel lblDatadeNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPizzariadeMuspelheim;
    private javax.swing.JLabel lblPontodeReferencia;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSobrenome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pnlPizzariadeMuspelheim;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtDatadeNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPontodeReferencia;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtSobrenome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
