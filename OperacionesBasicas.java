import java.util.Scanner;

class OperacionesBasicas { 
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        double numer1;
        double numer2;
        
        System.out.print("ingresa el primer num: ");
        numer1 = scanner.nextDouble();   
        
         System.out.print("ingresa el segundo num: ");
         numer2 = scanner.nextDouble();
        
        System.out.println("La suma es :" + (numer1+numer2));
        System.out.println("La resta es :" + (numer1-numer2));
        System.out.println("La multiplicacion es :" + (numer1*numer2));
        System.out.println("La division  es :" + (numer1/numer2));
        System.out.println("El modulo   es :" + (numer1%numer2));
    }
}
