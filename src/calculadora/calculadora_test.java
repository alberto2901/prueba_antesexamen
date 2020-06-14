/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Alberto
 */
public class calculadora_test {
    
    public static int suma(int a, int b){
        return a+b;
    }
    
    public static int rest(int a, int b){
        return a-b;
    }
    
    public static void main(String args[]){
        int a=3;
        int b=2;
        
        int res=suma(a,b);
        System.out.println("3 + 2 = " + res);
    }
    
}
