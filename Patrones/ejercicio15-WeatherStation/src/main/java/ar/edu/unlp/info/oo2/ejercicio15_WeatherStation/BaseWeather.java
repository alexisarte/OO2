package ar.edu.unlp.info.oo2.ejercicio15_WeatherStation;

import java.util.List;

class BaseWeather implements Weather {

	private HomeWeatherStation weather;

	@Override
	public String displayData() {
		return "";
	}

	public double getTemperatureFahrenheit() {
		return this.weather.getTemperaturaFahrenheit();
	}

	public double getPressure() {
		return this.weather.getPresion();
	}

	public double getSolarRadiation() {
		return this.weather.getRadiacionSolar();
	}

	public List<Double> getTemperaturesFahrenheit() {
		return this.weather.getTemperaturasFahrenheit();
	}
	
	public void addTemperature(double temperature) {
		this.weather.addTemperature(temperature);
	}

}