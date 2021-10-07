package composition;

public class TrainerMain {

    public static void main(String[] args) {
//        Trainer trainer = new Trainer("John Doe");
//        System.out.println(trainer.getAddress());
//
//        Address address = new Address("Budapest", "Váci utca");
//        trainer.setAddress(address);
//
//        Address trainerAddress = trainer.getAddress();
//        System.out.println(trainerAddress.getCity());

        Trainer trainer = new Trainer("John Doe", new Address("Budapest", "Váci út"));
        System.out.println(trainer.getAddress().getCity());

        trainer.setAddress(new Address("Pécs", "Fő út"));
        System.out.println(trainer.getAddress().getCity());
    }
}
