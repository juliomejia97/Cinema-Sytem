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
	protected long id; //Id de la función
	protected Date fecha; //Fecha de la función
	protected long tarifaBase; //Tarifa de la función
	private Cine cine;
	
	//-------------
	// Relaciones
	//-------------
	protected List<Boleta> boletas; //Boletas de la función

	//-------------
	// Constructor
	//-------------
	
	/**
	 * Constructor de una función
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
	// Métodos
	//-------------
	
	/**
	 * Calcular el valor la boleta según tipo de función
	 * @return
	 */
	public abstract long calcularValorBoleta();
	
	/**
	 * Obtener el id de la función
	 * @return
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * Establecer el id de la función
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * Obtener la fecha de la función
	 * @return
	 */
	public Date getFecha() {
		return fecha;
	}
	
	/**
	 * Establecer la fecha de la función
	 * @param fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	/**
	 * Obtener la tarifa base de la función
	 * @return
	 */
	public long getTarifaBase() {
		return tarifaBase;
	}
	
	/**
	 * Establecer la tarifa base de la función
	 * @param tarifaBase
	 */
	public void setTarifaBase(long tarifaBase) {
		this.tarifaBase = tarifaBase;
	}
	
	/**
	 * Obtener la lista de boletas de una función
	 * @return
	 */
	public List<Boleta> getBoletas() {
		return boletas;
	}
	
	/**
	 * Establecer la lista de boletas de una función
	 * @param boletas
	 */
	public void setBoletas(List<Boleta> boletas) {
		this.boletas = boletas;
	}

	/**
	 * Método toString de función
	 */
	public String toString() {
		return "Funcion [id=" + id + ", fecha=" + fecha + ", tarifaBase=" + tarifaBase + ", boletas=" + boletas + "]";
	}
	
	/**
	 * Obtener el cine de la función
	 * @return
	 */
	public Cine getCine() {
		return cine;
	}

	/**
	 * Establecer el cine de la función
	 * @param cine
	 */
	public void setCine(Cine cine) {
		this.cine = cine;
	}
	
	
}
