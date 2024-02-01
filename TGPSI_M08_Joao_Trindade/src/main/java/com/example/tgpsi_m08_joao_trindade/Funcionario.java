package com.example.tgpsi_m08_joao_trindade;

public class Funcionario extends Pessoa{
    private String Posicao;

    public Funcionario(int Id,String nome,String Edereco,String Posicao){
        super(Id,nome,Edereco);
        this.Posicao = Posicao;
    }
    public String getPosicao() {
        return Posicao;
    }

    public void setPosicao(String Posicao) {
        this.Posicao = Posicao;
    }
}
