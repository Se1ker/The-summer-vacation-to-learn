#include<iostream>
#include<cmath>
using namespace std;
// 已知线段两个端点的坐标，求AB长度
int main(){
	int a1,a2,b1,b2;
	cin >> a1 >> a2;
	cin >> b1 >> b2;
	printf("%.3lf",sqrt((a1 -b1)*(a1 -b1) + (a2 - b2) * (a2 - b2)));
}
