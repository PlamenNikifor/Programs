#include<stdio.h>

main(){
	int x,y,p,counter2;
	printf("Vuvedete x i y, kudete y>x\n");
	printf("x= ");
	scanf("%d" , &x);
	printf("y= ");
	scanf("%d" , &y);
	if(x >= y){
		printf("Nevalidni stoinosti na x i y");
		return 0;
	}
	printf("Vsichki prosti chisla zavurshvashti na 3 v intervala [x;y] sa ");	
		while(x <= y){
			p = 1;
			counter2 = 0;
			while(p <= x){
				if(x % p == 0){
					counter2++;
				}
				p++;
			}
			if((counter2 == 1 && x % 10 == 3) || (counter2 == 2 && x % 10 == 3)){
				printf("%d ", x);
			}
			x++;	
		}
	return 0;
}
