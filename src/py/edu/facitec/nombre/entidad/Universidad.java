package py.edu.facitec.nombre.entidad;

import java.util.Date;

public class Universidad {
private Date añoCreacion;

public Universidad() {
	super();
	añoCreacion=new Date();
}
public Date getAñoCreacion() {
	return añoCreacion;
}
public void setAñoCreacion(Date añoCreacion) {
	this.añoCreacion = añoCreacion;
}
@Override
public String toString() {
	return "Universidad [añoCreacion=" + añoCreacion + "]";
}


}



