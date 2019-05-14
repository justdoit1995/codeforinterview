package ObserverPattern;
/** 
* @author 作者 justdoit1995: 
* @version 创建时间：2019年5月14日 下午4:32:17 
* 类说明 
*/
public class CurrentConditionsDisplay implements Observer,DisplayElement{

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void display() {
		System.out.println(temperature+"  "+humidity);
	}

	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature=temperature;
		this.humidity=humidity;
		display();
	}

}
