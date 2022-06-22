#include<iostream>
using namespace std;
// 读入一个浮点数，保留3位小数输出这个浮点数。
int main() {
	double a;
	// cin读取浮点数可能读取不全
	scanf("%lf",&a);
	printf("%.3lf",a);
	return 0;
}

