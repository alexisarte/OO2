package ar.edu.unlp.info.oo2.ejercicio15_WeatherStation;

class AverageCelsiusDecorator extends WeatherDecorator {
	
	public AverageCelsiusDecorator(Weather weather) {
		super(weather);
	}

	@Override
	public String displayData() {
		return null;
	}
	
}