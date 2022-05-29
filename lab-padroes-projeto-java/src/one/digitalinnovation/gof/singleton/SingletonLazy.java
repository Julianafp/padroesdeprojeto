package one.digitalinnovation.gof.singleton;

/**
 * 
 * Singleton preguiçoso que instancia e retorna a si mesmo ao ser ivocado.
 * 
 * @author julianapinto
 *
 */
public class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
