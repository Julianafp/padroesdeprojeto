package one.digitalinnovation.gof.singleton;

/**
 * 
 * Padrão singleton apressado. 
 * 
 * @author julianapinto
 *
 */
public class SingletonEager {

	
	/**
	 * instancia novo singleton apressado e retorna a instância. 
	 */
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
