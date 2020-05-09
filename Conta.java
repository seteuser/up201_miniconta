class Conta {

    private int numero;
    private double saldo;

    Conta(int num) {
        this.numero = num;
    }

    int getNumero() {
        return this.numero;
    }

    double getSaldo() {
        return this.saldo;
    }

    void creditar(double valor) {
        this.saldo += valor;
    }

    void debitar(double valor) {
        this.saldo -= valor;
        if (this.saldo < 0)
            this.saldo -= 10;
    }

}
