class BalancoTrimestral{
	public static void main (String[] args){
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		double mediaMensal;
		
		System.out.println("Gastos no Trimestre: " + gastosTrimestre);
		
		mediaMensal = gastosTrimestre / 3;
		System.out.println("Média mensal no trimestre: " + mediaMensal);
	}
}