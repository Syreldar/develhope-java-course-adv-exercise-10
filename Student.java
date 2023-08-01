class Student extends CollegePerson implements LearningPerson
{
    private final int academicYear;

    public Student(String name, String surname, int id, int year)
    {
        super(name, surname, id);
        this.academicYear = year;
    }

    @Override
    public void studyAtHome()
    {
        System.out.println("As a student, I am studying at home.");
    }
}
