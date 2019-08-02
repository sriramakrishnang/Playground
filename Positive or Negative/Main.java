#include<stdio.h>
int main()
{
   
    double number;
    
    scanf("%lf", &number);
    if (number <= 0.0)
    {
        if (number == 0.0)
            printf("You entered 0.");
        else
            printf("Negative");
    }
    else
        printf("Positive");
    return 0;
}