package dad.javafx.hexagono;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class HexagonoController {

	private HexagonoModel model;
	private HexagonoView view;

	public HexagonoController() {

		model = new HexagonoModel();
		view = new HexagonoView();

		view.getRadioText().textProperty().bindBidirectional(model.radioProperty(), new NumberStringConverter());

		view.getAreaText().textProperty().bind(Bindings.selectString(model.areaProperty()));
		view.getPerimetroText().textProperty().bind(Bindings.selectString(model.perimetroProperty()));
	}

	public HexagonoView getRoot() {
		return view;
	}
}
