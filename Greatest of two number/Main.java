#include<stdio.h>
void main()
{
  int num1,num2;
  scanf("%d\n%d",&num1,&num2);
  if(num1>num2)
    printf("num1 is the greatest");
  else if(num1<num2)
    printf("num2 is the greatest");
  else if(num1==num2)
    printf("Both number Equal");
}