#include<stdio.h>
#include<conio.h>

void bubblesort(int arr[],int len)
{
	int i,j,temp;
	for(i=0;i<len;i++){
		printf("%d ",arr[i]);
	}
	for(i=0;i<len-1;i++)
	{
		for(j=0;j<len-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
			       temp=arr[j];
			       arr[j]=arr[j+1];
			       arr[j+1]=temp;
			}
		}
	}
	for(i=0;i<len;i++){
		printf("%d ",arr[i]);
	}
}

void main()
{
	int arr[]={4,2,1,5,8};
	int l=5;
	clrscr();
	bubblesort(arr,l);
	getch();
}
