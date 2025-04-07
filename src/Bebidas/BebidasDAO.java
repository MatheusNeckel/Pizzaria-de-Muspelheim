package Bebidas;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BebidasDAO {
     Connection conn;
    PreparedStatement st;
    ResultSet rs;

    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PiazzariadeMuspelheim", "root", "Leleco56789@");
            System.out.println("Conexão com banco de dados bem sucedida.");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return false;
        }
    }

    public int cadastrar(Bebidas bebidas) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO Bebidas(Nome,Preco,Descricao,Quantidade) VALUES(?,?,?,?)");
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

    public Bebidas consultar(String nome) {

        try {
            Bebidas bebidas = new Bebidas();
            st = conn.prepareStatement("SELECT * from Bebidas WHERE Nome = ?");
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
            st = conn.prepareStatement("DELETE FROM Bebidas WHERE Nome = ?");
            st.setString(1, nome);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public int atualizar(Bebidas bebidas) {
        int status;
        try {
            st = conn.prepareStatement("UPDATE Bebidas SET Nome = ?, Preco = ?, Descricao = ?, Quantidade = ? where Nome = ?");
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

    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {

        }
    }

    public List<Bebidas> buscarBebidas(String nome) {
        String sql = "SELECT * FROM Bebidas WHERE Nome LIKE ?";
        List<Bebidas> listaBebidas = new ArrayList<>();
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
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
