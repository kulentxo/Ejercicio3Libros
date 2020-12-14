package com.ejercicio3.mf0227.accesodatos;

import java.util.TreeMap;

import com.ejercicio3.mf0227.pojo.Usuario;

public class UsuarioDaoTreeMap {
	private UsuarioDaoTreeMap() {
		Usuario p1 = new Usuario("administrador", "123456", 1L);
		usuarios.put(1, p1);

	}

	private final static UsuarioDaoTreeMap INSTANCIA = new UsuarioDaoTreeMap();

	public static UsuarioDaoTreeMap getInstancia() {
		return INSTANCIA;
	}

	private TreeMap<Integer, Usuario> usuarios = new TreeMap<Integer, Usuario>();

	public Iterable<Usuario> listar() {
		return usuarios.values();
	}

	public Usuario recuperar(int id) {
		return usuarios.get(id);
	}

	public void crear(Usuario objeto) {
		Long id = (long) (usuarios.lastKey() != null ? usuarios.lastKey() + 1 : 1);
		objeto.setId(id);
		usuarios.put(id.intValue(), objeto);
	}

	public void modificar(Usuario objeto) {
		usuarios.put(objeto.getId().intValue(), objeto);
	}

	public void eliminar(int id) {
		usuarios.remove(id);
	}

	public Usuario validarEmail(String email) {
		for (Usuario u : usuarios.values()) {
			if (u.getEmail().equals(email)) {
				return u;
			}
		}
		return null;
	}

}
