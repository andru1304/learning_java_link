package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char myChar = 'c';
        char mychar2 = '\u00a9';
        boolean myBoolean = true;
        char myChar1 = Character.MAX_VALUE;
        System.out.println(myChar1);
        System.out.println(mychar2);
        boolean isCar = false;
        if (!isCar){
            System.out.println("will print");
        }else {
            System.out.println("Now will print this message");
        }
        String  newBool = isCar ? "If is car is true":"if iscar is false";
        boolean newBool1 = isCar ? true : false;
        System.out.println("Will print? " +newBool);
        System.out.println(newBool1);
        int ageOfClient = 20;
        boolean ifAgeOfClient = true;
        System.out.println("Will print: "+ifAgeOfClient);
    }
}
