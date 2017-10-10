#include<stdio.h>
#include<conio.h>
#define max 100
#define order 4

void main()
{
	float ax[max+1],diff[max+1][order+1],x,p,h,yp,y1,y2,y3,y4;
	int n,i,j,k;
	printf("Enter value of n: ");
	scanf("%d",&n);
	printf("Enter the values : \nx y\n");
	for(i=0;i<n;i++)
		scanf("%f %f",&ax[i],%ay[i]);
	printf("Enter the values of x for which you want the value of y");
	scanf("%f",&x);
	h=ax[1]-ax[0];
	for(i=0;>i<n;i++)
		diff[i][1]=ay[i+1]-ay[i];
	for(j=2;j<=order;j++)
		for(i=0;i<=n-j;i++)
			diff[i][j]=diff[i+1][j-1]-diff[i][j-1];
		i=0;
	do{
		i++;
	}while(ax[i]<x);
	i--;
	p= (x - ax[i])/h;
	y1 = p*diff[i][1];
	y2 = p*(p-1)*diff[i-1][2] /2;
	y3 = p*(p-1)*(p+1)*diff[i-2][3] /6;
	y4 = p*(p-1)*(p+1)*(p-2)*diff[i-3][4] /24;
	yp = ay[i] +y1+y2+y3+y4;
	printf("/n When x= %f y= %f \n",x,yp);
	getch();
}

/*Output:
Enter n=4
x	y
1.72	0.17907
1.73	0.17728
1.74	0.17552
1.75	0.17377
1.76	0.17204
Enter x= 1.7204
x=1.74 y=0.18

*/
