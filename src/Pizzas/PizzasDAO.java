package Pizzas;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PizzasDAO {
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

    public int cadastrar(Pizzas pizzas) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO Pizzas(Nome,Tamanho,Preco,Descricao,Quantidade) VALUES(?,?,?,?,?)");
            st.setString(1, pizzas.getNome());
            st.setString(2, pizzas.getTamanho());
            st.setDouble(3, pizzas.getPreco());
            st.setString(4, pizzas.getDescricao());
            st.setInt(5, pizzas.getQuantidade());
            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar pizza: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    public Pizzas consultar(String nome) {

        try {
            Pizzas pizzas = new Pizzas();
            st = conn.prepareStatement("SELECT * from Pizzas WHERE Nome = ?");
            st.setString(1, nome);
            rs = st.executeQuery();
            if (rs.next()) {
                pizzas.setNome(rs.getString("Nome"));
                pizzas.setTamanho(rs.getString("Tamanho"));
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
            st = conn.prepareStatement("DELETE FROM Pizzas WHERE Nome = ?");
            st.setString(1, nome);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public int atualizar(Pizzas pizzas) {
        int status;
        try {
            st = conn.prepareStatement("UPDATE Pizzas SET Nome = ?, Tamanho = ?, Preco = ?, Descricao = ?, Quantidade = ? where Nome = ?");
            st.setString(1, pizzas.getNome());
            st.setString(2, pizzas.getTamanho());
            st.setDouble(3, pizzas.getPreco());
            st.setString(4, pizzas.getDescricao());
            st.setInt(5, pizzas.getQuantidade());
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

    public List<Pizzas> buscarPizzas(String nome) {
        String sql = "SELECT * FROM Pizzas WHERE Nome LIKE ?";
        List<Pizzas> listaPizzas = new ArrayList<>();
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Pizzas pizzas = new Pizzas();

                pizzas.setNome(rs.getString("Nome"));
                pizzas.setTamanho(rs.getString("Tamanho"));
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
