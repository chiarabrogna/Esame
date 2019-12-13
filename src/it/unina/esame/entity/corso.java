package it.unina.esame.entity;

public class corso {
	protected String NomeCorso;
	protected docente NomeDocente;
	protected int CFU;

public corso() { //COSTRUTTORE SENZA PARAMETRI
	this.NomeCorso="";
	this.NomeDocente= new docente();
	this.CFU=0;
	
}

public corso(String Corso,docente Docente,int _CFU) {//COSTRUTTORE CON PARAMETRI 
	this.NomeCorso= new String(Corso);
	NomeDocente=Docente;
	CFU=_CFU;
}

public String getNomeCorso() {
	return NomeCorso;
}

public void setNomeCorso(String Corso) {
	NomeCorso=Corso;
}

public docente getdocente() {
	return NomeDocente;
	
}

}
