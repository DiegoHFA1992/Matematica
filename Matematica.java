//clase Matematica.java
/**clase que va a contener
 * metodos estaticos de calculo
 * matematico
 * @author Diego Ureña
 * @version 0.0
 */
 public class Matematica {
	/**metodo que devuelve si un numero
	 * es par o no
	 * @param numero entero 
	 * @return boolean
	 */
	 
	public static boolean esPar(int numero) {
		return numero%2==0;
	}

	/**metodo que devuelve si un numero
	 * es divisible por 3
	 * @param numero entero 
	 * @return boolean es divisible por 3
	 */
	
	 
	public static boolean esDivisiblePorTres(int numero) {
		return numero%3==0;
	} 
	/**metodo que devuelve si un numero
	 * es divisible por cinco
	 * @param numero entero 
	 * @return boolean true si es divisible por cinco
	 */
	
	 
	public static boolean esDivisiblePorCinco(int numero) {
		return numero%5==0;
	}
}
