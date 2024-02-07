/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1P;

import javax.swing.JOptionPane;

/**
 * Raíz Cuadrada.
 * Pide un número por teclado y calcula su raíz cuadrada,el resultado de elevar
 * ésta a ^3 y la suma de todas las raíces cuadradas que hayas pedido.
 * @author ErikSerranoSantos
 * @version 07/02/2024
 */
public class RaizCuadrada {

    public static void main(String[] args) {
        String teclado;
        double num = 0.0;
        double operacion = 0.0;
        double raizCuadrada = 0.0;
        double total = 0;

        do {
            teclado = JOptionPane.showInputDialog("Introduce un número (0 para terminar)");
            num = Double.parseDouble(teclado);

            if (num != 0) {
                raizCuadrada = Math.sqrt(num);
                total += raizCuadrada;
                operacion = Math.pow(raizCuadrada, 3);
            }
        } while (num != 0);
    }
}
