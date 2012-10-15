public class HelloWorld {

	public static  void main(String[] args){
		 int i = 0;
//		for(int i=0; i <= 10; i++){
//			a = a + i;
//			System.out.println(i);
//		}
//		System.out.println(a);
//		System.out.println("Hello, World");
		int[] nums = new int[10];
		int a = 51;
		for(i=0; i<10; i++){
			nums[i] = a;
			a = a + 2;
		}
	        i = 0;
		for(i=0; i<10; i++){
		System.out.println(nums[i]);
		}
	}


}