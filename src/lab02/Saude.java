package lab02;

public class Saude {


	private String mental;
	private String fisica;
	public Saude() {
		this.mental = "boa";
		this.fisica = "boa";
	}
	public void defineSaudeMental(String valor) {
		this.mental = valor;
	}
	public void defineSaudeFisica(String valor) {
		this.fisica = valor;
	}
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
