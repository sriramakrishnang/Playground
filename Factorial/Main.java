#include<stdio.h>
int main()
{
 int i,f=1,num;

 scanf("%d",&num);

 for(i=1;i<=num;i++)
     f=f*i;

 printf(" %d",f);
 return 0; //fill your code
}