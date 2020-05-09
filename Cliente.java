import java.util.ArrayList;

class Cliente {

    String nome;
    ArrayList<Conta> carteira = new ArrayList<Conta>();

    void adicionaConta(final Conta c) {
        this.carteira.add(c);
    }

    ArrayList<Conta> getCarteira() {
        return this.carteira;
    }

}