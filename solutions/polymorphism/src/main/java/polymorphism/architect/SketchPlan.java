package polymorphism.architect;

public class SketchPlan extends Plan {

    protected String title;

    public SketchPlan(int pagesOfDocumentation, String title) {
        super(pagesOfDocumentation);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int getPagesOfDocumentation() {
        return pagesOfDocumentation;
    }
}
