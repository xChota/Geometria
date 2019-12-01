package dad.javafx.circulo;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CirculoView extends GridPane {

	private TextField radioText;
	private Label areaText, perimetroText;
	private Label radioLabel;
	private Label areaLabel, perimetroLabel;
	private Circle circulo;

	public CirculoView() {
		super();

		radioLabel = new Label("Radio:");

		radioText = new TextField();
		radioText.setPromptText("Radio");
		radioText.setPrefColumnCount(5);

		circulo = new Circle();
		circulo.setRadius(40);
		circulo.setFill(Color.RED);
		circulo.setStrokeWidth(2);
		circulo.setStroke(Color.BLACK);

		areaLabel = new Label("Area:");
		perimetroLabel = new Label("Perímetro:");

		areaText = new Label();
		perimetroText = new Label();

		addRow(0, radioLabel, radioText);
		addRow(1, circulo);

		setColumnSpan(circulo, 2);
		setHalignment(circulo, HPos.CENTER);

		addRow(2, areaLabel, areaText);
		addRow(3, perimetroLabel, perimetroText);

		setAlignment(Pos.CENTER);
		setHgap(15);
		setVgap(5);
	}

	public TextField getRadioText() {
		return radioText;
	}

	public Label getAreaText() {
		return areaText;
	}

	public Label getPerimetroText() {
		return perimetroText;
	}

	public Circle getCirculo() {
		return circulo;
	}
}
