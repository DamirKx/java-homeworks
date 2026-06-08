package inheritance.task2;

public class DieselType extends VehicleTypeByFuelTypes{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.DIESEL.name();
    }
}
