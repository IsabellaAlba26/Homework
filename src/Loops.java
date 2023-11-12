public class Loops {
    public static void main(String[] args) {
        Loops homework= new Loops();
    }
    public Loops(){
        countUP();
        System.out.println();
        countByThrees();
        System.out.println();
        System.out.println();
        countDown();
        System.out.println();
        singSong();
    }

    public void countUP(){
        for (int x=1;x<6;x=x+1) {
            System.out.println(x);
        }
    }

    public void countByThrees(){
        for (int x = 3; x < 18; x = x + 3) {
            System.out.print(x);
            System.out.print(" ");
        }
    }

    public void countDown() {
        for (int x = 10; x > 0; x = x - 1) {
            if (x > 1) {
                System.out.print(x + ", ");
            } else {
                System.out.print(x);
            }
        }
        System.out.println();
        System.out.println("Happy Loops Year!");
    }

    public void singSong(){
        System.out.println("Now sing! :\n" + "Should auld acquaintance be forgot\n" +
                "And never brought to mind?\n" +
                "Should auld acquaintance be forgot\n" +
                "And the days of auld lang syne?\n" +
                "For auld lang syne, my dear\n" +
                "For auld lang syne\n" +
                "We'll drink a cup of kindness yet\n" +
                "For the sake of auld lang syne\n" +
                "And surely you will buy your cup\n" +
                "And surely I'll buy mine!\n" +
                "We'll take a cup of kindness yet\n" +
                "For the sake of auld lang syne\n" +
                "We two have paddled in the stream\n" +
                "From morning sun till night\n" +
                "The seas between us Lord and swell\n" +
                "Since the days of auld lang syne\n" +
                "For old acquaintance be forgot\n" +
                "And never brought to mind\n" +
                "Should old acquaintance be forgot\n" +
                "For the sake of auld lang syne?\n" +
                "For old acquaintance be forgot\n" +
                "And never brought to mind\n" +
                "Should old acquaintance be forgot\n" +
                "In the days of auld lang syne?\n" +
                "For auld lang syne, my dear\n" +
                "For auld lang syne\n" +
                "We'll drink a cup of kindness yet\n" +
                "For the sake of auld lang syne");
    }

}
