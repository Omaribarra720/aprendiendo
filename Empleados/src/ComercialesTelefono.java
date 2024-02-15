

public class ComercialesTelefono extends Empleado {

	private int clientesConseguidos;
	
	public ComercialesTelefono(String DNI, String nombre, double sueldoBase, double productividad, int clientesConseguidos) {
		super(DNI, nombre, sueldoBase, productividad);
		this.clientesConseguidos=clientesConseguidos;
	}

	@Override
	public double extra() {
		return clientesConseguidos * getSueldoBase() * 0.05;
	}
	public void sumarContrato(int contrato) {
		clientesConseguidos += contrato;
		}

	public String toString() {
		return super.toString() + "\n"+
					"Clientes Conseguidos: " + clientesConseguidos;
	}

}