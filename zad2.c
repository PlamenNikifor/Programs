#include<stdio.h>

main(){
	int x,y;
	int sum = 0;
	printf("Vuvedete x i y, kudete y>x\n");
	printf("x= ");
	scanf("%d" , &x);
	printf("y= ");
	scanf("%d" , &y);
	if(x >= y){
		printf("Nevalidni stoinosti na x i y");
		return 0;
	}
	while(y >= x){
		if(x % 17 == 0){
			sum = sum + x;
		}
		x++;
	
	}
	printf("Sumata na vsichki chisla delqshti se na 17 v intervala [y,x] e %d", sum );
	return 0;
	



}
