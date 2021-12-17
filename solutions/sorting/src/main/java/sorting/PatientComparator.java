package sorting;

import java.util.Comparator;

public class PatientComparator implements Comparator<Patient> {

    @Override
    public int compare(Patient one, Patient other) {
        return one.getTime().compareTo(other.getTime());
    }
}
