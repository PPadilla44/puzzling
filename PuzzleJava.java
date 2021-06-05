import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava{

    public ArrayList<Integer> printSumReturnArray(int[] inputArray){
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        int sum = 0;

        for(int i : inputArray){
            sum+=i;
            if(i > 10){
                list.add(i);
            }
        }

        System.out.println("Sum of the array: " + sum);
        return list;
        
    }

    public ArrayList<String> shufflePrintNamesReturnArray(String[] inputArray){
        ArrayList<String> list = new ArrayList<String>();

        for(String str : inputArray){
            list.add(str);
        }

        Collections.shuffle(list);
        System.out.println(list);

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).length() < 6) {
                list.remove(i);
            }
        }

        return list;
    }

    public void shuffleAlphabet(String[] inputArray) {
        ArrayList<String> list = new ArrayList<String>();
        String[] vowels = {"a","e","i","o","u"};

        for(String str : inputArray){
            list.add(str);
        }

        Collections.shuffle(list);

        System.out.println("First Letter " + list.get(0));
        for(String i : vowels) {
            if(list.get(0) == i) {
                System.out.println("ITS A VOWEL!");
                
            }
        }
        System.out.println("Last Letter " + list.get(list.size()-1));
    }

    public ArrayList<Integer> random10Ints(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random generator = new Random();

        for(int i = 0; i < 10; i ++){
            list.add(generator.nextInt(45)+55);
        }

        return list;
    }

    public ArrayList<Integer> random10IntsSorted(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random generator = new Random();

        for(int i = 0; i < 10; i ++){
            list.add(generator.nextInt(45)+55);
        }

        Collections.sort(list);
        list.add(0,55);
        list.add(100);
        return list;
    }

    public String randomString(){
        Random generator = new Random();
        String[] alpha = {"a","b","c","d","e","f","g","h","i",
                        "j","k","l","m","n","o","p","q","r","s","t",
                        "u","v","w","x","y","z"};
        String result = "";
        
        for(int i = 0; i < 5; i++) {
            result += alpha[generator.nextInt(26)];
        }
        
        return result;
    }

    public ArrayList<String> randomStringArray(){
        Random generator = new Random();
        String[] alpha = {"a","b","c","d","e","f","g","h","i",
                        "j","k","l","m","n","o","p","q","r","s","t",
                        "u","v","w","x","y","z"};
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i = 0; i < 10; i++){
            String str = "";
            for(int j = 0; j < 5; j++) {
                str += alpha[generator.nextInt(26)];
            }
            list.add(str);
        }
        
        return list;
    }
}