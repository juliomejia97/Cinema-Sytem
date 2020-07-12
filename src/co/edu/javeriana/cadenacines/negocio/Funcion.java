package co.edu.javeriana.cadenacines.negocio;

import java.util.List;
import java.util.Date;
import java.util.LinkedList;

public abstract class Funcion implements Comparable<Funcion>{
	
	//-------------
	// Constantes
	//-------------
	protected static long CONSECUTIVO = 0; //Lleva cuentas de funcion creada
	

	//-------------
	// Atributos
	//-------------
	protected long id; //Id de la funci�n
	protected Date fecha; //Fecha de la funci�n
	protected long tarifaBase; //Tarifa de la funci�n
	private Cine cine;
	
	//-------------
	// Relaciones
	//-------------
	protected List<Boleta> boletas; //Boletas de la funci�n

	//-------------
	// Constructor
	//-------------
	
	/**
	 * Constructor de una funci�n
	 * @param fechaDate
	 * @param pTarifaBase
	 */
	public Funcion(Date fechaDate, long pTarifaBase, Cine pCine)
	{
		CONSECUTIVO++;
		id = CONSECUTIVO;
		fecha = fechaDate;
		tarifaBase = pTarifaBase;
		boletas = new LinkedList<Boleta>();
		setCine(pCine);
	}
	//-------------
	// M�todos
	//-------------
	
	/**
	 * Calcular el valor la boleta seg�n tipo de funci�n
	 * @return
	 */
	public abstract long calcularValorBoleta();
	
	/**
	 * Obtener el id de la funci�n
	 * @return
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * Establecer el id de la funci�n
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * Obtener la fecha de la funci�n
	 * @return
	 */
	public Date getFecha() {
		return fecha;
	}
	
	/**
	 * Establecer la fecha de la funci�n
	 * @param fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	/**
	 * Obtener la tarifa base de la funci�n
	 * @return
	 */
	public long getTarifaBase() {
		return tarifaBase;
	}
	
	/**
	 * Establecer la tarifa base de la funci�n
	 * @param tarifaBase
	 */
	public void setTarifaBase(long tarifaBase) {
		this.tarifaBase = tarifaBase;
	}
	
	/**
	 * Obtener la lista de boletas de una funci�n
	 * @return
	 */
	public List<Boleta> getBoletas() {
		return boletas;
	}
	
	/**
	 * Establecer la lista de boletas de una funci�n
	 * @param boletas
	 */
	public void setBoletas(List<Boleta> boletas) {
		this.boletas = boletas;
	}

	/**
	 * M�todo toString de funci�n
	 */
	public String toString() {
		return "Funcion [id=" + id + ", fecha=" + fecha + ", tarifaBase=" + tarifaBase + ", boletas=" + boletas + "]";
	}
	
	/**
	 * Obtener el cine de la funci�n
	 * @return
	 */
	public Cine getCine() {
		return cine;
	}

	/**
	 * Establecer el cine de la funci�n
	 * @param cine
	 */
	public void setCine(Cine cine) {
		this.cine = cine;
	}
	
	
}
