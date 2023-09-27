#include <iostream>
#include <conio.h>
using namespace std;

main()
{
	int array []={1,2,3,4,5}, i=0,x;
	cout<<"Masukan data yang akan anda cari "; cin>>x;
	array[5]=x;
	i=0;
	while (array[i]!=x)
	i++;
	if (i<5)
	{
		cout<<"Data Ketemu";
	}
	else
	cout<<"Data Tidak ditemukan";
	getch();
}
