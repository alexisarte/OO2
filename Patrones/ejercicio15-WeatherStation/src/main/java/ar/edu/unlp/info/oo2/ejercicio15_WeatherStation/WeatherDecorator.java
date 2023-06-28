package ar.edu.unlp.info.oo2.ejercicio15_WeatherStation;

import java.util.List;

abstract class WeatherDecorator implements Weather {

	private Weather weather;

	public WeatherDecorator(Weather weather) {
		this.weather = weather;
	}

	@Override
	public String displayData() {
		return this.weather.displayData();
	}

	@Override
	public double getFahrenheitTemperature() {
		return this.weather.getFahrenheitTemperature();
	}

	@Override
	public double getPressure() {
		return this.weather.getPressure();
	}

	@Override
	public double getSolarRadiation() {
		return this.weather.getSolarRadiation();
	}

	@Override
	public List<Double> getFahrenheitTemperatures() {
		return this.weather.getFahrenheitTemperatures();
	}

	@Override
	public void addTemperature(double temperature) {
		this.weather.addTemperature(temperature);
	}
	
}