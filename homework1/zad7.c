#include<stdio.h>
#include<math.h>
#include<stdlib.h>

main(){
	int x,p,y,d;
	float q,z,arr[10];
	printf("Vuvedete x, kudeto 0<x<10");
	y = 1;
	p = 1;
	while(p <= 10){
		z = cos(y);
		q = z;
		z = z * 1000;
		z = z / z;
		d = z;
		d = d % 10;
		if(d == x){
			arr[p] = q;
			p++;
		}
		y++;

	}
	p = 1; 
	while(p <= 10){
		printf("%f ", arr[p]);
		p++;
	}
	return 0;
	
}
