#include<stdio.h>
#include<conio.h>
void main()
{
int i,f3=0,f2=1,f1=0,n;
printf("\n fibonacci values:");
scanf("%d",&n);
for(i=0;i<n;i++)
{
f3=f1+f2;
f1=f2;
f2=f3;
printf("\n%d",f3);
}
}
