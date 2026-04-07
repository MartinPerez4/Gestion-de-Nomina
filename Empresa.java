package GestionNomina;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }


    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }


    public Empleado buscarEmpleado(String documento) {
        for (Empleado empleado : empleados) {
            if (empleado.getDocumento().equals(documento)) {
                return empleado;
            }
        }
        return null;
    }

    
}