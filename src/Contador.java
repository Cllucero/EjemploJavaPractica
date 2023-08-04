
public class Contador {
	CuentaClienteBanco CopiaContador;
	double saldoActual;
	double montoModificar;
	
	
	public Contador (CuentaClienteBanco clienteOriginal)
	{
	
		CopiaContador.CUB=clienteOriginal.CUB;
		CopiaContador.Saldo=clienteOriginal.Saldo;
		CopiaContador.Titular=clienteOriginal.Titular;
	}
	
	public CuentaClienteBanco ContIncrementar (CuentaClienteBanco CuentaCliente, double monto)
	{
	//Cuenta=CuentaCliente;
		montoModificar =this.saldoActual;
	if (monto>=0)
		{
		CuentaCliente.Saldo=CuentaCliente.getSaldo()+monto;
		}
	else
		{
		System.out.println("Este metodo solo permite Incrementar, usted quiere Descrementar");
		}
	return CuentaCliente;
	}
	
	public CuentaClienteBanco ContDecrementar (CuentaClienteBanco CuentaCliente, double monto)
	{
	//Cuenta=CuentaCliente;
		montoModificar =this.saldoActual;
	if (monto<0)
		{
		CuentaCliente.Saldo=CuentaCliente.getSaldo()+monto;
		}
	else
		{
		System.out.println("Este metodo solo permite Decrementar, usted quiere Incrementar");
		}
	return CuentaCliente;
	}
	
	
	
	
	
	public Contador() {
		// TODO Auto-generated constructor stub
	}

	public double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}

	public double getMontoModificar() {
		return montoModificar;
	}

	public void setMontoModificar(double montoModificar) {
		this.montoModificar = montoModificar;
	}

	
		
}
