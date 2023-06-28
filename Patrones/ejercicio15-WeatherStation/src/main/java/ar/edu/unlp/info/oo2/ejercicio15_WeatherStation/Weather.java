package ar.edu.unlp.info.oo2.ejercicio15_WeatherStation;

import java.util.List;

interface Weather {

	String displayData();

	double getFahrenheitTemperature();

	double getPressure();

	double getSolarRadiation();

	List<Double> getFahrenheitTemperatures();

	void addTemperature(double temperature);

}