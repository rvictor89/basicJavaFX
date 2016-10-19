package de.victorfx.basicJavaFX.controller;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Ramon Victor on 17.10.2015.
 *
 * Controller for the FXML.
 */
public class BasicController implements Initializable {

    private ResourceBundle language;

    /**
     * Method for when the controller is initialized.
     *
     * @param location  location
     * @param resources resources
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        language = resources;
    }

}
