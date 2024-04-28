
import java.util.Scanner;
public class App {

    /*Ather Daniel Morales Solano 1M1-S
    2024-1384 U
     */
    public static int num1;
    public static int num2;
    public static int num3;
    public static void main(String[] args) throws Exception {
        Scanner leer= new Scanner(System.in);

        //Ingreso de los tres digitos
        do {
            try {
                System.out.println("Ingrese tres numeros enteros diferentes");
                num1=leer.nextInt();
                num2=leer.nextInt();
                num3=leer.nextInt();
            } catch (Exception e) {
            System.out.println(e);
            System.out.println("Ingrese los valores correctos");
            leer.nextLine();
            }

            //Identificador de numeros menores 
            int sumchi= Math.min(num1, Math.min(num2,num3));
            int sumchi2= Math.max(Math.min(num1,num2), Math.min(num2,num3));

            //Identificador de numeros mayores
            int restag= Math.max(num1, Math.max(num2,num3));
            int restag2= Math.min(Math.max(num1,num2), Math.max(num2, num3));

            //Suma de los dos mas pequeños 
            int sumapeque= sumchi+sumchi2;

            //Resta de los dos mas grandes 
            int resta= restag-restag2;

            System.out.println("La suma de los dos más pequeños es: "+sumapeque);

            System.out.println("La resta de los dos más grandes es: "+resta);
        } while (num1==num2 || num1==num3 || num2==num3);
    }
}
