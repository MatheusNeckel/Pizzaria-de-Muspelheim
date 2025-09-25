package Pedidos;

import java.sql.Date;

public class Pedidos {
    
    private int id;
    private String caminhoImagem;
    private String descricao;
    private String valorTotal;
    private String tipoDePagamento, status;
    private Date data;

    public Pedidos() {
    }

    public Pedidos(int id, String caminhoImagem, String descricao,
    String valorTotal, String tipoDePagamento, String status, Date data) {
        this.id = id;
        this.caminhoImagem = caminhoImagem;
        this.descricao = descricao;
        this.valorTotal = valorTotal;
        this.tipoDePagamento = tipoDePagamento;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getTipoDePagamento() {
        return tipoDePagamento;
    }

    public void setTipoDePagamento(String tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
