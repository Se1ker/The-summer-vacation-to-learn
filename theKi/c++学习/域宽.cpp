#include<iostream>
using namespace std;
int main(void){
	printf("%-10.2f \n",11.2222);// 左对齐，右边补空格
	printf("%10.2f \n",11.2222); //右对齐，左边不满十位的补空格
	printf("%010.2f",11.2222); //右对齐，左边不满十位的补0
//	printf("%-010.2f \n",11.2222);// 无效
}
