package Principal;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Principal {
	
	public static void main(String[] args) {		
		
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		Scanner c = new Scanner(System.in);
		int e = 0, opc = 0, sexo = 0, tamLista = 0;
		Homem homem = new Homem("", "", 0, 0);
		Mulher mulher = new Mulher("", "", 0, 0);
		
		System.out.println("Digite o tamanho do array desejado:");
		tamLista = a.nextInt();
		PessoaIMC[] Lista  = new PessoaIMC [tamLista];
		
		
		do {
			
			System.out.println("-------------------------");
			System.out.println("   Escolha uma opção:\n");
			System.out.println("1- Inserir nova pessoa");
			System.out.println("2- Listar pessoas");
			System.out.println("3- Sair");
			System.out.println("-------------------------");
			
			opc = c.nextInt();
		switch (opc) {
			
			case 1:
				System.out.println("Selecione Homem ou Mulher:\n1- Homem\n2- Mulher");
				sexo = a.nextInt();
				
				switch (sexo) {
					case 1:
						System.out.println("Digite o nome:");
						homem.setNome(b.nextLine());
					
						System.out.println("Digite a data de nascimento:");
						homem.setDataNascimento(b.nextLine());
					
						System.out.println("Digite o peso:");
						homem.setPeso(c.nextDouble());
					
						System.out.println("Digite a altura:");
						homem.setAltura(c.nextDouble());
					
						Lista[e] = homem;
						e++;
						
						break;
					
					case 2: 
		
						System.out.println("Digite o nome:");
						mulher.setNome(b.nextLine());
						
						System.out.println("Digite a data de nascimento:");
						mulher.setDataNascimento(b.nextLine());
						
						System.out.println("Digite o peso:");
						mulher.setPeso(c.nextDouble());
						
						System.out.println("Digite a altura:");
						mulher.setAltura(c.nextDouble());
						
						Lista[e] = mulher;
						e++;
					
						break;
						
						
					case 3: 
						System.out.println("Opção inválida");
						
						break;
				}
				
				break;
			
			case 2: 
				if (homem != null) {
					System.out.println("Relação de pessoas no sistema: \n");
					System.out.println(homem.ToString());
					System.out.println("O IMC desta pessoa é: \n");
					homem.ResultIMC();
					System.out.println("\n");
				}
				if (mulher != null) {
					System.out.println("Relação de pessoas no sistema: \n");
					System.out.println(mulher.ToString());
					System.out.println("O IMC desta pessoa é: \n");
					mulher.ResultIMC();
					System.out.println("\n");
				}
				try { 	Thread.sleep(3000);  }
			        
                catch(Exception x)  {x.printStackTrace(); }
				
				break;
			
			case 3: 
				
				break;
			
			}

		}	
		
		
		while (opc != 3);
		
		a.close();
		b.close();
		c.close();
	}
}
