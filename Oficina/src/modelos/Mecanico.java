package modelos;

import abstratos.Automovel;
import abstratos.Pessoa;
import enuneradores.Especialidade;
import interfaces.Atendimento;

public class Mecanico extends Pessoa implements Atendimento{

    private Especialidade especialidade;

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void apreentacao() {
        System.out.println(this.getNome()+": Olá! Eu me chamo "+this.getNome()
                          +" e sou um mecânico com especialidade em "+this.getEspecialidade().getDescricao());
    }

    @Override
    public String atendimento(Automovel automovel) {

        if(automovel.getClass() == Moto.class
            && this.getEspecialidade().equals(Especialidade.MOTO)){

            return this.getNome()+": O que está acontecendo com sua motocicleta ?";

        }else  if(automovel.getClass() == Carro.class
                && this.getEspecialidade().equals(Especialidade.CARRO)){

            return this.getNome()+": O que está acontecendo com seu carro ?";

        }

        return this.getNome()+": Desculpe, não sou mecânico especilista deste tipo de veiculo, só um minuto, chamarei alguém que irá lhe ajudar";
    }
}
