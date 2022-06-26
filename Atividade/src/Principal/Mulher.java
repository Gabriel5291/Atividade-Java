package Principal;

class Mulher extends PessoaIMC {
	
	public Mulher(String setNome, String setDataNascimento, double setPeso, double setAltura) {
		super(setNome, setDataNascimento, setPeso, setAltura);
	}
	
	public void ResultIMC() {
		double m = 0;
		if (m < 19) {
			System.out.println("Abaixo do peso ideal");
		}
		else if (m > 25.8) {
			System.out.println("A do peso ideal");
		}
		else {
			System.out.println("Peso ideal");
		}
		
	}

}
