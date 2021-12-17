package sorting;

import java.util.Arrays;

public class Income {

    private int[] incomes;

    public Income(int[] incomes) {
        this.incomes = incomes;
    }

    public int[] getIncomes() {
        return incomes;
    }

    public int getHighestIncome() {
        Arrays.sort(incomes);
        return incomes[incomes.length - 1];
    }
}
