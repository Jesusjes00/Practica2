
public class Persona extends Cliente {
	// Atributos
	private String nombre;
	private String apellidos;
	private String telefono;
	private int edad;

	public Persona(String name, String lastname, String phone, int age) {
		this.nombre = name;
		this.apellidos = lastname;
		this.telefono = phone;
		this.edad = age;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Nombre:" + nombre + " Apellido:" + apellidos + " Telefono:" + telefono + " edad:" + edad;
	}

}
