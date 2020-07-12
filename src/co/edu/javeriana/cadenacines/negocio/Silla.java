package co.edu.javeriana.cadenacines.negocio;

public class Silla implements Comparable<Silla> {
	
	//-------------
	// Constantes
	//-------------
	
	//-------------
	// Atributos
	//-------------
	private String fila; //Fila a la que pertenece la silla
	private int numero; // Número de la silla a la que pertenece la silla
	private TipoSilla tipoSilla;
	//-------------
	// Relaciones
	//-------------


	//-------------
	// Constructor
	//-------------
	/**
	 * Constructor de una silla
	 * @param pFila
	 * @param pNumero
	 * @param pTipo
	 */
	public Silla(String pFila, int pNumero, String pTipo)
	{
		fila = pFila;
		numero = pNumero;
		if(pTipo.equalsIgnoreCase("normal"))
		{
			setTipoSilla(TipoSilla.NORMAL);
		}else if(pTipo.equalsIgnoreCase("primera"))
		{
			setTipoSilla(TipoSilla.PRIMERA);
		}
	}
	

	//-------------
	// Métodos
	//-------------
	
	/**
	 * Obtener la fila de la silla
	 * @return
	 */
	public String getFila() {
		return fila;
	}
	
	/**
	 * Establecer la fila de la silla
	 * @param pfila
	 * @return 
	 */
	public void setFila(String pfila) {
		fila = pfila;
	}
	
	/** Obtener el número de la fila de la silla
	 * 
	 * @return
	 */
	public int getNumero() {
		return numero;
	}
	
	/**
	 * Establecer el número de la fila de la silla
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	/**
	 * Obtener el tipo de silla
	 * @return
	 */
	public TipoSilla getTipoSilla() {
		return tipoSilla;
	}

	/**
	 * Establecer el tipo de silla
	 * @param tipoSilla
	 */
	public void setTipoSilla(TipoSilla tipoSilla) {
		this.tipoSilla = tipoSilla;
	}
	
	

	/**
	 * Método toString
	 */
	public String toString() {
		return "Silla [fila=" + fila + ", numero=" + numero + ", tipoSilla=" + tipoSilla + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	/**
	 * Ordenar silla según la fila;
	 * Si es la misma fila, entonces, se ordena por número
	 * @param o
	 * @return
	 */
	public int compareTo(Silla otraSilla) {
		int respuesta = fila.compareTo(otraSilla.getFila());
		if(respuesta == 0)
		{
			respuesta = numero - otraSilla.getNumero();
		}
		return respuesta;
	}

	
}
