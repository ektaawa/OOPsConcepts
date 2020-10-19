# OOPsConcepts
Class- It is a blueprint or the design which defines the objects and their behaviour.
Example- Human is a class with specifications like name, age, height, eyecolor and their behaviours like speak(), eat(), walk(), work(), etc.
But we need a constructor to construct or build the objects of type Human class.

Car myCar = new Car();
In Heap, Car refernce is stored i.e. the address

In Stack, main(), local variables,myCar, etc are stored. Once the method execution is completed, the place holder is deleted from the stack.

**Dependency Association-**
Eg: There is a Vehicle class which has 3 methods--> startEngine(), stopEngine(), accelerate(). Now there is a Driver class which takes Vehicle object as a parameter and uses accelerate() method which means Driver class is dependent on Vehicle class object to perform its drive operation.

**Composition Association-**
Eg: There is a Vehicle class which owns an Engine class. So if the Vehicle class ceases, then Engine class will also cease i.e. without Vehicle class, the Engine class object won't be working around. This type of association applies ownership so that means Vehicle class owns an Engine Object.

**Aggregation Association-**

