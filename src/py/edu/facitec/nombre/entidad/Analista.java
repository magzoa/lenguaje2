package py.edu.facitec.nombre.entidad;

import py.edu.facitec.nombre.interfaz.Consulta;

public class Analista extends Profecional {
private String lenguaje;


public Analista() {
	super();
	lenguaje="";
	
}

public Analista(String lenguaje, int ci) {
	super();
	this.lenguaje = lenguaje;
}

@Override
public double calcularSalario() {
	
	return 0;
}

public String getLenguaje() {
	return lenguaje;
}

public void setLenguaje(String lenguaje) {
	this.lenguaje = lenguaje;
}

@Override
public String toString() {
	return "Analista [lenguaje=" + lenguaje + "]";
}


}


