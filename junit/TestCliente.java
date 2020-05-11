package junit;

import mnc.Cliente;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCliente {

    @Test
    public void testClienteSimples() {

        Cliente cliente = new Cliente();

        cliente.nome = "Dolores";

        assertEquals("Dolores", cliente.nome);

        cliente.nome = "Maeve";
        assertEquals("Maeve", cliente.nome);

    }

}