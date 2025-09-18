package Pedidos;

import DataBase.DataBaseDAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PedidosDAO {

    DataBaseDAO bd = new DataBaseDAO();
    private PreparedStatement st;
    private ResultSet rs;

    public int cadastrar(Pedidos pedidos) {
        int status;
        try {
            st = bd.conn.prepareStatement("INSERT INTO Pedidos(Caminho_Imagem,Valor_Total,Status_pedido,Tipo_Pagamento,Data_pedido) VALUES(?,?,?,?,?)");
            st.setString(1, pedidos.getCaminhoImagem());
            st.setString(2, pedidos.getValorTotal());
            st.setString(3, pedidos.getStatus());
            st.setString(4, pedidos.getTipoDePagamento());
            st.setDate(5, new Date(pedidos.getData().getTime()));
            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar pedido: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    public int atualizar(Pedidos pedidos) {
        int status;
        try {
            st = bd.conn.prepareStatement("UPDATE Pedidos SET Caminho_Imagem = ?, Valor_Total = ?,"
                    + "Status_pedido = ?, Tipo_Pagamento = ?, Data_pedido = ? where Nome = ?");
            st.setString(1, pedidos.getCaminhoImagem());
            st.setString(2, pedidos.getValorTotal());
            st.setString(3, pedidos.getStatus());
            st.setString(4, pedidos.getTipoDePagamento());
            st.setDate(4, new Date(pedidos.getData().getTime()));
            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
    }

    public Pedidos consultar(String nome) {
        try {
            Pedidos pedidos = new Pedidos();
            st = bd.conn.prepareStatement("SELECT * from Pedidos WHERE Nome = ?");
            st.setString(1, nome);
            rs = st.executeQuery();
            if (rs.next()) {
                pedidos.setCaminhoImagem(rs.getString("Caminho_Imagem"));
                pedidos.setValorTotal(rs.getString("Valor_Total"));
                pedidos.setStatus(rs.getString("Status_Pedido"));
                pedidos.setTipoDePagamento(rs.getString("Tipo_Pagamento"));
                pedidos.setData(rs.getDate("Data_pedido"));
                return pedidos;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }

    public boolean excluir(String nome) {
        try {
            st = bd.conn.prepareStatement("DELETE FROM Pedidos WHERE Nome = ?");
            st.setString(1, nome);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public List<Pedidos> buscarPedidos(String nome) {
        String sql = "SELECT * FROM Pedidos WHERE Nome LIKE ?";
        List<Pedidos> listaPedidos = new ArrayList<>();
        try {
            PreparedStatement stmt = this.bd.conn.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Pedidos pedidos = new Pedidos();

                pedidos.setCaminhoImagem(rs.getString("Caminho_Imagem"));
                pedidos.setValorTotal(rs.getString("Valor_Total"));
                pedidos.setStatus(rs.getString("Status_Pedido"));
                pedidos.setTipoDePagamento(rs.getString("Tipo_Pagamento"));
                pedidos.setData(rs.getDate("Data_pedido"));

                listaPedidos.add(pedidos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaPedidos;
    }
}
