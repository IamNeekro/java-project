import java.util.Scanner;  // Import the Scanner class


public class main {

public static void main(String[] args){

// final int cons = 1; //constante 


// int[][] matriz = new int[4][4]; // matriz
// for(var valor = 0; valor < 4; valor++ ){
//         // System.out.printf("\n linha da matriz numero %d", valor);
//     for(var valor1 = 0; valor1 < 4; valor1++){
//     // System.out.printf("\n coluna da matriz numero %d", valor1);
//     matriz[valor][valor1] = valor1;
//     }
// } //laço de repetição

// for(int[] n:matriz){ //foreach
//     // System.out.printf("Linha: %d",n);
//     for(int f:n){
//         System.out.printf("\nLinha: " + n + "\n Coluna: " + f);
//     }
// }
Scanner scan = new Scanner(System.in);
System.out.println("digite o primeiro valor do cálculo");
var valor1 = scan.nextInt();
System.out.println("digite o sinal");
var valor2 = scan.nextLine();
System.out.println("digite o segundo valor do cálculo");
var valor3 = scan.nextInt();
if(valor2.equals("/")){
var total = (valor1 / valor3);
System.out.printf("o valor do seu cálculo é de %d", total);
}
if(valor2.equals("*")){
   var total = (valor1 * valor3);
System.out.printf("o valor do seu cálculo é de %d", total); 
}


}
}