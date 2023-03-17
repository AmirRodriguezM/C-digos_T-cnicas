public class Banco {
    private String nombre;
    private double saldo;

    public Banco(String name, double sal){
        this.nombre = name;
        this.saldo = sal;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
