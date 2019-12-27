#include "stdlib.h"
#include "math.h"

void main()
{
  double squareSum = 0, squareSumSqaured = 0, result = 0;
  int i = 1;

  while(i <= 100)
  {
    squareSum = pow(i, 2) + squareSum;
    i++;
  }
  printf("%lf\n", squareSum);

  i = 1;
  while(i <= 100)
  {
    squareSumSqaured = squareSumSqaured + i;
    i++;
  }

  squareSumSqaured = pow(squareSumSqaured, 2);

  result = squareSumSqaured - squareSum;

  printf("%lf\n", squareSumSqaured);
  printf("%lf\n", result);

}
