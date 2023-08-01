class CollegePerson
{
    protected String name;
    protected String surname;
    protected int collegeId;

    public CollegePerson(String name, String surname, int id)
    {
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
    }

    public void goToCollege()
    {
        System.out.printf("Name: %s, Surname: %s, College ID: %d\n", name, surname, collegeId);
    }
}
