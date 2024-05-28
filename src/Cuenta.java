import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Cuenta implements Comparable<Cuenta>{
    private int numero;
    private String fechaApertura;
    private double saldo;
    private String fechaCancelacion;

    public Cuenta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        fechaApertura = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-YY"));
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(String fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }


    @Override
    public String toString() {
        return "Cuenta{" + "\n"+ "\t"+
                "numero=" + numero + "\n"+ "\t"+
                "fechaApertura='" + fechaApertura + '\'' + "\n"+ "\t"+
                "saldo=" + saldo + "\n"+ "\t"+
                "fechaCancelacion='" + fechaCancelacion + '\'' + "\n"+ "\t"+
                '}';
    }

    @Override
    public int compareTo(Cuenta cuenta) {
        return Double.compare(saldo, cuenta.getSaldo());
    }

}
