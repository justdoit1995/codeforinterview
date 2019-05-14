package ObserverPattern;

import java.util.ArrayList;

/** 
* @author 作者 justdoit1995: 
* @version 创建时间：2019年5月14日 下午4:24:46 
* 类说明 
*/
public class WeatherData implements Subject{
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	
	public WeatherData() {
		observers=new ArrayList();
	}
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if(i>=0){
			observers.remove(i);
		}
	}
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i=0;i<observers.size();i++){
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	public void measurementsChanged(){
		notifyObservers();
	}
	
	
	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
	}
}
