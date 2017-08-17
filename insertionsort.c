

		     #include <stdio.h>
		     #include <conio.h>

		     void insertionsort(int arr[],int len)
		     {

			int i,j,key;
			for(i=0;i<len;i++)
			{
				key=arr[i];
				j=i-1;

				while(j>=0 && arr[j]>key)
				{
					arr[j+1]=arr[j];
					j=j-1;
				}
				arr[j+1]=key;
			}
			for(i=0;i<len;i++)
			{
				printf("%d ",arr[i]);
			}
		     }
		     void main()
		     {
		     int arr[]={9,8,7,6,5};
		     int l=5;
		     clrscr();
		     insertionsort(arr,l);
		     getch();
		     }
