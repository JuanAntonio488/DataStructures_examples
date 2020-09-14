#include <iostream>

using namespace std;

int main(){
	
	try{
		int num = 0;
		
		if(num<0){
			throw "Error en el sistema";
		}
		
		else if(num==0){
			//throw 5;  Usar esta linea para ver la excepcion numerica
			throw 'a';
		}
		
		else{
			cout << num << endl;
		}
	}
	catch(const char* dato){
		cout << dato << endl;
	}
	catch(int dato){
		cout << "Error numero: " << dato << endl;
	}
	catch(...){
		cout << "Error!" << endl;
	}
	
	return 0;
}
