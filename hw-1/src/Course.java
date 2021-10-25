public class Course {
    int[] obstacles;

    public Course(int obstacle1, int obstacle2, int obstacle3)
    {
        this.obstacles = new int[] {obstacle1, obstacle2, obstacle3};
    }

    public void finishCourse(Team team)
    {
        for(Participant participant: team.participants) {
            for (int obstacle: this.obstacles) {

                if(participant.runningDistance >= obstacle) {
                    participant.isFinish = true;

                } else{
                    participant.isFinish = false;
                    break;
                }
            }

            if(participant.isFinish) {
                System.out.println(participant.name + " finished");
            }
        }
    }

}










//3. Добавить класс Course (полоса препятствий), в котором будут находиться:
//массив препятствий;
//метод, который будет просить команду пройти всю полосу.