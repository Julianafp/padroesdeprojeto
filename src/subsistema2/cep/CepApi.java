package subsistema2.cep;

public class CepApi {

	/*
	 *Cria uma nova instância de CEP API
	 *Que simula (cria um mock) a obtenção de dados de CEP
	 *retornando cidade e estado. 
	 * 
	 */
	
	private static CepApi instancia = new CepApi();

	private CepApi() {
		super();
	}

	//método getInstancia retorna uma nova instância 
	public static CepApi getInstancia() {
		return instancia;
	}
	
	//método recuperCidade recebe um cep como parametro
	//e retorna uma cidade. 
	public String recuperarCidade(String cep) {
		return "Paraí";
	}
	
	//método recuperaEstado recebe um cep como param
	//e retorna um estado.
	public String recuperarEstado(String cep) {
		return "RS";
	}
}
