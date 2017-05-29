package py.edu.facitec.nombre.entidad;

public abstract class Profecional {
private int ci;
private Universidad universidad;
public Profecional() {
	super();
	ci=0;
}
public abstract double calcularSalario();
public int getCi() {
	return ci;
}
public void setCi(int ci) {
	this.ci = ci;
}
@Override
public String toString() {
	return "Profecional [ci=" + ci + "]";
}

}
