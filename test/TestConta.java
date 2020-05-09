package test;

import java.util.ArrayList;
import mnc.Conta;

public class TestConta {

    public static void executa() {

        Conta contaoto1 = new Conta(101);

        Conta contaana1 = new Conta(201);
        Conta contaana2 = new Conta(202);
        Conta contaana3 = new Conta(203);

        Conta contacid1 = new Conta(301);
        Conta contacid2 = new Conta(302);

        contaoto1.creditar(1500);
        contaoto1.debitar(500);

        contaana1.creditar(2000);
        contaana2.creditar(4000);
        contaana2.debitar(5000);
        contaana3.debitar(1000);

        contacid1.creditar(0); // zerada contacid2.creditar(1000); //zerada
        contacid2.debitar(1000); // zerada

        ArrayList<Conta> lista = new ArrayList<Conta>();
        lista.add(contaoto1);
        lista.add(contaana1);
        lista.add(contaana2);
        lista.add(contaana3);
        lista.add(contacid1);
        lista.add(contacid2);

        // Apresentacao - Mostrando clientes cadastrados
        System.out.println("\n2) Contas *****");
        for (Conta ctemp : lista) {
            System.out.println("[" + ctemp.getNumero() + "] R$" + ctemp.getSaldo());
        }

    }

}
