package lab02;

public class Disciplina {
	
	private int horas;
	private String nomeDisciplina;
	private double nota[] = new double[4];

	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public void cadastraHoras(int horas) {
		this.horas += horas;
	}
	public void cadastraNota(int nota, double valorNota) {
		this.nota[nota-1] = valorNota;
	}

	private double media() {
		double total = 0;
		for(int i = 0; i < nota.length; i++) {
			total += nota[i];
		}
		return total/nota.length;
	}
	
	public boolean aprovado() {
		if(media() >= 7.0 ) {
			return true;
		} else {
			return false;
		}
	}
	public String toString() {
		String retorno = this.nomeDisciplina + " " + this.horas + " " + this.media() + " [" + nota[0];
		for(int i = 1; i < nota.length; i++) retorno += ", " + nota[i]; retorno += "]";
		return retorno;
	}
}
