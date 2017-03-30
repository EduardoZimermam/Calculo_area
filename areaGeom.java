import java.util.Scanner;

class formGeo{

	double area;
	Scanner in = new Scanner(System.in);

	public double imprimeArea(){

		System.out.println("\n\n\nA área da forma geométrica é: " +area+ "\n\n\n");

		return(0);
	}
}

class circulo extends formGeo{

	double leCirc(){
		double raio;

		System.out.println("\n\n\n\nDigite o raio do circulo: ");
		raio = in.nextDouble();

		return(raio);
	}

	void areaCirc(){
		double raio = leCirc();

		area = Math.PI *(raio*raio);
	}
}

class quadrado extends formGeo{

	double leQuad(){
		double lado;

		System.out.println("\n\n\n\n\nDigite o lado do quadrado: ");
		lado = in.nextDouble();

		return(lado);
	}

	void areaQuad(){
		double lado = leQuad();

		area = lado * lado;
	}
}

class retangulo extends formGeo{

	double base, altura;

	void leRet(){

		System.out.println("\n\n\n\n\nDigite a base do retângulo: ");
		base = in.nextDouble();

		System.out.println("\nDigite a altura do retângulo: ");
		altura = in.nextDouble();
	}

	void areaRet(){

		leRet();
		area = base * altura;

	}
}

class areaGeo{
	public static void main(String args[]){

		int opcao = 1;
		Scanner in = new Scanner(System.in);

		System.out.println("1 - Para calcular a área do circulo.");
		System.out.println("2 - Para calcular a área do quadrado.");
		System.out.println("3 - Para calcular a área do retângulo.\n\n");
		System.out.println("0 - Para sair.\n\n\n");
		System.out.println("Digite a opção desejada:");
		opcao = in.nextInt();

		switch (opcao){
			case 1:
				circulo objCirc = new circulo();

				objCirc.areaCirc();
				objCirc.imprimeArea();

				break;

			case 2:
				quadrado objQuad = new quadrado();

				objQuad.areaQuad();
				objQuad.imprimeArea();

				break;

			case 3:
				retangulo objRet = new retangulo();

				objRet.areaRet();
				objRet.imprimeArea();

				break;

			default:
				System.out.println("Opção inválida!!");
		}
	}
}
