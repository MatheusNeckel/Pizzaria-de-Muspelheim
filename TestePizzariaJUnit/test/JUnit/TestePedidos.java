package JUnit;

import Pedidos.Pedidos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 55549
 */
public class TestePedidos {

    public TestePedidos() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    void testarAtribuicaoeRecuperacaodeValores() throws ParseException {
        Pedidos pedido = new Pedidos();
        String dataRecebida = "25/09/2025"; // String no formato dd/MM/yyyy
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Date data = formato.parse(dataRecebida);

        java.sql.Date dataSql = new java.sql.Date(data.getTime());

        pedido.setId(1);
        pedido.setCaminhoImagem("imagens/pedido1.png");
        pedido.setDescricao("Pedido de teste com pizza calabresa");
        pedido.setValorTotal("112.00");
        pedido.setTipoDePagamento("Cartão");
        pedido.setStatus("Em processamento");
        pedido.setData(dataSql);

        assertEquals(1, pedido.getId());
        assertEquals("imagens/pedido1.png", pedido.getCaminhoImagem());
        assertEquals("Pedido de teste com pizza calabresa", pedido.getDescricao());
        assertEquals("112.00", pedido.getValorTotal());
        assertEquals("Cartão", pedido.getTipoDePagamento());
        assertEquals("Em processamento", pedido.getStatus());
        assertEquals(data, pedido.getData());
    }
}
