public class Main {
    //Testes
    public static void main(String[] args) {
            Cliente cliente1 = new Cliente();
            cliente1.setNomeCliente("Helinton");

            Conta cc = new ContaCorrente(cliente1);
            Conta cp = new ContaPoupanca(cliente1);

            cc.depositar(1000);
            cc.imprimirExtrato();
            cc.transferencia(245, cp);
            cp.imprimirExtrato();


    }
}
