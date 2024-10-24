module GluonDemo {

	requires org.slf4j;

	requires java.net.http;

	requires javafx.controls;
	requires javafx.fxml;

	opens com.jardoapps.gluon.demo to javafx.graphics;
	opens com.jardoapps.gluon.demo.controller to javafx.fxml;

	exports com.jardoapps.gluon.demo;
	exports com.jardoapps.gluon.demo.controller;
}
