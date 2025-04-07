package TelasPizzaria;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class UploadImagem extends JFrame {
    private JLabel labelImagem;
    private JButton botaoUpload;
    
    public void selecionarImagem() {
        JFileChooser fileChooser = new JFileChooser();

        // Filtro para aceitar apenas imagens
        FileNameExtensionFilter filtroImagem = new FileNameExtensionFilter(
                "Imagens (JPG, PNG, JPEG)", "jpg", "png", "jpeg"
        );
        fileChooser.setFileFilter(filtroImagem);

        int resultado = fileChooser.showOpenDialog(null);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File arquivoSelecionado = fileChooser.getSelectedFile();

            // Verificação extra por segurança
            String nomeArquivo = arquivoSelecionado.getName().toLowerCase();
            if (nomeArquivo.endsWith(".jpg") || nomeArquivo.endsWith(".jpeg") || nomeArquivo.endsWith(".png")) {
                // Aqui você pode continuar com o upload ou exibição
                System.out.println("Imagem selecionada: " + arquivoSelecionado.getAbsolutePath());
            } else {
                JOptionPane.showMessageDialog(null, "Formato de arquivo inválido! Selecione apenas imagens JPG ou PNG.");
            }
        }
    }

    public UploadImagem() {
        setTitle("Upload de Imagem");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        labelImagem = new JLabel("Nenhuma imagem carregada");
        labelImagem.setBounds(50, 20, 300, 150);
        add(labelImagem);

        botaoUpload = new JButton("Selecionar Imagem");
        botaoUpload.setBounds(100, 200, 180, 30);
        add(botaoUpload);

        botaoUpload.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                escolherImagem();
            }
        });
    }

    private void escolherImagem() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Escolher Imagem");
        int resultado = fileChooser.showOpenDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File arquivoSelecionado = fileChooser.getSelectedFile();

            try {
                Image imagem = ImageIO.read(arquivoSelecionado).getScaledInstance(300, 150, Image.SCALE_SMOOTH);
                labelImagem.setIcon(new ImageIcon(imagem));
                labelImagem.setText(""); // remove texto antigo
                salvarImagem(arquivoSelecionado); // opcional: salvar cópia
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao carregar a imagem.");
            }
        }
    }

    private void salvarImagem(File imagem) throws IOException {
        // Copia a imagem para uma pasta local (por exemplo: "imagens/")
        File destino = new File("imagens/" + imagem.getName());
        destino.getParentFile().mkdirs(); // cria a pasta se não existir
        java.nio.file.Files.copy(imagem.toPath(), destino.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Imagem salva em: " + destino.getAbsolutePath());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new UploadImagem().setVisible(true);
        });
    }
}
