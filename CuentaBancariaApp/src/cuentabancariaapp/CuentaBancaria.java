/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package cuentabancariaapp;

public class CuentaBancaria {

    private int NumeroCuenta;
    private Integer DniCliente;
    private long SaldoActual;
    private int interes;
    private double IngresarDinero;
    private double RetirarDinero;
    private double ExtraccionRapida;
    private long ConsultarSaldo;
    private String ConsultarDatos;

    public CuentaBancaria() {

    }

    public CuentaBancaria(int NumeroCuenta, Integer DniCliente, long SaldoActual, int interes) {
        this.NumeroCuenta = NumeroCuenta;
        this.DniCliente = DniCliente;
        this.SaldoActual = SaldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public long getDniCliente() {
        return DniCliente;
    }

    public void setDniCliente(Integer DniCliente) {
        this.DniCliente = DniCliente;
    }

    public long getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(long SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public void IngresarDinero(double IngresarDinero) {
        this.IngresarDinero = IngresarDinero;

    }

    public double getIngresarDinero() {
        return IngresarDinero;
    }

    public void setIngresarDinero(double IngresarDinero) {
        this.IngresarDinero = IngresarDinero;
    }
    public void RetirarDinero(double RetirarDinero){
        this.RetirarDinero = RetirarDinero;
    }

    public double getRetirarDinero() {
        return RetirarDinero;
    }

    public void setRetirarDinero(double RetirarDinero) {
        this.RetirarDinero = RetirarDinero;
    }
    public void ExtraccionRapida(double ExtraccionRapida){
        this.ExtraccionRapida = ExtraccionRapida;
    }

    public double getExtraccionRapida() {
        return ExtraccionRapida;
    }

    public void setExtraccionRapida(double ExtraccionRapida) {
        this.ExtraccionRapida = ExtraccionRapida;
    }
    public void ConsultarSaldo(long ConsultarSaldo){
        this.ConsultarSaldo = ConsultarSaldo;
        
    }

    public long getConsultarSaldo() {
        return ConsultarSaldo;
    }

    public void setConsultarSaldo(long ConsultarSaldo) {
        this.ConsultarSaldo = ConsultarSaldo;
    }
    public void ConsultarDatos (String ConsultarDatos){
        this.ConsultarDatos = ConsultarDatos;
    }

    public String getConsultarDatos() {
        return ConsultarDatos;
    }

    public void setConsultarDatos(String ConsultarDatos) {
        this.ConsultarDatos = ConsultarDatos;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "NumeroCuenta=" + NumeroCuenta + ", DniCliente=" + DniCliente + ", SaldoActual=" + SaldoActual + ", interes=" + interes + ", IngresarDinero=" + IngresarDinero + ", RetirarDinero=" + RetirarDinero + ", ExtraccionRapida=" + ExtraccionRapida + ", ConsultarSaldo=" + ConsultarSaldo + ", ConsultarDatos=" + ConsultarDatos + '}';
    }
    
}
