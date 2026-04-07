package GestionNomina;

public class EmpleadoVentas extends Empleado {

    private float totalVentas;
    private float porcentajeComision;

    
    public EmpleadoVentas(String nombre, String documento, int edad, float salarioBase, CategoriaEmpleado categoria,
            float descuentoSalud, float descuentoPension, float totalVentas, float porcentajeComision) {
        super(nombre, documento, edad, salarioBase, categoria, descuentoSalud, descuentoPension);
        this.totalVentas = totalVentas;
        this.porcentajeComision = porcentajeComision;
    }

    

    public float getTotalVentas() {
        return totalVentas;
    }



    public void setTotalVentas(float totalVentas) {
        this.totalVentas = totalVentas;
    }



    public float getPorcentajeComision() {
        return porcentajeComision;
    }



    public void setPorcentajeComision(float porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }



    public float calcularComision() {
        return totalVentas * porcentajeComision / 100f;
    }

    @Override
    public float calcularSalarioBruto() {
        return salarioBase
             + calcularCategoria()
             + calcularComision();
    }
}
