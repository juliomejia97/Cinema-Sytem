package co.edu.javeriana.cadenacines.negocio;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CadenaCines implements ICadenaCines{
	
	//-------------
	// Constantes
	//-------------

	//-------------
	// Atributos
	//-------------
	private String nombre; //Nombre de la cadena de cines 

	//-------------
	// Relaciones
	//-------------
	private List<CentroComercial> centrosComerciales; // Lista de centros comerciales de la cadena de cines
	private HashMap<Long, Pelicula> peliculas; // Lista de películas
	private List<Pelicula> peliculas2;
	private List<Cliente> clientes; // Lista de clientes de la cadena de cines

	//-------------
	// Constructor
	//-------------
	public CadenaCines(String pNombre)
	{
		nombre = pNombre;
		centrosComerciales = new LinkedList<CentroComercial>();
		peliculas = new HashMap<Long, Pelicula>();
		clientes = new LinkedList<Cliente>();
	}

	
	
	//-------------
	// Métodos
	//-------------
	/**
	 * Obtener el nombre de la cadena de cines
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Establecer el nombre de la cadena de cines
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Obtener la lista de centros comerciales
	 * @return
	 */
	public List<CentroComercial> getCentrosComerciales() {
		return centrosComerciales;
	}
	
	/**
	 * Establecer la lista de centros comerciales
	 * @param centrosComerciales
	 */
	public void setCentrosComerciales(List<CentroComercial> centrosComerciales) {
		this.centrosComerciales = centrosComerciales;
	}
	
	/**
	 * Obtener el map de películas
	 * @return
	 */
	public Map<Long, Pelicula> getPeliculas() {
		return peliculas;
	}
	
	/**
	 * Establecer el map de películas
	 * @param peliculas
	 */
	public void setPeliculas(HashMap<Long, Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	
	/**
	 * Obtener la lista de peliculas
	 * @return
	 */
	public List<Pelicula> getPeliculasList() {
		return peliculas2;
	}
	
	/**
	 * Obtener la lista de peliculas
	 * @param peliculas2
	 */
	public void setPeliculasList(List<Pelicula> peliculas2) {
		this.peliculas2 = peliculas2;
	}	
	
	/**
	 * Obtener la lista de clientes
	 * @return
	 */
	public List<Cliente> getClientes() {
		return clientes;
	}
	
	/**
	 * Establecer la lista de clientes
	 * @param clientes
	 */
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	/**
	 * Método toString
	 */
	public String toString() {
		return "CadenaCines [nombre=" + nombre + ", centrosComerciales=" + centrosComerciales + ", peliculas="
				+ peliculas + ", clientes=" + clientes + "]";
	}
	
	/**
	 * Agregar centro comercial a la lista
	 */
	public void agregarCentroComercial(CentroComercial centroNuevo) { 
		centrosComerciales.add(centroNuevo);
		Collections.sort(getCentrosComerciales());
	}

	/**
	 * Agregar cine a lista de un centro comercial
	 */
	public void agregarCine(List<Cine> nuevosCines, Cine nuevoCine) {
		nuevosCines.add(nuevoCine);
		Collections.sort(nuevosCines);
	}
	
	/**
	 * Agregar pelicula a la lista (HashMap)
	 */
	public void agregarPeliculaMap(Pelicula nuevaPelicula, long pCodigo) {
		Map<Long, Pelicula> peliculas  = getPeliculas();
		peliculas.put(pCodigo, nuevaPelicula);
	}
	
	/**
	 * Agregar pelicula a la lista
	 */
	public void agregarPeliculaList(Pelicula nuevaPelicula) {
		List<Pelicula> peliculas2 = getPeliculasList();
		peliculas2.add(nuevaPelicula);
		Collections.sort(peliculas2);
	}
	
	/**
	 * Agregar función de gala a una película.
	 */
	public void agregarFuncionGala(FuncionDeGala funcionAgregar, Pelicula peliculaFuncion, Cine cineFuncion) {
		List<Funcion> funcionesPelicula = peliculaFuncion.getFunciones();
		List<Funcion> funcionesCine = cineFuncion.getFunciones();
		funcionesPelicula.add(funcionAgregar);
		funcionesCine.add(funcionAgregar);
		
	}



	/**
	 * Agrega una función corriente a una película.
	 */
	public void agregarFuncionCorriente(FuncionCorriente funcionAgregar, Pelicula peliculaFuncion, Cine cineFuncion) {
		List<Funcion> funcionesPelicula = peliculaFuncion.getFunciones();
		List<Funcion> funcionesCine = cineFuncion.getFunciones();
		funcionesPelicula.add(funcionAgregar);
		funcionesCine.add(funcionAgregar);
	}

	/**
	 * Agrega un cliente de tipo miembro a la lista de clientes. 	 
	 */
	public void agregarClienteMiembro(ClienteMiembro clienteAgregar) {
		List<Cliente> clientes = getClientes();
		clientes.add(clienteAgregar);
		Collections.sort(clientes);
		
	}

	/**
	 * Agrega un cliente de tipo particular a la lista de clientes.
	 */
	public void agregarClienteParticular(ClienteParticular clienteAgregar) {
		List<Cliente> clientes = getClientes();
		clientes.add(clienteAgregar);
		Collections.sort(clientes);
	}

	/**
	 * Agrega una boleta comprada a la lista de boletas del cliente comprador.
	 */
	public void comprarBoleta(List<Boleta> boletasCliente, Boleta boletaAsignar) {
		boletasCliente.add(boletaAsignar);
		
	}
	
	/**
	 * Buscar un centro comercial mediante el nombre
	 * @param pNombre
	 * @return centroComercial
	 */
	public CentroComercial buscarCentroComercialNombre(String pNombre)
	{
		CentroComercial centroComercialRetornar = null;
		for(int i = 0; i < centrosComerciales.size(); i++)
		{
			CentroComercial ccActual = centrosComerciales.get(i);
			if(pNombre == ccActual.getNombre())
			{
				centroComercialRetornar = ccActual;
			}
		}
		return centroComercialRetornar;
	}
	
	/**
	 * Método que busca una sala por su nombre.
	 * @param pNombreSala - Nombre de la sala
	 * @param nuevosCines - Lista de las nuevas salas.
	 * @return Verdadero si la sala se encuentra, falso si la sala no se encuentra.
	 */
	public static boolean buscarNombreSala(String pNombreSala,List<Cine> nuevosCines) {
		boolean estado  = false;
		for(int i = 0; i < nuevosCines.size(); i++)
		{
			Cine actual = nuevosCines.get(i);
			if(pNombreSala == actual.getSala())
			{
				estado = true;
			}
		}
		return estado;
	}

	/**
	 * Método que busca un centro comercial por su nombre.
	 * @param pNombre - Nombre del centro comercial.
	 * @param centrosComerciales - Lista de centros comerciales.
	 * @return Verdadero si el centro comercial se encuentra, falso si el centro comercial no se encuentra.
	 */
	public static boolean buscarCentro(String pNombre)
	{
		List<CentroComercial> centrosComerciales = getCentrosComerciales();
		boolean estado = false;
		for(int i = 0; i < centrosComerciales.size(); i++)
		{
			CentroComercial actual = centrosComerciales.get(i);
			if(pNombre.equals(actual.getNombre()))
			{
				estado = true;
			}
		}
		return estado;
	}

	/**
	 * Método que busca un cliente por su nombre.
	 * @param pNombre - Nombre del cliente
	 * @param clientes - Lista de clientes.
	 * @return Verdadero si el cliente se encuentra, falso si el cliente no se encuentra.
	 */
	public static boolean buscarCliente(String pNombre, List<Cliente> clientes)
	{
		boolean encontrado = false;
		for(int i = 0; i < clientes.size(); i++)
		{
			Cliente actual = clientes.get(i);
			if(pNombre.equals(actual.getNombre()))
			{
				encontrado = true;
			}
		}
		return encontrado;
	}

	/**
	 * Método que busca una película por su nombre.
	 * @param pNombre - Nombre de la película.
	 * @param peliculas - Lista de películas.
	 * @return Verdadero si la película se encuentra, falso si la película no se encuentra.
	 */
	public static boolean buscarPelicula(String pNombre, Map<Long, Pelicula> peliculas)
	{
		boolean encontrado = false;
		for (Entry<Long, Pelicula> actual : peliculas.entrySet()) 
		{
			if(actual.getValue().getNombre() == pNombre)
			{
				encontrado = true;
			}
		}
		return encontrado;
	}

	/**
	 * Método que busca un cine por si ID.
	 * @param pId - ID del cine.
	 * @param cadena 
	 * @return El objeto de tipo Cine si se encuentra.
	 */
	public static Cine buscarCineId(long pId, CadenaCines cadena)
	{
		List<CentroComercial> centrosComerciales= cadena.getCentrosComerciales();
		Cine cineRetornar = null;
		for(int i = 0; i < centrosComerciales.size(); i++)
		{
			CentroComercial actualCC = centrosComerciales.get(i);
			for(int j = 0; j < actualCC.getCines().size(); j++){
				Cine cineActual = actualCC.getCines().get(j);
				if(cineActual.getId()== pId)
				{
					cineRetornar = cineActual;
				}
			}
		}
		return cineRetornar;
	}

	/**
	 * Método que busca un cine por una de sus funciones asignadas.
	 * @param pId 
	 * @param cadena
	 * @return El objeto de tipo Cine si se encuentra.
	 */
	public static Cine buscarCineFuncion(long pId, CadenaCines cadena)
	{
		List<CentroComercial> centrosComerciales = cadena.getCentrosComerciales();
		Cine cineRetornar = null;
		for(int i = 0; i < centrosComerciales.size(); i++)
		{
			CentroComercial actualCC = centrosComerciales.get(i);
			List<Cine> cines = actualCC.getCines();
			for(int j = 0; j < cines.size(); j++)
			{
				Cine actualCine = cines.get(j);
				List<Funcion> funciones = actualCine.getFunciones();
				for(int k = 0; k < funciones.size(); k++)
				{
					Funcion actualFuncion = funciones.get(k);
					if(pId == actualFuncion.getId())
					{
						cineRetornar = actualCine;
					}
				}
			}
		}
		return cineRetornar;
	}

	/**
	 * Método que busca un centro comercial por una de sus funciones asignadas.
	 * @param pId
	 * @param cadena
	 * @return El objeto CentroComercial si se encuentra.
	 */
	public static CentroComercial buscarCCFuncion(long pId, CadenaCines cadena)
	{
		List<CentroComercial> centrosComerciales = cadena.getCentrosComerciales();
		CentroComercial retornarCC = null;
		for(int i = 0; i < centrosComerciales.size(); i++)
		{
			CentroComercial actualCC = centrosComerciales.get(i);
			List<Cine> cines = actualCC.getCines();
			for(int j = 0; j < cines.size(); j++)
			{
				Cine actualCine = cines.get(j);
				List<Funcion> funciones = actualCine.getFunciones();
				for(int k = 0; k < funciones.size(); k++)
				{
					Funcion actualFuncion = funciones.get(k);
					if(pId == actualFuncion.getId())
					{
						retornarCC = actualCC;
					}
				}
			}
		}
		return retornarCC;
	}

	/**
	 * Método que busca una función por su ID.
	 * @param pId - ID de la función.
	 * @param cadena
	 * @return El objeto de tipo Función si se encuentra.
	 */
	public static Funcion buscarFuncionId(long pId, CadenaCines cadena)
	{
		Funcion funcionRetornar = null;
		List<CentroComercial> centrosComerciales = cadena.getCentrosComerciales();
		for(int i = 0; i < centrosComerciales.size(); i++)
		{
			CentroComercial actualCC = centrosComerciales.get(i);
			List<Cine> cines = actualCC.getCines();
			for(int j = 0; j < cines.size(); j++)
			{
				Cine actualCine = cines.get(j);
				List<Funcion> funciones = actualCine.getFunciones();
				for(int k = 0; k < funciones.size(); k++)
				{
					Funcion actualFuncion = funciones.get(k);
					if(pId == actualFuncion.getId())
					{
						funcionRetornar = actualFuncion;
					}
				}
			}
		}
		return funcionRetornar;
	}
}
