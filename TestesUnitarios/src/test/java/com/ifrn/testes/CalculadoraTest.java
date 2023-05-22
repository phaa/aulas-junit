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
    
    //Positivos
    @Test
    public void testSomarPositivos() {
        System.out.println("Soma de Positivos");
        int a = 10;
        int b = 5;
        int expected = 15;
        Calculadora c = new Calculadora();
        assertEquals(expected, c.somar(a, b));
    }
    
    @Test
    public void testSomarNegativos() {
        System.out.println("Soma de negativos");
        int a = -10;
        int b = -5;
        int expected = -15;
        Calculadora c = new Calculadora();
        assertEquals(expected, c.somar(a, b));
    }
    
    @Test
    public void testSomarPositivoNegativo() {
        System.out.println("Soma de positivos e negativos");
        int a = -10;
        int b = 5;
        int expected = -5;
        Calculadora c = new Calculadora();
        assertEquals(expected, c.somar(a, b));
    }
    
    // Subtração
    @Test
    public void testSubtrairPositivos() {
        System.out.println("Subtração de Positivos");
        int a = 10;
        int b = 5;
        int expected = 5;
        Calculadora c = new Calculadora();
        assertEquals(expected, c.subtrair(a, b));
    }
    
    @Test
    public void testSubtrairNegativos() {
        System.out.println("Subtração de negativos");
        int a = -10;
        int b = -5;
        int expected = -5;
        Calculadora c = new Calculadora();
        assertEquals(expected, c.subtrair(a, b));
    }
    
    @Test
    public void testSubtrairPositivoNegativo() {
        System.out.println("Subtração de positivos e negativos");
        int a = -10;
        int b = 5;
        int expected = -15;
        Calculadora c = new Calculadora();
        assertEquals(expected, c.subtrair(a, b));
    }
}
