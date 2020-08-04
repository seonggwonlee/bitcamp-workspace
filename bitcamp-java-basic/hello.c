#include <stdio.h>
#include <stdlib.h>

// function prototype

void f1(int);
void f2(int*); // 파라미터 변수는 넣어도 되고 안 넣어도 된다. 즉, (int* p)도 가능 

int main(){
  int a = 200;
  
  f1(a);
  
  printf("a = %d\n", a);
  
  f2(&a); // a의 메모리 '주소'를 f2에 넘긴다.
  
  printf("a = %d\n", a);
    return 0;
}

void f1(int a) {
  a = 100;
}

void f2(int* p) {
  *p = 100;
}