#include<iostream>
using namespace std;
// 给出前两项，计算n位值
int main() {
	int a1, a2, n;
	cin >> a1 >> a2 >> n;
	int d = a1 - a2;
	cout << a1 - (n-1) * d << endl;
	return 0;
}


