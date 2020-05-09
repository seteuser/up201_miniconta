package mnc;

import java.util.ArrayList;

public class Cliente {

    public String nome;
    ArrayList<Conta> carteira = new ArrayList<Conta>();

    public void adicionaConta(final Conta c) {
        this.carteira.add(c);
    }

    public ArrayList<Conta> getCarteira() {
        return this.carteira;
    }

}