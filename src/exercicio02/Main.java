package exercicio02;

import javax.sound.midi.Soundbank;
import javax.sound.midi.spi.SoundbankReader;

public class Main {
    public static void main(String[] args) {

        SenhaAtendimento s1 = new SenhaAtendimento("Selmini");
        SenhaAtendimento s2 = new SenhaAtendimento("Evelyn");
        SenhaAtendimento s3 = new SenhaAtendimento("Luiz");

        System.out.println(s1.getDados());
        System.out.println(s2.getDados());
        System.out.println(s3.getDados());

        System.out.println("Próxima Senha: " + SenhaAtendimento.controle);
    }
}
