package py.edu.facitec.nombre.movimiento;

import java.util.ArrayList;
import java.util.List;

import py.edu.facitec.nombre.entidad.Analista;
import py.edu.facitec.nombre.entidad.Medico;
import py.edu.facitec.nombre.interfaz.Consulta;

public class Servicio implements Consulta {
private Integer codigo;
private double monto;
private Medico medico;
//Aplicación de agregacion en un relacionamiento de uno a muchos


private  List<Analista> analistas;

public Servicio() {
	super();
	codigo=0;
	monto=0;
	medico=new Medico();
	
	//en el caso de composición
	
	
	analistas=new ArrayList<>();
	
}
public double calcularTotal(int dias){
	
		
	
		  //vector   recuperando el primer elemento del vector
	return analistas.get(0).calcularSalario()*dias;
}

protected void cancelar(){
	
}
public Integer getCodigo() {
	return codigo;
}
public void setCodigo(Integer codigo) {
	this.codigo = codigo;
}
public double getMonto() {
	return monto;
}
public void setMonto(double monto) {
	this.monto = monto;
}
public Medico getMedico() {
	return medico;
}
public void setMedico(Medico medico) {
	this.medico = medico;
}

public java.util.List<Analista> getAnalistas() {
	return analistas;
}
public void setAnalistas(java.util.List<Analista> analistas) {
	this.analistas = analistas;
}
@Override
public String toString() {
	return "Servicio [codigo=" + codigo + ", monto=" + monto + ", medico="
			+ medico + "]";
}
@Override
public void getList(List<Medico> medicos) {
	
	
}

}
