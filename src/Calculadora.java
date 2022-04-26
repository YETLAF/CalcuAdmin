import java.util.Scanner;

public class Calculadora {public static void main(String args[]){

    Scanner Tecla = new Scanner(System.in);

    int n1=0;
    int n2=0;
    int Operador=0;
    int Resultado=0;

    System.out.println("Ingresa el primer numero: ");
    n1 = Tecla.nextInt();

    System.out.println("Ingresa el segundo numero: ");
    n2 = Tecla.nextInt();

    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Multiplicacion");
    System.out.println("4. Division");

    System.out.println("Elige una opcion :) ");
    Operador = Tecla.nextInt();

    if(Operador == 1)
    {
        Resultado=n1+n2;
        System.out.println("El resultado de la suma es: "+Resultado);
    }
    else if(Operador == 2)
    {
        Resultado=n1-n2;
        System.out.println("El resultado de la resta es: "+Resultado);
    }
    else if(Operador == 3)
    {
        Resultado=n1*n2;
        System.out.println("El resultado de la multiplicaicon es: "+Resultado);
    }
    else if(Operador==4)
    {
        Resultado=n1/n2;
        System.out.println("El resultado de la multiplicacion es: "+Resultado);
    }
    else
    {
        System.out.println("La opcion ingresada no existe.");
    }
}
}
