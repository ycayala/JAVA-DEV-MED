import java.util.TreeSet;

public class Banco implements servicioClientes{
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private TreeSet<Cliente> clientes;

    public Banco(String nombre, Domicilio domicilio, String rfc, String telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public TreeSet<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(TreeSet<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Banco{" + "\n" + "\t" +
                "nombre='" + nombre + '\'' + "\n" + "\t" +
                "domicilio='" + domicilio + '\'' + "\n" + "\t" +
                "rfc='" + rfc + '\'' + "\n" + "\t" +
                "telefono='" + telefono + '\'' + "\n" + "\t" +
                "clientes=" + clientes + "\n" + "\t" +
                '}';
    }


    @Override
    public boolean agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        return true;
    }

    @Override
    public boolean eliminarCliente(int numero) {
        Cliente clienteRemove = null;
        for (Cliente cliente: clientes){
            if (cliente.getNumero() == numero){
               clienteRemove = cliente;
               break;
            }
        }
        if (clienteRemove != null){
            clientes.remove(clienteRemove);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Cliente consultaCliente(int numero) {
        for (Cliente cliente: clientes){
            if (cliente.getNumero() == numero){
                return cliente;
            }
        }
        return  null;
    }

    @Override
    public TreeSet<Cliente> obtenerClientes() {
        return clientes;
    }

    @Override
    public Cliente buscarClientePorRFC(String rfc) {
        for (Cliente cliente: clientes){
            if (cliente.getRcf().equals(rfc)){
                return cliente;
            }
        }
        return  null;
    }
}
