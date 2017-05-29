package py.edu.facitec.nombre.entidad;

public class Medico extends Profecional {
private String especialidad;

public double calcularSalario() {
	return 0;
}

public Medico() {
	super();
	especialidad="";
}

public String getEspecialidad() {
	return especialidad;
}

public void setEspecialidad(String especialidad) {
	this.especialidad = especialidad;
}

@Override
public String toString() {
	return "Medico [especialidad=" + especialidad + ", toString()="
			+ super.toString() + "]";
}

}
