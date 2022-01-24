package week13.day04;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Human> myList = List.of(new Human("John",12), new Human("Jack",10),new Human("Jane",18));

        myList.stream().sorted(Comparator.comparing(Human::getName)).collect(Collectors.toList());


    }


    public static class Human{
        private String name;
        private int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
