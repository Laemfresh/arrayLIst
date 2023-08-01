import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception1 {


       /* List<Cat> arrayCat = new ArrayList<>();
        arrayCat.add(new Cat("murca",2));
        arrayCat.add(new Cat("noname",1));
        arrayCat.add(new Cat("supra",1));*/

        
        List<Integer> arraylist = new ArrayList<>();
        Random random = new Random();
        int listSize = 50;
        for (int i = 0; i <listSize; i++) {

            int randomNumber= random.nextInt(100);
            arraylist.add(randomNumber);
        }
        ArrayList<Integer> evenNumbersList = new ArrayList<>();
        ArrayList<Integer> oddNumbersList = new ArrayList<>();

        for (int number : arraylist) {
            if (number % 2 == 0) {
                evenNumbersList.add(number);
            } else {
                oddNumbersList.add(number);
            }
        }

        System.out.println("Original ArrayList: " + arraylist);
        System.out.println("Even numbers: " + evenNumbersList);
        System.out.println("Odd numbers: " + oddNumbersList);



        }

    }