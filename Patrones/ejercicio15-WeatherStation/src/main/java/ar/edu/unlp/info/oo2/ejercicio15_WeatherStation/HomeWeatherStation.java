package ar.edu.unlp.info.oo2.ejercicio15_WeatherStation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HomeWeatherStation {
	
	private double temperaturaFarenheit;
	private double presion;
	private double radiacionSolar;
	private List<Double> temperatures;
	
	public HomeWeatherStation(double temperature, double pressure, double solarRadiation) {
		this.temperaturaFarenheit = temperature;
		this.presion = pressure;
		this.radiacionSolar = solarRadiation;
		this.temperatures = new ArrayList<>();	
		this.addTemperature(this.temperaturaFarenheit);
	}
	
	//retorna la temperatura en grados Fahrenheit
	public double getTemperaturaFahrenheit() {
		return this.temperaturaFarenheit;
	}
	
	//retorna la presión atmosférica en hPa
	public double getPresion() {
		return this.presion;
	}
	
	//retorna la radiación solar
	public double getRadiacionSolar() {
		return this.radiacionSolar;
	}
	
	//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public List<Double> getTemperaturasFahrenheit() {
		return Collections.unmodifiableList(this.temperatures);
	}
	
	public void addTemperature(double temperature) {
		this.temperatures.add(temperature);
	}
	
}
