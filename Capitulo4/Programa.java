class Programa{
	public static void main(String[] args){
		Conta minhaConta = new Conta();
		
		minhaConta.setNomeDono("Pl�nio");
		minhaConta.depositar(100);
		
		System.out.println("Saldo atual: " + minhaConta.consultaSaldo());
	}
}