package Pizzas;

import DataBase.DataBaseDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PizzasDTO {

    DataBaseDAO bd = new DataBaseDAO();
    private PreparedStatement st;
    private ResultSet rs;

    public int cadastrar(Pizzas pizzas) {
        int status;
        try {
            st = bd.conn.prepareStatement("INSERT INTO Pizzas(Nome,Tamanho,Preco,Descricao,Quantidade) VALUES(?,?,?,?,?)");
            st.setString(1, pizzas.getNome());
            st.setDouble(2, pizzas.getPreco());
            st.setString(3, pizzas.getDescricao());
            st.setInt(4, pizzas.getQuantidade());
            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar pizza: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    public int atualizar(Pizzas pizzas) {
        int status;
        try {
            st = bd.conn.prepareStatement("UPDATE Pizzas SET Nome = ?, Tamanho = ?, Preco = ?, Descricao = ?, Quantidade = ? where Nome = ?");
            st.setString(1, pizzas.getNome());
            st.setDouble(2, pizzas.getPreco());
            st.setString(3, pizzas.getDescricao());
            st.setInt(4, pizzas.getQuantidade());
            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
    }

    public Pizzas consultar(String nome) {
        try {
            Pizzas pizzas = new Pizzas();
            st = bd.conn.prepareStatement("SELECT * from Pizzas WHERE Nome = ?");
            st.setString(1, nome);
            rs = st.executeQuery();
            if (rs.next()) {
                pizzas.setNome(rs.getString("Nome"));
                pizzas.setPreco(rs.getDouble("Preco"));
                pizzas.setDescricao(rs.getString("Descricao"));
                pizzas.setQuantidade(rs.getInt("Quantidade"));
                return pizzas;
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
            st = bd.conn.prepareStatement("DELETE FROM Pizzas WHERE Nome = ?");
            st.setString(1, nome);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public List<Pizzas> buscarPizzas(String nome) {
        String sql = "SELECT * FROM Pizzas WHERE Nome LIKE ?";
        List<Pizzas> listaPizzas = new ArrayList<>();
        try {
            PreparedStatement stmt = this.bd.conn.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Pizzas pizzas = new Pizzas();

                pizzas.setNome(rs.getString("Nome"));
                pizzas.setPreco(rs.getDouble("Preco"));
                pizzas.setDescricao(rs.getString("Descricao"));
                pizzas.setQuantidade(rs.getInt("Quantidade"));

                listaPizzas.add(pizzas);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaPizzas;
    }
}
