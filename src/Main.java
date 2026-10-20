public class Main{
    static void main(){
        cliente cliente = new cliente();
        cliente.setNombre("Ana");
        cliente.setCorreo("ana@correo.com");
        
        cliente.setEdad(-5);
        cliente.setSaldo(-100);

        System.out.println("Edad almacenada (debe ser 0 por defecto): " + cliente.getEdad());
        System.out.println("Saldo almacenado (debe ser 0.0 por defecto): " + cliente.getSaldo());

    }
}
