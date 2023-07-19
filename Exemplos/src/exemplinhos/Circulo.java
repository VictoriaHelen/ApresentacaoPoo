package exemplinhos;

public class Circulo extends Forma {
	 private double raio;

	    public Circulo(double raio) {
	        super(0);
	        this.raio = raio;
	    }

	    @Override
	    public double calcularArea() {
	        return Math.PI * raio * raio;
	    }
	};

