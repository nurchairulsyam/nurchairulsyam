
package jurnal;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Jurnal {

    public static void main(String[] args) {
        System.out.println("Jumlah Deret Fibonacci:");
        Scanner inputFibonacci = new Scanner(System.in);
        
        int fibonacciCount = inputFibonacci.nextInt();
        
        for (int ii=0; ii < fibonacciCount; ii++)
        {
            System.out.println("Bilangan Fibonacci: " + methodFibonacci(ii));
        }
    }
    
    public static int methodFibonacci(int fibonacciInput)
    {   
        int x;
        int n = fibonacciInput;
        if(n <=0 || n<=1)
        {
           return n;
        }
       
        else
        {
            return methodFibonacci(n-2) + methodFibonacci(n-1) ;
        }    
    }
}