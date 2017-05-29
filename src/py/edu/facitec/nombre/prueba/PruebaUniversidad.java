package py.edu.facitec.nombre.prueba;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import py.edu.facitec.nombre.entidad.Analista;
import py.edu.facitec.nombre.entidad.Medico;
import py.edu.facitec.nombre.entidad.Universidad;
import py.edu.facitec.nombre.movimiento.Servicio;

public class PruebaUniversidad {
private Servicio servicio;

public PruebaUniversidad() {
	super();
	servicio=new Servicio();
}
public void cargar(){
	Medico me=new Medico();
	int ci=Integer.parseInt(JOptionPane.showInputDialog("Ingrece el CI del medico"));
	me.setCi(ci);
	String es=JOptionPane.showInputDialog("Ingrese la especialidad del Medico");
	me.setEspecialidad(es);
	Analista an=new Analista("Java", 5698033);
	Universidad un=new Universidad();
	//servicio.setAnalistas(new ArrayList<Analista>);
	Date ac=new Date(JOptionPane.showInputDialog("Ingrese la fecha de creacion de la universidad"));
	un.setAñoCreacion(ac);
	Integer co=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de servicio"));
	servicio.setCodigo(co);
	double monto=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto del servicio"));
	servicio.setMonto(monto);

	
	Analista ana1=new Analista("Java", 2342342);
	Analista ana2=new Analista("C++", 12312123);
	
	
	
	
	//1ra forma de inicializar lista en agregacion
	servicio.setAnalistas(new ArrayList<Analista>());
	
	//2da forma
	List<Analista> lista=new ArrayList<>();
	
	
	servicio.setAnalistas(lista);
	//Agregando los objetos a la lista de analistas
	servicio.getAnalistas().add(ana1);
	servicio.getAnalistas().add(ana2);
	
	
	
}
public void imprimir(){
	
	JOptionPane.showMessageDialog(null, servicio.toString()+servicio.calcularTotal(30));
	
		//Clase	  objeto       la lista de analistas
	for (Analista  obj:      servicio.getAnalistas()) {
		
		System.out.println(obj.toString());
		
	}
	
}


public static void main(String[] args) {
	PruebaUniversidad prueba=new PruebaUniversidad();
	prueba.cargar();
	prueba.imprimir();
}



}
