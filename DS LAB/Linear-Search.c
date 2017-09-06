#include<stdio.h>
#include<conio.h>
void main()
{
	int key[10]={5,10,15,20,25,30,35,40,45,50};
	int i,k,flag=0;
	clrscr();
	printf("Enter key: ");
	scanf("%d",&k);
	//Linear Search Algorithm
	for(i=0;i<10;i++){
		if(key[i]==k)
	       {
		printf("Key Found at position: %d ",i);
		flag=1;
	       }
	}
	if(flag==0){printf("Key NOT FOUND!");}
	getch();
}

