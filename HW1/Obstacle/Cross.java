package HW1.obstacle;
import HW1.team.TeamMember;
public class Cross extends Obstacle {
    public Cross(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.run(super.getDifficulty());
    }
}
