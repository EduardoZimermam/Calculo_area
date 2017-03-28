import java.util.Scanner;

class formGeo
class circulo{

	Scanner in = new Scanner(System.in);

	double leCirc(){
		double raio;

		System.out.println("\n\n\n\n\nDigite o raio do circulo: ");
		raio = in.nextDouble();

		return(raio);
	}

	void areaCirc(double raio){
		double pi = 3.1416;
		double area = pi *(raio*raio);
	}
}

class quadrado{

	Scanner in = new Scanner(System.in);

	double leQuad(){
		double lado;
	
		System.out.println("\n\n\n\n\nDigite o lado do quadrado: ");
		lado = in.nextDouble();

		return(lado);
	}

	void areaQuad(double lado){

		double area = lado * lado;
	}
}

class retangulo{

	Scanner in = new Scanner(System.in);

	double areaRet(double base, double altura){

		return(base*altura);
	}

	void leRet(){
		double base, altura, area;

		System.out.println("\n\n\n\n\nDigite a base do retangulo: ");
		base = in.nextDouble();

		System.out.println("\nDigite o lado do quadrado: ");
		altura = in.nextDouble();

		area = areaRet(base, altura);
	}	
}


class areaGeo{
	public static void main(String args[]){

		int opcao = 1;
		Scanner in = new Scanner(System.in);

		while (opcao != 0){
			System.out.println("1 - Para calcular a área do circulo.");
			System.out.println("2 - Para calcular a área do quadrado.");
			System.out.println("3 - Para calcular a área do retângulo.\n\n");
			System.out.println("0 - Para sair.\n\n\n");
			System.out.println("Digite a opção desejada:");
			opcao = in.nextInt();

			if (opcao == 1){
				circulo objCirc = new circulo();

				objCirc.areaCirc(objCirc.leCirc());
			}else if (opcao == 2){
				quadrado objQuad = new quadrado();

				objQuad.areaQuad(objQuad.leQuad());
			}else if (opcao == 3){
				retangulo objRet = new retangulo();

				objRet.leRet();
			}
		}
	}
}