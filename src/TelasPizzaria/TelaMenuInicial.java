package TelasPizzaria;

public class TelaMenuInicial extends javax.swing.JFrame {

    public TelaMenuInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTeladeFundo = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        pnlPizzariadeMuspelheim = new javax.swing.JPanel();
        imgPizzariadeMuspelheim = new javax.swing.JLabel();
        pnlPerfil = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        imgPerfil = new javax.swing.JLabel();
        pnlFunções = new javax.swing.JPanel();
        pnlBotõesPrincipais = new javax.swing.JPanel();
        btnPedidos = new javax.swing.JButton();
        btnCardapio = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnPagamentos = new javax.swing.JButton();
        btnRelatorios = new javax.swing.JButton();
        btnConfiguracoes = new javax.swing.JButton();
        pnlPedidos = new javax.swing.JPanel();
        lblUltimosPedidos = new javax.swing.JLabel();
        pnlPedido4 = new javax.swing.JPanel();
        lblPedido4 = new javax.swing.JLabel();
        pnlPedido3 = new javax.swing.JPanel();
        lblPedido3 = new javax.swing.JLabel();
        pnlPedido2 = new javax.swing.JPanel();
        lblPedido2 = new javax.swing.JLabel();
        pnlPedido1 = new javax.swing.JPanel();
        lblPedido1 = new javax.swing.JLabel();
        imgMuspelheim = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Inicial");

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

        pnlPizzariadeMuspelheim.setBackground(new java.awt.Color(255, 153, 0));
        pnlPizzariadeMuspelheim.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgPizzariadeMuspelheim.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgPizzariadeMuspelheim (1).png")); // NOI18N
        pnlPizzariadeMuspelheim.add(imgPizzariadeMuspelheim, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 140));

        pnlTeladeFundo.add(pnlPizzariadeMuspelheim, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 140));

        pnlPerfil.setBackground(new java.awt.Color(255, 153, 0));
        pnlPerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsuario.setText("Usuário");
        pnlPerfil.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        imgPerfil.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgPerfil.png")); // NOI18N
        pnlPerfil.add(imgPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pnlTeladeFundo.add(pnlPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 90, 110));

        pnlFunções.setBackground(new java.awt.Color(255, 51, 0));
        pnlFunções.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBotõesPrincipais.setBackground(new java.awt.Color(255, 204, 0));
        pnlBotõesPrincipais.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPedidos.setBackground(new java.awt.Color(255, 102, 51));
        btnPedidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPedidos.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\Ícone de Lista.png")); // NOI18N
        btnPedidos.setText("Pedidos");
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });
        pnlBotõesPrincipais.add(btnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, -1));

        btnCardapio.setBackground(new java.awt.Color(255, 102, 51));
        btnCardapio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCardapio.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\Ícone de Pizza.png")); // NOI18N
        btnCardapio.setText("Cardápio");
        btnCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCardapioActionPerformed(evt);
            }
        });
        pnlBotõesPrincipais.add(btnCardapio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 160, -1));

        btnClientes.setBackground(new java.awt.Color(255, 102, 51));
        btnClientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\Ícone de Clientes.png")); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        pnlBotõesPrincipais.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 180, -1));

        btnPagamentos.setBackground(new java.awt.Color(255, 102, 51));
        btnPagamentos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPagamentos.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\Ícone de Dinheiro.png")); // NOI18N
        btnPagamentos.setText("Pagamentos");
        pnlBotõesPrincipais.add(btnPagamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, -1));

        btnRelatorios.setBackground(new java.awt.Color(255, 102, 51));
        btnRelatorios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRelatorios.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\Emoji.png")); // NOI18N
        btnRelatorios.setText("Relatórios");
        pnlBotõesPrincipais.add(btnRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 160, -1));

        btnConfiguracoes.setBackground(new java.awt.Color(255, 102, 51));
        btnConfiguracoes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConfiguracoes.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\Group (2).png")); // NOI18N
        btnConfiguracoes.setText("Configurações");
        pnlBotõesPrincipais.add(btnConfiguracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        pnlFunções.add(pnlBotõesPrincipais, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 570, 130));

        lblUltimosPedidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUltimosPedidos.setText("Últimos pedidos:");

        javax.swing.GroupLayout pnlPedidosLayout = new javax.swing.GroupLayout(pnlPedidos);
        pnlPedidos.setLayout(pnlPedidosLayout);
        pnlPedidosLayout.setHorizontalGroup(
            pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlPedidosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblUltimosPedidos)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlPedidosLayout.setVerticalGroup(
            pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlPedidosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblUltimosPedidos)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnlFunções.add(pnlPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 160, 30));

        lblPedido4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPedido4.setText("Pedido 4");

        javax.swing.GroupLayout pnlPedido4Layout = new javax.swing.GroupLayout(pnlPedido4);
        pnlPedido4.setLayout(pnlPedido4Layout);
        pnlPedido4Layout.setHorizontalGroup(
            pnlPedido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPedido4Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lblPedido4)
                .addContainerGap())
        );
        pnlPedido4Layout.setVerticalGroup(
            pnlPedido4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPedido4Layout.createSequentialGroup()
                .addComponent(lblPedido4)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        pnlFunções.add(pnlPedido4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 90, 30));

        lblPedido3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPedido3.setText("Pedido 3");

        javax.swing.GroupLayout pnlPedido3Layout = new javax.swing.GroupLayout(pnlPedido3);
        pnlPedido3.setLayout(pnlPedido3Layout);
        pnlPedido3Layout.setHorizontalGroup(
            pnlPedido3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPedido3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lblPedido3)
                .addContainerGap())
        );
        pnlPedido3Layout.setVerticalGroup(
            pnlPedido3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPedido3Layout.createSequentialGroup()
                .addComponent(lblPedido3)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        pnlFunções.add(pnlPedido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 90, 30));

        lblPedido2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPedido2.setText("Pedido 2");

        javax.swing.GroupLayout pnlPedido2Layout = new javax.swing.GroupLayout(pnlPedido2);
        pnlPedido2.setLayout(pnlPedido2Layout);
        pnlPedido2Layout.setHorizontalGroup(
            pnlPedido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPedido2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lblPedido2)
                .addContainerGap())
        );
        pnlPedido2Layout.setVerticalGroup(
            pnlPedido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPedido2Layout.createSequentialGroup()
                .addComponent(lblPedido2)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        pnlFunções.add(pnlPedido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, 30));

        lblPedido1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPedido1.setText("Pedido 1");

        javax.swing.GroupLayout pnlPedido1Layout = new javax.swing.GroupLayout(pnlPedido1);
        pnlPedido1.setLayout(pnlPedido1Layout);
        pnlPedido1Layout.setHorizontalGroup(
            pnlPedido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPedido1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lblPedido1)
                .addContainerGap())
        );
        pnlPedido1Layout.setVerticalGroup(
            pnlPedido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPedido1Layout.createSequentialGroup()
                .addComponent(lblPedido1)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        pnlFunções.add(pnlPedido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 90, 30));

        pnlTeladeFundo.add(pnlFunções, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 630, 250));

        imgMuspelheim.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgMuspelheim (3).png")); // NOI18N
        pnlTeladeFundo.add(imgMuspelheim, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTeladeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTeladeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        TelaListagemPedidos telaPedidos = new TelaListagemPedidos();
        telaPedidos.setVisible(true);
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCardapioActionPerformed
        TelaCardapio telaCardapio = new TelaCardapio();
        telaCardapio.setVisible(true);
    }//GEN-LAST:event_btnCardapioActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        TelaListagemClientes telaClientes = new TelaListagemClientes();
        telaClientes.setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCardapio;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnConfiguracoes;
    private javax.swing.JButton btnPagamentos;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnRelatorios;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel imgMuspelheim;
    private javax.swing.JLabel imgPerfil;
    private javax.swing.JLabel imgPizzariadeMuspelheim;
    private javax.swing.JLabel lblPedido1;
    private javax.swing.JLabel lblPedido2;
    private javax.swing.JLabel lblPedido3;
    private javax.swing.JLabel lblPedido4;
    private javax.swing.JLabel lblUltimosPedidos;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlBotõesPrincipais;
    private javax.swing.JPanel pnlFunções;
    private javax.swing.JPanel pnlPedido1;
    private javax.swing.JPanel pnlPedido2;
    private javax.swing.JPanel pnlPedido3;
    private javax.swing.JPanel pnlPedido4;
    private javax.swing.JPanel pnlPedidos;
    private javax.swing.JPanel pnlPerfil;
    private javax.swing.JPanel pnlPizzariadeMuspelheim;
    private javax.swing.JPanel pnlTeladeFundo;
    // End of variables declaration//GEN-END:variables
}
