/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;
        
/**
 *
 * @author jeand
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, i,a, p, q , m, s=0;
        q = 0;
        p = 0;
        i = 0;
        a = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite um Número: (0 interrompe a repetição)"));
            q++;
            s= s += n;
            m= s/q;
          
            if (n%2==0){
                p++;
            } else {
                i++;
            } if (n>100) {
                a++;
            }
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final: <hr>"
                + "<br> Quantidade de números digitados: " + q + "<hr>"
                + "Quantidade de números PARES: " + p + "<hr>"
                + "Quantidade de números IMPARES: " + i + "<hr>" 
                + "Quantidade de números acima de 100: " + a + "<hr>"
                + "Média entre os números: " + m + "<hr> </html>");
         
        // TODO code application logic here
    }
    
}

/* Obs:  essas repetições funcionam de acordo com as repetições vistas em algoritmos:
        Enquanto  /// While no começo da expressão
        Repita   ///  Do no começo e While no final
        Para    ///   For é usado no lugar de While no começo
*/ 
