#include <iostream>
#include <map>
#include <unordered_map>
#include <iterator>

using namespace std;

int main(){
	
	//map <string, int> agenda;
	//map <string,int>::iterator it;
	
	unordered_map <string, int> agenda;
	unordered_map <string,int>::iterator it;
	
	agenda.insert(make_pair("Juan",23));
	agenda.insert(make_pair("Antonio",23));
	agenda.insert(make_pair("Maria",19));
	agenda.insert(make_pair("Fernanda",19));
	
	agenda["Santi"] = 13;
	
	it = agenda.begin();
	
	while (it != agenda.end()){
		cout << it->first << "---->" << it->second << endl;
		it++;
	}
	
	it = agenda.find("Fernandaa");
	
	if(it == agenda.end()){
		cout << "Key not found" << endl;
	}	
	else{
		cout << "Key found" << endl;
	}
	return 0;
}
