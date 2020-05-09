package test;

import mnc.Cliente;
import mnc.Conta;
import mnc.Informe;
import java.util.ArrayList;

public class TestInforme {

    public static void executa() {

        Cliente oto = new Cliente();
        oto.nome = "Oto Silva";

        Cliente ana = new Cliente();
        ana.nome = "Ana Bitar";

        Cliente cid = new Cliente();
        cid.nome = "Cid Lindo";

        Conta contaoto1 = new Conta(101);

        Conta contaana1 = new Conta(201);
        Conta contaana2 = new Conta(202);
        Conta contaana3 = new Conta(203);

        Conta contacid1 = new Conta(301);
        Conta contacid2 = new Conta(302);

        contaoto1.creditar(100); // somado 100

        contaana1.creditar(100000);
        contaana2.creditar(100000);
        contaana3.creditar(100000); // somado 3000.000

        contacid1.debitar(1000);
        contacid2.debitar(1000); // somado 2.000 mil + mais as multas 20

        oto.adicionaConta(contaoto1);
        ana.adicionaConta(contaana1);
        ana.adicionaConta(contaana2);
        ana.adicionaConta(contaana3);
        cid.adicionaConta(contacid1);
        cid.adicionaConta(contacid2);

        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        lista.add(oto);
        lista.add(ana);
        lista.add(cid);

        Informe informe = new Informe();

        // Apresentacao - Mostrando contas trasferencias
        System.out.println("\n4) Informe Financeiro Clientes *****");
        for (Cliente clitemp : lista) {
            System.out.println(
                    clitemp.nome + " [" + informe.categoria(clitemp) + "] Geral: R$ " + informe.montante(clitemp));
        }

    }

}
