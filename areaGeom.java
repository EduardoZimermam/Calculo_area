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

		void areaCirc(){
			double raio = leCirc();

			double area = Math.PI *(raio*raio);
		}
	}

	public class quadrado extends formGeo{

		double leQuad(){
			double lado;
	
			System.out.println("\n\n\n\n\nDigite o lado do quadrado: ");
			lado = in.nextDouble();

			return(lado);
		}

		void areaQuad(){
			double lado = leQuad();

			double area = lado * lado;
		}
	}

	public class retangulo extends formGeo{

		double base, altura;

		void leRet(){

			System.out.println("\n\n\n\n\nDigite a base do retangulo: ");
			base = in.nextDouble();

			System.out.println("\nDigite o lado do quadrado: ");
			altura = in.nextDouble();
		}	

		void areaRet(){

			area = base * altura;

		}
	}

	public double imprimeArea(){

		System.out.println("A área da forma geométrica é:" +area);

		return(0);
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

					objCirc.areaCirc();
					objCirc.imprimeArea();

					break;

				case 2:
					formGeo objQuad = new formGeo();

					break;

				case 3:
					formGeo objRet = new formGeo();

					break;

				default:
					System.out.println("Opção inválida!!");
			}
		}
	}
}