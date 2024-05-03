public interface IConta {

    void sacar(double valor);
    void depositar(double valor);
    void transferencia(double valor, Conta contaDestino);
    void imprimirExtrato();

}
