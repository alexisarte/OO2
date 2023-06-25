package ar.edu.unlp.info.oo2.ejercicio15_WeatherStation;

abstract class WeatherDecorator implements Weather {

	protected Weather weather;

	public WeatherDecorator(Weather weather) {
		this.weather = weather;
	}

	@Override
	public abstract String displayData();
	
}