package week8.day05;

import week8.day04.Position;

import java.util.Arrays;
import java.util.List;

public class TeamsFileReader extends AbstractFileReader {

    @Override
    public String getFileName() {
        return "football.dat";
    }

    @Override
    public List<Integer> getFilteredIndexes() {
        return Arrays.asList(0, 18);
    }


    @Override
    public Position getNamePosition() {
        return new Position(7, 22);
    }

    @Override
    public Position getValue1Position() {
        return new Position(43, 45);
    }

    @Override
    public Position getValue2Position() {
        return new Position(50, 52);
    }
}
