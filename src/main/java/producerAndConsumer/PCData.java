package producerAndConsumer;
/** 
* @author 作者 justdoit1995: 
* @version 创建时间：2019年4月20日 上午10:47:33 
* 类说明 
*/
public class PCData {
	private final int intData;
    public PCData(int d){
        intData = d;
    }
    public PCData(String d){
        intData = Integer.valueOf(d);
    }
    public int getData(){
        return intData;
    }
    @Override
    public String toString(){
        return "data:"+intData;
    }
}
