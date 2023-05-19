/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

/**
 *
 * @author Usuario
 */
public class SeisVariables {
    public static final int numero=28;
    public static void main (String[] args){
        
        String palabra="Thaiel";
        char caracter='K';
        float real=1.78f;
        double real2=(double)real;
        boolean logico=false;
        imprimirVariables(real);
    }
    public static void imprimirVariables(float r){
        System.out.println(r);
    }
}
