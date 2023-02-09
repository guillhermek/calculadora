package guilherme;
import javax.swing.JOptionPane;

public class principal {
    public static void main( String[]args){
        
        Guilherme objeto = new Guilherme();
        

         String opcao = JOptionPane.showInputDialog("  - CALCULADORA - \n \n 1- SOMAR \n 2- SUBTRAIR  \n 3- MULTIPLICAR \n 4- DIVIDIR \n ");
         int opcao2 = Integer.parseInt(opcao);
         
         if(opcao2 == 1){      
             String firstNumber = JOptionPane.showInputDialog(" DIGITE O PRIMEIRO NUMERO  ");
             String secondNumber = JOptionPane.showInputDialog(" DIGITE O SEGUNDO  ");
             int number1 = Integer.parseInt(firstNumber);
             int number2 = Integer.parseInt(secondNumber);
             int resultado = objeto.somar(number1, number2);
            JOptionPane.showMessageDialog(null," O RESULTADO  DA SOMAR È "+resultado);
         }
          if(opcao2 == 2){      
             String firstNumber = JOptionPane.showInputDialog(" DIGITE O PRIMEIRO NUMERO  ");
             String secondNumber = JOptionPane.showInputDialog(" DIGITE O SEGUNDO  ");
             int number1 = Integer.parseInt(firstNumber);
             int number2 = Integer.parseInt(secondNumber);
             int resultado = objeto.subtrair(number1, number2);
            JOptionPane.showMessageDialog(null," O RESULTADO  DA SUBTRAÇÂO È "+resultado);         }
           if(opcao2 == 3){      
             String firstNumber = JOptionPane.showInputDialog(" DIGITE O PRIMEIRO NUMERO  ");
             String secondNumber = JOptionPane.showInputDialog(" DIGITE O SEGUNDO  ");
             int number1 = Integer.parseInt(firstNumber);
             int number2 = Integer.parseInt(secondNumber);
             int resultado = objeto.multiplicar(number1, number2);
             JOptionPane.showMessageDialog(null," O RESULTADO  DA MULTPLICÂO È "+resultado);         }
            if(opcao2 == 4){      
             String firstNumber = JOptionPane.showInputDialog(" DIGITE O PRIMEIRO NUMERO  ");
             String secondNumber = JOptionPane.showInputDialog(" DIGITE O SEGUNDO  ");
             int number1 = Integer.parseInt(firstNumber);
             int number2 = Integer.parseInt(secondNumber);
             int resultado = objeto.dividir(number1, number2);
               JOptionPane.showMessageDialog(null," O RESULTADO  DA DIVISÂO È "+resultado);
         }   
            
            
            
          int res = objeto.dividir(10,2); 
          System.out.println(" r = "+res);
    }
}

