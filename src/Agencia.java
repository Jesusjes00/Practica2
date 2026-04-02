import java.util.ArrayList;

public class Agencia {
	private String nombre;
	private Vehiculo[] vehiculo = new Vehiculo[8];
	private ArrayList<Renta> renta = new ArrayList<>();

	public Agencia() {
		this.nombre = "AutoMove";
		vehiculo[0] = new Coche("ABF-472", "Chevrolet", "Aveo", 1199.99, "Manual", 4);
		vehiculo[1] = new Coche("KLM-905", "Volkswagen", "Golf", 1399.99, "Automático", 4);
		vehiculo[2] = new Coche("TRX-318", "Mercedes", "Maybach", 7999.99, "Manual", 4);
		vehiculo[3] = new Camioneta("YHG-662", "Nissan", "Kicks", 1599.99, "Manual", 5);
		vehiculo[4] = new Camioneta("PQR-741", "Honda", "CR-V", 1799.99, "Automático", 7);
		vehiculo[5] = new Camioneta("VBN-289", "Toyota", "Tacoma", 2499.99, "Manual", 5);
		vehiculo[6] = new Moto("84J-K2", "Italika", "250Z", 699.99, 1);
		vehiculo[7] = new Moto("19M-R7", "Kawazaki", "Ninja ZX-10R", 2999.99, 4);

	}

	// está disponible
	public boolean estaDisponible(String placa, ArrayList<Renta> renta) {

		for (Renta R : renta) {
			if (placa.equalsIgnoreCase(R.getVehiculo().getPlaca())) {
				return true; // Esta Rentado
			}
		}
		return false; // No esta Rentado
	}

	// Ver vehículo
	public void verVehiculos(boolean estado) {
		if (estado) {

			for (int i = 0; i < 8; i++) {
				boolean disponible = estaDisponible(vehiculo[i].getPlaca(), renta);
				System.out.println("[" + i + "]" + vehiculo[i] + " \n   " + "Rentado: " + disponible);
			}

		} else {
			for (int i = 0; i < 8; i++) {
				boolean disponible = estaDisponible(vehiculo[i].getPlaca(), renta);
				if (disponible == false) {
					System.out.println("[" + i + "]" + vehiculo[i] + " \n   " + "Rentado: " + disponible);
				}

			}

		}
	}

	// Crear Renta
	public int crearRenta(int indice, int dias, Cliente cliente) {
		// Primero buscamos si es posible rentar el vehiculo
		if (indice < 0 || indice > 7) {
			System.out.println("**Digite un numero dentro del rango disponible**");
			return 1;
		}

		boolean disponible = estaDisponible(vehiculo[indice].getPlaca(), renta);
		if (disponible == true) {
			System.out.println("El vehiculo que usted quiere ya está rentado :(");
			return 2;
		}

		// Crear la renta
		renta.add(new Renta(dias, vehiculo[indice], cliente));
		System.out.println("El vehiculo se rentó con exito");
		return 0;
	}

	// Consultar rentas
	public void consultarRentas() {
		for (Renta R : renta) {
			// Obtenemos a cliente y vehiculo
			Vehiculo temporal = R.getVehiculo();
			Cliente temporal_2 = R.getCliente();
			System.out.println("------Renta------:\n" + R
					+ "\n------------------Dato del vehiculo----------------------:\n" + temporal
					+ "\n-------------------Datos del cliente---------------:\n" + temporal_2 + "\n");

		}
	}

	public void avanzarDia() {
		System.out.println("\n----Pasó un día----\n");
		// Buscamos el 0 al momento de agregar el dia en las rentas
		int c = 0;
		for (int i = 0; i < renta.size(); i++) {
			int dias_restantes = renta.get(i).getDias_restantes();
			dias_restantes--;
			if (dias_restantes == 0) {
				System.out.println("Renta: " + (c + 1) + ") La renta expiró");
				renta.remove(i);
				i--;
			} else {
				renta.get(i).setDias_restantes(dias_restantes);
				System.out.println("Renta: " + (c + 1) + ") Se Mantiene dentro del rango de días restantes");
			}
			c++;

		}

	}

	public String getNombre() {
		return nombre;
	}

}
