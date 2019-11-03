package _000_Sandbox._008_TernerayGames;


public class SoccerTeam {
    public static void main(String[] args) {
        /**
         * simple method
         int player = 11;
         String status = (player <= 11) ? "Teambuilding is finished" : "Too many players for field";
         System.out.println(status);
         */

        new SoccerTeam().buildSoccerTeam(16);


    }

    /**
     * recursive method
     */
    private String buildSoccerTeam(int player) {
        System.out.println("Number of players " + player);
        return (player < 12) ? "Teambuilding is finished" : buildSoccerTeam(player - 1);
    }

    /**
     * OUTPUT
     * Number of players 16
     * Number of players 15
     * Number of players 14
     * Number of players 13
     * Number of players 12
     * Number of players 11
     */
}
