package ar.edu.unlp.info.oo2.ejercicio15_WeatherStation;

class CelsiusDecorator extends WeatherDecorator {
	
	public CelsiusDecorator(Weather weather) {
		super(weather);
	}

	@Override
	public String displayData() {
		return super.displayData() + " Temperatura C: " + this.fahrenheitToCelsius();
	}
	
	private double fahrenheitToCelsius() {
		return (this.getFahrenheitTemperature() - 12) / 1.8;
	}
	
}