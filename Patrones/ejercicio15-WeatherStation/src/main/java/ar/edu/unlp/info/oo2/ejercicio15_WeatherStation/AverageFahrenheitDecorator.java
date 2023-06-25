package ar.edu.unlp.info.oo2.ejercicio15_WeatherStation;

class AverageFahrenheitDecorator extends WeatherDecorator {
	public AverageFahrenheitDecorator(Weather weather) {
		super(weather);
	}

	@Override
	public String displayData() {
		return null;
	}
	
}