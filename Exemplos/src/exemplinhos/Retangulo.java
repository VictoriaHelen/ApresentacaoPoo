package exemplinhos;

public class Retangulo extends Forma {
	  private double comprimento;
	    private double largura;

	    public Retangulo(double comprimento, double largura) {
	        super(4);
	        this.comprimento = comprimento;
	        this.largura = largura;
	    }

	    @Override
	    public double calcularArea() {
	        return comprimento * largura;
	    }
	};

