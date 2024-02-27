/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple;

/**
 *
 * @author Alicia
 */
public class Simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Llamada al método saludar
        saludar("Hola, soy un mini programa en Java!");

        // Llamada al método sumar y mostrar el resultado
        int resultado = sumar(3, 4);
        System.out.println("La suma es: " + resultado);
    }

    // Método que imprime un saludo
    public static void saludar(String mensaje) {
        System.out.println(mensaje);
    }

    // Método que suma dos números y devuelve el resultado
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }
  
    
}
