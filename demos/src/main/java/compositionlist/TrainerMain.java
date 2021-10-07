package compositionlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrainerMain {

    public static void main(String[] args) {
//        Trainer trainer = new Trainer("John Doe");
//        System.out.println(trainer.getAddresses());
//
//        List<Address> addresses = new ArrayList<>(Arrays.asList(
//                new Address("Budapest", "Váci utca"),
//                new Address("Pécs", "Fő út")
//        ));
//        trainer.setAddresses(addresses);
//
//        System.out.println(trainer.getAddresses().get(0).getCity());
//
//        trainer.getAddresses().add(new Address("Győr", "Folyó utca"));
//
//        System.out.println(trainer.getAddresses().size());

//        Trainer trainer = new Trainer("John Doe");
//        System.out.println(trainer.getAddresses());
//        System.out.println(trainer.getAddresses().size());
//
//        //trainer.getAddresses().add(new Address("Budapest", "Váci utca"));
//        trainer.addAddress(new Address("Budapest", "Váci utca"));
//        System.out.println(trainer.getAddresses().size());
//        System.out.println(trainer.getAddresses().get(0).getCity());

        List<Address> address = new ArrayList<>(
                Arrays.asList(new Address("Budapest", "Váci utca"),
                        new Address("Pécs", "Fő utca"))
        );
        Trainer trainer = new Trainer("John Doe", address);

        System.out.println(trainer.getAddresses().get(0).getCity());

    }
}
