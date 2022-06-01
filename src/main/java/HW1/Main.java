package HW1;

import HW1.obstacle.Course;
import HW1.obstacle.Cross;
import HW1.obstacle.Jumping;
import HW1.obstacle.Swimming;
import HW1.team.Team;
import HW1.team.TeamMember;

public class Main {
    public static void main(String[] args) {
        Team Star = new Team("Star",
                new TeamMember("A", 4),
                new TeamMember("B", 5),
                new TeamMember("C", 8),
                new TeamMember("D", 7));

        Course course = new Course(new Cross(5), new Swimming(5), new Jumping(3));
        course.doIt(Star);
    }
    }

