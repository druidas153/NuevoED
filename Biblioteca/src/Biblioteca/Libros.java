package Biblioteca;

public class Libros {

	private String li_nombre;
	private String editorial;
	private int ano;
	private String autor;
	private boolean prestado;

	
	/**
	 * 
	 * @param li_nombre
	 */
	public void setLi_nombre(int li_nombre) {
		// TODO - implement Libros.setLi_nombre
		throw new UnsupportedOperationException();
	}

	
	/**
	 * 
	 * @param editorial
	 */
	public void setEditorial(int editorial) {
		// TODO - implement Libros.setEditorial
		throw new UnsupportedOperationException();
	}

	

	/**
	 * 
	 * @param ano
	 */
	public void setano(int ano) {
		this.ano = ano;
	}

    @Override
    public String toString() {
        return "Libros{" + "li_nombre=" + li_nombre + ", editorial=" + editorial + ", ano=" + ano + ", autor=" + autor + ", prestado=" + prestado + '}';
    }

	
	/**
	 * 
	 * @param autor
	 */
	public void setAutor(int autor) {
		// TODO - implement Libros.setAutor
		throw new UnsupportedOperationException();
	}

        /**
	 * 
	 * @return String con el nombre 
	 */
    public String getLi_nombre() {
        return li_nombre;
    }

     /**
	 * 
	 * @return String con la editorial
	 */
    public String getEditorial() {
        return editorial;
    }

     /**
	 * 
	 * @return int con el año
	 */
    public int getAno() {
        return ano;
    }

     /**
	 * 
	 * @return String con el autor
	 */
    public String getAutor() {
        return autor;
    }

    /**
	 * 
	 * @return boolean Devuelve si esta prestado
	 */
    public boolean isPrestado() {
        return prestado;
    }

	

	/**
	 * 
	 * @param prestado
	 */
	public void setPrestado(int prestado) {
		// TODO - implement Libros.setPrestado
		throw new UnsupportedOperationException();
	}

	/**
	 * Constructor de Libros
	 * @param li_nombre
	 * @param editorial
	 * @param ano
	 * @param autor
	 * @param prestado
	 */
	public Libros(String li_nombre, String editorial, int ano, String autor, boolean prestado) {
		// TODO - implement Libros.Libros
		throw new UnsupportedOperationException();
	}

}