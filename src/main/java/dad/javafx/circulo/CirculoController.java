package dad.javafx.circulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class CirculoController {

	private CirculoModel model;
	private CirculoView view;

	public CirculoController() {

		model = new CirculoModel();
		view = new CirculoView();

		view.getRadioText().textProperty().bindBidirectional(model.radioProperty(), new NumberStringConverter());

		view.getAreaText().textProperty().bind(Bindings.selectString(model.areaProperty()));
		view.getPerimetroText().textProperty().bind(Bindings.selectString(model.perimetroProperty()));
	}

	public CirculoView getRoot() {
		return view;
	}
}
