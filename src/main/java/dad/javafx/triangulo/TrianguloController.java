package dad.javafx.triangulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class TrianguloController {

	private TrianguloModel model;
	private TrianguloView view;

	public TrianguloController() {

		model = new TrianguloModel();
		view = new TrianguloView();

		view.getBaseText().textProperty().bindBidirectional(model.baseProperty(), new NumberStringConverter());
		view.getAlturaText().textProperty().bindBidirectional(model.alturaProperty(), new NumberStringConverter());

		view.getAreaText().textProperty().bind(Bindings.selectString(model.areaProperty()));
		view.getPerimetroText().textProperty().bind(Bindings.selectString(model.perimetroProperty()));
	}

	public TrianguloView getRoot() {
		return view;
	}
}
