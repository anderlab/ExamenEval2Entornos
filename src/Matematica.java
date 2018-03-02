import java.sql.Array;
import java.util.ArrayList;

public class Matematica {

	private ArrayList sumas = new ArrayList();

	/**Este metodo suma dos numeros (a y b) y devuelve un resultado, ademas introduce el resultado en un array llamado sumas
	 * @param a Es un numero que le pasamos para que lo sume
	 * @param b Es el otro numero que forma parte de la suma, para sumar con el primero
	 * @return resultado, es el resultado de la suma
	 */
	public int suma(int a, int b) {

		int resultado = a + b;

		sumas.add(resultado);
		return resultado;

	}
	
	

	/**Este metodo devuelve true si el numero (a) es mayor que el numero (b)
	 * @param a  Es un numero que le pasamos para que lo compare con otro numero (b)
	 * @param b	 Es el numero con el que compararemos a
	 * @return devuelve true si a>b y devuelve false si a<b o a=b
	 */
	public boolean mayor(int a, int b) {

		if (a > b) {
			return true;
		}
		return false;

	}

	
	/**Este metodo es para devolver un arraylist con los resultados de las sumas realizadas
	 * @return devuelve un array con los resultados de las sumas
	 */
	public ArrayList sumas(){
		
		
		return sumas;
		
		
	}
	
	
	
	public ArrayList getSumas() {
		return sumas;
	}

	public void setSumas(ArrayList sumas) {
		this.sumas = sumas;
	}

}
