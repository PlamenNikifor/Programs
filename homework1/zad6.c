#include<stdio.h>
#include<stdlib.h>

main(){

	int q,i,x,arr[100],arr2[100];
	printf("Vuvedete x, kudeto 0<x<10\n");
	scanf("%d", &x);
	i = 1;
	q = 1;
	while(i < 100){
		arr[i] = rand()%99;
		i++;
	}
	i = 0;
	while(i < 100){
		if(arr[i] % 10 == x){
			arr2[q] = arr[i];
			q++;
		}		
		i++;
	}
	i = 0;
	while(i < 100){
		if(arr[i] % 10 != x){
			arr2[q] = arr[i];
			q++;
		}
	i++;
	}
	i = 0;
	while(i < 100){
		printf("%d ", arr2[i]);
		i++;
	}


}
