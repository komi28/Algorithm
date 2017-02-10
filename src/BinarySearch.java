
/**
 * 二分法查找
 * @author Administrator
 *
 */
public class BinarySearch {
	
	public static int rank(int key,int[] a){
		int number = 0;
		int arratLength = a.length-1;
		
		while(number<=arratLength){
			//被查找的建要么不存在，要么必然存在玉a[number..arratLength]之中
			int mid = number + (arratLength-number) / 2;
			if(key < a[mid]){
				arratLength = mid - 1;
			}else if(key > a[mid]){
				number = mid + 1;
			}else{
				return mid;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] whilelist = {1,2,3,4,5,6,7,8,9,10};
		int key = 1;
		if(rank(key,whilelist)!=-1){
			System.out.println(key+"存在！");
		}
	}

}
