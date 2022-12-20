package ch.noseryoung.blj;
/**
 * This class creats a player.
 * @author Krish & ainhoa
 * @version 1.0.0
 */
public class Player {
// attributes
        private String name;
        private int age;
        private int singleTitles;
        private int wins;
        private Trainer trainer;
        private Racket racket;
        //it shows a aggregation between player and racket.
        public Player() {
            racket = new Racket(0.68f, 0.68f, "Wilson");
        }

        /**
         * This method gets the name of the player.
         * @return name
         */
        public String getName() {
            return name;
        }
        /**
         * This method sets the name of the player.
         * @param name
         */
        public void setName(String name) {
            this.name = name;
        }
        /**
         * This method gets the age of the player.
         * @return age
         */
        public int getAge() {
            return age;
        }
        /**
         * This method sets the age of the player.
         * @param age
         */
        public void setAge(int age) {
            this.age = age;
        }
        /**
         * This method gets the number of single titles of the player.
         * @return singleTitles
         */
        public int getSingleTitles() {
            return singleTitles;
        }
        /**
         * This method sets the number of single titles of the player.
         * @param singleTitles
         */
        public void setSingleTitles(int singleTitles) {
            this.singleTitles = singleTitles;
        }
        /**
         * This method gets the number of wins of the player.
         * @return wins
         */
        public int getWins() {
            return wins;
        }
        /**
         * This method sets the number of wins of the player.
         * @param wins
         */
        public void setWins(int wins) {
            this.wins = wins;
        }
        /**
         * This method gets the trainer of the player.
         * @return trainer
         */
        public Trainer getTrainer() {
            return trainer;
        }
        /**
         * This method sets the trainer of the player.
         * @param trainer
         */
        public void setTrainer(Trainer trainer) {
            this.trainer = trainer;
        }
        /**
         * This method gets the racket of the player.
         * @return racket
         */
        public Racket getRacket() {
            return racket;
        }
        /**
         * This method sets the racket of the player.
         * @param racket
         */
        public void setRacket(Racket racket) {
            this.racket = racket;
        }
}
