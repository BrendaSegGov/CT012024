package ejemploJava;

public class Ejemplo_Array_Unidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[];
		int[] intarray2;
		
		// Declarar un arreglo de strings
		double doublearray[];
		
		String[] arr;
		// Asignar memoria para 5 strings
		arr = new String[5];
		
		arr[0] = "cero";
		
		arr[1] = "uno";
		
		arr[2] = "dos";
		
		arr[3] = "tres";
		
		arr[4] = "cuatro";
		
		System.out.println("El valor del arreglo es: " + arr[3]);
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Elemento en el indice: " + i +  ": " + arr[i]);
		}
		// ejemplo de arreglo con enteros
		int [] intArr = new int[] {1,2,3,4,5,6,7,8};

	}

}
