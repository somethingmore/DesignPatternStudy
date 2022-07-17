public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		//Subject의 상태가 변경되면 Observer들의 update 메소드가 호출되고 각 display가 출력됨.
		weatherData.setMeasurements(1, 2, 3.4f);
	}
}
