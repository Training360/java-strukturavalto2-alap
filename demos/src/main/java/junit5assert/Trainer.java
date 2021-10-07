package junit5assert;

public class Trainer {

    private String name;

    private int salary;

    private int[] lessonByTheDay;

    public Trainer(String name, int salary, int[] lessonByTheDay) {
        this.name = name;
        this.salary = salary;
        this.lessonByTheDay = lessonByTheDay;
    }

    public double getSalaryByTheMonth() {
        return salary / 12.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int[] getLessonByTheDay() {
        return lessonByTheDay;
    }

    public void setLessonByTheDay(int[] lessonByTheDay) {
        this.lessonByTheDay = lessonByTheDay;
    }
}
