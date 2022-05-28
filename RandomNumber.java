import java.util.Random;
public class RandomNumber {
    public static void main(String [] args){
            Random randompick = new Random();
            int random = randompick.nextInt(30);
            // generates integers in the range of 0 to 5
            System.out.println("number randomly picked:"+" "+random);
            System.out.println("from Math class:"+" "+Math.random()); //Math.random generates doubles
        }
    }

/*
output:

 */
