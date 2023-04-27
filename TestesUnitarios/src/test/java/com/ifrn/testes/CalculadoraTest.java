/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ifrn.testes;

import com.ifrn.teste.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pedro
 */
public class CalculadoraTest {
    String message = "Testando calculadora";
    @Test
    public void testSomar() {
        System.out.println("Testando método somar()");
        int a = 10;
        int b = 5;
        int expected = 16;
        Calculadora c = new Calculadora();
        assertEquals(expected, c.somar(a, b));
    }
    
}
