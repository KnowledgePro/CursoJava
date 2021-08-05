
public class Rectangulo extends FiguraGeometrica {

	private int ancho;
	private int alto;
	
	@Override
	public double calcularArea() {
		return ancho * alto;
	}
}
