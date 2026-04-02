
public class Moto extends Vehiculo {
	private int cilindros;

	public Moto(String placa, String marca, String modelo, double costo_por_dia, int cilindros) {
		super(placa, marca, modelo, costo_por_dia);
		this.cilindros = cilindros;
	}

	public int getCilindros() {
		return cilindros;
	}

	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}

	public double calcularCostoRenta(int dias, Cliente cliente) {
		// Obtenemos el posible costo
		double costo = dias * costo_por_dia;
		System.out.println("El costo total es de $" + costo);
		return costo;
	}

	public String toString() {
		return "Moto: [Marca: " + marca + ", Modelo: " + modelo + ", Número de cilíndros: " + cilindros + ", Placa: "
				+ placa + ", Costo por dia: " + costo_por_dia + "]";
	}
}
