package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {

    private List<FamilyMember> familyMembers;

    public Family() {
        this.familyMembers = new ArrayList<>();
    }

    public List<FamilyMember> getFamilyMembers() {
        return familyMembers;
    }

    public void addFamilyMember(FamilyMember familyMember) {
        familyMembers.add(familyMember);
    }

    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String name) {
        List<Integer> result = new ArrayList<>();
        for (FamilyMember f : familyMembers) {
            if (f.getName().contains(name)) {
                result.add(f.getAge());
            }
        }
        return result;
    }
}
