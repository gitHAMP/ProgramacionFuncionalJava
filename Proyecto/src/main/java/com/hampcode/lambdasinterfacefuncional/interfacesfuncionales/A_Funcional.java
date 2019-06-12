package com.hampcode.lambdasinterfacefuncional.interfacesfuncionales;

public class A_Funcional {

	public static void main(String[] args) {
		Matematicas o = (x, y) -> x + y;
		System.out.println(o.operacion(2, 3));

		// Antigua forma
		InvertirPalabra miInterface = new InvertirPalabra() {
			@Override
			public String invertir(String palabra) {
				String result = "";
				for (int i = palabra.length() - 1; i >= 0; i--) {
					result += palabra.charAt(i);
				}
				return result;
			}
		};
		System.out.println(miInterface.invertir("supercalifragilístico"));

		// Con java 8
		InvertirPalabra miInterface2 = (String palabra) -> {
			String result = "";
			for (int i = palabra.length() - 1; i >= 0; i--) {
				result += palabra.charAt(i);
			}
			return result;
		};
		System.out.println(miInterface2.invertir("supercalifragilístico"));
	}

}
