#include<stdio.h>
int main()
{
  int a;
  int b=4;
  scanf("%d",&a);
  if(a%b==0)
  {
     printf("Leap year");
  }
  else
  {
     printf("Not Leap year");
  }
  return 0;
}