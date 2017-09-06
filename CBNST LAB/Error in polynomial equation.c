#include<stdio.h>
#include<conio.h>
#include<math.h>
float fun(float a)
{
      return ( 2*pow(a,2) - 5*a);

}


void main()
{
	float u, v, dv, du, rel, per;
	clrscr();
	printf("Enter the value of v at which the error is to be found: ");
	scanf("%f", &v);
	u=fun(v);
	printf("\nEnter the error in v:");
	scanf("%f", &dv);
	du= (4*v - 5)*dv;
	printf("\nAbsolute error is= %f", du);
	rel=du/u;
	per=rel*100;
	printf("\nRelative error is= %f", rel);
	printf("\nPercentage error is= %f", per);
	getch();
}
