package com.example.tgpsi_m08_joao_trindade;

public class Cliente extends Pessoa {
    private int N_Telefone;

    public Cliente (int Id,String nome,String Edereco, int N_Telefone){
        super(Id,nome,Edereco);
        this.N_Telefone = N_Telefone;
    }
    public int getN_Telefone() {
        return N_Telefone;
    }

    public void setN_Telefone(int N_Telefone) {
        this.N_Telefone = N_Telefone;
    }

}
