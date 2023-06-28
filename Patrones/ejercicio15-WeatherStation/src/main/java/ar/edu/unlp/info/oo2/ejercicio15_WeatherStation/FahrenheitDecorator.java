package ar.edu.unlp.info.oo2.ejercicio15_WeatherStation;

class FahrenheitDecorator extends WeatherDecorator {
	
	public FahrenheitDecorator(Weather weather) {
		super(weather);
	}

	@Override
	public String displayData() {
		return super.displayData() + "  " + this.getFahrenheitTemperature();
	}
	
}