package co.edu.javeriana.cadenacines.negocio;

import java.util.ArrayList;
import java.util.List;

public class Cine implements Comparable<Cine>{

	//-------------
	// Constantes
	//-------------
	private static long CONSECUTIVO = 0; //Lleva conteo de cines

	//-------------
	// Atributos
	//-------------
	private long id; //Id del cine
	private String sala; //Nombre de la sala
	private long capacidad; //Capacidad de la sala o cine
	private CentroComercial centro;

	//-------------
	// Relaciones
	//-------------
	private List<Funcion> funciones; //Lista de funciones en un cine
	private List<Silla> sillas; //Lista de sillas que tiene un cine

	//-------------
	// Constructor
	//-------------
	/**
	 * Constructor de un cine
	 * @param pSala
	 * @param pCapacidad
	 */
	public Cine(String pSala, long pCapacidad, CentroComercial pCentro)
	{
		CONSECUTIVO++;
		id = CONSECUTIVO;
		sala = pSala;
		capacidad = pCapacidad;
		setCentroComercial(pCentro);
		funciones = new ArrayList<Funcion>();
		sillas = new ArrayList<Silla>();

	}
	//-------------
	// Métodos
	//-------------

	/**
	 * @return El Id del cine o sala
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param Id del cine o sala
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return Nombre de la sala o cine
	 */
	public String getSala() {
		return sala;
	}

	/**
	 * @param Nombre de la sala o cine
	 */
	public void setSala(String sala) {
		this.sala = sala;
	}

	/**
	 * @return La capacidad de la sala o cine
	 */
	public long getCapacidad() {
		return capacidad;
	}

	/**
	 * @param La capacidad de la sala o cine
	 */
	public void setCapacidad(long capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return Lista de funciones
	 */
	public List<Funcion> getFunciones() {
		return funciones;
	}

	/**
	 * @param Lista de funciones
	 */
	public void setFunciones(List<Funcion> funciones) {
		this.funciones = funciones;
	}

	/**
	 * @return Lista de sillas de sala o cine
	 */
	public List<Silla> getSillas() {
		return sillas;
	}

	/**
	 * @param Lista de sillas de sala o cine
	 */
	public void setSillas(List<Silla> sillas) {
		this.sillas = sillas;
	}

	/**
	 * Obtener el centro comercial al cua pertenece el cine
	 * @return
	 */
	public CentroComercial getCentroComercial() {
		return centro;
	}
	
	/**
	 * Establecer el centro comercial del cine
	 * @param centro
	 */
	public void setCentroComercial(CentroComercial centro) {
		this.centro = centro;
	}
	/**
	 * Método para organizar los cines por nombre
	 */
	public int compareTo(Cine otroCine) {
		int respuesta = sala.compareTo(otroCine.getSala());
		if(respuesta == 0)
		{
			respuesta = (int) (capacidad - otroCine.getCapacidad());
		}
		return respuesta;
	}




}
