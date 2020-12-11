package ejercicio3.pojo;

import java.math.BigDecimal;

public class Libro {
	private Long id;
	private String nombre;
	private BigDecimal precio;
	private Long descuento;
	private String autor;
	private String imagen;

	private boolean correcto = true;

	private String errorId;
	private String errorNombre;
	private String errorPrecio;
	private String errorDescuento;
	private String errorAutor;
	private String errorImagen;

	public Libro() {
		super();
	}

	public Libro(String id, String nombre, String precio, String descuento, String autor, String imagen) {
		setId(id);
		setNombre(nombre);
		setPrecio(precio);
		setDescuento(descuento);
		setAutor(autor);
		setImagen(imagen);
	}

	public Long getId() {
		return id;
	}

	public void setId(String id) {
		// TODO mirar porque devuelve null en la pantalla
		Long id1;
		try {
			id1 = Long.parseLong(id);
			if (id1 != null && id1 < 0) {
				setErrorId("El id no puede ser inferior o igual a 0");
			} else {
				correcto = true;
				this.id = id1;
			}

		} catch (Exception e) {
			setErrorId("El id debe ser un numero");
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (!(nombre.trim().length() > 2 && nombre.trim().length() < 150)) {
			setErrorNombre("El nombre tiene que contener entre 2 y 150 caracteres");
		}
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		BigDecimal precio1;
		try {
			precio1 = new BigDecimal(precio);
			if ((precio1.compareTo(new BigDecimal("0")) < 0) || !precio.matches("^\\d{1,3}(\\.\\d{1,2})?$")) {
				setErrorPrecio("El precio no puede ser menor a 0 y tiene que contener 2 decimales");
			} else {
				correcto = true;
				this.precio = precio1;
			}

		} catch (Exception e) {
			setErrorPrecio("El precio debe de ser un numero");
		}

	}

	public Long getDescuento() {
		return descuento;
	}

	public void setDescuento(String descuento) {
		Long descuento1;
		try {
			descuento1 = Long.parseLong(descuento);
			if (descuento1 >= 0 && descuento1 <= 100) {
				correcto = true;
				this.descuento = descuento1;
			} else {
				setErrorDescuento("El descuento debe estar entre 0 y 100");
			}
		} catch (Exception e) {
			setErrorDescuento("El descuento debe de ser un numero");
		}
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor == "" || autor == null) {
			autor = "anonimo";
		} else {
			this.autor = autor;
		}
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public boolean isCorrecto() {
		return correcto;
	}

	public void setCorrecto(boolean correcto) {
		this.correcto = correcto;
	}

	public String getErrorId() {
		return errorId;
	}

	public void setErrorId(String errorId) {
		correcto = false;
		this.errorId = errorId;
	}

	public String getErrorNombre() {
		return errorNombre;
	}

	public void setErrorNombre(String errorNombre) {
		correcto = false;
		this.errorNombre = errorNombre;
	}

	public String getErrorPrecio() {
		return errorPrecio;
	}

	public void setErrorPrecio(String errorPrecio) {
		correcto = false;
		this.errorPrecio = errorPrecio;
	}

	public String getErrorDescuento() {
		return errorDescuento;
	}

	public void setErrorDescuento(String errorDescuento) {
		correcto = false;
		this.errorDescuento = errorDescuento;
	}

	public String getErrorAutor() {
		return errorAutor;
	}

	public void setErrorAutor(String errorAutor) {
		correcto = false;
		this.errorAutor = errorAutor;
	}

	public String getErrorImagen() {
		return errorImagen;
	}

	public void setErrorImagen(String errorImagen) {
		correcto = false;
		this.errorImagen = errorImagen;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((descuento == null) ? 0 : descuento.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((imagen == null) ? 0 : imagen.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((precio == null) ? 0 : precio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (descuento == null) {
			if (other.descuento != null)
				return false;
		} else if (!descuento.equals(other.descuento))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (imagen == null) {
			if (other.imagen != null)
				return false;
		} else if (!imagen.equals(other.imagen))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (precio == null) {
			if (other.precio != null)
				return false;
		} else if (!precio.equals(other.precio))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", descuento=" + descuento + ", autor="
				+ autor + ", imagen=" + imagen + "]";
	}

}
