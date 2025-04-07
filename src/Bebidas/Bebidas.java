package Bebidas;

public class Bebidas {

    String nome;
    String tipo;
    String tamanho;
    Double preco;
    String descricao;
    Double dose;

    public Bebidas() {
    }

    public Bebidas(String nome, String tipo, String tamanho, Double preco, String descricao, Double dose) {
        this.nome = nome;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.preco = preco;
        this.descricao = descricao;
        this.dose = dose;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getDose() {
        return dose;
    }

    public void setDose(Double dose) {
        this.dose = dose;
    }
}
