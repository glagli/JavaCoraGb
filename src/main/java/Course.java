public class Course {
    String[] hurdles = {"bench press", "running", "cycling"};

    public void doIt(Team team) {
        for (int i = 0; i < hurdles.length; i++) {
            for (int j = 0; j < team.partTeam.length; j++) {
                if (hurdles[i] == "bench press") {
                    if (team.partTeam[j].getStrength() >= 70) {
                        //System.out.println(team.partTeam[j].getSurname() + " прошел жим лежа");
                        team.partTeam[j].setPassedDistance(true);
                    } else {
                        //System.out.println(team.partTeam[j].getSurname() + " завалил жим лежа");
                        team.partTeam[j].setPassedDistance(false);
                    }
                }
                if (hurdles[i] == "running") {
                    if (team.partTeam[j].getDexterity() >= 70) {
                        //System.out.println(team.partTeam[j].getSurname() + " пробежал дистанцию");
                        team.partTeam[j].setPassedDistance(true);
                    } else {
                        //System.out.println(team.partTeam[j].getSurname() + " снят с забега");
                        team.partTeam[j].setPassedDistance(false);
                    }
                }
                if (hurdles[i] == "cycling") {
                    if (team.partTeam[j].getDexterity() >= 80) {
                        //System.out.println(team.partTeam[j].getSurname() + " проехал вело-дистанцию");
                        team.partTeam[j].setPassedDistance(true);
                    } else {
                        //System.out.println(team.partTeam[j].getSurname() + " снят с вело-заезда");
                        team.partTeam[j].setPassedDistance(false);
                    }
                }

            }

        }
    }
}

