public class main {
    public static void main(String[] args) {
        Participants participants1 = new Participants("Trevor","Filips",45,80,85);
        Participants participants2 = new Participants("Maikel","Taunli",50,45,50);
        Participants participants3 = new Participants("Franklin","Klinton",25,85,90);
        Participants participants4 = new Participants("Karl","Jonson",30,80,70);
        Participants participants5 = new Participants("Niko","Belick",43,66,66);
        Participants participants6 = new Participants("Klod","Smith",26,87,70);
        Participants participants7 = new Participants("Tommi","Versety",30,74,70);
        Participants participants8 = new Participants("David","Ueston",40,88,70);

        Team team1 = new Team("New Mans",new Participants[]{participants6,participants8,participants3,participants4});
        Team team2 = new Team("Old Mans",new Participants[]{participants1,participants2,participants5,participants7});
        team1.infoTeam();
        System.out.println("---------------------------------");
        team2.infoTeam();
        System.out.println("---------------------------------");
        Course course = new Course();
        course.doIt(team1);
        course.doIt(team2);
        team1.showResults(course);
        System.out.println("---------------------------------");
        team2.showResults(course);
    }
}
