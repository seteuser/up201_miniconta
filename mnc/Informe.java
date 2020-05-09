package mnc;

import java.util.ArrayList;

public class Informe {

    public double montante(Cliente c) {

        ArrayList<Conta> carteira = c.getCarteira();

        double total = 0;

        for (Conta ctemp : carteira) {

            total += ctemp.getSaldo();

        }

        return total;

    }

    public String categoria(Cliente c) {

        double total = this.montante(c);
        String categoria = "PADRAO";

        if (total < 0)
            categoria = "DEVEDOR";
        if (total > 100000)
            categoria = "INVESTIDOR";

        return categoria;

    }

}
