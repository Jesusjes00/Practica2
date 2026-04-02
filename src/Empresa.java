
public class Empresa extends Cliente {
	private String nombre;
	private String telefono;
	private Persona contacto;

	public Empresa(String nombre, String telefono, Persona contacto) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.contacto = contacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Persona getContacto() {
		return contacto;
	}

	public void setContacto(Persona contacto) {
		this.contacto = contacto;
	}

	@Override
	public String toString() {
		return "Nombre de la Empresa:" + nombre + " Telefono:" + telefono + "\nContacto:\n" + contacto;
	}

}
