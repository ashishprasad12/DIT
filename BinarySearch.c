#include<stdio.h>
#include<conio.h>
void main()
{
	int arr[5]={1,2,3,4,5};
	int low,mid,high,key,state=0;
	clrscr();
	printf("ENTER KEY: ");
	scanf("%d",&key);
	while(low<=high)
	{
		printf("h");
		mid=(low+high)/2;
		if(arr[mid]==key){
			printf("KEY FOUND AT POSITION %d",mid);
			state=1;
			break;
		}
		else if(arr[mid]>key)
		{
			high=mid-1;
		}
		else if(arr[mid]<key)
		{
			low=mid+1;
		}
	}
	if(state==0)
		printf("KEY NOT FOUND!");
	getch();
}
