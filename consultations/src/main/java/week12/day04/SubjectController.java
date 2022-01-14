package week12.day04;

public class SubjectController {


    public static void main(String[] args) {
        SubjectService subjectService = new SubjectService("src/main/resources/beosztas.txt");

        System.out.println(subjectService.getSubjectBlocks());

        System.out.println(subjectService.sumOfLessonNumberByName("Albatrosz Aladin"));

        System.out.println(subjectService.containsSubjectBlock(new SubjectBlock("Albatrosz Aladin","kemia","9.a",2)));

    }


}
