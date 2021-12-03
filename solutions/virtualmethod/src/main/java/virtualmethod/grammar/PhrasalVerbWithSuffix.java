package virtualmethod.grammar;

public class PhrasalVerbWithSuffix extends PhrasalVerb implements Suffix {

    private String suffix;

    public PhrasalVerbWithSuffix(String word, String preposition, String suffix) {
        super(word, preposition);
        this.suffix = suffix;
    }

    @Override
    public String getSuffix() {
        return suffix;
    }

    @Override
    public String getWholeWord() {
        return super.getWholeWord() + suffix;
    }
}
