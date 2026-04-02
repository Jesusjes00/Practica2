import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Agencia agencia = new Agencia();
		Scanner scan = new Scanner(System.in);
		System.out.println("Hola Digita tu nombre:");
		String nombre_cliente = scan.nextLine();
		// scan.nextInt();
		int op = 0;
		System.out.println("Bievenido " + nombre_cliente + " a " + agencia.getNombre());

		// Inicio del ciclo principal
		do {// Selección de menú
			System.out.println("\nQue quieres hacer");
			System.out.println(
					"(1).Ver vehiculos\n(2).Crear una renta\n(3).Consultar rentas\n(4).Avanzar dias\n(5).Salir");
			System.out.println("\nDigite alguna opción:");
			op = scan.nextInt();
			scan.nextLine();

			switch (op) {
			// Ver vehículos
			case 1:
				System.out.println("Ver Vehiculos\n");
				agencia.verVehiculos(true);
				break;

			// Crear Renta
			case 2:
				System.out.println("Crear una renta");
				System.out.println("\nVehiculos disponibles\n");
				agencia.verVehiculos(false);

				System.out.println("Digite el índice del vehículo que quiere rentar:");
				int index_carro = scan.nextInt();

				System.out.println("Digite (1) si es una persona // Digite (2) si es una empresa");
				int op_cliente = scan.nextInt();
				scan.nextLine();

				Cliente cliente;// Creamos Clientes
				// es persona
				if (op_cliente == 1) {
					System.out.println("Digite su nombre:");
					String Nombre = scan.nextLine();
					System.out.println("Digite su apellido:");
					String Apellido = scan.nextLine();
					System.out.println("Digite su número de telefono:");
					String Telefono = scan.nextLine();
					System.out.println("Digite su edad:");
					int edad = scan.nextInt();
					if (edad < 18) {
						System.out.println("Renta cancelada.\nUn menor de edad no puede rentar un vehículo.");
						break;
					}
					cliente = new Persona(Nombre, Apellido, Telefono, edad);
				} else { // Es empresa
					System.out.println("Digite el nombre de la empresa:");
					String Nombre_Empresa = scan.nextLine();
					System.out.println("Digite el telefono de la empresa:");
					String Telefono_Empresa = scan.nextLine();
					System.out.println("\n---Persona de Contacto---\n");

					// Persona de contacto
					System.out.println("Digite su nombre:");
					String Nombre = scan.nextLine();
					System.out.println("Digite su apellido:");
					String Apellido = scan.nextLine();
					System.out.println("Digite su número de telefono:");
					String Telefono = scan.nextLine();
					System.out.println("Digite su edad:");
					int edad = scan.nextInt();
					if (edad < 18) {
						System.out.println("Renta cancelada.\nUn menor de edad no puede hacer una renta.");
						break;
					}
					Persona contacto = new Persona(Nombre, Apellido, Telefono, edad);

					cliente = new Empresa(Nombre_Empresa, Telefono_Empresa, contacto);
				}

				int dias;

				do {
					System.out.println("Digite cuántos días va a rentar el vehículo: ");
					dias = scan.nextInt();
					if (dias <= 0) {
						System.out.println(
								"**Error, debe rentar el vehículo por lo menos un día. Inténtelo de nuevo**\n");
					}
				} while (dias <= 0);

				agencia.crearRenta(index_carro, dias, cliente);
				break;

			// Consultar rentas
			case 3:
				System.out.println("Ver Rentas Activas\n");
				agencia.consultarRentas();
				break;

			// Avanzar días
			case 4:
				System.out.println("Avanzar tiempo");
				agencia.avanzarDia();
				break;

			// Finalizar el programa
			case 5:
				System.out.println("Vuelva Pronto:)");
				scan.close();
				break;

			// Otro
			default:
				System.out.println("**Error, selección fuera del rango**\n");

			}

		} while (op != 5);

	}

}
