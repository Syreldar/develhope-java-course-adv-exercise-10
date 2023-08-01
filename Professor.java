class Professor extends CollegePerson implements TeachingPerson
{
    private final String teachingSubject;

    public Professor(String name, String surname, int id, String subject)
    {
        super(name, surname, id);
        this.teachingSubject = subject;
    }

    @Override
    public void teachToOtherPeople()
    {
        System.out.printf("As a professor, I am teaching %s\n", teachingSubject);
    }
}
