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
	private long codigo; //C�digo de la pel�cula
	private String nombre; //Nombre de la pel�cula
	private String descripcion; //Descrici�n de la pel�cula
	//-------------
	// Relaciones
	//-------------
	private List<Funcion> funciones; // Lista de funciones asociadas a la pel�cula

	//-------------
	// Constructor
	//-------------
	/**
	 * Constructor de una pel�cula.
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
	// M�todos
	//-------------
	
	/**
	 * Obtener el c�digo de la pel�cula
	 * @return codigo
	 */
	public long getCodigo() {
		return codigo;
	}
	
	/**
	 * Establecer el c�digo de la pel�cula
	 * @param codigo
	 */
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Obtener el nombre de la pel�cula
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Establecer el nombre de la pel�cula
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Obtener la descripci�n de la pel�cula
	 * @return descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	
	/**
	 * Establecer la descripci�n de la pel�cula
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/**
	 * Obtener la lista de funciones de la pel�cula
	 * @return funciones
	 */
	public List<Funcion> getFunciones() {
		return funciones;
	}
	
	/**
	 * Establecer las funciones de la pel�cula
	 * @param funciones
	 */
	public void setFunciones(List<Funcion> funciones) {
		this.funciones = funciones;
	}

	/**
	 * M�todo para ordenar apartir del c�digo 
	 */
	public int compareTo(Pelicula otraPelicula) {
		int respuesta = (int) (codigo - otraPelicula.getCodigo());
		return respuesta;
	}

}
