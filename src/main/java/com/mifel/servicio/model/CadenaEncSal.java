package com.mifel.servicio.model;

public class CadenaEncSal {
	
	private String cadena ="";
	private String encriptado = "";
	private String desencriptado ="";



	public String getDesencriptado() {
		return desencriptado;
	}

	public void setDesencriptado(String desencriptado) {
		this.desencriptado = desencriptado;
	}

	public String getEncriptado() {
		return encriptado;
	}

	public void setEncriptado(String encriptado) {
		this.encriptado = encriptado;
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public CadenaEncSal(String cadena) {
		this.cadena = cadena;
	}

	public CadenaEncSal(String cadena, String encriptado, String desencriptado) {
		this.cadena = cadena;
		this.encriptado = encriptado;
		this.desencriptado = desencriptado;
	}

	public CadenaEncSal() {
		super();
	}


}
