package one.digitalinnovation.gof.strategy;


/**
 * Importa Comportamento de forma privaa (só pode ser chamada de dentro da classe Robo) e
 * cria dois métodos que são setComportamento e mover.
 * 
 * @author julianapinto
 *
 */
public class Robo {
	
	private Comportamento comportamento;

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.mover();
	}
}
