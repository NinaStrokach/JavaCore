package HW1.team;

import HW1.Status;
public class TeamMember {
    private Status status = Status.NoPassedDistance;

    private  final String name;
    private final int power;

    public TeamMember(String name, int power){
        this.name = name;
        this.power = power;

    }

    public Status getStatus() { return status; }
    public String getName() { return name; }
    public void jump(int courseDifficulty){
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance, "pass jump");
        }
        else {
            changeStatus(Status.NoPassedDistance, "fail jump");
        }
    }
    public void run(int courseDifficulty){
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance, "pass run");
        }
        else {
            changeStatus(Status.NoPassedDistance, "fail run");
        }
    }

    public void swim(int courseDifficulty){
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance, "pass swim");
        }
        else {
            changeStatus(Status.NoPassedDistance, "fail swim");
        }
    }
    private boolean checkPower(int courseDifficulty){
        return power > courseDifficulty || power == courseDifficulty;
    }
    private void changeStatus(Status newStatus, String message){status = newStatus;
        System.out.println(name + message);}
}
