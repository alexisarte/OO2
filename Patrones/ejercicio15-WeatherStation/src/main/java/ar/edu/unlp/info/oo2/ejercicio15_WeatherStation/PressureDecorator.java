package ar.edu.unlp.info.oo2.ejercicio15_WeatherStation;

class PressureDecorator extends WeatherDecorator {

	public PressureDecorator(Weather weather) {
		super(weather);
	}

	@Override
	public String displayData() {
		return super.displayData() + "  Presión atmosférica: " + this.getPressure();
	}

}