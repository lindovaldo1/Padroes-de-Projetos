package modelos;

import abstratos.Automovel;

public class Moto extends Automovel {

    public Moto(String modelo, String marca, String cor){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setCor(cor);
    }

    @Override
    public String toString() {
        return "Moto{}";
    }

    @Override
    public String tipoVeiculo() {
        return "moto";
    }
}
