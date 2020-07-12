package co.edu.javeriana.cadenacines.negocio;

import java.util.Date;

public class FuncionDeGala extends Funcion{

	//-------------
	// Constantes
	//-------------


	//-------------
	// Atributos
	//-------------
	private boolean trajeDeEtiqueta;


	//-------------
	// Relaciones
	//-------------


	//-------------
	// Constructor
	//-------------
	/**
	 * Constructor de la función de gala.
	 * @param fechaDate
	 * @param pTarifaBase
	 */
	public FuncionDeGala( Date fechaDate, long pTarifaBase, Cine pCine) {
		super(fechaDate, pTarifaBase, pCine);
		trajeDeEtiqueta = true;

	}

	//-------------
	// Métodos
	//------------
	
	/**
	 *Obtener el estado del traje de etiqueta 
	 * @return
	 */
	public boolean isTrajeDeEtiqueta() {
		return trajeDeEtiqueta;
	}
	
	/**
	 * Establecer el estado del traje de etiqueta
	 * @param trajeDeEtiqueta
	 */
	public void setTrajeDeEtiqueta(boolean trajeDeEtiqueta) {
		this.trajeDeEtiqueta = trajeDeEtiqueta;
	}
	
	/**
	 * Calcular el valor de la boleta de una función de gala
	 */
	public long calcularValorBoleta() {
		long valorBoleta = 0;
		valorBoleta = tarifaBase*10;
		return valorBoleta;
	}

	/**
	 * Método toString de función de gala
	 */
	public String toString() {
		return "FuncionDeGala [trajeDeEtiqueta=" + trajeDeEtiqueta + super.toString() +"]";
	}

	/**
	 * Método para comparar id de la función
	 */
	public int compareTo(Funcion otraFuncion) {
		int respuesta = (int) (id - otraFuncion.getId());
		return respuesta;
	}
	
	
}
