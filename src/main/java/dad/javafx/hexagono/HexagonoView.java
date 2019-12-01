package dad.javafx.hexagono;

import dad.javafx.formas.Poligono;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class HexagonoView extends GridPane {

	private TextField radioText;
	private Label areaText, perimetroText;
	private Label radioLabel;
	private Label areaLabel, perimetroLabel;
	private Poligono hexagono;
	
	public HexagonoView() {
		super();
		radioLabel = new Label("Radio:");
		
		radioText = new TextField();
		radioText.setPromptText("Radio");
		radioText.setPrefColumnCount(5);
		
		hexagono = new Poligono(40, 6);
		hexagono.setFill(Color.DARKMAGENTA);
		hexagono.setStrokeWidth(2);
		hexagono.setStroke(Color.BLACK);
		
		areaLabel = new Label("Area:");
		perimetroLabel = new Label("Perímetro:");
		
		areaText = new Label();
		perimetroText = new Label();
		
		addRow(0, radioLabel, radioText);
		addRow(1, hexagono);
		
		setColumnSpan(hexagono, 2);
		setHalignment(hexagono, HPos.CENTER);
		
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

	public Poligono getHexagono() {
		return hexagono;
	}
}
