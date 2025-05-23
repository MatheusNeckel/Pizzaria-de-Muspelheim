package Clientes;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ClientesDAO {
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

    public int cadastrar(Clientes clientes) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO Clientes(Nome,Sobrenome,"
            + "Data_Nascimento,Genero,Telefone,CPF,Endereco,Ponto_Referencia,Email,Senha)VALUES(?,?,?,?,?,?,?,?,?,?)");
            st.setString(1, clientes.getNome());
            st.setString(2, clientes.getSobrenome());
            st.setDate(3, new Date(clientes.getDataDeNascimento().getTime()));
            st.setString(4, clientes.getGenero());
            st.setString(5, clientes.getTelefone());
            st.setString(6, clientes.getCpf());
            st.setString(7, clientes.getEndereco());
            st.setString(8, clientes.getPontoReferencia());
            st.setString(9, clientes.getEmail());
            st.setString(10, clientes.getSenha());
            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar cliente: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    public Clientes consultar(String nome) {

        try {
            Clientes clientes = new Clientes();
            st = conn.prepareStatement("SELECT * from Clientes WHERE Nome = ?");
            st.setString(1, nome);
            rs = st.executeQuery();
            if (rs.next()) {
                clientes.setNome(rs.getString("Nome"));
                clientes.setSobrenome(rs.getString("Sobrenome"));
                clientes.setDataDeNascimento(rs.getDate("Data_Nascimento"));
                clientes.setGenero(rs.getString("Genero"));
                clientes.setTelefone(rs.getString("Telefone"));
                clientes.setCpf(rs.getString("CPF"));
                clientes.setEndereco(rs.getString("Endereco"));
                clientes.setPontoReferencia(rs.getString("Ponto_Referencia"));
                clientes.setEmail(rs.getString("Email"));
                clientes.setSenha(rs.getString("Senha"));
                return clientes;
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
            st = conn.prepareStatement("DELETE FROM Clientes WHERE Nome = ?");
            st.setString(1, nome);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public int atualizar(Clientes clientes) {
        int status;
        try {
            st = conn.prepareStatement("UPDATE Clientes SET Nome = ?, Sobrenome = ?, Data_Nascimento = ?, Genero = ?,"
            + "Telefone = ?, CPF = ?, Endereco = ?, Ponto_Referencia = ?, Email = ?, Senha = ? where Nome = ?");
            st.setString(1, clientes.getNome());
            st.setString(2, clientes.getSobrenome());
            st.setDate(3, new Date(clientes.getDataDeNascimento().getTime()));
            st.setString(4, clientes.getGenero());
            st.setString(5, clientes.getTelefone());
            st.setString(6, clientes.getCpf());
            st.setString(7, clientes.getEndereco());
            st.setString(8, clientes.getPontoReferencia());
            st.setString(9, clientes.getEmail());
            st.setString(10, clientes.getSenha());
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

    public List<Clientes> buscarClientes(String nome) {
        String sql = "SELECT * FROM Clientes WHERE Nome LIKE ?";
        List<Clientes> listaClientes = new ArrayList<>();
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Clientes clientes = new Clientes();

                clientes.setNome(rs.getString("Nome"));
                clientes.setSobrenome(rs.getString("Sobrenome"));
                clientes.setDataDeNascimento(rs.getDate("Data_Nascimento"));
                clientes.setGenero(rs.getString("Genero"));
                clientes.setTelefone(rs.getString("Telefone"));
                clientes.setCpf(rs.getString("CPF"));
                clientes.setEndereco(rs.getString("Endereco"));
                clientes.setPontoReferencia(rs.getString("Ponto_Referencia"));
                clientes.setEmail(rs.getString("Email"));
                clientes.setSenha(rs.getString("Senha"));

                listaClientes.add(clientes);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaClientes;
    }
}
