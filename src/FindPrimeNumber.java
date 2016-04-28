import java.util.ArrayList;
import java.util.List;


/**
 * 题目：判断101-200之间有多少个素数，并输出所有素数。 
 * @author Administrator
 *1.程序分析：判断素数的方法：所谓素数是指除了1和它本身以外，不能被任何整数整除的数，例如17就是素数，因为它不能被2~16的任一整数整除。
 */
public class FindPrimeNumber {
	
	public static void main(String[] args) {
		getPrimes(101,200);
	}
	
	//得到这个数的其它整数（除了1和本身）
	public static List<Integer> getNumber(int number){
		List<Integer> array = new ArrayList<Integer>();
		for(int i =2;i<number;i++){
			array.add(i);
		}
		return array;
	}
	
	public static void getPrimes(int startNumber,int endNumber){
		
		for(int i = startNumber;i<endNumber;i++){
			Boolean bool = true;
			List<Integer> array = getNumber(i);
			
			for(int j = 0;j<array.size();j++){
				if(i%array.get(j)==0){
					bool = false;	//说明被整除了
				}
			}
			
			if(bool==true){
				System.out.println(i);
			}
			
		}
	}
	
}
