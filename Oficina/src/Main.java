import enuneradores.Especialidade;
import modelos.Carro;
import modelos.Cliente;
import modelos.Mecanico;
import modelos.Moto;

public class Main {
    public static void main(String[] args) {

        Mecanico mecanico1 = new Mecanico();
        mecanico1.setNome("Anderson Rubens");
        mecanico1.setCpf("109.876.543-21");
        mecanico1.setIdade(15);
        mecanico1.setEspecialidade(Especialidade.CARRO);

        Mecanico mecanico2 = new Mecanico();
        mecanico2.setNome("Bruno Silva");
        mecanico2.setCpf("109.876.543-21");
        mecanico2.setIdade(40);
        mecanico2.setEspecialidade(Especialidade.MOTO);


        Carro carro = new Carro("Mitsubishi", "pajero", "preto");

        Moto moto = new Moto("Honda", "Titan 150cc", "branca");


        Cliente cliente1 = new Cliente("João", 18);
        cliente1.setCpf("123.456.789-10");
        cliente1.setAutomovel(moto);

        Cliente cliente2 = new Cliente("Ana Vitoria", 25);
        cliente2.setCpf("123.456.789-10");
        cliente2.setAutomovel(carro);


        cliente1.apreentacao();
        mecanico2.apreentacao();
        System.out.println(mecanico2.atendimento(cliente1.getAutomovel()));;

        cliente2.apreentacao();
        mecanico2.apreentacao();
        System.out.println(mecanico2.atendimento(cliente2.getAutomovel()));;
        mecanico1.apreentacao();
        System.out.println(mecanico1.atendimento(cliente2.getAutomovel()));;

    }
}