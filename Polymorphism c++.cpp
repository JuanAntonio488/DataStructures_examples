/* Polymorphism Example C++*/

#include <iostream>
using namespace std;

//Base class

public class Animal {
	public:
		void animalSound(){
			cout << "The animal makes a sound\n";
		}
};

//Derived class

class Pig : Animal {
	public:
		void animalSound(){
			cout << "The pig says: wee wee \n";
		}
};

//Derived class
class Dog : Animal{
	public:
		void animalSound(){
			cout << "The dog says: bow wow \n";
		}
};

int main(){
	Animal myAnimal;
	Pig pig;
	Dog dog;
	
	myAnimal.animalSound();
	pig.animalSound();
	dog.animalSound();
}


