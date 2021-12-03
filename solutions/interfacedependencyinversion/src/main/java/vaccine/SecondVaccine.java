package vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine {

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        addYoungPeopleToVaccinationList(registrated);
        addEldersToVaccinationList(registrated);
    }

    private void addYoungPeopleToVaccinationList(List<Person> registrated) {
        for (Person p : registrated) {
            if (p.getAge() <= 65 && p.getPregnant() == Pregnancy.NO && p.getChronic() == ChronicDisease.NO) {
                vaccinationList.add(p);
            }
        }
    }

    private void addEldersToVaccinationList(List<Person> registrated) {
        for (Person p : registrated) {
            if (p.getAge() > 65 && p.getPregnant() == Pregnancy.NO && p.getChronic() == ChronicDisease.NO) {
                vaccinationList.add(p);
            }
        }
    }
}
