package ejercicio3.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class libroConsola {
	// TODO mirar si hace falta poner excepciones
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long idLibro = 0L;
		ArrayList<Libro> libros = new ArrayList<Libro>();
		String opc = "";
		do {
			pintarMenu();
			opc = sc.nextLine();
			switch (opc) {
			case "1":
				insertarLibro(sc, libros, idLibro);
				break;
			case "2":
				borrarLibro(sc, libros);
				break;
			}
		} while ("S" != opc);

	}

	private static void borrarLibro(Scanner sc, ArrayList<Libro> libros) {
		System.out.printf("%15s %6s %9s %15s \n", "Nombre", "Precio", "Descuento", "Autor");
		for (Libro libro : libros) {
			System.out.printf("%15s %6d %9d %15s \n", libro.getNombre(), libro.getPrecio().intValue(),
					libro.getDescuento().intValue(), libro.getAutor());
		}
		System.out.println("Introduce la posicion de libro(Teniendo en cuenta que el primero es 0)");
		int opc = Integer.parseInt(sc.nextLine());
		libros.remove(opc);
		System.out.println("El libro ha sido borrado");
	}

	private static void insertarLibro(Scanner sc, ArrayList<Libro> libros, Long idLibro) {
		Libro l;
		String nombre, autor, imagen;
		BigDecimal precio;
		Long descuento;
		do {
			System.out.println("Introduce el nombre del libro");
			nombre = sc.nextLine();
		} while (nombre.length() <= 2 || nombre.length() >= 150);
		try {
			do {
				System.out.println("Introduce el precio del libro");
				precio = new BigDecimal(sc.nextLine());
			} while (precio.compareTo(new BigDecimal("0")) == 1);
			do {
				System.out.println("Inserta el descuento que tenga el libro");
				descuento = Long.parseLong(sc.nextLine());
			} while (descuento < 0 || descuento > 100);
			System.out.println("Inserta el autor del libro");
			autor = sc.nextLine();
			if (autor == "" || autor == null) {
				autor = "anonimo";
			}
			System.out.println("Inserta la imagen del libro");
			imagen = sc.nextLine();
			if (!libros.isEmpty()) {
				idLibro += 1L;
				l = new Libro(idLibro, nombre, precio, descuento, autor, imagen);
				libros.add(l);
			} else {
				l = new Libro(idLibro, nombre, precio, descuento, autor, imagen);
				libros.add(l);
			}

		} catch (Exception e) {
			System.out.println("Error");
		}

	}

	private static void pintarMenu() {
		System.out.println("********************Menu de opciones*********************");
		System.out.println("1.-Insertar libro");
		System.out.println("2.-Borrar libro");
		System.out.println("S.-Salir de la aplicacion");
		System.out.println("*********************************************************");
	}

}
