#include<stdio.h>
int main()
{
 int array[100], maximum, size, c, location = 1;

 scanf("%d", &size);

 for (c = 0; c < size; c++)
   scanf("%d", &array[c]);

 maximum = array[0];

 for (c = 1; c < size; c++)
 {
   if (array[c] > maximum)
   {
      maximum  = array[c];
      location = c+1;
   }
 }

 printf("%d\n",maximum);
 return 0;
}