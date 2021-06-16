package Biblioteca;



public class Socio extends Persona {

	private int telefono;

      /**
	 * Constructor Socio
	 * @param nombre Nombre de Socio
	 * @param edad Edad de Socio
         * @param telefono Telefono de Socio
	 */
    public Socio(String nombre, int edad,int telefono) {
        super(nombre, edad);
        this.telefono=telefono;
    }

    @Override
    public String toString() {
        return super.toString() +", telefono=" + telefono ;
    }

   

    /**
	 * 
	 * @return int con el numero de telefono
	 */
    public int getTelefono() {
        return telefono;
    }

   

   

	

	/**
	 * 
	 * @param telefono
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	

}