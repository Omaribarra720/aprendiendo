
public class Cuenta {

	

		private int noCuenta;
		private double saldo;
		private double multa;
		private int numRetiros;
		
		

		public Cuenta(int noCuenta) {
			this.noCuenta=noCuenta;
			saldo=0;
			multa=0;
			numRetiros=0;
			
		}
		
		public int retirar(double monto) {
			
			if(monto<=saldo) {
				saldo-=monto;
				
				numRetiros++;
				
				if(numRetiros>5) {
					
					saldo-=20;
					//retiro con comision
					return 1;
					
				}
				//retiro sin comision
				return 0;
			}
			else {
				
				multa+=500;
				saldo-=500;
				//sin retiro y multa por falta de fondos
				return 2;
				
			}
			
		}
		public void depositar(double monto) {
			saldo+=monto;
		} 
		public double getSaldo() {
			return saldo;
		} 
		public String toString() {
			return "No cuenta: "+ noCuenta+"\n"+"Saldo: "+ saldo+"\n"+"Pago por multas han sido de: "+ multa;
		
		}
		public boolean equals(Object c) { 
			return false;
		}
		
	

}
