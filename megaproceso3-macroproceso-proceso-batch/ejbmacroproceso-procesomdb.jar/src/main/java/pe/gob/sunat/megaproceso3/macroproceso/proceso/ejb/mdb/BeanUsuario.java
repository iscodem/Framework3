package pe.gob.sunat.megaproceso3.macroproceso.proceso.ejb.mdb;

public class BeanUsuario{

	private Integer codigo;
	private String  nombres;
	private String  apellidos;
	private String  edad;
	private String  dni;
	private String  telefono;
	private String  cumpleanos;
	private String  email;

	//Constructores ... 
	public BeanUsuario(){}
	
	public BeanUsuario( Integer codigo, String nombres, String apellidos,
			            String edad, String dni, String telefono, 
			            String cumpleanos, String email ){
		super();
		this.codigo     = codigo;
		this.nombres    = nombres;
		this.apellidos  = apellidos;
		this.edad       = edad;
		this.dni        = dni;
		this.telefono   = telefono;
		this.cumpleanos = cumpleanos;
		this.email      = email;
	}

	public Integer getCodigo(){
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCumpleanos() {
		return cumpleanos;
	}

	public void setCumpleanos(String cumpleanos) {
		this.cumpleanos = cumpleanos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

