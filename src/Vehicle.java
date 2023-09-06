public class Vehicle {

    private String carName;

    public Vehicle(String name) {
        this.carName = name;
    }

    public void driveCar() {
        String article;
        if("aeiou".contains(super.getClass().getSimpleName().toLowerCase().substring(0, 1))){
            article = "an ";
        } else {
            article = "a ";
        }
        String className = super.getClass().getSimpleName().toLowerCase();
        System.out.println("\n" + this.carName + " is " + article + className + " car. \n");
    }

    public static Vehicle setVehicleType(String type, String carName){
        return switch(type.toUpperCase().charAt(0)){
            case 'O' -> new Offroad(carName);
            case 'F' -> new Family(carName);
            case 'E' -> new Emergency(carName);
            default -> new Vehicle(carName);
        };
    }
}

class Offroad extends Vehicle {
    public Offroad(String name) {
        super(name);
    }

    @Override
    public void driveCar() {
        super.driveCar();
    }
}

class Family extends Vehicle{
    public Family(String name){
        super(name);
    }

    @Override
    public void driveCar() {
        super.driveCar();
    }
}

class Emergency extends Vehicle{
    public Emergency(String name){
        super(name);
    }

    @Override
    public void driveCar() {
        super.driveCar();
    }
}
