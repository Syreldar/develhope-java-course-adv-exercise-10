class Assistant extends CollegePerson implements LearningPerson, TeachingPerson
{
    private final boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int id, boolean willBeAPhD)
    {
        super(name, surname, id);
        this.isGoingToBeAPhD = willBeAPhD;
    }

    @Override
    public void studyAtHome()
    {
        System.out.println("As an assistant, I am studying at home.");
    }

    @Override
    public void teachToOtherPeople()
    {
        System.out.println("As an assistant, I am teaching to other people.");
    }
}