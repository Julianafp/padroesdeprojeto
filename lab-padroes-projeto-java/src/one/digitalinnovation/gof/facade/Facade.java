package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

/**
 * Esta classe é responsável por ser uma intermediária na gravação de dados no CRM
 * Seu método migrarCliente recebe além do nome um cep.
 * Este CEP é então utilizado como argumento para uma busca na API de CEP(mockada).
 * 
 * 
 * 
 * @author julianapinto
 *
 */
public class Facade {

	/**
	 * Neste método é instanciada a classe CepAPI e chamados seus métodos 
	 * de busca por cidade e por estado.
	 * 
	 * @param nome
	 * @param cep
	 */
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		
		/**
		 * Com os dados de cidade e estado adquiridos na API de buscar CEP
		 * instacio a outra API, agora de reclacionamento com o CRM e
		 * uso os dados adquiridos para salvar o usuário lá. 
		 * 
		 * nome e cep são recebidos e cidade e estado são adquiridos.
		 */
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
