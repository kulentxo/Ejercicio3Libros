package com.ejercicio3.mf0227.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.ejercicio3.mf0227.pojo.Libro;

public class LibroConsola {
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
		} while ("S" != opc.toUpperCase());

	}

	private static void borrarLibro(Scanner sc, ArrayList<Libro> libros) {
		System.out.printf("%15s %6s %9s %15s \n", "Nombre", "Precio", "Descuento", "Autor");
		for (Libro libro : libros) {
			System.out.printf("%15s %6d %9d %15s \n", libro.getNombre(), libro.getPrecio().intValue(),
					libro.getDescuento().intValue(), libro.getAutor());
		}
		try {
			System.out.println("Introduce la posicion de libro(Teniendo en cuenta que el primero es 0)");
			int opc = Integer.parseInt(sc.nextLine());
			libros.remove(opc);
			System.out.println("El libro ha sido borrado");
		} catch (Exception e) {
			System.out.println("El id introducido debe ser numerico");
		}

	}

	private static void insertarLibro(Scanner sc, ArrayList<Libro> libros, Long idLibro) {
		Libro l = new Libro();
		String id, nombre, autor, imagen, precio, descuento;
		do {
			System.out.println("Introduce un Id");
			id = sc.nextLine();
			l.setId(id);
			if (!l.isCorrecto()) {
				System.out.println(l.getErrorId());
			}
		} while (l.isCorrecto() == false);
		do {
			System.out.println("Introduce un nombre");
			nombre = sc.nextLine();
			l.setNombre(nombre);
			if (!l.isCorrecto()) {
				System.out.println(l.getErrorNombre());
			}
		} while (l.isCorrecto() == false);
		do {
			System.out.println("Introduce un autor");
			autor = sc.nextLine();
			l.setAutor(autor);
			if (!l.isCorrecto()) {
				System.out.println(l.getErrorAutor());
			}
		} while (l.isCorrecto() == false);
		do {
			System.out.println("Introduce un imagen");
			imagen = sc.nextLine();
			l.setImagen(imagen);
			if (!l.isCorrecto()) {
				System.out.println(l.getErrorImagen());
			}
		} while (l.isCorrecto() == false);

		do {
			System.out.println("Introduce un precio");
			precio = sc.nextLine();
			l.setPrecio(precio);
			if (!l.isCorrecto()) {
				System.out.println(l.getErrorPrecio());
			}
		} while (l.isCorrecto() == false);

		do {
			System.out.println("Introduce un descuento");
			descuento = sc.nextLine();
			l.setDescuento(descuento);
			if (!l.isCorrecto()) {
				System.out.println(l.getErrorDescuento());
			}
		} while (l.isCorrecto() == false);
		libros.add(l);
		System.out.println("Libro añadido");
	}

	private static void pintarMenu() {
		System.out.println("********************Menu de opciones*********************");
		System.out.println("1.-Insertar libro");
		System.out.println("2.-Borrar libro");
		System.out.println("S.-Salir de la aplicacion");
		System.out.println("*********************************************************");
	}

}
