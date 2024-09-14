package classes.automobiles;

public abstract class Car {
    private int vinNumber;
    private String make;
    private String model;
    private int mileage;

//    Supongamos que estás construyendo un sistema de inventario de automóviles.
//    Todos los automóviles tienen un vinNumber, make, model y mileage.
//    Pero ningún automóvil es solo un automóvil cualquiera. Cada automóvil puede ser un Sedan,
//    un UtilityVehicle o un Truck.


    public Car(int vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public int getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(int vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
