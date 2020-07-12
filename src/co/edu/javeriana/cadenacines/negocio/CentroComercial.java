package co.edu.javeriana.cadenacines.negocio;

import java.util.LinkedList;
import java.util.List;

public class CentroComercial implements Comparable<CentroComercial>{
	
	//-------------
	// Constantes
	//-------------

	//-------------
	// Atributos
	//-------------
	private String nombre; // Nombre del centro comercial

	//-------------
	// Relaciones
	//-------------
	private List<Cine> cines;

	//-------------
	// Constructor
	//-------------
	/**
	 * Constructor de un centro comercial
	 * @param pNombre
	 */
	public CentroComercial(String pNombre)
	{
		nombre = pNombre;
		cines = new LinkedList<Cine>();
	}
	
	//-------------
	// Métodos
	//-------------
	/**
	 * Obtener el nombre del centro comercial 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Establecer el nombre del centro comercial
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Obtener la lista de cines del centro comercial
	 * @return cines
	 */
	public List<Cine> getCines() {
		return cines;
	}
	
	/**
	 * Establecer la lista de cines del centro comercial
	 * @param cines
	 */
	public void setCines(List<Cine> cines) {
		this.cines = cines;
	}

	/**
	 * Método toString de centro comercial
	 */
	public String toString() {
		return "CentroComercial [nombre=" + nombre + ", cines=" + cines + "]";
	}

	
	public int compareTo(CentroComercial otroCentro) {
		int respuesta = nombre.compareTo(otroCentro.getNombre());
		return respuesta;
	}
	

}
