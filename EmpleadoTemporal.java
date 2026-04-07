package GestionNomina;

public class EmpleadoTemporal extends Empleado {

    private int   diasTrabajados;
    private float valorDia;

    

    public EmpleadoTemporal(String nombre, String documento, int edad, float salarioBase, CategoriaEmpleado categoria,
            float descuentoSalud, float descuentoPension, int diasTrabajados, float valorDia) {
        super(nombre, documento, edad, salarioBase, categoria, descuentoSalud, descuentoPension);

        this.diasTrabajados = diasTrabajados;
        this.valorDia = valorDia;
    }

    

    public int getDiasTrabajados() {
        return diasTrabajados;
    }



    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }



    public float getValorDia() {
        return valorDia;
    }



    public void setValorDia(float valorDia) {
        this.valorDia = valorDia;
    }



    public float calcularPagoDias() {
        return diasTrabajados * valorDia;
    }
     @Override
    public float calcularSalarioBruto() {
        return calcularPagoDias() + calcularCategoria();
    }


}