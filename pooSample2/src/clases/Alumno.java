package clases;

public class Alumno {
	// Atributos
	int codigo, nota1, nota2;
	String nombre;
	
	// Operaciones
	double promedio() {
		return (nota1 + nota2) / 2.0;
	}
}
