package lab02;

public class ContaCantina {

	private String nomeDaCantina;
	private int conta;
	private int qtdItens;
	public ContaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;
	}
	public void cadastraLanche(int qtdItens, int valorCentavos) {
		this.conta += valorCentavos;
		this.qtdItens += qtdItens;
	}
	public void pagaConta(int valorCentavos) {
		this.conta -= valorCentavos;
	}
	public String toString() {
		return this.nomeDaCantina + " " + this.qtdItens + " " + this.conta;
	}
	
}
