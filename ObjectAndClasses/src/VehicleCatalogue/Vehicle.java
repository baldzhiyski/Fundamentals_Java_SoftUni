package VehicleCatalogue;
public class Vehicle {
    private String typeOfVehicle ;
    private String modelOfVehicle;
    private String color ;
    private int horsePower;

    public Vehicle(String typeOfVehicle,String modelOfVehicle,String color,int horsePower){
        this.typeOfVehicle=typeOfVehicle;
        this.modelOfVehicle=modelOfVehicle;
        this.color=color;
        this.horsePower=horsePower;
    }

    public String getModelOfVehicle() {
        return modelOfVehicle;
    }

    public String getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }
}
