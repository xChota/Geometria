package dad.javafx.circulo;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.ReadOnlyFloatProperty;
import javafx.beans.property.ReadOnlyFloatWrapper;
import javafx.beans.property.SimpleFloatProperty;

public class CirculoModel {

	private FloatProperty radio = new SimpleFloatProperty();

	private ReadOnlyFloatWrapper area = new ReadOnlyFloatWrapper();
	private ReadOnlyFloatWrapper perimetro = new ReadOnlyFloatWrapper();

	public CirculoModel() {

		area.bind(radio.multiply(Math.PI).multiply(radioProperty()));
		perimetro.bind(radio.multiply(Math.PI * 2));
	}

	public final FloatProperty radioProperty() {
		return this.radio;
	}

	public final float getRadio() {
		return this.radioProperty().get();
	}

	public final void setRadio(final float radio) {
		this.radioProperty().set(radio);
	}

	public final ReadOnlyFloatProperty areaProperty() {
		return this.area;
	}

	public final float getArea() {
		return this.areaProperty().get();
	}

	public final ReadOnlyFloatProperty perimetroProperty() {
		return this.perimetro;
	}

	public final float getPerimetro() {
		return this.perimetroProperty().get();
	}

}
