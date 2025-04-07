package TelasPizzaria;

import Pedidos.Pedidos;
import Pedidos.PedidosDAO;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TelaCadastroPedidos extends javax.swing.JFrame {

    public TelaCadastroPedidos() {
        initComponents();
    }
    
    private String caminhoImagem = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlTeladeLogin = new javax.swing.JPanel();
        pnlTeladeFundo = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        imgPizza = new javax.swing.JLabel();
        imgPizza2 = new javax.swing.JLabel();
        imgPizzariadeMuspelheim = new javax.swing.JLabel();
        imgKratosComPizza = new javax.swing.JLabel();
        imgMuspelheim = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        btnLimpar = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        pnlData = new javax.swing.JPanel();
        ftfData = new javax.swing.JFormattedTextField();
        pnlImagemUpload = new javax.swing.JPanel();
        btnUpload = new javax.swing.JButton();
        imgUpload = new javax.swing.JLabel();
        lblEscolherImagem = new javax.swing.JLabel();
        lblDescricaodoProduto = new javax.swing.JLabel();
        pnlDescricaodoProduto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescricaodoProduto = new javax.swing.JTextArea();
        lblData = new javax.swing.JLabel();
        cmbTipodePagamento = new javax.swing.JComboBox<>();
        lblPreco = new javax.swing.JLabel();
        pnlPreco = new javax.swing.JPanel();
        ftfPreco = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Pedidos");

        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTeladeLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        pnlTeladeLogin.add(pnlTeladeFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 510));

        pnlLogin.setBackground(new java.awt.Color(255, 255, 0));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLimpar.setBackground(new java.awt.Color(255, 51, 0));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        pnlLogin.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        btnEnviar.setBackground(new java.awt.Color(0, 255, 0));
        btnEnviar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnEnviar.setText("ENVIAR");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        pnlLogin.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, -1, -1));

        pnlData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ftfData.setText("    DD/MM/YYYY");
        pnlData.add(ftfData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, -1));

        pnlLogin.add(pnlData, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 120, 20));

        pnlImagemUpload.setBackground(new java.awt.Color(255, 255, 255));
        pnlImagemUpload.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUpload.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnUpload.setText("Upload");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });
        pnlImagemUpload.add(btnUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        imgUpload.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgNuvemUpload.png")); // NOI18N
        pnlImagemUpload.add(imgUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        lblEscolherImagem.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblEscolherImagem.setText(" Escolha uma imagem:");
        pnlImagemUpload.add(lblEscolherImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 110, -1));

        pnlLogin.add(pnlImagemUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 110));

        lblDescricaodoProduto.setText("DESCRIÇÃO DO PRODUTO:");
        pnlLogin.add(lblDescricaodoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jtaDescricaodoProduto.setColumns(20);
        jtaDescricaodoProduto.setRows(5);
        jScrollPane1.setViewportView(jtaDescricaodoProduto);

        javax.swing.GroupLayout pnlDescricaodoProdutoLayout = new javax.swing.GroupLayout(pnlDescricaodoProduto);
        pnlDescricaodoProduto.setLayout(pnlDescricaodoProdutoLayout);
        pnlDescricaodoProdutoLayout.setHorizontalGroup(
            pnlDescricaodoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescricaodoProdutoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlDescricaodoProdutoLayout.setVerticalGroup(
            pnlDescricaodoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        pnlLogin.add(pnlDescricaodoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 210, -1));

        lblData.setText("DATA:");
        pnlLogin.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        cmbTipodePagamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbTipodePagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Pagamento", "Dinheiro", "Cartão de crédito/débito", "Pix", "Vale-refeição" }));
        pnlLogin.add(cmbTipodePagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 210, -1));

        lblPreco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPreco.setText("PREÇO:");
        pnlLogin.add(lblPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        pnlPreco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ftfPreco.setText("          R$00,00");
        ftfPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfPrecoActionPerformed(evt);
            }
        });
        pnlPreco.add(ftfPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, -1));

        pnlLogin.add(pnlPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 130, 20));

        pnlTeladeLogin.add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 250, 510));

        pnlPrincipal.add(pnlTeladeLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void ftfPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfPrecoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaListagemPedidos telaPedidos = new TelaListagemPedidos();
        telaPedidos.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        Pedidos pedidos = new Pedidos();
        PedidosDAO pedidosDAO = new PedidosDAO();
        boolean status;
        int resposta = 0;
        
        pedidos.setCaminhoImagem(caminhoImagem);
        pedidos.setDescricao(jtaDescricaodoProduto.getText());
        pedidos.setTipoDePagamento((String) cmbTipodePagamento.getSelectedItem());
        pedidos.setValorTotal(ftfPreco.getText());
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String strData = ftfData.getText();
        
        try {
            Date data = sdf.parse(strData);

            java.sql.Date sqlDate = new java.sql.Date(data.getTime());

            pedidos.setData(sqlDate);

        } catch (ParseException ex) {
            System.out.println("Erro ao converter o texto para Date: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
    UploadImagem upload = new UploadImagem();
    upload.selecionarImagem();
        
    JLabel lblImagem = new JLabel();
        
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Escolher Imagem");

    int resultado = fileChooser.showOpenDialog(this);

    if (resultado == JFileChooser.APPROVE_OPTION) {
        File arquivoSelecionado = fileChooser.getSelectedFile();

        caminhoImagem = arquivoSelecionado.getAbsolutePath(); // ← aqui você seta o caminho
            JOptionPane.showMessageDialog(null, "Imagem selecionada com sucesso!");
        try {
            Image imagem = ImageIO.read(arquivoSelecionado).getScaledInstance(
                lblImagem.getWidth(), lblImagem.getHeight(), Image.SCALE_SMOOTH
            );
            lblImagem.setIcon(new ImageIcon(imagem));
            lblImagem.setText("");

            // Opcional: salvar em uma pasta local
            File destino = new File("imagens/" + arquivoSelecionado.getName());
            destino.getParentFile().mkdirs();
            java.nio.file.Files.copy(
                arquivoSelecionado.toPath(), 
                destino.toPath(), 
                java.nio.file.StandardCopyOption.REPLACE_EXISTING
            );
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar a imagem.");
        }
    }
    
   
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagens", "jpg", "png", "jpeg", "gif");
        fileChooser.setFileFilter(filtro);
    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        Pedidos pedidos = new Pedidos();
        PedidosDAO pedidosDAO = new PedidosDAO();
        boolean status;
        int resposta = 0;
        
        pedidos.setCaminhoImagem(caminhoImagem);
        pedidos.setDescricao(jtaDescricaodoProduto.getText());
        pedidos.setTipoDePagamento((String) cmbTipodePagamento.getSelectedItem());
        pedidos.setValorTotal(ftfPreco.getText());
         
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String strData = ftfData.getText();
        
        try {
            Date data = sdf.parse(strData);

            java.sql.Date sqlDate = new java.sql.Date(data.getTime());

            pedidos.setData(sqlDate);

        } catch (ParseException ex) {
            System.out.println("Erro ao converter o texto para Date: " + ex.getMessage());
        }
        
        status = pedidosDAO.conectar();
        
        if (!status) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!");
        } else {
            resposta = pedidosDAO.cadastrar(pedidos);
            if (resposta == 1) {
                JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso.");
                jtaDescricaodoProduto.setText("");
                ftfData.setText("");
                cmbTipodePagamento.setSelectedItem("Tipo de Pagamento");
                ftfPreco.setText("");
            } else if (resposta == 1062) {
                JOptionPane.showMessageDialog(null, "Este pedido já foi cadastrado.");
        } else {
                JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar o pedido!");
        }
        pedidosDAO.desconectar();
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnUpload;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbTipodePagamento;
    private javax.swing.JFormattedTextField ftfData;
    private javax.swing.JFormattedTextField ftfPreco;
    private javax.swing.JLabel imgKratosComPizza;
    private javax.swing.JLabel imgMuspelheim;
    private javax.swing.JLabel imgPizza;
    private javax.swing.JLabel imgPizza2;
    private javax.swing.JLabel imgPizzariadeMuspelheim;
    private javax.swing.JLabel imgUpload;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtaDescricaodoProduto;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDescricaodoProduto;
    private javax.swing.JLabel lblEscolherImagem;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JPanel pnlData;
    private javax.swing.JPanel pnlDescricaodoProduto;
    private javax.swing.JPanel pnlImagemUpload;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlPreco;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlTeladeFundo;
    private javax.swing.JPanel pnlTeladeLogin;
    // End of variables declaration//GEN-END:variables
}
