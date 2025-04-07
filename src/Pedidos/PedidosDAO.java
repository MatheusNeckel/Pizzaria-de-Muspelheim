package Pedidos;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class PedidosDAO {
    Connection conn;
    PreparedStatement st;
    ResultSet rs;

    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PizzariadeMuspelheim", "root", "Leleco56789@");
            System.out.println("Conexão com banco de dados bem sucedida.");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return false;
        }
    }

    public int cadastrar(Pedidos pedidos) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO Pedidos(Caminho_Imagem, Valor_Total,FormaDePagamento,"
            + "Status_pedido,Data_pedido) VALUES(?,?,?,?,?,?)");
            st.setString(1, pedidos.getCaminhoImagem());
            st.setString(2, pedidos.getDescricao());
            st.setString(3, pedidos.getValorTotal());
            st.setString(4, pedidos.getTipoDePagamento());
            st.setString(5, pedidos.getStatus());
            st.setDate(6, new Date(pedidos.getData().getTime()));
            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar usuário: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    public Pedidos consultar(int idCliente) {

        try {
            Pedidos pedidos = new Pedidos();
            st = conn.prepareStatement("SELECT * from Pedidos WHERE Descricao = ?");
            st.setString(1, pedidos.getCaminhoImagem());
            rs = st.executeQuery();
            if (rs.next()) {
                pedidos.setCaminhoImagem(rs.getString("Caminho_Imagem"));
                pedidos.setDescricao(rs.getString("Descricao"));
                pedidos.setData(rs.getDate("Data_pedido"));
                pedidos.setValorTotal(rs.getString("Valor_Total"));
                pedidos.setTipoDePagamento(rs.getString("Tipo_Pagamento"));
                pedidos.setStatus(rs.getString("Status"));
                return pedidos;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }

    public boolean excluir(int id) {
        try {
            st = conn.prepareStatement("DELETE FROM Pedidos WHERE ID = ?");
            st.setInt(1, id);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public int atualizar(Pedidos pedidos) {
        int status;
        try {
            st = conn.prepareStatement("UPDATE Pedidos SET Caminho_Imagem = ?, Valor_Total = ?, Status_pedido = ?,"
            + "Forma_Pagamento = ?, Data_pedido = ?");
            
            st.setString(1, pedidos.getCaminhoImagem());
            st.setString(2, pedidos.getDescricao());
            st.setString(3, pedidos.getValorTotal());
            st.setString(4, pedidos.getTipoDePagamento());
            st.setString(5, pedidos.getStatus());
            st.setDate(6, new Date(pedidos.getData().getTime()));
            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
    }

    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {

        }
    }

    public List<Pedidos> buscarPedidos(String descricao) {
        String sql = "SELECT * FROM Pedidos WHERE ID = ?";
        List<Pedidos> listaPedidos = new ArrayList<>();
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, descricao);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Pedidos pedidos = new Pedidos();
                
                pedidos.setCaminhoImagem(rs.getString("Caminho_Imagem"));
                pedidos.setDescricao(rs.getString("Descricao"));
                pedidos.setValorTotal(rs.getString("Valor_Total"));
                pedidos.setStatus(rs.getString("Status_pedido"));
                pedidos.setTipoDePagamento(rs.getString("Tipo_Pagamento"));
                pedidos.setData(rs.getDate("Data_pedido"));

                listaPedidos.add(pedidos);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaPedidos;
    }
    
    public void salvarCaminhoImagem(String caminhoImagem) {
        try {
        String sql = "INSERT INTO Pedidos (Caminho_Imagem) VALUES (?)";
        st = conn.prepareStatement(sql);
        st.setString(1, caminhoImagem);

        st.executeUpdate();
        System.out.println("Caminho da imagem salvo com sucesso!");

    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (st != null) st.close();
            if (conn != null) conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
}
