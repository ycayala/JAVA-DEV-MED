import java.util.ArrayList;

public class Cliente implements servicioCuentas, Comparable <Cliente> {
    private int numero;
    private String nombre;
    private Domicilio Domicilio;
    private String rcf;
    private String telefono;
    private ArrayList<Cuenta> cuentas;
    private String fechaNacimiento;

    public Cliente(int numero, String nombre, Domicilio domicilio, String rcf, String telefono, String fechaNacimiento) {
        this.numero = numero;
        this.nombre = nombre;
        Domicilio = domicilio;
        this.rcf = rcf;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        Domicilio = domicilio;
    }

    public String getRcf() {
        return rcf;
    }

    public void setRcf(String rcf) {
        this.rcf = rcf;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "\n"+ "\t"+
                "numero=" + numero + "\n"+ "\t"+
                "nombre='" + nombre + '\'' + "\n"+ "\t"+
                "Domicilio='" + Domicilio + '\'' + "\n"+ "\t"+
                "rcf='" + rcf + '\'' + "\n"+ "\t"+
                "telefono='" + telefono + '\'' + "\n"+ "\t"+
                "cuentas=" + cuentas + "\n"+ "\t"+
                "fechaNacimiento='" + fechaNacimiento + '\'' + "\n"+ "\t"+
                '}';
    }

    @Override
    public boolean agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
        return true;
    }

    @Override
    public boolean cancelarCuenta(int numero) {
        Cuenta cuentaRemove = null;
        for (Cuenta cuenta : cuentas) {
            if(cuenta.getNumero() == numero){
                cuentaRemove = cuenta;
                break;
            }
        }
        if (cuentaRemove != null){
            cuentas.remove(cuentaRemove);
            return true;
        }else{
            return false;
        }

    }

    @Override
    public void abonarCuenta(int numero, double abono) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero() == numero) {
                cuenta.setSaldo(cuenta.getSaldo() + abono);
                //System.out.println("Saldo abonado... su nuevo saldo es: "+cuenta.getSaldo());
                return;
            }
        }

    }

    @Override
    public void retirar(int numero, double retiro) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero() == numero) {
                if (cuenta.getSaldo() > retiro){
                    cuenta.setSaldo(cuenta.getSaldo() - retiro);
                    //System.out.println("Saldo retirado... su nuevo saldo es: "+cuenta.getSaldo());
                }
                return;
            }
        }
    }

    @Override
    public ArrayList<Cuenta> obtenerCuentas() {
        return cuentas;
    }

    @Override
    public int compareTo(Cliente cliente) {
        return Integer.compare(numero, cliente.getNumero());
    }
}
