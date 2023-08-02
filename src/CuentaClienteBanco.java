

public class CuentaClienteBanco {
   String CUB;
   String Titular;
   int Saldo;
   private CuentaClienteBanco Copia;

   public CuentaClienteBanco(String CUB, String Titular, int Saldo) {
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



public int getSaldo() {
	return Saldo;
}



public void setSaldo(int saldo) {
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
