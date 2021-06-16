package Biblioteca;



public class Trabajador extends Persona {

	private int salario;

        /**
	 * Constructor Trabajador
	 * @param nombre Nombre de Trabajador
	 * @param edad Edad de Trabajador
         * @param salario Edad de persona
	 */
    public Trabajador(String nombre, int edad,int salario) {
        super(nombre, edad);
        this.salario=salario;
    }

    @Override
    public String toString() {
        
        return super.toString()+ ", salario=" + salario;
    }

       /**
	 * 
	 * @return int con el salario
	 */
    public int getSalario() {
        return salario;
    }

   

	/**
	 * 
	 * @param salario
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}

	/**
	 * 
	 * @param nombre
	 * @param edad
	 * @param salario
	 */
	

}