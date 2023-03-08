package modelos;

import abstratos.Automovel;

public class Carro extends Automovel {

    public Carro(String marca, String modelo){
        this.setMarca(marca);
        this.setModelo(modelo);
    }

    public Carro(String marca, String modelo, String cor){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setCor(cor);
    }

    @Override
    public String toString() {
        return "Carro{}";
    }

    @Override
    public String tipoVeiculo() {
        return "Carro";
    }
}
