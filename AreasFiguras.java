
import java.util.Scanner;
class AreasFiguras {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print ("A que figura quiere sacar el area ");
     System.out.print ("1 triangulo ");
     System.out.print(" 2 rectangulo ");
     System.out.print("3 circulo ");
     String opcion = sc.nextLine();
     double resultado = 0 ;
     
     switch(opcion){
       
       case "1":
        System.out.print ("ingrese  la base  de su triangulo  ");
         double base  = sc.nextDouble();
         System.out.print ("ingrese la altura   de su triangulo  ");
         double altura  = sc.nextDouble();
         resultado = base * altura/2;
         System.out.println  ("El area de tu triangulo es:  " + resultado );
         break;
         
        
        case "2":
        System.out.print ("ingrese el ancho  de su rectangulo  ");
         double ancho  = sc.nextDouble();
         System.out.print ("ingrese el largo de su rectangulo  ");
          double largo  = sc.nextDouble();
          resultado = ancho * largo;
            System.out.println ("El area de tu rectangulo es:  " + resultado );
          break;
          
        
        
        case "3":
      System.out.print ("ingrese el radio del circulo");
      double radio = sc.nextDouble();
      resultado = radio * radio * 3.1416;
       System.out.println  ("El area de tu circulo es:  " + resultado );
      break;
     
      
    }
}
}
