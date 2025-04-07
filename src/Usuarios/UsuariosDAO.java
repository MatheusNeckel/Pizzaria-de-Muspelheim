package Usuarios;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuariosDAO {

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

    public int cadastrar(Usuarios usuarios) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO Usuarios(Nome,Email,Senha,Tipo_de_Usuario) VALUES(?,?,?,?)");
            st.setString(1, usuarios.getNome());
            st.setString(2, usuarios.getEmail());
            st.setString(3, usuarios.getSenha());
            st.setString(4, usuarios.getTipoDeUsuario());
            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar usuário: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    public Usuarios consultar(String nome) {

        try {
            Usuarios usuarios = new Usuarios();
            st = conn.prepareStatement("SELECT * from Usuarios WHERE Nome = ?");
            st.setString(1, nome);
            rs = st.executeQuery();
            if (rs.next()) {
                usuarios.setNome(rs.getString("Nome"));
                usuarios.setEmail(rs.getString("Email"));
                usuarios.setSenha(rs.getString("Senha"));
                usuarios.setTipoDeUsuario(rs.getString("Tipo de Usuario"));
                return usuarios;
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
            st = conn.prepareStatement("DELETE FROM Usuarios WHERE Nome = ?");
            st.setString(1, nome);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public int atualizar(Usuarios usuarios) {
        int status;
        try {
            st = conn.prepareStatement("UPDATE Usuarios SET Nome = ?, Email = ?, Senha = ?, Tipo_de_Usuario = ? where Nome = ?");
            st.setString(1, usuarios.getNome());
            st.setString(2, usuarios.getEmail());
            st.setString(3, usuarios.getSenha());
            st.setString(4, usuarios.getTipoDeUsuario());
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

    public List<Usuarios> buscarUsuarios(String nome) {
        String sql = "SELECT * FROM Usuarios WHERE Nome LIKE ?";
        List<Usuarios> listaUsuarios = new ArrayList<>();

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Usuarios usuarios = new Usuarios();

                usuarios.setNome(rs.getString("Nome"));
                usuarios.setEmail(rs.getString("Email"));
                usuarios.setSenha(rs.getString("Senha"));
                usuarios.setTipoDeUsuario(rs.getString("Tipo de Usuario"));

                listaUsuarios.add(usuarios);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaUsuarios;
    }
}
