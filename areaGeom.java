import java.util.Scanner;

class formGeo{

	double area;
	Scanner in = new Scanner(System.in);

	class circulo extends formGeo{

		double leCirc(){
			double raio;

			System.out.println("\n\n\n\n\nDigite o raio do circulo: ");
			raio = in.nextDouble();

			return(raio);
		}

		void areaCirc(double raio){
			double area = Math.PI *(raio*raio);
		}
	}

	class quadrado extends formGeo{

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

	class retangulo extends formGeo{

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

			switch (opcao){
				case 1:
					formGeo objCirc = new circulo();

					break;

				case 2:
					formGeo objQuad = new quadrado();

					break;

				case 3:
					formGeo objRet = new retangulo();

					break;

				default:
					println("Opção inválida!!");
			}
		}
	}
}