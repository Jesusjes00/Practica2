
public abstract class Vehiculo implements Rentable {
	protected String placa;
	protected String marca;
	protected String modelo;
	protected double costo_por_dia;

	public Vehiculo(String placa, String marca, String modelo, double costo_por_dia) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.costo_por_dia = costo_por_dia;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCosto_por_dia() {
		return costo_por_dia;
	}

	public void setCosto_por_dia(double costo_por_dia) {
		this.costo_por_dia = costo_por_dia;
	}

}
