class Vehicle{
    public void start(){

        System.out.println("vehicle started");
    }
    public void stop(){
        System.out.println("vehicle stopped");

    }
}

class Car extends Vehicle{
    public void start(){

        System.out.println("car started");
    }
    public void stop(){
        System.out.println("car stopped");

    }
}

class MotorCycle extends Vehicle{
    public void start(){

        System.out.println("Motor cycle started");
    }
    public void stop(){
        System.out.println("Motor Cycle stopped");

    }
}



public class VehicleClassifier {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        c.stop();
        MotorCycle motorCycle=new MotorCycle();
        motorCycle.start();
        motorCycle.stop();

    }
}