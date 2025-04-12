import java.util.Scanner;

class DatosUsuario {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //solicitar nombren
        System.out.print("ingrese su nombre:  " );
        String nombre = scanner.nextLine();
        //solicitar correo electronico
        System.out.print("ingrese su correo electronico: ");
        String correo = scanner.nextLine();
        //solicitar edad
        System.out.print("ingrese su edad: ");
        int edad = scanner.nextInt();
         //mostrar resultados 
         System.out.println("Nombre: " + nombre);
         System.out.println("Edad: " + edad);
         System.out.println("Coreo electronico: " + correo);
        
     
    }
}
