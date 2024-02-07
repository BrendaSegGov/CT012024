package ejemploJava;

public class DemoVehiculo {

	public static void main(String[] args) {
		
		Vehiculo minivan = new Vehiculo ();
		
		int rango;
		
		//Asignar los valores a los campos de minivan
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		//Calccular el rango asumiendo un tanque lleno
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un range de " + rango + " kilometros" );
		
		Vehiculo carro = new Vehiculo();
		carro.pasajeros = 4;
		System.out.println(" Numero de pasajeros en carro es: " + carro.pasajeros );
		
	}

}
