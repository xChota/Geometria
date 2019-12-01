package dad.javafx.rectangulo;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectanguloView extends GridPane {

	private TextField baseText, alturaText;
	private Label areaText, perimetroText;
	private Label baseLabel, alturaLabel;
	private Label areaLabel, perimetroLabel;
	private Rectangle rectangulo;
	
	public RectanguloView() {
		super();
		
		baseLabel = new Label("Ancho:");
		alturaLabel = new Label("Alto:");
		
		baseText = new TextField();
		baseText.setPromptText("Ancho");
		baseText.setPrefColumnCount(5);
		alturaText = new TextField();
		alturaText.setPromptText("Alto");
		alturaText.setPrefColumnCount(5);
		
		rectangulo = new Rectangle();
		rectangulo.setWidth(80);
		rectangulo.setHeight(60);
		rectangulo.setFill(Color.rgb(0, 162, 232));
		rectangulo.setStrokeWidth(2);
		rectangulo.setStroke(Color.BLACK);
		
		areaLabel = new Label("Area:");
		perimetroLabel = new Label("Perímetro:");
		
		areaText = new Label();
		perimetroText = new Label();

		addRow(0, baseLabel, baseText);
		addRow(1, alturaLabel, alturaText);
		addRow(2, rectangulo);
		
		setColumnSpan(rectangulo, 2);
		setHalignment(rectangulo, HPos.CENTER);
		
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

	public Rectangle getRectangulo() {
		return rectangulo;
	}
}
