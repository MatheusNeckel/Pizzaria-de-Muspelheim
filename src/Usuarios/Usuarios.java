package Usuarios;

public class Usuarios {

    private String nome;
    private String email;
    private String senha;
    private String tipoDeUsuario;

    public Usuarios() {
    }

    public Usuarios(String nome, String email, String senha, String tipoDeUsuario) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(String tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }

}
