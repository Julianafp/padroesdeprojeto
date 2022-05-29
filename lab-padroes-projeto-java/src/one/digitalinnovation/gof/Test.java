package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;


/**
 * Classe de teste das classes criadas no nosso código.
 * 
 * @author julianapinto
 *
 */
public class Test {

	public static void main(String[] args) {
		
	
		/**
		 * Teste nas 3 classes do singleton.
		 * Instancio as classes em suas variáveis e chamo o método get instância 
		 * para cada uma delas. Assim teremos uma istância de cada pronta para o teste.
		 * O código então retorna a identificação da instancia criada. 
		 */
		SingletonLazy lazy = SingletonLazy.getInstancia();
		String lz = "Instância Normal: " + lazy;
		System.out.println(lz);

		SingletonEager eager = SingletonEager.getInstancia();
		String ea = "Instância Agressiva: " + eager;
		System.out.println(ea);
		
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		String lh = "Instância Defensiva: " + lazyHolder;
		System.out.println(lh);


		
		/**
		 * Crio as variáveis de comportamento normal, defensivo e agressivo
		 * e atribuo a elas o tipo de Comportamento referente que 
		 * que só tem a função de "mover", cada um de acordo com a sua proposta.
		 * 
		 */
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		/**
		 * Instacio meu robô que só tem a funcão de chamar os complortaemntos
		 * e chamo o método mover em cada um dos cenários. 
		 */
		Robo robo = new Robo();
		//neste caso define o comportamento como normal, que criamos há pouco.
		robo.setComportamento(normal);
		//aqui move o robô baseado no comportamento acima. 
		robo.mover();
		//aqui o defensivo
		robo.setComportamento(defensivo);
		robo.mover();
		//e pra fechar o cenário de testes, o agressivo.
		robo.setComportamento(agressivo);
		robo.mover();

		
		/**
		 * Após a mudança de comportamentos executada pelo nosso robô simulamos a gravação de 
		 * dados do cliente com o resultado de busca pelo seu cep no CRM (mockado) usando a 
		 * classe facade e o método migrarCliente.
		 * os parâmetros enviados são somente nome e cep.
		 * A busca pelos dados do endereço é feita com este cep lá
		 * no método migrarCliente.
		 */
		Facade facade = new Facade();
		facade.migrarCliente("Tomi", "95360000");
	}

}
