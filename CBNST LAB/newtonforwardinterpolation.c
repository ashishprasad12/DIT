#include <stdio.h>
#include <conio.h>

void main()
{
	float x[5],y[5][4],x0,y0,y1,y2,y3,y4,p;
	int i,j,n=5;
	clrscr();
	/*Entering Values*/
	printf("Entering Values :\nX\tY ");
	for(i=0;i<5;i++)
	{
		scanf("%f %f",&x[i],&y[i][0]);
	}
	/*Calculating Table*/
	for(j=1;j<n;j++)
	{
		for(i=0;i<n-j;i++)
		{
			y[i][j]=y[i+1][j-1]-y[i][j-1];
		}
	}
	/*Printing Forward Table*/
	clrscr();
	printf("X\tY\tY'\tY''\tY'''\tY''''\tY'''''\n");
	for(i=0;i<n;i++)
	{
		printf("%5f",x[i]);
		for(j=0;j<n-i;j++)
		{
			printf("  %5f",y[i][j]);
		}
		printf("\n");
	}

	/*Entering X*/
	printf("Enter value of X: ");
	scanf("%f",&x0);
	/*Finding index of X and Calculating p*/
	i=0;
	do{
		i++;
	}while(x[i]<x0);
	i--;
	p=(x0-x[i])/(x[1]-x[0]);
	printf("P = %f",p);
	/*Calculating Values of Y0,Y1,Y2,Y3,Y4*/
	y1=p*y[i][1];
	y2=p*(p-1)*y[i][2]/2;
	y3=p*(p-1)*(p-2)*y[i][3]/6;
	y4=p*(p-1)*(p-2)*(p-3)*y[i][4]/24;
	y0=y[i][0]+y1+y2+y3+y4;
	printf("\nThe value of X is %f\n,The value of Y is %f\n",x0,y0);
	getch();
}
