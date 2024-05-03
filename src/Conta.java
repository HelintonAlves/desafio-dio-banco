public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente(){
        return cliente;
    }

    @Override
    public void sacar(double valor) {
        if (saldo > valor){
            saldo -= valor;
            System.out.println("Seu saldo atual: " + saldo);
        }else{
            System.out.println("Valor insuficiente para saque!");
        }

    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferencia(double valor, Conta contaDestino) {
        if (saldo > valor){
            sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Seu deposito no valor de " + valor + " foi realizado com sucesso!");

        }
    }

    protected void imprimirInfoComuns(){
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Títular: ", this.cliente.getNomeCliente()));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
