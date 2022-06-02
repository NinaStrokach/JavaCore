package HW1.obstacle;
import HW1.team.TeamMember;

public class Jumping extends Obstacle {
    public Jumping(int difficulty){
        super(difficulty);
    }
    @Override
    public void goChallenge(TeamMember member) {member.jump(super.getDifficulty());}
}
