package ar.edu.unlp.info.oo2.ejercicio15_WeatherStation;

class AverageFahrenheitDecorator extends WeatherDecorator {
	
	public AverageFahrenheitDecorator(Weather weather) {
		super(weather);
	}

	@Override
	public String displayData() {
		return super.displayData() + " Temperatura C: " + this.getFahrenheitTemperatures()
			.stream().mapToDouble(t -> t).average().orElse(0);
	}

}
