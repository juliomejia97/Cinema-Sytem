package co.edu.javeriana.cadenacines.negocio;

import java.util.LinkedList;
import java.util.List;
public abstract class Cliente implements Comparable<Cliente>{

	//-------------
	// Constantes
	//-------------
	protected static long CONSECUTIVO = 0; //Lleva la cuenta de cuantos clientes va

	//-------------
	// Atributos
	//-------------
	protected long id; //Id del cliente
	protected String nombre; //Nombre del cliente
	protected String email; //Email del cliente

	//-------------
	// Relaciones
	//-------------
	protected List<Boleta> boletas; //Lista de boletas de un cliente

	//-------------
	// Constructor
	//-------------
	/**
	 * Constructor de un cliente
	 * @param pNombre
	 * @param pEmail
	 */
	public Cliente(String pNombre, String pEmail)
	{
		CONSECUTIVO++;
		id = CONSECUTIVO;
		nombre = pNombre;
		email = pEmail;
		boletas = new LinkedList<Boleta>();
	}
	//-------------
	// Métodos
	//-------------
	
	/**
	 * Obtener el Id del cliente
	 * @return Id del cliente
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * Establecer el id del cliente
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * Obtener el nombre del cliente
	 * @return Nombre del cliente
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Establecer el nombre del cliente
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Obtener el email del cliente
	 * @return emailCliente
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Establecer el email del cliente
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Obtener lista de boletas del cliente
	 * @return List<Boleta>
	 */
	public List<Boleta> getBoletas() {
		return boletas;
	}

	/**
	 * Establecer las boletas del cliente
	 * @param boletas
	 */
	public void setBoletas(List<Boleta> boletas) {
		this.boletas = boletas;
	}
	/**
	 * Calcular valor de una boleta por cliente
	 * @return
	 */
	public abstract long valorBoleta(long valorFuncion,Boleta boletaCliente);

	/**
	 * Método toString de cliente
	 */
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", email=" + email + ", boletas=" + boletas + "]";
	}

}
