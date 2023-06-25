package ar.edu.unlp.info.oo2.ejercicio15_WeatherStation;

class PressureDecorator extends WeatherDecorator {

	public PressureDecorator(Weather weather) {
		super(weather);
	}

	@Override
	public String displayData() {
		// Lógica para mostrar los datos con el decorador de presión
		return null;
	}

}