import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Calc extends Application {
	
	Label labell;
	Label eql = new Label("=");
	TextField txt1 = new TextField();
	TextField txt2 = new TextField();
	TextField txt3 = new TextField();
	
	Button btnAdd = new Button("+");
	Button btnSub = new Button("-");
	Button btnMul = new Button("*");
	Button btnDiv = new Button("/");
	Button btnLog = new Button("log");
	
	public static void main (String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("JavaFX Calculator");
		labell = new Label("First label");
		
		GridPane gridPane = new GridPane();
		gridPane.setMinSize(400, 200);
		gridPane.setPadding(new Insets(10, 10, 10, 10));
		gridPane.setVgap(5);
		gridPane.setHgap(5);
		gridPane.setAlignment(Pos.CENTER);
		
		gridPane.add(txt1, 0, 0);
		gridPane.add(txt2, 0, 1);
		gridPane.add(eql, 0, 2);
		gridPane.add(txt3, 0, 3);
		gridPane.add(btnAdd, 1, 0);
		gridPane.add(btnSub, 1, 1);
		gridPane.add(btnMul, 2, 0);
		gridPane.add(btnDiv, 2, 1);
		gridPane.add(btnLog, 3, 0);
		
		Scene scene = new Scene(gridPane);
		
		OpFactory factory = new OpFactory();
		
		btnAdd.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				double a = Double.parseDouble(txt1.getText());
				double b = Double.parseDouble(txt2.getText());
				Operator op = factory.getOp("Add");
				txt3.setText(String.valueOf(op.perform(a, b)));
			}
		});
		
		btnSub.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				double a = Double.parseDouble(txt1.getText());
				double b = Double.parseDouble(txt2.getText());
				Operator op = factory.getOp("Sub");
				txt3.setText(String.valueOf(op.perform(a, b)));
			}
		});
		
		btnMul.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				double a = Double.parseDouble(txt1.getText());
				double b = Double.parseDouble(txt2.getText());
				Operator op = factory.getOp("Mul");
				txt3.setText(String.valueOf(op.perform(a, b)));
			}
		});
		
		btnDiv.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				double a = Double.parseDouble(txt1.getText());
				double b = Double.parseDouble(txt2.getText());
				Operator op = factory.getOp("Div");
				txt3.setText(String.valueOf(op.perform(a, b)));
			}
		});
		
		btnLog.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				double a = Double.parseDouble(txt1.getText());
				Operator op = factory.getOp("Log");
				txt3.setText(String.valueOf(op.perform(a, 0)));
			}
		});
		
		stage.setScene(scene);
		stage.show();
	}
}