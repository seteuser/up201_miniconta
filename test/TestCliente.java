package test;

import mnc.Cliente;

public class TestCliente {

    public static void executa() {

        final Cliente oto = new Cliente();
        oto.nome = "Oto Silva";

        final Cliente ana = new Cliente();
        ana.nome = "Ana Bitar";

        final Cliente cid = new Cliente();
        cid.nome = "Cid Lindo";

        // Apresentacao - Mostrando clientes cadastrados
        System.out.println("\n1) Clientes *****");
        System.out.println(oto.nome);
        System.out.println(ana.nome);
        System.out.println(cid.nome);

    }

}