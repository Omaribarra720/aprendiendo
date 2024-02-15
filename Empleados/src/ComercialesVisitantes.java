public class ComercialesVisitantes extends ComercialesTelefono {

	private int visitasRealizadas;
	
	public ComercialesVisitantes(String DNI, String nombre, double sueldoBase, double productividad,
			int clientesConseguidos, int visitasRealizadas) {
		super(DNI, nombre, sueldoBase, productividad, clientesConseguidos);
		this.visitasRealizadas=visitasRealizadas;
	}

	public double extra() {
		return super.extra() + visitasRealizadas* getSueldoBase() * 0.01;
	}
	public void sumarVisitas(int visitas) {
		visitasRealizadas += visitas;
		}

	
	public String toString() {
		return super.toString() + "\n" + 
					"Visitas Realizadas: " + visitasRealizadas;
	}
}