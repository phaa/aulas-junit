/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifrn.teste;

/**
 *
 * @author pedro
 */
public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        return a / b;
    }

    public boolean isPrimo(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                sum++;
            }
        }
        return sum == 2;
    }
    
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println(c.isPrimo(7));
    }
}
