import java.util.Scanner;  // Import the Scanner class
import java.util.concurrent.TimeUnit;

public class main {

public static void main(String[] args){
while (true) {
Scanner scan = new Scanner(System.in);
System.out.println("digite o primeiro valor do cálculo: ");
var valor1 = scan.nextInt();
System.out.println("digite o sinal: ");
var valor2 = scan.next();
System.out.println("digite o segundo valor do cálculo: ");
var valor3 = scan.nextInt();
if(valor2.equals("/")){
var total = (valor1 / valor3);
System.out.printf("o valor do seu cálculo é de %d", total);
}
if(valor2.equals("*")){
   var total = (valor1 * valor3);
System.out.printf("o valor do seu cálculo é de %d", total); 
}
if(valor2.equals("+")){
   var total = (valor1 + valor3);
System.out.printf("o valor do seu cálculo é de %d", total); 
}
if(valor2.equals("-")){
   var total = (valor1 - valor3);
System.out.printf("o valor do seu cálculo é de %d", total); 
}
System.out.println("\ncálculo finalizado");

try{
Thread.sleep(200);
}catch(InterruptedException e){
    // Thread.currentThread().interrupt();
}
System.out.println("Continue? s/n");
var continuar = scan.next();
if(continuar.equals("s") || continuar.equals("S")){
    scan.close();
    continue;
}else{
    scan.close();
    break;
}
}
System.out.printf("programa finalizado!");
}
}
//bagunça do carai