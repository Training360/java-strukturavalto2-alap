package exceptionmulticatch.converter;

public class AnswerStat {

    private BinaryStringConverter converter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.converter = binaryStringConverter;
    }

    public int answerTruePercent(String answers) {
        boolean[] booleans = convert(answers);
        int numberOfTrue = 0;
        for (int j = 0; j < booleans.length; j++) {
            if (booleans[j]) {
                numberOfTrue++;
            }
        }
        return (int)Math.round((double)numberOfTrue / booleans.length * 100);
    }

    public boolean[] convert(String checkboxes) {
        try {
            return converter.binaryStringToBooleanArray(checkboxes);
        } catch (NullPointerException | IllegalArgumentException ex) {
            throw new InvalidBinaryStringException(ex);
        }
    }

}
