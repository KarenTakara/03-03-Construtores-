package exercicio03;

import java.util.Random;

public class BilheteUnico {
    int numero;
    String usuario;
    double saldo;
    String tipoTarifa;
    final static double tarifa = 5.50;
    //Random r = new Random();      não deve estár aqui por que não é um atributo do objeto

    public BilheteUnico(String usuario, String tipoTarifa) {
        Random r = new Random();
        this.numero = r.nextInt(1000,9999);
        this.usuario = usuario;
        this.tipoTarifa = tipoTarifa;
        this.saldo = 0;
    }

    public void passarNaCatraca() {
        double valor = tarifa;
        if(tipoTarifa.equalsIgnoreCase("professor") || tipoTarifa.equalsIgnoreCase("estudante")){
            valor = tarifa / 2;
        }

        if (saldo < valor){
            System.out.println("Saldo insuficiente");
            return;   //posso utilizar o return com void pq nao estou retornando nada
        }

        saldo -= valor;
    }

}
