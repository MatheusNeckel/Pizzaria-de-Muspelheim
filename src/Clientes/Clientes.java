package Clientes;

import java.sql.Date;

public class Clientes {
    
    private String nome, sobrenome, genero, telefone, cpf, endereco,
            pontoReferencia, email, senha;
    private Date dataDeNascimento;

    public Clientes() {
    }

    public Clientes(String nome, String sobrenome, String genero, String telefone,
    String cpf, String endereco, String pontoReferencia, String email, String senha, Date dataDeNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.genero = genero;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
        this.pontoReferencia = pontoReferencia;
        this.email = email;
        this.senha = senha;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
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
}
