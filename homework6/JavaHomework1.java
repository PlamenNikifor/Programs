import java.util.Properties;
import java.util.*;
class Homework1 {
	public static void main(String[] args){
		int i = 1;
		String[] AnArray = new String[4];
		if(args[args.length].equals ("down")){
			for(int count = args.length-1; count >= 0; count -- ){
				AnArray[i] = args[count];
				System.out.println(AnArray[i]);
				i++;
			}
		}
		else{
                	for(int count = 0; count >= args.length-1; count ++){ 
                               	AnArray[i] = args[count];
				System.out.println(AnArray[i]);
                               	i--;
			}
		}
	}
}