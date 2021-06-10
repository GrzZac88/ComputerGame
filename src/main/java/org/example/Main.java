package org.example;

public class Main {

    public static void main(String[] args) {

        ComputerGame computerGame1 =
                new ComputerGame("Gra1",
                        PegiAgeRating.P12,
                        10.,
                        1024,
                        8,
                        2,
                        2,
                        2.4);
        ComputerGame computerGame2 =
                new ComputerGame("Gra2",
                        PegiAgeRating.P18,
                        51.,
                        4096,
                        78,
                        8,
                        4,
                        2.4);



        PCGame pcGame1 = new ComputerGameAdapter(computerGame1);
        System.out.println("Computer game:\n"+computerGame1+"\n\n\n"
                +
                "PCGAME:\n" + "getTitle: " + pcGame1.getTitle() + "\n" +
                "getPegiAllowedAge: " + pcGame1.getPegiAllowedAge() + "\n"+ "isTripleAGame: " + pcGame1.isTripleAGame() + "\n"+
                "getRequirements: " + pcGame1.getRequirements() + "\n");

        PCGame pcGame2 = new ComputerGameAdapter(computerGame2);
        System.out.println("Computer game:\n"+computerGame2+"\n\n\n"
                +
                "PCGAME:\n" + "getTitle: " + pcGame2.getTitle() + "\n" +
                "getPegiAllowedAge: " + pcGame2.getPegiAllowedAge() + "\n"+ "isTripleAGame: " + pcGame2.isTripleAGame() + "\n"+
                "getRequirements: " + pcGame2.getRequirements() + "\n");
    }

}
