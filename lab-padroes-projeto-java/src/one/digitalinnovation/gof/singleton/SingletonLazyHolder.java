package one.digitalinnovation.gof.singleton;

/**
 * 
 * Singleton normal que instancia e retorna a si mesmo ao ser ivocado.
 * 
 * @author julianapinto
 *
 */
public class SingletonLazyHolder {

	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
