package lab02;

/**
 * Representação de uma conta em uma cantina. A cada conta é atribuido
 * o nome de uma única cantina.
 * @author Thúlio Carvalho
 */
public class ContaCantina {

	/**
     * Nome da cantina.
     */
	private String nomeDaCantina;
	/**
     * Valor contido na conta, em centavos. 
   	 */	
	private int conta;
	/**
	 * Quantidade de itens adquiridos na cantina. 
	 */
	private int qtdItens;
	/**
     * Constrói uma conta na cantina a partir do nome da cantina.
     * @param nomeDaCantina o nome da cantina.
     */
	public ContaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;
	}
	/**
	 * Cadastra o valor e a quantidade de itens adquiridos em um lanche.
	 * @param qtdItens quantidade de itens adquiridos no lanche
	 * @param valorCentavos valor total dos itens adquiridos
	 */
	public void cadastraLanche(int qtdItens, int valorCentavos) {
		this.conta += valorCentavos;
		this.qtdItens += qtdItens;
	}
	/**
	 * Efetua um pagamento, retirando um valor, em centavos, da conta.
	 * @param valorCentavos valor a ser retirado(pago), em centavos.
	 */
	public void pagaConta(int valorCentavos) {
		this.conta -= valorCentavos;
	}
	/**
	 * Retorna a String que representa a conta da cantina.
	 * A representação segue o formato:
	 * "<Nome da Cantina> <Quantidade de Itens> <Valor na Conta>"
	 * @returns a representação em String de uma conta na cantina.
	 */
	public String toString() {
		return this.nomeDaCantina + " " + this.qtdItens + " " + this.conta;
	}
	
}
