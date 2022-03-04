package Practicum_Review.Review02.GUIStuff;

import java.util.HashMap;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class numbersGUI extends Application {
    // model
    public int[][] grid = new int[][]{{1,4},{2,3}};
    public Label[][] lGrid = new Label[2][2];

    @Override
    public void start(Stage stage) throws Exception {
        // Set the title
        stage.setTitle("Number Grid");        

        // Create a gridpane to hold the labels
        HashMap<Integer, Color> colors = new HashMap<>(){{put(0, Color.RED);put(1, Color.AZURE);put(2,Color.GOLD);put(3,Color.LIGHTPINK);}};
        GridPane pane = new GridPane();
        int index = 0;
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                lGrid[i][j] = makeNumLabel(grid[i][j], colors.get(index));
                pane.add(lGrid[i][j], i, j);
                index++;
            }
        }

        // Create the buttons for clockwise/counter-clockwise
        Button clockwise = new Button("clockwise");
        Button counterClockwise = new Button("counter-clockwise");
        // Set the size of the buttons
        clockwise.setPrefWidth(200);
        counterClockwise.setPrefWidth(200);
        // Add action listens to buttons
        clockwise.setOnAction(new ClockwiseHandler(this));
        counterClockwise.setOnAction(new CounterClockwiseHandler(this));

        // Add the buttons to a vertical box
        VBox buttons = new VBox(clockwise,counterClockwise);

        // Set the layout
        VBox layout = new VBox(pane, buttons);

        // Set up the scene and stage
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }

    public static Label makeNumLabel(int n, Color color){
        Label nLabel = new Label(Integer.toString(n));
        nLabel.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
        nLabel.setMinSize(100, 150);
        nLabel.setAlignment(Pos.CENTER);
        nLabel.setFont(new Font("Arial", 30));
        
        return nLabel;
    }

    public static void updateNumLabel(Label label, int num){
        // Sets the text of the label to the next number in the sequence
        label.setText(Integer.toString(num)); 
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
