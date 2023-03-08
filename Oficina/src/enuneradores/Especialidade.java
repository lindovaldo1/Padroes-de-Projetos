package enuneradores;

public enum Especialidade {
    MOTO("moto"),
    CARRO("carro");

    private String descricao;

    Especialidade(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
