import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label balance;
    @FXML
    private Label win;
    @FXML
    private Label n1;
    @FXML
    private Label n2;
    @FXML
    private Label n3;
    @FXML
    private Label n4;
    @FXML
    private Label n5;
    @FXML
    private Label n6;
    @FXML
    private Label n7;
    @FXML
    private Label n8;
    @FXML
    private Label n9;




    Random random = new Random();
    int[] arr = new int[9];

    int money = 100;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void onClick(){
        int sum = 0;
        for (int i=0; i<=6; i++){
            int rand_num =  random.nextInt(3 - (-2)) + (-2);
            arr[i] = rand_num;
        }
        n1.setText(String.valueOf(arr[0]));
        n2.setText(String.valueOf(arr[1]));
        n3.setText(String.valueOf(arr[2]));
        n4.setText(String.valueOf(arr[3]));
        n5.setText(String.valueOf(arr[4]));
        n6.setText(String.valueOf(arr[5]));
        n7.setText(String.valueOf(arr[6]));
        n8.setText(String.valueOf(arr[7]));
        n9.setText(String.valueOf(arr[8]));

        for (int i=0; i<9; i++){
            sum += arr[i];
        }
        System.out.println(sum);

        if (sum > 0){
            win.setText("გილოცავთ თქვენ მოიგეთ: 5ლ");
            money += 5;
        }else {
            win.setText("სამწუხაროდ თქვენ წააგეთ: 5ლ");
            money -= 5;
        }
        balance.setText("თქვენი ბალანსია: " + money);
    }
}
