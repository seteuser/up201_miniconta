class Operacao {

    static void transferir(final double v, final Conta o, final Conta d) {

        o.debitar(v);
        d.creditar(v);

    }

}