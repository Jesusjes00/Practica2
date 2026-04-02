
public class Coche extends Vehiculo {
	private String transmision;
	private int puertas;

	public Coche(String placa, String marca, String modelo, double costo_por_dia, String transmisión, int puertas) {
		super(placa, marca, modelo, costo_por_dia);
		this.transmision = transmisión;
		this.puertas = puertas;
	}

	public String getTransmisión() {
		return transmision;
	}

	public int getPuertas() {
		return puertas;
	}

	public double calcularCostoRenta(int dias, Cliente cliente) {
		// Obtenemos el posible costo
		double costo = dias * costo_por_dia;
		if (dias > 7) {
			System.out.println("Tiene descuento del 10%");
			costo = costo - (costo) / 10;
		}
		System.out.println("El costo total es de $" + costo);
		return costo;
	}

	public String toString() {
		return "Coche: [Marca: " + marca + ", Modelo: " + modelo + ", Transmisión: " + transmision
				+ ", Número de puertas: " + puertas + ", Placa: " + placa + ", Costo por dia: " + costo_por_dia + "]";
	}

}
