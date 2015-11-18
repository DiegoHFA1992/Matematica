//clase para comprobar los metodos
//estaticos de la clase Matematicas.java
import java.util.Scanner;
public class TestMatematica{
   public static void main(String[] arg){
	   //abrimos scanner
		Scanner sc = new Scanner(System.in);
		//leemos el numero entero
		System.out.println("Escribe un numero");
		int numero = sc.nextInt();
		boolean calculo1=Matematica.esPar(numero);
		boolean calculo2=Matematica.esDivisiblePorTres(numero);
		boolean calculo3=Matematica.esDivisiblePorCinco(numero);
		
		System.out.println("el numero : "+numero+ " es " +calculo1);
		System.out.println("el numero : "+numero+ " es " +calculo2);
		System.out.println("el numero : "+numero+ " es " +calculo3);
	}
}
