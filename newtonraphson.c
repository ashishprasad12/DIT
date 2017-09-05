#include<stdio.h>
#include<conio.h>
#include<math.h>
float func(float x)
{
	return (cos(x)+1-3*x);
}

float funcdash(float x)
{
	return  (-sin(x)-3);
}

void main()
{
	float x0,x1,x,x2,newx2;
	clrscr();
	printf("Enter x0 and x1 : ");
	scanf("%f %f",&x0,&x1);
	x=(x0+x1)/2;
	do{
		x2=x-(func(x)/funcdash(x));
		printf("x2 = %f \n",x2);
		getch();
		x=x2;
		newx2=x-(func(x)/funcdash(x));
	}while(x2!=newx2);
	getch();
}


