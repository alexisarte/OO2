package ar.edu.unlp.info.oo2.ejercicio15_WeatherStation;

class CelsiusDecorator extends WeatherDecorator {
	public CelsiusDecorator(Weather weather) {
		super(weather);
	}

	@Override
	public String displayData() {
		// Lógica para mostrar los datos con el decorador de Celsius
		return null;
	}
}