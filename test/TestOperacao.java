package test;

import mnc.Conta;
import  mnc.Operacao;
import java.util.ArrayList;

public class TestOperacao {

    public static void executa() {

        Conta minhaconta1 = new Conta(111);
        Conta minhaconta2 = new Conta(222);
        Conta minhaconta3 = new Conta(333);
        Conta minhaconta4 = new Conta(444);

        minhaconta1.creditar(1000);
        minhaconta2.creditar(0);

        minhaconta3.creditar(1000);
        minhaconta4.creditar(0);

        Operacao.transferir(500, minhaconta1, minhaconta2);
        Operacao.transferir(2000, minhaconta3, minhaconta4);

        ArrayList<Conta> lista = new ArrayList<Conta>();
        lista.add(minhaconta1);
        lista.add(minhaconta2);
        lista.add(minhaconta3);
        lista.add(minhaconta4);

        // Apresentacao - Mostrando contas trasferencias
        System.out.println("\n3) Contas com transferencias *****");
        for (Conta ctemp : lista) {
            System.out.println("[" + ctemp.getNumero() + "] R$" + ctemp.getSaldo());
        }

    }

}