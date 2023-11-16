public class Conditionals {

    public static void main(String[] args) {
        Conditionals MagicEightBall=new Conditionals();
    }

    public Conditionals(){
        String question = "Will I live to 100?";
        System.out.println(question);
        int randomInt = (int)(Math.random()*11);
        if(randomInt<=1){
            System.out.println("Yes, I see that in your future.");
        } else if(randomInt<=2) {
            System.out.println("That seems unlikely.");
        } else if(randomInt<=3){
            System.out.println("Potentially.");
        } else if(randomInt<=4){
            System.out.println("Why would I spoil the surprise?");
        } else if(randomInt<=5){
            System.out.println("Hmmm. I don't see that many years ahead of you.");
        } else if (randomInt<=6){
            System.out.println("I see a large bus impeding your goal.");
        } else if(randomInt<=7){
            System.out.println("Without a doubt!");
        } else if(randomInt<=8){
            System.out.println("I can't answer that, but I can say your luck will shortly be running out.");
        } else if (randomInt<=9){
            System.out.println("My answer is conditional on your consumption of Diet Coke.");
        } else{
            System.out.println("Only if your enemy doesn't meddle with you.");
        }

    }


}
