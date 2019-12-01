package dad.javafx.triangulo;

import dad.javafx.formas.Triangulo;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class TrianguloView extends GridPane {

	private TextField baseText, alturaText;
	private Label areaText, perimetroText;
	private Label baseLabel, alturaLabel;
	private Label areaLabel, perimetroLabel;
	private Triangulo triangulo;

	public TrianguloView() {
		super();

		baseLabel = new Label("Base:");
		alturaLabel = new Label("Altura:");

		baseText = new TextField();
		baseText.setPromptText("Base");
		baseText.setPrefColumnCount(5);
		alturaText = new TextField();
		alturaText.setPromptText("Altura");
		alturaText.setPrefColumnCount(5);

		triangulo = new Triangulo(80, 60);
		triangulo.setFill(Color.GREEN);
		triangulo.setStrokeWidth(2);
		triangulo.setStroke(Color.BLACK);

		areaLabel = new Label("Area:");
		perimetroLabel = new Label("Perímetro:");

		areaText = new Label();
		perimetroText = new Label();

		addRow(0, baseLabel, baseText);
		addRow(1, alturaLabel, alturaText);
		addRow(2, triangulo);

		setColumnSpan(triangulo, 2);
		setHalignment(triangulo, HPos.CENTER);

		addRow(3, areaLabel, areaText);
		addRow(4, perimetroLabel, perimetroText);

		setAlignment(Pos.CENTER);
		setHgap(15);
		setVgap(5);
	}

	public TextField getBaseText() {
		return baseText;
	}

	public TextField getAlturaText() {
		return alturaText;
	}

	public Label getAreaText() {
		return areaText;
	}

	public Label getPerimetroText() {
		return perimetroText;
	}

	public Triangulo getTriangulo() {
		return triangulo;
	}

}
