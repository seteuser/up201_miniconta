package junit;

import mnc.Conta;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestConta {

    @Test
    public void testContaSimples() {

        Conta conta2 = new Conta(1000);
        assertEquals(1000, conta2.getNumero());
        assertEquals(0.0, conta2.getSaldo(), 0.1);

    }

    public void testContaDebitaBasico() {

        Conta conta = new Conta(100);

        conta.creditar(100);
        assertEquals(100.0, conta.getSaldo(), 0.1);

        conta.creditar(200);
        assertEquals(300.0, conta.getSaldo(), 0.1);

        conta.debitar(100);
        assertEquals(200.0, conta.getSaldo(), 0.1);

        conta.creditar(200);
        assertEquals(400.0, conta.getSaldo(), 0.1);

        conta.debitar(400);
        assertEquals(0.0, conta.getSaldo(), 0.1);

    }

    public void testContaDebitaComTaxa() {
        Conta conta = new Conta(100);

        conta.creditar(100);
        assertEquals(100.0, conta.getSaldo(), 0.1);

        conta.debitar(200);
        assertEquals(-110.0, conta.getSaldo(), 0.1);

        conta.creditar(110);
        assertEquals(0.0, conta.getSaldo(), 0.1);

        conta.creditar(100);
        assertEquals(100.0, conta.getSaldo(), 0.1);

        conta.debitar(100);
        assertEquals(0.0, conta.getSaldo(), 0.1);

        conta.debitar(100);
        assertEquals(-110.0, conta.getSaldo(), 0.1);

        conta.debitar(100);
        assertEquals(-220.0, conta.getSaldo(), 0.1);
    }
}