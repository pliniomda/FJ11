class Conta{
	private int numero;
	private String dono;
	private double saldo = 0;
	private double limite;
	
	private Conta(){
		this(0, "", 0);
	}
	
	public Conta(int numero, String nome, double limite){
		this.numero = numero;
		this.dono = nome;
		this.saldo = 0;
		this.limite = limite;
	}
	
	public void sacar(double quantidade){
		this.saldo -= quantidade;
	}
	
	public void depositar(double quantidade){
		this.saldo += quantidade;
	}
	
	public void imprimeNomeDono(){
		System.out.println("O dono desta conta é: " + dono);
	}
	
	public double consultaSaldo(){
		return this.saldo;
	}
	
	public void transfereOutraConta(Conta contaDest, double quantidade){
		this.sacar(quantidade);
		contaDest.depositar(quantidade);
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}

	public void setNomeDono(String nomeDono){
		this.dono = nomeDono;
	}

	public void setLimite(double limite){
		this.limite = limite;
	}

	/*
	if(this.saldo < quantidade){
		System.out.println("O saldo não é suficiente para esta operação.");
	}
	*/
}