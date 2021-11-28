public class Team {
    private String teamName;
    private boolean PassedDistance = false;
    Participants[] partTeam = new Participants[4];

    public Team(String teamName, Participants[] partTeam) {
        this.teamName = teamName;
        this.partTeam = partTeam;
    }

    public String getTeamName() {
        return teamName;
    }

    public void infoTeam() {
        System.out.println(teamName);
        for (int i = 0; i < partTeam.length; i++) {
            System.out.println(partTeam[i]);
        }
    }

    public void showResults(Course course) {
        int check = 0;
        for (int i = 0; i < partTeam.length; i++) {
            if (partTeam[i].isPassedDistance()) {
                check++;
            }
        }
        //System.out.println(check);
        if (check == partTeam.length) {
            System.out.println("Команда " + teamName + " прошла все испытания");
            for (int i = 0; i < partTeam.length; i++) {
                if (partTeam[i].isPassedDistance()) {
                    System.out.println(partTeam[i].getSurname() + " прошел всю дистанцию");
                }
                else {
                    System.out.println(partTeam[i].getSurname() + " не справился");
                }
            }
        } else {
            System.out.println("Команда " + teamName + " не прошла испытания");
            for (int i = 0; i < partTeam.length; i++) {
                if (!partTeam[i].isPassedDistance()) {
                    System.out.println(partTeam[i].getSurname() + " не справился");
                }
                else {
                    System.out.println(partTeam[i].getSurname() + " прошел всю дистанцию");
                }
            }
        }
    }

}
