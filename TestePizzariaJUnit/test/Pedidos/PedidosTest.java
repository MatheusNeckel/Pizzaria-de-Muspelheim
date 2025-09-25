/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Pedidos;

import java.sql.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 55549
 */
public class PedidosTest {
    
    public PedidosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Pedidos.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Pedidos instance = new Pedidos();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Pedidos.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Pedidos instance = new Pedidos();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCaminhoImagem method, of class Pedidos.
     */
    @Test
    public void testGetCaminhoImagem() {
        System.out.println("getCaminhoImagem");
        Pedidos instance = new Pedidos();
        String expResult = "";
        String result = instance.getCaminhoImagem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCaminhoImagem method, of class Pedidos.
     */
    @Test
    public void testSetCaminhoImagem() {
        System.out.println("setCaminhoImagem");
        String caminhoImagem = "";
        Pedidos instance = new Pedidos();
        instance.setCaminhoImagem(caminhoImagem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescricao method, of class Pedidos.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Pedidos instance = new Pedidos();
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescricao method, of class Pedidos.
     */
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String descricao = "";
        Pedidos instance = new Pedidos();
        instance.setDescricao(descricao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorTotal method, of class Pedidos.
     */
    @Test
    public void testGetValorTotal() {
        System.out.println("getValorTotal");
        Pedidos instance = new Pedidos();
        String expResult = "";
        String result = instance.getValorTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorTotal method, of class Pedidos.
     */
    @Test
    public void testSetValorTotal() {
        System.out.println("setValorTotal");
        String valorTotal = "";
        Pedidos instance = new Pedidos();
        instance.setValorTotal(valorTotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoDePagamento method, of class Pedidos.
     */
    @Test
    public void testGetTipoDePagamento() {
        System.out.println("getTipoDePagamento");
        Pedidos instance = new Pedidos();
        String expResult = "";
        String result = instance.getTipoDePagamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoDePagamento method, of class Pedidos.
     */
    @Test
    public void testSetTipoDePagamento() {
        System.out.println("setTipoDePagamento");
        String tipoDePagamento = "";
        Pedidos instance = new Pedidos();
        instance.setTipoDePagamento(tipoDePagamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Pedidos.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Pedidos instance = new Pedidos();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Pedidos.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        Pedidos instance = new Pedidos();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class Pedidos.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Pedidos instance = new Pedidos();
        Date expResult = null;
        Date result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class Pedidos.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        Date data = null;
        Pedidos instance = new Pedidos();
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
