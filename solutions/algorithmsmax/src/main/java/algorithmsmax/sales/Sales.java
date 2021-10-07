package algorithmsmax.sales;

import java.util.List;

public class Sales {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales) {
        Salesperson salespersonWithMaxSalesAmount = null;
        for (Salesperson salesperson : sales) {
            if (salespersonWithMaxSalesAmount == null || salesperson.getAmount() > salespersonWithMaxSalesAmount.getAmount()) {
                salespersonWithMaxSalesAmount = salesperson;
            }
        }
        return salespersonWithMaxSalesAmount;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales) {
        Salesperson salespersonWithFurthestAboveTarget = null;
        for (Salesperson salesperson : sales) {
            if (salespersonWithFurthestAboveTarget == null
                    || (salesperson.getDifferenceFromTarget() > 0 && salesperson.getDifferenceFromTarget() > salespersonWithFurthestAboveTarget.getDifferenceFromTarget())) {
                salespersonWithFurthestAboveTarget = salesperson;
            }
        }
        return salespersonWithFurthestAboveTarget;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) {
        Salesperson salespersonWithFurthestBelowTarget = null;
        for (Salesperson salesperson : sales) {
            if (salespersonWithFurthestBelowTarget == null
                    || (salesperson.getDifferenceFromTarget() < 0 && salesperson.getDifferenceFromTarget() < salespersonWithFurthestBelowTarget.getDifferenceFromTarget())) {
                salespersonWithFurthestBelowTarget = salesperson;
            }
        }
        return salespersonWithFurthestBelowTarget;
    }
}
