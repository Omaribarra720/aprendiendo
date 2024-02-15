import java.util.Scanner;
public class PrueBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectura=new Scanner(System.in);
		int op,monto;
		


		Cuenta c1 = new Cuenta(123);
		System.out.println("Su numero de cuenta es 123 ");
		System.out.println("De cuanto desea su monto inicial: ");
		monto=lectura.nextInt();
		c1.depositar(monto);

		do {
			System.out.println("Banco cepillin"+"\n"+"1-Retirar"+"\n"+"2-Depositar"+"\n"+"3-Ver saldo"+"\n"+"4-Salir"+"\n"+"Que desea: ");
			op=lectura.nextInt();
			switch(op) {

			case 1:
				
				System.out.println("De cuento desea su retiro");
				monto=lectura.nextInt();
				int tipoRetiro=	c1.retirar(monto);
		

				switch(tipoRetiro) {
				case 0:
					System.out.println("Retiro sin comision");
					break;
				case 1:
					System.out.println("Retiro con comision de 20 pesos");
					break;

				case 2:
					System.out.println("Sin retiro y multa por falta de fondos");
					break;
				}
				
				
				System.out.println(c1.toString());
				System.out.println("\n");
				
				
				break;

			case 2:
			
				
				System.out.println("Cuanto desea depositar: ");
				monto=lectura.nextInt();
				c1.depositar(monto);
				System.out.println("\n");
				
				break;



			case 3:
				System.out.println("El saldo de su cuenta es de: ");
				System.out.println(c1.getSaldo());
				System.out.println("\n");
				break;
				
			
			}
		}
		while(op!=4);

	}

}


