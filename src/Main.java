import model.*;

public class Main {

    public static void main(String[] args) {
        Cliente tardelli = new Cliente();
        tardelli.setNome("Tardelli");


        Conta cc = new ContaCorrente(tardelli);
        cc.depositar(500);

        Conta cp = new ContaPoupanca(tardelli);
        cc.transferir(400, cp);


        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}