package HW1.team;
import HW1.Status;

public class Team {
    private TeamMember[] members;
    private final String name;

    public Team(String name, TeamMember... members) {
     this.members = members;
     this.name = name;
    }

    public TeamMember[] getMembers() { return members; }

    public void showResult() {

    }
    private void showResultMemberNoPassed(TeamMember member) {
printDivider();
System.out.println(member.getName() + "No passed");
    }
    private void showResultMemberPassed(TeamMember member) {
printDivider();
System.out.println(member.getName() + "passed");
    }
    private void printDivider() {System.out.println("-----------------");}
}
