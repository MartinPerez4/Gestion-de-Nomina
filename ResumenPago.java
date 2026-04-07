package GestionNomina;

public record ResumenPago(
    String documento,
    String nombre,
    String tipoEmpleado,
    float salarioBruto,
    float descuentos,
    float salarioNeto
) {}