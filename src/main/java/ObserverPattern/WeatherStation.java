package ObserverPattern;
/** 
* @author 作者 justdoit1995: 
* @version 创建时间：2019年5月14日 下午4:36:51 
* 类说明 
*/
public class WeatherStation {
	public static void main(String args[]){
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(81, 64, 31.4f);
	}
}
