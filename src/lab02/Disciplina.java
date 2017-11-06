package lab02;
/**
 * Representação de uma disciplina
 * Toda disciplina tem um nome associado
 * e é possível cadastrar notas e horas e obter
 * informações sobre a aprovação.
 * @author Thúlio Carvalho
 */
public class Disciplina {
	/**
	 * Quantidade de horas registradas na disciplina.
	 */
	private int horas;
	/**
	 * Nome da disciplina.
	 */
	private String nomeDisciplina;
	/**
	 * Notas da disciplina.
	 */
	private double nota[] = new double[4];
	/**
	 * Constrói uma nova disciplina a partir de
	 * um único nome.
	 * @param nomeDisciplina nome da disciplina.
	 */
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	/**
	 * Cadastra uma quantidade de horas à disciplina.
	 * @param horas quantidade de horas a ser cadastrada.
	 */
	public void cadastraHoras(int horas) {
		this.horas += horas;
	}
	/**
	 * Cadastra uma nota específica à disciplina.
	 * Por padrão, toda disciplina tem quatro notas a serem
	 * cadastradas.
	 * @param nota nota a ser cadastrada.
	 * @param valorNota valor obtido da nota pelo aluno.
	 */
	public void cadastraNota(int nota, double valorNota) {
		this.nota[nota-1] = valorNota;
	}
	/**
	 * Retorna a média dos valores das notas cadastradas
	 * @return média, em ponto flutuante, das notas cadastradas.
	 */
	private double media() {
		double total = 0;
		for(int i = 0; i < nota.length; i++) {
			total += nota[i];
		}
		return total/nota.length;
	}
	/**
	 * Retorna um boolean que representa a aprovação do aluno
	 * na disciplina. 
	 * @return true para aprovado e false para não aprovado.
	 */
	public boolean aprovado() {
		if(media() >= 7.0 ) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Retorna a String que informa a situação do aluno na disciplina
	 * seguindo a ordem: Nome da Disciplina, Horas Cadastradas, Média das notas e
	 * valores das notas.
	 * @return a representação da disciplina em String.
	 */
	public String toString() {
		String retorno = this.nomeDisciplina + " " + this.horas + " " + this.media() + " [" + nota[0];
		for(int i = 1; i < nota.length; i++) retorno += ", " + nota[i]; retorno += "]";
		return retorno;
	}
}
