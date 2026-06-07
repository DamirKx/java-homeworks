package inheritance.task2;

public class VehicleAd {
    private final int id;
    private String model;
    private VehicleTypeByPurpose vehicleTypeByPurpose;
    private VehicleTypeByBodyTypes vehicleTypeByBodyTypes;
    private VehicleTypeByFuelTypes vehicleTypeByFuelTypes;

    public VehicleAd(int id, String model, VehicleTypeByPurpose vehicleTypeByPurpose, VehicleTypeByBodyTypes vehicleTypeByBodyTypes, VehicleTypeByFuelTypes vehicleTypeByFuelTypes) {
        this.id = id;
        this.model = model;
        this.vehicleTypeByPurpose = vehicleTypeByPurpose;
        this.vehicleTypeByBodyTypes = vehicleTypeByBodyTypes;
        this.vehicleTypeByFuelTypes = vehicleTypeByFuelTypes;
    }
}
