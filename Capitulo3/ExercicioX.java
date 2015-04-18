class ExercicioX{
	static long fib(long n){
		/*
		if(n < 2){
			return n;
		}else{
			return fib(n - 1) + fib(n - 2);
		}
		*/
		return(n < 2) ? n : fib(n - 1) + fib(n - 2);
	}
	
	public static void main (String[] args){
		int i;
		/*
		//NÚMEROS DE 150 A 300
		for(i = 150; i <= 300; i++){
			System.out.print(i + ",");
		}
		
		//SOMA DE 1 A 1000
		int soma = 0;
		for(i = 1; i <= 1000; i++){
			soma += i;
		}
		System.out.println("A soma de 1 a 1000 é :" + soma);
		
		//MÚLTIPLOS DE 3
		for(i = 1; i <= 1000; i++){
			int resto = i % 3;
			if(resto == 0){
				System.out.println("Múltiplo de 3, de 1 a 100: " + i);
			}
		}
		
		//FATORIAL
		int fatorial = 1;
		for(i = 1; i <= 10; i++){
			fatorial *= i;
			System.out.println("O fatorial de " + i + " é: " + fatorial);
		}
		*/
		
		//FIBONACCI
		int maxFibonacci = 40;
		for(i = 0; i <= maxFibonacci; i++){
			System.out.println("(" + i + ") :" + fib(i));
		}
	}
}
