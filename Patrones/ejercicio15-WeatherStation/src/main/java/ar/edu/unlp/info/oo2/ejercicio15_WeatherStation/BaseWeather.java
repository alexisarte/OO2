package ar.edu.unlp.info.oo2.ejercicio15_WeatherStation;

import java.util.List;

class BaseWeather implements Weather {

	private HomeWeatherStation weather;
	
	public BaseWeather(HomeWeatherStation weather) {
		this.weather = weather;
	}

	@Override
	public String displayData() {
		return "";
	}
	
	@Override
	public double getFahrenheitTemperature() {
		return this.weather.getTemperaturaFahrenheit();
	}

	@Override
	public double getPressure() {
		return this.weather.getPresion();
	}

	@Override
	public double getSolarRadiation() {
		return this.weather.getRadiacionSolar();
	}

	@Override
	public List<Double> getFahrenheitTemperatures() {
		return this.weather.getTemperaturasFahrenheit();
	}
	
	@Override
	public void addTemperature(double temperature) {
		this.weather.addTemperature(temperature);
	}

}