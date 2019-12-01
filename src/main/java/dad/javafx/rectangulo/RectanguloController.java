package dad.javafx.rectangulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class RectanguloController {

	private RectanguloModel model;
	private RectanguloView view;

	public RectanguloController() {

		model = new RectanguloModel();
		view = new RectanguloView();

		view.getBaseText().textProperty().bindBidirectional(model.baseProperty(), new NumberStringConverter());
		view.getAlturaText().textProperty().bindBidirectional(model.alturaProperty(), new NumberStringConverter());

		view.getAreaText().textProperty().bind(Bindings.selectString(model.areaProperty()));
		view.getPerimetroText().textProperty().bind(Bindings.selectString(model.perimetroProperty()));
	}

	public RectanguloView getRoot() {
		return view;
	}
}
