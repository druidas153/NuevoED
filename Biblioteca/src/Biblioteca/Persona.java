package Biblioteca;



public class Persona {

	protected String nombre;
	protected int edad;

    @Override
    public String toString() {
        return  "nombre=" + nombre + ", edad=" + edad  ;
    }

    /**
	 * 
	 * @return String Devuelve el nombre
	 */
    public String getNombre() {
        return nombre;
    }

    /**
	 * 
	 * @return int Devuelve el valor de la edad
	 */
    public int getEdad() {
        return edad;
    }


	/**
	 * 
	 * @param nombre Nombre de persona a cambiar
	 */
	public void setNombre(int nombre) {
		// TODO - implement Persona.setNombre
		throw new UnsupportedOperationException();
	}


	/**
	 * 
	 * @param edad Edad de la persona a cambiar
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}



	/**
	 * Constructor
	 * @param nombre Nombre de persona
	 * @param edad Edad de persona
	 */
	public Persona(String nombre, int edad) {
		// TODO - implement Persona.Persona
		throw new UnsupportedOperationException();
	}

}