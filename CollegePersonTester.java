public class CollegePersonTester
{
    public static void main(String[] args)
    {
        Student student = new Student("John", "Doe", 1, 2023);
        Professor professor = new Professor("Jane", "Smith", 2, "Computer Science");
        Assistant assistant = new Assistant("David", "Johnson", 3, true);

        student.goToCollege();
        student.studyAtHome();

        professor.goToCollege();
        professor.teachToOtherPeople();

        assistant.goToCollege();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }
}
