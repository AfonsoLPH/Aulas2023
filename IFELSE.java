package Aulas;
import java.util.*;
public class IFELSE {
    public static void main (String[]args){
        Scanner in = new Scanner( System.in);

        int idade;
        double valor = 100;
       
        System.out.println(" Digite sua idade: ");

           idade = in.nextInt();
        
        if(idade <= 14){
           valor = valor/2;
            System.out.println("Idade menor que 14, valor a pagar : " + valor);
        }
            else { 
                System.out.println(" Maior que 14, valor a pagar : " + valor);}

            
        
              





    }
    
}
