//modificacion para el ejercicio de entornos git
class TestCuentaBancaria
{
	public static void main(String args[])
	{
		CuentaBancaria cuenta = new CuentaBancaria("1234521","Director Banco",100,0);
		CuentaBancaria cuenta3= new CuentaBancaria("0987654","dante gennari",2000,0);
		System.out.println("Saldo = " + cuenta.getSaldo());
		cuenta.reintegro(50);
		cuenta.ingreso(100);
		System.out.println("Saldo es : " + cuenta.getSaldo());
	}
}
