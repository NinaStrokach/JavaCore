package HW1.obstacle;

import HW1.team.TeamMember;

public class Swimming extends Obstacle {
    public Swimming(int difficulty){
        super(difficulty);
    }
    @Override
    public void goChallenge(TeamMember member) {member.swim(super.getDifficulty());}
}
