import java.util.ArrayList;
import java.util.List;


/**
 * 题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如:153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。 
 * @author Administrator
 * 程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 */
public class FindDaffodilNumber {
	
	//分解整数
	public static List<Integer> getNumber(int number){
		List<Integer> list = new ArrayList<Integer>();
		list.add(number%10);		//个位数
		list.add(number/10%10);		//十位数
		list.add(number/100);		//百位数
		return list;
	}
	
	public static void main(String[] args) {
		
		for(int i = 100;i<1000;i++){
			List<Integer> list = getNumber(i);
			int count = 0;
			
			for(int j = 0;j<list.size();j++){
				int cubed = (int)Math.pow(list.get(j), 3);
				count = count + cubed;
			}
			
			if(count == i){
				System.out.println("水仙花数："+i);
			}
			
		}
		
	}
}
