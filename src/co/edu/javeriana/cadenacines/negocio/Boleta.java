package co.edu.javeriana.cadenacines.negocio;

public class Boleta {

	//-------------
	// Constantes
	//-------------
	private static long CONSECUTIVO = 0;


	//-------------
	// Atributos
	//-------------
	private boolean comprada; //Estado de la boleta
	private long idBoleta; // Id de la boleta
	private Cliente cliente; //Cliente asignado

	//-------------
	// Relaciones
	//-------------
	private Silla sillaBoleta; //Silla de la boleta asignada


	//-------------
	// Constructor
	//-------------
	/**
	 * Constructor de boleta
	 * @param pSilla
	 */
	public Boleta(Silla pSilla, Cliente pCliente)
	{
		CONSECUTIVO++;
		idBoleta = CONSECUTIVO;
		comprada = false;
		sillaBoleta = pSilla;
		setCliente(pCliente);
	}


	//-------------
	// Métodos
	//-------------
	
	/**
	 * Obtener el id de la boleta
	 * @return
	 */
	public long getIdBoleta() {
		return idBoleta;
	}

	/**
	 * Establecer el id de la boleta
	 * @param idBoleta
	 */
	public void setIdBoleta(long idBoleta) {
		this.idBoleta = idBoleta;
	}


	/**
	 * Obtener el estado de la boleta
	 * @return
	 */
	public boolean isComprada() {
		return comprada;
	}
	
	/**
	 * Establecer el estado de la boleta
	 * @param comprada
	 */
	public void setComprada(boolean comprada) {
		this.comprada = comprada;
	}
	
	/**
	 * Obtener la silla de la boleta
	 * @return
	 */
	public Silla getSillaBoleta() {
		return sillaBoleta;
	}
	
	/**
	 * Establecer la silla de la boleta
	 * @param sillaBoleta
	 */
	public void setSillaBoleta(Silla sillaBoleta) {
		this.sillaBoleta = sillaBoleta;
	}
	
	/**
	 * Método toString de Boleta
	 */
	public String toString() {
		return "Boleta [comprada=" + comprada + ", sillaBoleta=" + sillaBoleta + "]";
	}
	
	/**
	 * Obtener el cliente al que está asignada la boleta
	 * @return
	 */
	public Cliente getCliente() {
		return cliente;
	}
	
	/**
	 * Establecer el cliente al que está asignada la boleta
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

}
