package lab02;

/**
 * Representação de uma conta em um laboratório. A cada laboratório
 * deve ser associado um único nome e uma cota. Se não definida,
 * a cota será automaticamente de 2000mb. 
 * @author Thúlio Carvalho
 */
public class ContaLaboratorio {
	
	/**
	 * Nome do laboratório.
	 */
	private String nomeLaboratorio;
	/**
	 * Cota de espaço, em MB.
	 */
	private int cota = 2000;
	/**
	 * Espaço atualmente ocupado, em MB.
	 */
	private int espacoOcupado = 0;

	/**
	 * Constrói uma nova conta em um laboratório a partir
	 * de um único nome de laboratório.
	 * @param nomeLaboratorio nome do laboratório.
	 */
	public ContaLaboratorio(String nomeLaboratorio) {
		this.nomeLaboratorio = nomeLaboratorio;
	}
	/**
	 * Constrói uma nova conta em um laboratório a partir
	 * de um único nome de laboratório e um valor inicial da
	 * cota de espaço.
	 * @param nomeLaboratorio nome do laboratório
	 * @param cota valor, em MB, da cota de espaço.
	 */
	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = cota;
	}
	/**
	 * Consome uma certa quantia de espaço ocupado; não
	 * interferindo no valor da cota.
	 * @param mbytes valor a ser consumido, em MB.
	 */
	public void consomeEspaco(int mbytes) {
		this.espacoOcupado += mbytes;
	}
	/**
	 * Libera uma certa quantia de espaço ocupado; não
	 * interferindo no valor da cota.
	 * @param mbytes valor a ser libereado, em MB.
	 */
	public void liberaEspaco(int mbytes) {
		this.espacoOcupado -= mbytes;
	}
	/**
	 * Retorna um booleano que representa se a o espaço ocupado
	 * já atingiu o valor máximo da cota estabelecida.
	 * @return um booleano true para atingido, e false para não atingido.
	 */
	public boolean atingiuCota() {
		return (this.espacoOcupado >= this.cota);
	}
	/**
	 * Retorna a String que representa a conta no laboratório
	 * tal como o espaço ocupado e o espaço total, no formato
	 * "Nome_do_Laboratório Espaço_Ocupado/Cota"
	 * @return a representação da conta do laboratório em String. 
	 */
	public String toString() {
		return this.nomeLaboratorio + " " + this.espacoOcupado + "/" + this.cota;
	}
	
}
