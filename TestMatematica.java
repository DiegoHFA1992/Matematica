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
		boolean calculo=Matematica.esPar(numero);
		System.out.println("el numero : "+numero+ " es " +calculo);
		System.out.printf("%s %d %s %b %n","El numero",numero,"es par: ",Matematicas.esPar(numero));
	}
}
