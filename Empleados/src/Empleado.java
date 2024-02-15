public abstract class Empleado {
	private String DNI;
	private double sueldoBase;
	private String nombre;
	private double productividad;
	
	public Empleado(String DNI,String nombre, double sueldoBase, double productividad){
		this.DNI=DNI;
		this.nombre=nombre;
		this.sueldoBase=sueldoBase;
		this.productividad=productividad;
	}
	
	public double sueldoMensual() {
		return sueldoBase + productividad + extra();
	}
	
	public abstract double extra();

	public String getDNI() {
		return DNI;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public String getNombre() {
		return nombre;
	}

	public double getProductividad() {
		return productividad;
	}
	
	public String toString() {
		return "DNI: "+DNI + "\n"+
				"Nombre: " + nombre + "\n"+
				"Sueldo Base: " + sueldoBase + "\n"+
				"Productividad: " + productividad + "\n"+
				"Sueldo Mensual: " + sueldoMensual();
	}
	
	
	
	
	
	
	
}