package HW1.obstacle;

import HW1.Status;
import HW1.team.Team;
import HW1.team.TeamMember;

public class Course {
    private Obstacle[] obstacles;
    public Course(Obstacle... obstacles) { this.obstacles = obstacles; }
    public void doIt(Team team) {
        for (TeamMember member: team.getMembers()) {
            for (Obstacle obs :obstacles) {
                obs.goChallenge(member);
                if (member.getStatus()== Status.NoPassedDistance){
                    break;
                }
            }
        }
    }
}
