public class CuentaDeAhorro extends Cuenta{

    private double tasaInteresMensual;

    public CuentaDeAhorro(int numero, double saldo, double tasaInteresMensual) {
        super(numero, saldo);
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public double calcularInteres(){
        return 0;
    }

    @Override
    public String toString() {
        return "CuentaDeAhorro{" +
                "tasaInteresMensual=" + tasaInteresMensual +
                "} " + "\t" +super.toString();
    }



}
