package tarea1.mariangelbolañoszumbado;
    
    import java.util.Scanner;

    //Tarea 1 - Mariangel Bolaños Zumbado
    //Realizar un programa que suma, resta, divide ,multiplica y identifica numeros primos
public class Tarea1MariangelBolañosZumbado {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola Profe!");
        
        //Declaro variables
        
            int suma  = 0;
            int resta = 0;
            int mult  = 0;
            int div   = 0;
           
        //Se designan que numeros va a utilizar
        
        System.out.println("Digite el primer numero: ");
        int num1 = sc.nextInt(); 
        
        System.out.println("Digite el primer numero: ");
        int num2 = sc.nextInt(); 
        
        System.out.println("Digite el primer numero: ");
        int num3 = sc.nextInt(); 
        
        System.out.println("Digite el primer numero: ");
        int num4 = sc.nextInt(); 
        
        //Designar Operaciones y Impresión de texto
        
        suma  = num1+num2+num3+num4;
        resta = num1-num2-num3-num4;
        mult  = num1*num2*num3*num4;
        div   = num1/num2/num3/num4;
        
        System.out.println("La suma de los numeros es: "+suma);
        System.out.println("La resta de los numeros es: "+resta);
        System.out.println("La multiplicación de los numeros es: "+mult);
        System.out.println("La division de los numeros es: "+div);
        
        System.out.println("///////////////////////////////////////////////////////");
     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        scanner.close();

        if (esPrimo(num)) {
            System.out.println(num + " es primo.");
        } else {
            System.out.println(num + " no es primo.");
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        if (numero <= 3) {
            return true;
        }

        if (numero % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
        
    }   
}
