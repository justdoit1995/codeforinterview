package ObserverPattern;
/** 
* @author 作者 justdoit1995: 
* @version 创建时间：2019年5月14日 下午4:21:05 
* 类说明 
*/
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
