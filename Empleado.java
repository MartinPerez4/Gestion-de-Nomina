package GestionNomina;

public abstract class Empleado {
    protected String nombre;
    protected String documento;
    protected int edad;
    protected float salarioBase;
    protected CategoriaEmpleado categoria;
    protected float descuentoSalud;
    protected float descuentoPension;


    public Empleado(String nombre, String documento, int edad, float salarioBase, CategoriaEmpleado categoria,
            float descuentoSalud, float descuentoPension) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.categoria = categoria;
        this.descuentoSalud = descuentoSalud;
        this.descuentoPension = descuentoPension;
    }

    public abstract float calcularSalarioBruto();

    public float calcularCategoria() {
        if (categoria == CategoriaEmpleado.JUNIOR) {
        return salarioBase * 0.05f;
    } else if (categoria == CategoriaEmpleado.SEMI_SENIOR) {
        return salarioBase * 0.10f;
    } else {
        return salarioBase * 0.15f;
    }
  }
   public float calcularDescuentos() {
        float bruto = calcularSalarioBruto();
        return bruto * (descuentoSalud / 100f) + bruto * (descuentoPension / 100f);
    }

     public float calcularSalarioNeto() {
        return calcularSalarioBruto() - calcularDescuentos();
    }

     public String getNombre() {
         return nombre;
     }

     public void setNombre(String nombre) {
         this.nombre = nombre;
     }

     public String getDocumento() {
         return documento;
     }

     public void setDocumento(String documento) {
         this.documento = documento;
     }

     public int getEdad() {
         return edad;
     }

     public void setEdad(int edad) {
         this.edad = edad;
     }

     public float getSalarioBase() {
         return salarioBase;
     }

     public void setSalarioBase(float salarioBase) {
         this.salarioBase = salarioBase;
     }

     public CategoriaEmpleado getCategoria() {
         return categoria;
     }

     public void setCategoria(CategoriaEmpleado categoria) {
         this.categoria = categoria;
     }

     public float getDescuentoSalud() {
         return descuentoSalud;
     }

     public void setDescuentoSalud(float descuentoSalud) {
         this.descuentoSalud = descuentoSalud;
     }

     public float getDescuentoPension() {
         return descuentoPension;
     }

     public void setDescuentoPension(float descuentoPension) {
         this.descuentoPension = descuentoPension;
     }

    
    
}
