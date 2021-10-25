public class Participant {
    String name;
    int runningDistance;
    boolean isFinish;

    public Participant(String name, int runningDistance)
    {
        this.name = name;
        this.runningDistance = runningDistance;
        this.isFinish = false;
    }

    public void info()
    {
        System.out.println(name + " " + runningDistance + " " + isFinish);
    }

}
