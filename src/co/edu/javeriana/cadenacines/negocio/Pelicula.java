package co.edu.javeriana.cadenacines.negocio;

import java.util.LinkedList;
import java.util.List;

public class Pelicula implements Comparable<Pelicula>{

	//-------------
	// Constantes
	//-------------

	//-------------
	// Atributos
	//-------------
	private long codigo; //Código de la película
	private String nombre; //Nombre de la película
	private String descripcion; //Descrición de la película
	//-------------
	// Relaciones
	//-------------
	private List<Funcion> funciones; // Lista de funciones asociadas a la película

	//-------------
	// Constructor
	//-------------
	/**
	 * Constructor de una película.
	 * @param pCodigo
	 * @param pNombre
	 * @param pDescripcion
	 */
	public Pelicula(long pCodigo, String pNombre, String pDescripcion)
	{
		codigo = pCodigo;
		nombre = pNombre;
		descripcion = pDescripcion;
		funciones = new LinkedList<Funcion>();
	}

	//-------------
	// Métodos
	//-------------
	
	/**
	 * Obtener el código de la película
	 * @return codigo
	 */
	public long getCodigo() {
		return codigo;
	}
	
	/**
	 * Establecer el código de la película
	 * @param codigo
	 */
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Obtener el nombre de la película
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Establecer el nombre de la película
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Obtener la descripción de la película
	 * @return descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	
	/**
	 * Establecer la descripción de la película
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/**
	 * Obtener la lista de funciones de la película
	 * @return funciones
	 */
	public List<Funcion> getFunciones() {
		return funciones;
	}
	
	/**
	 * Establecer las funciones de la película
	 * @param funciones
	 */
	public void setFunciones(List<Funcion> funciones) {
		this.funciones = funciones;
	}

	/**
	 * Método para ordenar apartir del código 
	 */
	public int compareTo(Pelicula otraPelicula) {
		int respuesta = (int) (codigo - otraPelicula.getCodigo());
		return respuesta;
	}

}
