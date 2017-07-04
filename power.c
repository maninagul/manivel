
#include<stdio.h>
#include<math.h>
int main()
{

   int i=1, x, n, ans=1;
   printf("Enter x and power n \n");
   scanf("%d \n %d",&x, &n);

   ans= pow (x,n);

   printf("%d to the power %d is %d", x, n, ans);
   return 0;
}
