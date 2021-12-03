package polymorphism.architect;

public class ConstructionPlan extends PermitPlan {

    private int sheetsOfConstructionDrawings;

    public ConstructionPlan(int pagesOfDocumentation, String title, String nameOfClient, String addressOfBuilding, int sheetsOfConstructionDrawings) {
        super(pagesOfDocumentation, title, nameOfClient, addressOfBuilding);
        this.sheetsOfConstructionDrawings = sheetsOfConstructionDrawings;
    }

    public int getSheetsOfConstructionDrawings() {
        return sheetsOfConstructionDrawings;
    }
}
