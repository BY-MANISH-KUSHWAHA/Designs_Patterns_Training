package Creational_Extra;

public class Director {
    AirCraftBuilder airCraftBuilder;

    public Director(AirCraftBuilder airCraftBuilder) {
        this.airCraftBuilder = airCraftBuilder;
    }

    public void construct(boolean iPassenger){
        airCraftBuilder.builderEngine();
        airCraftBuilder.builderTyres();
        airCraftBuilder.builderWings();
    }
}
