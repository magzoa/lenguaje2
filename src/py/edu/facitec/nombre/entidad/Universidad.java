package py.edu.facitec.nombre.entidad;

import java.util.Date;

public class Universidad {
private Date a�oCreacion;

public Universidad() {
	super();
	a�oCreacion=new Date();
}
public Date getA�oCreacion() {
	return a�oCreacion;
}
public void setA�oCreacion(Date a�oCreacion) {
	this.a�oCreacion = a�oCreacion;
}
@Override
public String toString() {
	return "Universidad [a�oCreacion=" + a�oCreacion + "]";
}


}



