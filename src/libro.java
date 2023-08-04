import java.util.Random;

public class libro extends CuentaClienteBanco {
    private int CodPrestamo;
    private Double MontoPrestamo;
    private boolean EstadoPrestamo;

    public libro(String CUB, String Titular, double Saldo, int CodPrestamo, Double MontoPrestamo, boolean EstadoPrestamo) {
        super(CUB, Titular, Saldo);
        this.setCodPrestamo(CodPrestamo);
        this.setMontoPrestamo(MontoPrestamo);
        this.setEstadoPrestamo(EstadoPrestamo);  
    }
    
    public libro(CuentaClienteBanco Cliente, int CodPrestamo, Double MontoPrestamo, boolean EstadoPrestamo) {
        super(Cliente);
        this.setCodPrestamo(CodPrestamo);
        this.setMontoPrestamo(MontoPrestamo);
        this.setEstadoPrestamo(EstadoPrestamo);  
    }

    public CuentaClienteBanco pretamoCliente (CuentaClienteBanco clienteAPrestar, double montoAPrestar)
    {
    	Random Codigo = new Random();
        int CodPrestamo = Codigo.nextInt(200000);
    	this.setCodPrestamo(CodPrestamo);
    	this.MontoPrestamo=montoAPrestar;
    	this.EstadoPrestamo=true;
		return clienteAPrestar;
    	
    }
    
    
	public int getCodPrestamo() {
		return CodPrestamo;
	}

	public void setCodPrestamo(int codPrestamo) {
		CodPrestamo = codPrestamo;
	}

	public Double getMontoPrestamo() {
		return MontoPrestamo;
	}

	public void setMontoPrestamo(Double montoPrestamo) {
		MontoPrestamo = montoPrestamo;
	}

	public boolean isEstadoPrestamo() {
		return EstadoPrestamo;
	}

	public void setEstadoPrestamo(boolean estadoPrestamo) {
		EstadoPrestamo = estadoPrestamo;
	}
	
	
	
}
