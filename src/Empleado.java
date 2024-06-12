public class Empleado {

    private String nombre;
    private int salario;

    public Empleado(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public void calcularSalarioNeto(double impuesto){
        salario *=  impuesto;
    }

    public void calcularSalarioNeto(double impuesto, double impuestoExtra){
        salario *= (impuesto + impuestoExtra);
    }

    public void agregarBonificacion(double bonificacion){
        salario += bonificacion;
    }

    public void mostrarInformacion(){
        System.out.println("informacion del empleado:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario base: " + salario);
    }







}
