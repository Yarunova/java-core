public class Main {

    public static void main(String[] args) {
        Participant participant1 = new Participant("Vlad",40);
        Participant participant2 = new Participant("Gleb",90);
        Participant participant3 = new Participant("Stas",60);
        Participant participant4 = new Participant("Pavel",85);

        Team team = new Team("Реактив", participant1, participant2, participant3, participant4);
        Course course = new Course(55,40,80);
        course.finishCourse(team);
    }
}
