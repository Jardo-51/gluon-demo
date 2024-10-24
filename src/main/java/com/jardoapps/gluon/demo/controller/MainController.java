package com.jardoapps.gluon.demo.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class MainController implements Initializable {

	@FXML
	private ComboBox<String> demoCmb;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		demoCmb.getItems().add("Item 1");
		demoCmb.getItems().add("Item 2");
	}

}
