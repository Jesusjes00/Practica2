
public class Renta {
	private int dias_restantes;
	private double costo_total;
	private Vehiculo vehiculo;
	private Cliente cliente;

	public Renta(int days, Vehiculo auto, Cliente cliente) {
		this.dias_restantes = days;
		this.costo_total = 0;
		this.vehiculo = auto;
		this.cliente = cliente;
		this.costo_total = vehiculo.calcularCostoRenta(days, cliente);

	}

	public int getDias_restantes() {
		return dias_restantes;
	}

	public void setDias_restantes(int dias_restantes) {
		this.dias_restantes = dias_restantes;
	}

	public double getCosto_total() {
		return costo_total;
	}

	public void setCosto_total(double costo_total) {
		this.costo_total = costo_total;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	@Override
	public String toString() {
		return "Datos de la renta:\ndias restates:" + dias_restantes + "\nCosto total:" + costo_total;
	}

}
