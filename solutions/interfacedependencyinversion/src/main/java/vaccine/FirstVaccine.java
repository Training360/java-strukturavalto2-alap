package vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine {

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        addPregnantsToVaccinationList(registrated);
        addEldersToVaccinationList(registrated);
        addOthersToVaccinationList(registrated);
    }

    private void addPregnantsToVaccinationList(List<Person> registrated) {
        for (Person p : registrated) {
            if (p.getPregnant() == Pregnancy.YES) {
                vaccinationList.add(p);
            }
        }
    }

    private void addEldersToVaccinationList(List<Person> registrated) {
        for (Person p : registrated) {
            if (p.getAge() > 65 && p.getPregnant() == Pregnancy.NO) {
                vaccinationList.add(p);
            }
        }
    }

    private void addOthersToVaccinationList(List<Person> registrated) {
        for (Person p : registrated) {
            if (p.getAge() <= 65 && p.getPregnant() == Pregnancy.NO) {
                vaccinationList.add(p);
            }
        }
    }
}
