package composition.realestate;

public class RealEstateDotCom {

    public static void main(String[] args) {
        Address address = new Address("Budapest", "1032", "Váradi utca", 14);
        System.out.println(address);

        Details details = new Details("Csodálatos panoráma a Hármashatár-hegyre egy 3+1 félszobás, 4. emeleti lakásból!",
                address, 85, 0);
        System.out.println(details);

        RealEstate realEstate = new RealEstate("3+1 félszobás, 4. emeleti, téglaépítésű lakás", 45.6, details);
        System.out.println(realEstate);
    }
}
