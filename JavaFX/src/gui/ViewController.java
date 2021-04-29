package gui;

import gui.util.Alerts;
import gui.util.Constraints;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entites.Person;

public class ViewController implements Initializable {

    @FXML
    private ComboBox<Person> cbBox;
    
    @FXML
    private Button btAll;

    private ObservableList<Person> obsList;

    @FXML 
    public void onBtAllAction()
    {
    for(Person person: cbBox.getItems())
    {
        System.out.println(person);
    
    }
    
    }
    
    @FXML
    public void onComboBoxPersonAction() {
        Person person = cbBox.getSelectionModel().getSelectedItem();
        System.out.println(person);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        List<Person> list = new ArrayList<>();

        list.add(new Person(1, "maria", "Maria@gmail.com"));
        list.add(new Person(2, "Alex", "alex@gmail.com"));
        list.add(new Person(3, "bob", "bob@gmail.com"));

        obsList = FXCollections.observableArrayList(list);
        cbBox.setItems(obsList);

        Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
            @Override
            protected void updateItem(Person item, boolean empty) {
                super.updateItem(item, empty);
                setText(empty ? "" : item.getName());

            }
        };
        cbBox.setCellFactory(factory);
        cbBox.setButtonCell(factory.call(null));
    }

}
