/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol1_3;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class Bol1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 3- Crea un algoritmo que cambie euros a dólares ( O cambio pídese por teclado ).
        //Codifica o programa, correspondente, para executar o programa  co nome boletin1_3
        System.out.print("EUROS =");
        Scanner euro= new Scanner(System.in);
        float euros = euro.nextFloat();  
        System.out.println("");         
        System.out.print("Valor dolares =");
        Scanner dolar= new Scanner(System.in);
        float dolares = dolar.nextFloat(); 
        
        
        float totalDolares = euros * dolares;
        System.out.println("Dolares= "+totalDolares);
    }
    
}
