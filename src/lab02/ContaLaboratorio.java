package lab02;

public class ContaLaboratorio {

	
	private String nomeLaboratorio;
	private int cota = 2000;
	private int espacoOcupado = 0;

	public ContaLaboratorio(String nomeLaboratorio) {
		this.nomeLaboratorio = nomeLaboratorio;
	}
	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = cota;
	}
	public void consomeEspaco(int mbytes) {
		this.espacoOcupado += mbytes;
	}
	public void liberaEspaco(int mbytes) {
		this.espacoOcupado -= mbytes;
	}
	public boolean atingiuCota() {
		return (this.espacoOcupado >= this.cota);
	}
	
	public String toString() {
		return this.nomeLaboratorio + " " + this.espacoOcupado + "/" + this.cota;
	}
	
}
