package junit;

import mnc.Cliente;
import mnc.Conta;
import mnc.Informe;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestInforme {

    @Test
    public void testInformeSimples() {
        Cliente dolores = new Cliente();
        Conta corrente = new Conta(100);
        Conta poupanca = new Conta(200);
        Conta investimento = new Conta(300);
        
        dolores.adicionaConta(corrente);
        dolores.adicionaConta(poupanca);
        dolores.adicionaConta(investimento);
        
        Informe informe = new Informe();
        
        assertEquals(0.0, informe.montante(dolores), 0.1);
        assertEquals("PADRAO", informe.categoria(dolores));
        
        dolores.getCarteira().get(0).creditar(200000);
        dolores.getCarteira().get(1).creditar(300000);
        dolores.getCarteira().get(2).creditar(500000);
        assertEquals(1000000.0, informe.montante(dolores), 0.1);
        assertEquals("INVESTIDOR", informe.categoria(dolores));
        
        
        dolores.getCarteira().get(0).debitar(200000);
        dolores.getCarteira().get(1).debitar(300000);
        dolores.getCarteira().get(2).debitar(500000);
        
        dolores.getCarteira().get(0).debitar(2);
        dolores.getCarteira().get(1).debitar(3);
        dolores.getCarteira().get(2).debitar(5);
        assertEquals(-40.0, informe.montante(dolores), 0.1);
        assertEquals("DEVEDOR", informe.categoria(dolores));
    }

}