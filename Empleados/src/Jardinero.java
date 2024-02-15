
public class Jardinero extends Empleado {

	private int diasTrabajados;
	
	public Jardinero(String DNI, String nombre, double sueldoBase, double productividad, int diasTrabajados) {
		super(DNI, nombre, sueldoBase, productividad);
		this.diasTrabajados=diasTrabajados;
	}

	
	public double extra() {
		return diasTrabajados * getSueldoBase() * 0.03;
	}
	public void sumarDias(int diasLejos) {
		diasTrabajados += diasLejos;
		}


	public String toString() {
		return super.toString() + "\n"+
					"Dias Trabajados: "+diasTrabajados;
	}


	public int getDiasTrabajados() {
		return diasTrabajados;
	}


	public void setDiasTrabajados(int diasTrabajados) {
		this.diasTrabajados = diasTrabajados;
	}
	
	
}