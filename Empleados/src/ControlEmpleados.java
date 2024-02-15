

public class ControlEmpleados {
private Empleado[] arreglo;
	
	public ControlEmpleados(int size)
	{
		arreglo = new Empleado[size]; //  crear el arreglo de tamaño size
	}
	
	public int buscarDisponible() 
	{
		int i=0;
		while(i<arreglo.length && arreglo[i]!=null)
			i++;
		
		return (i==arreglo.length)? -1:i;
		
	}
	
	public void agregarEmpleado(Empleado p)
	{
		int i= buscarDisponible();
		if(i!=-1)
		{
			arreglo[i]=p;
		}
	}
	public int buscarPublicacion(String Editorial,String nombre,String fecha)
	{
		int i=0;
		while(i<arreglo.length && arreglo[i]!=null)
			i++;
		return(i==arreglo.length)?-1:i;
	}

	
	
	
	public int  buscarEmpleado (String DNI, String nombre)
	{
		int i=0;
		while(i<arreglo.length && (arreglo[i]==null || !(arreglo[i].getDNI().equals(DNI) &&
														arreglo[i].getNombre().equals(nombre) )))
			i++;
		
		return (i==arreglo.length)?-1:i;
	}
	public Empleado buscarEmpleado (String DNI, String nombre, int sueldoBase,int productividad)
	{
		int i=0;
		while(i<arreglo.length && (arreglo[i]==null || !(arreglo[i].getDNI().equals(DNI) &&
														arreglo[i].getNombre().equals(nombre)&& 
														arreglo[i].getSueldoBase()==(sueldoBase)&& 
														arreglo[i].getProductividad()==(productividad))))
			i++;
		
		return (i==arreglo.length)? null:arreglo[i];
	}
	
	
	public int despedirEmpleado (String DNI, String nombre, int sueldoBase,int productividad)
	{
		
		int i=0;
		while(i<arreglo.length && (arreglo[i]==null || !(arreglo[i].getDNI().equals(DNI) &&
														arreglo[i].getNombre().equals(nombre)&& 
														arreglo[i].getSueldoBase()==(sueldoBase)&& 
														arreglo[i].getProductividad()==(productividad))))
		{
			i++;
			
		}
		if(i!=arreglo.length)
		{
			arreglo[i]=null;
		}
		if(i==arreglo.length) {
			return -1;
		}
		else {
			return 1;
		}
		
	}
	

	

	public int agregarDiasLejos(String DNI, String nombre, int diasLejos) {
		Jardinero aux;
		int i = buscarEmpleado(DNI, nombre);
		if(i != -1 && arreglo[i].getClass() == Jardinero.class) {
		aux = (Jardinero) arreglo[i];
		aux.sumarDias(diasLejos);
		return 1;
		}
		return 0;
		}
	public int agregarContrato(String DNI, String nombre, int contrato) {
		ComercialesTelefono aux;
		int i = buscarEmpleado(DNI, nombre);
		if(i != -1 && arreglo[i].getClass() == ComercialesTelefono.class) {
		aux = (ComercialesTelefono) arreglo[i];
		aux.sumarContrato(contrato);
		return 1;
		}
		return 0;
		}
	public int agregarVisita(String DNI, String nombre, int visitas) {
		ComercialesVisitantes aux;
		int i = buscarEmpleado(DNI, nombre);
		if(i != -1 && arreglo[i].getClass() == ComercialesVisitantes.class) {
		aux = (ComercialesVisitantes) arreglo[i];
		aux.sumarVisitas(visitas);
		return 1;
		}
		return 0;
		}


	
	
	public String toString()
	{
		String cadena="";
		
		for(int i=0;i<arreglo.length;i++)
		{
			if(arreglo[i]!=null)
				cadena+=arreglo[i].toString()+"\n";
		}
		return cadena;
	}
	
	public String toStringJardinero()
	{
		String cadena="";
		
		for(int i=0;i<arreglo.length;i++)
		{
			if(arreglo[i]!=null && arreglo[i].getClass()==Jardinero.class)
				cadena+=arreglo[i].toString()+"\n";
		}
		return cadena;
	}
}