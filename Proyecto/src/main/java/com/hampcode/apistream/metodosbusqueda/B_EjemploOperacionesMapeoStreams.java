package com.hampcode.apistream.metodosbusqueda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class B_EjemploOperacionesMapeoStreams {
	public static void main(String[] args) {

		List<String> capitales = Arrays.asList("Ja�n", "C�rdoba", "Sevilla", "Huelva", "C�diz", "M�laga", "Granada",
				"Almer�a");

		// Obtenemos todas las capitales en may�sculas
		Stream<String> capitalesEnMayus = capitales.stream().map(String::toUpperCase);
		capitalesEnMayus.forEach(System.out::println);
		
		// Obtenemos las longitudes en caracteres de todas las capitales
		IntStream longitudCapitales = capitales.stream().mapToInt(String::length);
		longitudCapitales.forEach(System.out::println);

	}
}
