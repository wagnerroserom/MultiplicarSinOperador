
	package multiplicacion;

	import java.util.Scanner;

	public class MultiplicarSinOperador {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("Por favor ingresa el primer número:");// Aquí solicitamos el ingreso del primer número
	        int numero1 = scanner.nextInt();
	        
            
	        System.out.println("Por favor ingresa el segundo número:");// Aquí solicitamos el ingreso del segundo número.
	        int numero2 = scanner.nextInt();

	        // Con estas variables almacenamos el resultado y el multiplicando
	        int resultado = 0;
	        int multiplicando = numero1;

	        // Vamos a utilizar un bucle para sumar el 'numero1' tantas veces como indique el 'numero2'
	        for (int i = 0; i < numero2; i++) {
	            resultado += multiplicando;
	        }

	        // Finalmente mostramos el resultado por consola.
	        System.out.println("El resultado de la multiplicación es: " + resultado);

	        scanner.close();
	    }



}

