package subsistema1.crm;

public class CrmService {

	
	/**
	 * Class que faz o mock de gravaçã oem uem CRM (Customer Relationship Management).
	 */
	private CrmService() {
		super();
	}
	
	/**
	 * Método gravarCliente que simplesmente retorna em linhas os parametros recebidos.
	 * Na vida real deveria estar aqui a lógica de graavação destes dados em  um CRM real.
	 * @param nome - Nome do cliente.
	 * @param cep - CEP do cliente.
	 * @param cidade - Cidade do cliente.
	 * @param estado - Estado do cliente.
	 */
	public static void gravarCliente(String nome, String cep, String cidade, String estado) {
		System.out.println("Cliente salvo no sistema de CRM:");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
	}
}
