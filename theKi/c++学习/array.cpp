#include <iostream>
#include<vector>
using namespace std;
int merge(int *arr1, int *arr2) {
	vector<int> vec;
	while (*arr1 || *arr2) {
		if (*arr1 != 0) {
			cout << *arr1 << endl;
			vec.push_back(*arr1);
			arr1 ++;
		}
		if (*arr2 != 0) {
			cout << *arr2 << endl;
			vec.push_back(*arr2);
			arr2 ++;
		}
	
	}
	cout << vec[0]<< endl;
	return 1;
}
int main(void) {
	int array[10] = {1, 2, 3, 4, 5};
	int array2[10] = {5, 6, 7, 8};
	int matrix[2][2] = {{1, 2}, {3, 4}};
	// 声明一个不定长度的数组
	int n;
	cin >> n;
	int *arr =  new int[n];
	cout << sizeof(*arr) / sizeof(arr[0])<< endl;
	cout << * array << endl; // 1
	cout << ** matrix + 2 << endl; // 3
	merge(array, array2);
	return 0;
}

