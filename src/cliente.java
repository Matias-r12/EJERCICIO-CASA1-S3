public class cliente {
    private String nombre;
    private String correo;
    private int edad;
    private double saldo;

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setCorreo(String correo) {
        if (correo != null && !correo.isEmpty()) {
            this.correo = correo;
        }
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }

    public int getEdad() {
        return this.edad;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }
}
