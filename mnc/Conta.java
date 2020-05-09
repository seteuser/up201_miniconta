package mnc;

public class Conta {

    private int numero;
    private double saldo;

    public Conta(int num) {
        this.numero = num;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void creditar(double valor) {
        this.saldo += valor;
    }

    public void debitar(double valor) {
        this.saldo -= valor;
        if (this.saldo < 0)
            this.saldo -= 10;
    }

}
