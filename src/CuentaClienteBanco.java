
//1. Crea una clase Cuenta con los métodos ingreso, reintegro y transferencia. La clase contendrá un constructor por defecto, un constructor con parámetros, un constructor copia y los métodos getters y setters.

//2. Crea una clase Contador con los métodos para incrementar y decrementar el contador. La clase contendrá un constructor por defecto, un constructor con parámetros, un constructor copia y los métodos getters y setters.
//3. Crea una clase Libro con los métodos préstamo, devolución y toString. La clase contendrá un constructor por defecto, un constructor con parámetros y los métodos getters y setters.
public class CuentaClienteBanco {
   String CUB;
   String Titular;
   double Saldo;
   private CuentaClienteBanco Copia;

   public CuentaClienteBanco(String CUB, String Titular, double Saldo) {
      CUB = this.CUB;
      Titular = this.Titular;
      Saldo = this.Saldo;
   }
   
   public CuentaClienteBanco() {
	   
	   }
   
   public CuentaClienteBanco(CuentaClienteBanco ACopiar) {
	      Copia.CUB = this.CUB;
	      Copia.Titular = this.Titular;
	      Copia.Saldo = this.Saldo;
	   }
   
   
   
   public String getCUB() {
	return CUB;
}



public void setCUB(String cUB) {
	CUB = cUB;
}



public String getTitular() {
	return Titular;
}



public void setTitular(String titular) {
	Titular = titular;
}



public double getSaldo() {
	return Saldo;
}



public void setSaldo(double saldo) {
	Saldo = saldo;
}



public CuentaClienteBanco getCopia() {
	return Copia;
}



public void setCopia(CuentaClienteBanco copia) {
	Copia = copia;
}



public static void main(String[] args) {
   }
}
