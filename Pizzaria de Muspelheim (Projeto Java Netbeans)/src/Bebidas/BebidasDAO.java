package Bebidas;

import DataBase.DataBaseDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BebidasDAO {

    DataBaseDAO bd = new DataBaseDAO();
    private PreparedStatement st;
    private ResultSet rs;

    public int cadastrar(Bebidas bebidas) {
        int status;
        try {
            st = bd.conn.prepareStatement("INSERT INTO Bebidas(Nome,Preco,Descricao,Quantidade) VALUES(?,?,?,?)");
            st.setString(1, bebidas.getNome());
            st.setDouble(2, bebidas.getPreco());
            st.setString(3, bebidas.getDescricao());
            st.setDouble(4, bebidas.getDose());
            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar bebida: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    public int atualizar(Bebidas bebidas) {
        int status;
        try {
            st = bd.conn.prepareStatement("UPDATE Bebidas SET Nome = ?, Preco = ?, Descricao = ?, Quantidade = ? where Nome = ?");
            st.setString(1, bebidas.getNome());
            st.setDouble(2, bebidas.getPreco());
            st.setString(3, bebidas.getDescricao());
            st.setDouble(4, bebidas.getDose());
            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
    }

    public Bebidas consultar(String nome) {
        try {
            Bebidas bebidas = new Bebidas();
            st = bd.conn.prepareStatement("SELECT * from Bebidas WHERE Nome = ?");
            st.setString(1, nome);
            rs = st.executeQuery();
            if (rs.next()) {
                bebidas.setNome(rs.getString("Nome"));
                bebidas.setPreco(rs.getDouble("Preco"));
                bebidas.setDescricao(rs.getString("Descricao"));
                bebidas.setDose(rs.getDouble("Dose"));
                return bebidas;
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
            st = bd.conn.prepareStatement("DELETE FROM Bebidas WHERE Nome = ?");
            st.setString(1, nome);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public List<Bebidas> buscarBebidas(String nome) {
        String sql = "SELECT * FROM Bebidas WHERE Nome LIKE ?";
        List<Bebidas> listaBebidas = new ArrayList<>();
        try {
            PreparedStatement stmt = bd.conn.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Bebidas bebidas = new Bebidas();

                bebidas.setNome(rs.getString("Nome"));
                bebidas.setPreco(rs.getDouble("Preco"));
                bebidas.setDescricao(rs.getString("Descricao"));
                bebidas.setDose(rs.getDouble("Dose"));

                listaBebidas.add(bebidas);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaBebidas;
    }
}
