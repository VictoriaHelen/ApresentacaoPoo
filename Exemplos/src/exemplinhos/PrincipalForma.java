package exemplinhos;

public class PrincipalForma {

	public static void main(String[] args) {
		   Forma retangulo = new Retangulo(5, 3);
	        System.out.println("Área do retângulo: " + retangulo.calcularArea());

	        Forma circulo = new Circulo(2);
	        System.out.println("Área do círculo: " + circulo.calcularArea());
	    }

	};


