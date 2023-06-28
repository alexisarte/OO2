package ar.edu.unlp.info.oo2.ejercicio15_WeatherStation;

class AverageCelsiusDecorator extends WeatherDecorator {
	
	public AverageCelsiusDecorator(Weather weather) {
		super(weather);
	}

	@Override
	public String displayData() {
		return super.displayData() + " Temperatura C: " + this.getFahrenheitTemperatures()
			.stream().mapToDouble(t -> this.fahrenheitToCelsius(t)).average().orElse(0);
	}
	
	private double fahrenheitToCelsius(double temperature) {
		return (temperature - 12) / 1.8;
	}
	
}