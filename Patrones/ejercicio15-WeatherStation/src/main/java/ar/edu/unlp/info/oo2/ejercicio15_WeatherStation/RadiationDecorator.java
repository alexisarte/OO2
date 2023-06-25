package ar.edu.unlp.info.oo2.ejercicio15_WeatherStation;

class RadiationDecorator extends WeatherDecorator {
	public RadiationDecorator(Weather weather) {
		super(weather);
	}

	@Override
	public String displayData() {
		// Lógica para mostrar los datos con el decorador de radiación solar
		return null;
	}
}