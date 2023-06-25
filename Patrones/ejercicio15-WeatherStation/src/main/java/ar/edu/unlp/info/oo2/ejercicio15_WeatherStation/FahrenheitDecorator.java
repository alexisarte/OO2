package ar.edu.unlp.info.oo2.ejercicio15_WeatherStation;

class FahrenheitDecorator extends WeatherDecorator {
	public FahrenheitDecorator(Weather weather) {
		super(weather);
	}

	@Override
	public String displayData() {
		// Lógica para mostrar los datos con el decorador de Fahrenheit
		return null;
	}
}