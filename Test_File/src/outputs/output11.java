package outputs;

//Person name
class Person{
public String name;
public void owner() {
System.out.print(name+" has"+" ");}
}
//Vehicle
class Vehicle extends Person{
public String fuel;
public String made;
public void make(){
System.out.println(made);
}
public void runs_on_fuel(){
System.out.println("Runs on "+fuel);
}
}
//Car
class Honda_Accord_Car extends Vehicle{
	public void vehicle_name() {
		System.out.println("Honda Accord Car");
	}
}
//Bike
class Ducati_Bike extends Vehicle{
	public void vehicle_name() {
		System.out.println("Ducati Bike");
	}
}


class output11{
public static void main(String [] args){
Honda_Accord_Car car=new Honda_Accord_Car();
car.fuel="Diesel";
car.made="Made in India";
car.name="Sourabh";
car.owner();
car.vehicle_name();
car.make();
car.runs_on_fuel();


Ducati_Bike bike=new Ducati_Bike();
bike.fuel="Petrol";
bike.made="Imported";
bike.name="Sourabh";
bike.owner();
bike.vehicle_name();
bike.make();
bike.runs_on_fuel();
}
}

