import org.w3c.dom.ls.LSOutput;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private float saldo; // usar %.2f e 0.00f para declarar valores

    public ContaTerminal(int numero, String agencia, String nomeCliente, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return String.format("Olá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque",
                this.nomeCliente, this.agencia, this.numero, this.saldo);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
