package ejercicio3.pojo;

import java.math.BigDecimal;

public class Libro {
	private Long id;
	private String nombre;
	private BigDecimal precio;
	private Long descuento;
	private String autor;
	private String imagen;

	public Libro(Long id, String nombre, BigDecimal precio, Long descuento, String autor, String imagen) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.descuento = descuento;
		this.autor = autor;
		this.imagen = imagen;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws Exception {
		if (nombre.length() >= 2 || nombre.length() <= 150) {
			this.nombre = nombre;
		} else {
			throw new Exception("El texto tiene que estar entre 2 y 150 caracteres");
		}
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) throws Exception {
		if (precio.compareTo(new BigDecimal(0)) == 1) {
			this.precio = precio;
		} else {
			throw new Exception("El precio debe ser mayor que cero");
		}
	}

	public Long getDescuento() {
		return descuento;
	}

	public void setDescuento(Long descuento) throws Exception {
		if (descuento >= 0 || descuento <= 100) {
			this.descuento = descuento;
		} else {
			throw new Exception("El descuento debe estar entre 0 y 100");
		}
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor == "" || autor == null) {
			this.autor = "anonimo";
		} else {
			this.autor = autor;
		}
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		// TODO nose como hacer por ahora
		this.imagen = imagen;
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
