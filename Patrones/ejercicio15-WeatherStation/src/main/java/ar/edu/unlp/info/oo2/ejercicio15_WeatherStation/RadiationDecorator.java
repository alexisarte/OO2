package ar.edu.unlp.info.oo2.ejercicio15_WeatherStation;

class RadiationDecorator extends WeatherDecorator {
	
	public RadiationDecorator(Weather weather) {
		super(weather);
	}

	@Override
	public String displayData() {
		return super.displayData() + " Radiación solar: " + this.getSolarRadiation();
	}
	
}