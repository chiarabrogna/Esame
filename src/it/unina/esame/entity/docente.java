package it.unina.esame.entity;

public class docente {
	protected String NomeDocente;
	
	public docente() {
		this.NomeDocente="";
	}
	public docente(String Docente) {
		this.NomeDocente= new String(Docente);
	}
	public String getNomeDocente() {
		return NomeDocente;
	}
	public void setNomeDocente(String Docente) {
		NomeDocente=Docente;
	}
}
