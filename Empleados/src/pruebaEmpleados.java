import java.util.Scanner;

public class pruebaEmpleados {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int op,tam,opTipo,sueldoBase,productividad;
		String DNI, nombre,fecha,autor,ISBN;
		int noDescargas,ejemplares,periodicidad,clasificado,diasTrabajados,clientes,visitas,contrato;
		boolean disponible;
		
		Jardinero j=null;
		ComercialesTelefono cT=null;
		ComercialesVisitantes cV=null;
		
		Empleado e=null;
		
		System.out.println("Capacidad: ");
		tam=lector.nextInt();
		
		ControlEmpleados control= new ControlEmpleados(tam);
		
		
		do {
			System.out.println("M E N U");
			System.out.println("1.-Contrata empleado");
			System.out.println("2.-Despide empleado");
			System.out.println("3.-Comienza mes");
			System.out.println("4.-Agregar datos");
			System.out.println("5.-Muestra sueldos");
			System.out.println("6.-Salir del sistema");
			
			op=lector.nextInt();
			switch(op)
			{
			case 1:
				System.out.println("TIPO DE EMPLEADO");
				System.out.println("1.-Jardinero");
				System.out.println("2.-Comerciales Telefono");
				System.out.println("3.-Comerciales Visitantes ");
			
				System.out.println("Opcion: ");
				opTipo = lector.nextInt();
				
				System.out.println("DNI: ");
				DNI = lector.next();
				
				System.out.println("Nombre: ");
				nombre = lector.next();
				
				System.out.println("Sueldo base: ");
				sueldoBase = lector.nextInt();
				
				System.out.println("productividad: ");
				productividad = lector.nextInt();
				
				
				switch(opTipo)
				{
				case 1:
					
					
					System.out.println("Dias trabajados: ");
					diasTrabajados = lector.nextInt();
					
					j = new Jardinero(DNI,nombre,sueldoBase, productividad, diasTrabajados);
					
					
					control.agregarEmpleado(j);
					
					break;
				case 2:
					System.out.println("Clientes conseguidos:  ");
					clientes = lector.nextInt();
					
					
					
					cT = new ComercialesTelefono(DNI,nombre,sueldoBase, productividad, clientes);
					
					control.agregarEmpleado(cT);
					break;
				case 3:
					System.out.println("Clientes conseguidos:  ");
					clientes = lector.nextInt();
					
					System.out.println("Visitas extra:  ");
					visitas = lector.nextInt();
					
					
					
					cV = new ComercialesVisitantes(DNI,nombre,sueldoBase, productividad, clientes,visitas);
					
					control.agregarEmpleado(cV);
					break;
				}
			
				
				
				break;
			case 2:
				
				System.out.println("Ingrese los datos del empleado que desea despedir");
				

				System.out.println("Opcion: ");
				opTipo = lector.nextInt();
				
				System.out.println("DNI: ");
				DNI = lector.next();
				
				System.out.println("Nombre: ");
				nombre = lector.next();
				
				System.out.println("Sueldo base: ");
				sueldoBase = lector.nextInt();
				
				System.out.println("productividad: ");
				productividad = lector.nextInt();
				
				
				if(control.despedirEmpleado(DNI, nombre, sueldoBase, productividad)==1) {
					System.out.println("Se ha despedido al empleado");
				}else {
					System.out.println("No se encontro al empleado");
					
				}
				
				//System.out.println(publicaciones.toString());
				break;
			case 3:
				
				
				

				
				break;
				
			case 4:
				System.out.println("A quien le quiere actualizar un dato 1-Jardinero....2-Comerciales telefono....3-Comerciales visitantes");
				opTipo = lector.nextInt();

				System.out.println("Ingrese los datos del empleado que desea buscar");
				
				System.out.println("DNI: ");
				DNI = lector.next();
				
				System.out.println("Nombre: ");
				nombre = lector.next();
				
			
				
				
				
								
				switch(opTipo)
				{
				case 1:
					
					
					System.out.println("Dias trabajados: ");
					diasTrabajados = lector.nextInt();
					
					int dias=control.agregarDiasLejos(DNI, nombre, diasTrabajados);
					
					if(dias==1) {
						System.out.println("Se han actualizado los dias");

						
					}
					else
						System.out.println("No se encontre el empleado");
					
					
					
									
					
					break;
				case 2:
					System.out.println("Contratos realizados: ");
					contrato = lector.nextInt();
					
					int contr=control.agregarContrato(DNI, nombre, contrato);
					
					if(contr==1) {
						System.out.println("Se han actualizado los contratos");

						
					}
					else
						System.out.println("No se encontre el empleado");

					break;
				case 3:
					System.out.println("Visitas realizadas: ");
					visitas = lector.nextInt();
					
					int vi=control.agregarContrato(DNI, nombre, visitas);
					
					if(vi==1) {
						System.out.println("Se han actualizado las visitas");

						
					}
					else
						System.out.println("No se encontrado el empleado");

					break;
				}
				
				
				break;
			case 5:
				System.out.println("Ingrese los datos del empleado del que desea saber su sueldo");
				
				System.out.println("DNI: ");
				DNI = lector.next();
				
				System.out.println("Nombre: ");
				nombre = lector.next();
				
				System.out.println("Sueldo base: ");
				sueldoBase = lector.nextInt();
				
				System.out.println("productividad: ");
				productividad = lector.nextInt();
				
				
				System.out.println(control.buscarEmpleado(DNI, nombre, sueldoBase, productividad));
												
				break;
			}
			
			
		
		}while(op!=6);

	}

}