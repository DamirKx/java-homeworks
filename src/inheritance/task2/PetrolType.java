package inheritance.task2;

public class PetrolType extends VehicleTypeByFuelTypes{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
