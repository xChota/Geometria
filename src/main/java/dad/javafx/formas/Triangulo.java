package dad.javafx.formas;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.shape.Polygon;

public class Triangulo extends Polygon {

	private DoubleProperty base = new SimpleDoubleProperty();
	private DoubleProperty altura = new SimpleDoubleProperty();

	public Triangulo(double base, double altura) {
		super();

		this.base.addListener((o, ov, nv) -> createPoints());
		this.altura.addListener((o, ov, nv) -> createPoints());

		this.base.set(base);
		this.altura.set(altura);
	}

	public Triangulo() {
		this(0.0, 0.0);
	}

	private void createPoints() {
		getPoints().clear();
		getPoints().addAll(getBase() / 2, 0.0);
		getPoints().addAll(getBase(), getAltura());
		getPoints().addAll(0.0, getAltura());
	}

	public final DoubleProperty baseProperty() {
		return this.base;
	}

	public final double getBase() {
		return this.baseProperty().get();
	}

	public final void setBase(final double base) {
		this.baseProperty().set(base);
	}

	public final DoubleProperty alturaProperty() {
		return this.altura;
	}

	public final double getAltura() {
		return this.alturaProperty().get();
	}

	public final void setAltura(final double altura) {
		this.alturaProperty().set(altura);
	}

}
