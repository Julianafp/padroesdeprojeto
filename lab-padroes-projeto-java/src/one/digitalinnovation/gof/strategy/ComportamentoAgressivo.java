package one.digitalinnovation.gof.strategy;


/**
 * Cria a classe de comportamento agressivo que implementa a interface de comportamento.
 * Nota: a implementação pode ser usada pois comportamento agressivo demanda uma característica de comportaemnto
 * que é o movimento. 
 * Em vez de criarmos movimento em cada uma das classes de comportamento que tivermos no nosso código
 * simplesmente criamos o movimento em Comportamento e depois implementamos cada tipo de movimento usando o 
 * movimento criado em Comportamento, exemplo: comportamento Agressivo tem movimento.   
 * 
 * 
 * @author julianapinto
 *
 */
public class ComportamentoAgressivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Robô movendo-se agressivamente... CUIDADO!!!!");
	}

}
