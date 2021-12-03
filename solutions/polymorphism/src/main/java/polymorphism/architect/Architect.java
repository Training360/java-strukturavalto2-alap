package polymorphism.architect;

public class Architect {

    public static void main(String[] args) {
        Plan firstPlan = new SketchPlan(135, "Családi ház");
        System.out.println(firstPlan.getPagesOfDocumentation());

        Plan secondPlan = new PermitPlan(135, "Családi ház", "Kiss József", "1124, Lejtő u. 20");
        System.out.println(secondPlan.getPagesOfDocumentation());

        Plan thirdPlan = new ConstructionPlan(135, "Családi ház", "Kiss József", "1124, Lejtő u. 20", 72);
        System.out.println(thirdPlan.getPagesOfDocumentation());

        SketchPlan firstSketchPlan = new SketchPlan(135, "Családi ház");
        System.out.println(firstSketchPlan.getTitle());
        System.out.println(firstSketchPlan.getPagesOfDocumentation());

        SketchPlan secondSketchPlan = new PermitPlan(135, "Családi ház", "Kiss József", "1124, Lejtő u. 20");
        System.out.println(secondSketchPlan.getTitle());
        System.out.println(secondSketchPlan.getPagesOfDocumentation());

        SketchPlan thirdSketchPlan = new ConstructionPlan(135, "Családi ház", "Kiss József", "1124, Lejtő u. 20", 72);
        System.out.println(thirdSketchPlan.getTitle());
        System.out.println(thirdSketchPlan.getPagesOfDocumentation());

        Header firstHeader = new PermitPlan(135, "Családi ház", "Kiss József", "1124, Lejtő u. 20");
        System.out.println(firstHeader.getNameOfClient());
        System.out.println(firstHeader.getAddressOfBuilding());

        Header secondHeader = new ConstructionPlan(135, "Családi ház", "Kiss József", "1124, Lejtő u. 20", 72);
        System.out.println(secondHeader.getNameOfClient());
        System.out.println(secondHeader.getAddressOfBuilding());

        PermitPlan firstPermitPlan = new PermitPlan(135, "Családi ház", "Kiss József", "1124, Lejtő u. 20");
        System.out.println(firstPermitPlan.getTitle());
        System.out.println(firstPermitPlan.getHeader());
        System.out.println(firstPermitPlan.getPagesOfDocumentation());
        System.out.println(firstPermitPlan.getNameOfClient());
        System.out.println(firstPermitPlan.getAddressOfBuilding());

        PermitPlan secondPermitPlan = new ConstructionPlan(135, "Családi ház", "Kiss József", "1124, Lejtő u. 20", 72);
        System.out.println(secondPermitPlan.getTitle());
        System.out.println(secondPermitPlan.getHeader());
        System.out.println(secondPermitPlan.getPagesOfDocumentation());
        System.out.println(secondPermitPlan.getNameOfClient());
        System.out.println(secondPermitPlan.getAddressOfBuilding());

        ConstructionPlan constructionPlan = new ConstructionPlan(135, "Családi ház", "Kiss József", "1124, Lejtő u. 20", 72);
        System.out.println(constructionPlan.getTitle());
        System.out.println(constructionPlan.getHeader());
        System.out.println(constructionPlan.getPagesOfDocumentation());
        System.out.println(constructionPlan.getNameOfClient());
        System.out.println(constructionPlan.getAddressOfBuilding());
        System.out.println(constructionPlan.getSheetsOfConstructionDrawings());
    }
}
