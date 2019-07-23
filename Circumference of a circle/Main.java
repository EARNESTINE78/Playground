#include<stdio.h>
int main() 
{
    float radius, diameter, circumference, area;
    scanf("%f", &radius);
    diameter = 2 * radius;
    circumference = 2 * 3.14 * radius;
    printf("%.2f ", circumference);
}