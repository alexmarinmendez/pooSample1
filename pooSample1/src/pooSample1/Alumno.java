package pooSample1;

public class Alumno {

	// Atributos
	int codigo, nota1, nota2;
	String nombre;
	
	// Operaciones
	double promedio() {
		return (nota1 + nota2) / 2.0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno dina = new Alumno();
		dina.codigo = 1;
		dina.nombre = "Dina Boluarte";
		dina.nota1 = 12;
		dina.nota2 = 7;
		
		System.out.println("Los datos del alumno son:");
		System.out.println("Código: " + dina.codigo);
		System.out.println("Nombre: " + dina.nombre);
		System.out.println("Nota 1: " + dina.nota1);
		System.out.println("Nota 2: " + dina.nota2);
		System.out.println("Promedio: " + dina.promedio());
	}

}
