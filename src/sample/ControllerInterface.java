package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerInterface implements Initializable{

    @FXML
    private Button buttonFind;

    @FXML
    private Button buttonRefresh;

    @FXML
    private Label labelSelectCurency;

    @FXML
    private Label labelExchangeRates;

    @FXML
    private Label labelBanks;

    @FXML
    private Label labelStatusBar;

    private ObservableList<String> list = FXCollections.observableArrayList(
            "USD", "EUR", "RUB"
    );

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private MenuBar menuBar;

    @FXML
    private void comboBoxAction(){

        buttonFind.setDisable(false);
        labelStatusBar.setText("Currency chosen. Please, press \"Find\" button");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comboBox.setItems(list);
        labelStatusBar.setText("Choose currency");
    }
}
