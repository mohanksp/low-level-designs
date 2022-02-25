package core.oodesign.creational.singleton;

/**
 * Created by mlal on 5/31/2017.
 */

class CustomException extends Exception{
    CustomException(String str){
        super(str);
    }
}
public class MakeACaptain {

    //private static MakeACaptain INSTANCE;

    private MakeACaptain() {
        //throw new CustomException("Not Possible");
    }

    /*public static MakeACaptain getCaptain() {
        // Lazy initialization
        if(INSTANCE == null) {
            System.out.println("New Captain selected for our team");
            INSTANCE =  new MakeACaptain();
        } else {
            System.out.print("You already have a Captain for your team. ");
            System.out.println("Send him for the toss.");
        }
        return INSTANCE;
    }*/

    //Bill Pugh solution - standard solution
    private static class SingletonHelper{
        //Nested class is referenced after getCaptain() is called
        private static final MakeACaptain INSTANCE = new MakeACaptain();
    }
    public static MakeACaptain getCaptain()
    {
        return SingletonHelper.INSTANCE;
    }

}
