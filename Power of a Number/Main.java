#include<stdio.h>
 int power(int n1, int n2);
int main()
 
{
 int base, powerRaised, result;
 
   scanf("%d",&base);
  
   scanf("%d",&powerRaised);
   result = power(base, powerRaised);
   printf("%d",result);
   return 0;
}
int power(int base, int powerRaised)
{
   if (powerRaised != 0)
       return (base*power(base, powerRaised-1));
   else
       return 1;
}