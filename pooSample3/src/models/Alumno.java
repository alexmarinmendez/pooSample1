package models;

public class Alumno {
	// Atributos
	public int codigo, nota1, nota2;
	public String nombre;
		
	// Operaciones
	public double promedio() {
		return (nota1 + nota2) / 2.0;
	}
}
