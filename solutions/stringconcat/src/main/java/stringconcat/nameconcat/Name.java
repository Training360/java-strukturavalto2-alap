package stringconcat.nameconcat;

public class Name {

    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, stringconcat.nameconcat.Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public String concatNameWesternStyle() {

        String nameString;

        if (title != null) {
            nameString = title.getTitleString();
            nameString = nameString.concat(" ");
            nameString = nameString.concat(givenName);
        } else {
            nameString = givenName;
        }
        nameString = nameString.concat(" ");
        if (middleName != null && !"".equals(middleName)) {
            nameString = nameString.concat(middleName);
            nameString = nameString.concat(" ");
        }
        nameString = nameString.concat(familyName);

        return nameString;
    }

    public String concatNameHungarianStyle() {

        String nameString;

        if (title != null) {
            nameString = title.getTitleString();
            nameString += " ";
            nameString += familyName;
        } else {
            nameString = familyName;
        }

        nameString += " ";

        if (middleName != null && !"".equals(middleName)) {
            nameString += middleName;
            nameString += " ";
        }
        nameString += givenName;

        return nameString;
    }
}
