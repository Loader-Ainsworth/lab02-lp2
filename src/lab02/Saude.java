package lab02;

/**
 * Representa a saúde de um usuário.
 * A saúde é dividade em física e mental, e ambas permitem
 * o estado de "boa" ou "fraca". 
 * O estado dos dois tipos de saúde impactam na saúde geral.
 * @author Thúlio Carvalho
 */
public class Saude {
	/**
	 * Estado da saúde mental.
	 */
	private String mental;
	/**
	 * Estado da saúde física.
	 */
	private String fisica;
	/**
	 * Constrói uma nova configuração de saúde.
	 * A saúde mental começará, por padrão, como "boa".
	 * A saúde física começará, por padrão, como "boa".
	 */
	public Saude() {
		this.mental = "boa";
		this.fisica = "boa";
	}
	/**
	 * Define um novo estado para a saúde mental.
	 * Pode ser "boa" ou "fraca".
	 * @param valor String que representa o novo estado da saúde mental.
	 */
	public void defineSaudeMental(String valor) {
		this.mental = valor;
	}
	/**
	 * Define um novo estado para a saúde física.
	 * Pode ser "boa" ou "fraca".
	 * @param valor String que representa o novo estado da saúde física.
	 */
	public void defineSaudeFisica(String valor) {
		this.fisica = valor;
	}
	/**
	 * Retorna uma String que informa o estado da saúde geral
	 * do aluno. Se os dois tipos predefinidos de saúde estiverem
	 * no estado "boa", a saúde geral será "boa".
	 * Se um dos tipos estiver como "boa" e outro como "fraca",
	 * a saúde geral será "ok".
	 * Se ambos os tipos estiverem como "fraca", a saúde
	 * geral será "fraca".
	 * @return String que representa o estado da saúde geral.
	 */
	public String geral(){
		if(this.mental.equals("boa")){
			if(this.fisica.equals("boa")) {
				return "boa";
			} else {
				return "ok";
			}
		} else if(this.mental.equals("fraca")) {
			if(this.fisica.equals("boa")) {
				return "ok";
			}
		}
		return "fraca";
	}
}
