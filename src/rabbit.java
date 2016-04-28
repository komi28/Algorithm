
/**
 * 兔子问题
 * 斐波那契数列求值
 * @author Administrator
 *题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 *小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 *1.程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
 */
public class rabbit {
	
	public static void main(String[] args) {
		MyFunction(20);
	}
	
	//我自己写的方法
	public static void MyFunction(int months){
		int lastLastGiveBirth=0;	//上上个月可生育的兔子数量
		int lastGiveBirth=0;		//上个月可生育的兔子数量
		int count = 1;				//总数量  初始化为一对兔子
		for(int month = 1;month<=months;month++){
			int giveBirth = lastGiveBirth+lastLastGiveBirth;
			if(month==3){
				giveBirth = 1;
			}
			lastLastGiveBirth = lastGiveBirth;
			lastGiveBirth = giveBirth;
			count = count+giveBirth;
			System.out.println("第"+month+"个月的兔子对数："+count);
		}
	}
	
	
	//递归方法实现(我认为好的方法)
    public static int fib(int month){
        if(month == 1 || month == 2){
            return 1;
        }else{
            return fib(month-1)+fib(month-2);
        }
    }
	
}
