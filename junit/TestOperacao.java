package junit;

import mnc.Conta;
import mnc.Operacao;
import static org.junit.Assert.assertEquals;

public class TestOperacao {

    public void testTransferenciaSimples() {

        Conta origem = new Conta(100);
        Conta destino = new Conta(200);

        origem.creditar(100);
        assertEquals(100.0, origem.getSaldo(), 0.1);
        assertEquals(0.0, destino.getSaldo(), 0.1);

        Operacao.transferir(50, origem, destino);
        assertEquals(50.0, origem.getSaldo(), 0.1);
        assertEquals(50.0, destino.getSaldo(), 0.1);

        Operacao.transferir(150, destino, origem);
        assertEquals(200.0, origem.getSaldo(), 0.1);
        assertEquals(-110.0, destino.getSaldo(), 0.1);
    }

}