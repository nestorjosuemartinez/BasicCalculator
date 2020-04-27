import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.math.*;

public class Calculator extends Application implements EventHandler<ActionEvent> {
	
	Label result;
	Button button0;
	Button button1;
	Button button2;
	Button button3;
	Button button4;
	Button button5;
	Button button6;
	Button button7;
	Button button8;
	Button button9;
	Button buttonPlus;
	Button buttonMinus;
	Button buttonDivide;
	Button buttonMultiply;
	Button buttonDot;
	Button buttonEquals;
	Button buttonBackspace;
	Button buttonLog;
	double ans;
	int operatorCounter;
	char operator;
	double firstNum;
	int secondNumNdx;
	double secondNum;
	boolean justEqualed;
	
	

	public static void main(String[] args){
		launch(args);

	}
	
	public void start(Stage stage) throws Exception {
		stage.setTitle("Basic Calculator");
		ans = 0;
		operatorCounter = 0;
		operator = 'z';
		firstNum = 0;
		secondNumNdx = 0;
		secondNum = 0;
		justEqualed = true;
		
		
		result = new Label("0");
		button0 = new Button("0");
		button1 = new Button("1");
		button2 = new Button("2");
		button3 = new Button("3");
		button4 = new Button("4");
		button5 = new Button("5");
		button6 = new Button("6");
		button7 = new Button("7");
		button8 = new Button("8");
		button9 = new Button("9");
		buttonPlus = new Button("+");
		buttonMinus = new Button("-");
		buttonDivide = new Button("/");
		buttonMultiply = new Button("*");
		buttonDot = new Button(".");
		buttonEquals = new Button("=");
		buttonBackspace = new Button("C");
		buttonLog = new Button("log");
		
		button0.setMaxSize(50, 50);
		button0.setMinSize(50, 50);
		button1.setMaxSize(50, 50);
		button1.setMinSize(50, 50);
		button2.setMaxSize(50, 50);
		button2.setMinSize(50, 50);
		button3.setMaxSize(50, 50);
		button3.setMinSize(50, 50);
		button4.setMaxSize(50, 50);
		button4.setMinSize(50, 50);
		button5.setMaxSize(50, 50);
		button5.setMinSize(50, 50);
		button6.setMaxSize(50, 50);
		button6.setMinSize(50, 50);
		button7.setMaxSize(50, 50);
		button7.setMinSize(50, 50);
		button8.setMaxSize(50, 50);
		button8.setMinSize(50, 50);
		button9.setMaxSize(50, 50);
		button9.setMinSize(50, 50);
		buttonPlus.setMaxSize(50, 50);
		buttonPlus.setMinSize(50, 50);
		buttonEquals.setMaxSize(50, 50);
		buttonEquals.setMinSize(50, 50);
		buttonMinus.setMaxSize(50, 50);
		buttonMinus.setMinSize(50, 50);
		buttonDivide.setMaxSize(50, 50);
		buttonDivide.setMinSize(50, 50);
		buttonDot.setMaxSize(50, 50);
		buttonDot.setMinSize(50, 50);
		buttonMultiply.setMaxSize(50, 50);
		buttonMultiply.setMinSize(50, 50);
		buttonBackspace.setMaxSize(100, 50);
		buttonBackspace.setMinSize(100, 50);
		buttonLog.setMaxSize(50, 50);
		buttonLog.setMinSize(50, 50);
		
		
		button0.setOnAction(this);
		button1.setOnAction(this);
		button2.setOnAction(this);
		button3.setOnAction(this);
		button4.setOnAction(this);
		button5.setOnAction(this);
		button6.setOnAction(this);
		button7.setOnAction(this);
		button8.setOnAction(this);
		button9.setOnAction(this);
		buttonDot.setOnAction(this);
		buttonPlus.setOnAction(this);
		buttonMinus.setOnAction(this);
		buttonDivide.setOnAction(this);
		buttonMultiply.setOnAction(this);
		buttonEquals.setOnAction(this);
		buttonBackspace.setOnAction(this);
		buttonLog.setOnAction(this);
		
		
		
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);

		Scene scene = new Scene(grid, 300, 400);
		stage.setScene(scene);
		grid.add(result, 0, 0, 3, 1);
		grid.add(button7, 0, 1);
		grid.add(button8, 1, 1);
		grid.add(button9, 2, 1);
		grid.add(button4, 0, 2);
		grid.add(button5, 1, 2);
		grid.add(button6, 2, 2);
		grid.add(button1, 0, 3);
		grid.add(button2, 1, 3);
		grid.add(button3, 2, 3);
		grid.add(button0, 0, 4);
		grid.add(buttonDot, 1, 4);
		grid.add(buttonEquals, 2, 4);
		grid.add(buttonPlus, 3, 1);
		grid.add(buttonMinus, 3, 2);
		grid.add(buttonMultiply, 3, 3);
		grid.add(buttonDivide, 3, 4);
		grid.add(buttonBackspace, 1, 5, 4, 4);
		grid.add(buttonLog, 3, 5);
		
		
		
		
		stage.show();
	}
	
	public void handle(ActionEvent event) {
		if (event.getSource() == button0) {
			if (justEqualed)
				result.setText("");
			result.setText(result.getText() + "0");
			justEqualed = false;
		}
		else if (event.getSource() == button1) {
			if (justEqualed)
				result.setText("");
			result.setText(result.getText() + "1");
			justEqualed = false;
		}
		else if (event.getSource() == button2) {
			if (justEqualed)
				result.setText("");
			result.setText(result.getText() + "2");
			justEqualed = false;
		}
		else if (event.getSource() == button3) {
			if (justEqualed)
				result.setText("");
			result.setText(result.getText() + "3");
			justEqualed = false;
		}
		else if (event.getSource() == button4) {
			if (justEqualed)
				result.setText("");
			result.setText(result.getText() + "4");
			justEqualed = false; 
		}
		else if (event.getSource() == button5) {
			if (justEqualed)
				result.setText("");
			result.setText(result.getText() + "5");
			justEqualed = false;
		}
		else if (event.getSource() == button6) {
			if (justEqualed)
				result.setText("");
			result.setText(result.getText() + "6");
			justEqualed = false;
		}
		else if (event.getSource() == button7) {
			if (justEqualed)
				result.setText("");
			result.setText(result.getText() + "7");
			justEqualed = false;
		}
		else if (event.getSource() == button8) {
			if (justEqualed)
				result.setText("");
			result.setText(result.getText() + "8");
			justEqualed = false;
		}
		else if (event.getSource() == button9) {
			if (justEqualed)
				result.setText("");
			result.setText(result.getText() + "9");
			justEqualed = false;
		}
		else if (event.getSource() == buttonDot)
			result.setText(result.getText() + ".");
		else if (event.getSource() == buttonPlus) {
			result.setText(result.getText() + " + ");
			operatorCounter++;
			operator = '+';
		}
		else if (event.getSource() == buttonMinus) {
			result.setText(result.getText() + " - ");
			operatorCounter++;
			operator = '-';
		}
		else if (event.getSource() == buttonDivide) {
			result.setText(result.getText() + " / ");
			operatorCounter++;
			operator = '/';
		}
		else if (event.getSource() == buttonMultiply) {
			result.setText(result.getText() + " * ");
			operatorCounter++;
			operator = '*';
		}
		else if (event.getSource() == buttonLog) {
			if (justEqualed)
				result.setText("");
			result.setText(result.getText() + "log");
			operatorCounter++;
			operator = 'l';
			justEqualed = false;
		}
		else if (event.getSource() == buttonEquals) {
			if (operatorCounter == 1) {
				if (operator == 'l') {
					firstNum = Double.parseDouble(result.getText().substring(3));
					ans = Math.log10(firstNum);
					
				}
				else {
					secondNumNdx = result.getText().indexOf(" ");
					firstNum = Double.parseDouble(result.getText().substring(0, secondNumNdx));
					secondNumNdx += 3;
					secondNum = Double.parseDouble(result.getText().substring(secondNumNdx));
					if (result.getText().substring(secondNumNdx - 2, secondNumNdx - 1).equals("+"))
						ans = firstNum + secondNum;
					else if (result.getText().substring(secondNumNdx - 2, secondNumNdx - 1).equals("-"))
						ans = firstNum - secondNum;
					else if (result.getText().substring(secondNumNdx - 2, secondNumNdx - 1).equals("*"))
						ans = firstNum * secondNum;
					else if (result.getText().substring(secondNumNdx - 2, secondNumNdx - 1).equals("/")) {
						if (secondNum == 0)
							result.setText("Error: Divide by 0");
						else 
							ans = firstNum / secondNum;
					}
				}
				if (result.getText().contains("Error"))
					result.setText("Error: Divide by 0");
				else if (ans % 1 == 0) {
					result.setText(Integer.toString((int)(Math.round(ans))));
				}
				else
					result.setText(Double.toString(ans));
			}
			else if (operatorCounter == 0) {
				result.setText("Error: No operators");
				justEqualed = true;
				operatorCounter = 0;
				
			}
			else if (operatorCounter > 1)
				result.setText("Error: Too many operators");
			justEqualed = true;
			operatorCounter = 0;
		}
		else if (event.getSource() == buttonBackspace) {
			if (result.getText().length() != 0 &&
					result.getText().substring(result.getText().length() - 1).equals(" "))
				result.setText(result.getText().substring(0, result.getText().length() - 3));
			else if (result.getText().length() != 0)
				result.setText(result.getText().substring(0, result.getText().length() - 1));
		}
			
	}

}
