package com.example.tgpsi_m08_joao_trindade;

public class produto {
    private int ID;
    private String Nome;
    private String Tipo;

    private int qtd;
    private double preco;
    //Um construtor para o produto
    public produto(int ID, String Nome, String Tipo, int qtd, double preco) {
        this.ID = ID;
        this.Nome = Nome;
        this.Tipo = Tipo;

        this.qtd = qtd;
        this.preco = preco;
    }
    public produto(int ID, String Nome, int qtd, double preco) {
        this.ID = ID;
        this.Nome = Nome;
        this.qtd = qtd;
        this.preco = preco;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {this.Nome = nome;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }





    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
