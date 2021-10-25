public class Team {
    String name;
    Participant[] participants;

    public Team(String name, Participant participant1, Participant participant2, Participant participant3, Participant participant4)
    {
        this.participants = new Participant[]{participant1, participant2, participant3, participant4};
        this.name = name;
    }

    public void printInfoParticipants()
    {
        System.out.println(this.name + ':');
        for (Participant participant: this.participants)
        {
            participant.info();
        }
    }

    public void printInfoFinishCourse()
    {
        for (Participant participants: participants)
        {
            if(participants.isFinish)
            {
                participants.info();
            }
        }

    }
}

















//2. Добавить класс Team, который будет содержать:
//название команды;
//массив из четырех участников — в конструкторе можно сразу всех участников указывать);
//метод для вывода информации о членах команды, прошедших дистанцию;
//метод вывода информации обо всех членах команды.