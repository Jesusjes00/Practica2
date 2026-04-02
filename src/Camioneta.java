
public class Camioneta extends Vehiculo {
	private String transmision;
	private int pasajeros;

	public Camioneta(String placa, String marca, String modelo, double costo_por_dia, String transmision,
			int pasajeros) {
		super(placa, marca, modelo, costo_por_dia);
		this.transmision = transmision;
		this.pasajeros = pasajeros;
	}

	public String getTransmisión() {
		return transmision;
	}

	public void setTransmisión(String transmisión) {
		this.transmision = transmisión;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	public double calcularCostoRenta(int dias, Cliente cliente) {
		// Obtenemos el posible costo
		double costo = dias * costo_por_dia;
		if (cliente instanceof Empresa) {
			System.out.println("Tiene descuento del 20%");
			costo = costo - (costo * 20) / 100;
		}
		System.out.println("El costo total es de $" + costo);

		return costo;
	}

	public String toString() {
		return "Camioneta: [Marca: " + marca + ", Modelo: " + modelo + ", Transmisión: " + transmision
				+ ", Número de pasajeros: " + pasajeros + ", Placa: " + placa + ", Costo por dia: " + costo_por_dia
				+ "]";
	}
}
