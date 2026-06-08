package inheritance.task2;

public class HybridType extends VehicleTypeByFuelTypes{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }
}
