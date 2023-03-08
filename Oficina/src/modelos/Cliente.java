package modelos;

import abstratos.Automovel;
import abstratos.Pessoa;

public class Cliente extends Pessoa {

    private Automovel automovel;

    public Cliente(String nome, int idade){
        this.setNome(nome);
        this.setIdade(idade);
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    @Override
    public void apreentacao() {
        System.out.println("\n"+this.getNome()+": Olá! Sou "+this.getNome()
                         + ", tenho esse(a) "+this.getAutomovel().tipoVeiculo()
                         +" e estou com um problema.");
    }

}
