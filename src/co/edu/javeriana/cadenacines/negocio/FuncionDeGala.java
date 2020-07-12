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
	 * Constructor de la funci�n de gala.
	 * @param fechaDate
	 * @param pTarifaBase
	 */
	public FuncionDeGala( Date fechaDate, long pTarifaBase, Cine pCine) {
		super(fechaDate, pTarifaBase, pCine);
		trajeDeEtiqueta = true;

	}

	//-------------
	// M�todos
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
	 * Calcular el valor de la boleta de una funci�n de gala
	 */
	public long calcularValorBoleta() {
		long valorBoleta = 0;
		valorBoleta = tarifaBase*10;
		return valorBoleta;
	}

	/**
	 * M�todo toString de funci�n de gala
	 */
	public String toString() {
		return "FuncionDeGala [trajeDeEtiqueta=" + trajeDeEtiqueta + super.toString() +"]";
	}

	/**
	 * M�todo para comparar id de la funci�n
	 */
	public int compareTo(Funcion otraFuncion) {
		int respuesta = (int) (id - otraFuncion.getId());
		return respuesta;
	}
	
	
}
