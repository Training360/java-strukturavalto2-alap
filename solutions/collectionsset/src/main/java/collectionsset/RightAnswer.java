package collectionsset;

import java.util.Objects;

public class RightAnswer {

    private String nameOfSolver;

    public RightAnswer(String nameOfSolver) {
        this.nameOfSolver = nameOfSolver;
    }

    public String getNameOfSolver() {
        return nameOfSolver;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        RightAnswer rightAnswer = (RightAnswer) other;
        return nameOfSolver.equals(rightAnswer.nameOfSolver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfSolver);
    }
}
