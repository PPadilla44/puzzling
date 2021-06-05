import java.util.ArrayList;

public class PuzzleJavaTest{
    
    public static void main(String[] args) {
        PuzzleJava test = new PuzzleJava();

        ArrayList<Integer> result1 = test.printSumReturnArray(new int[] {3,5,1,2,7,9,8,13,25,32});
        System.out.println(result1);
        
        System.out.println();
        
        ArrayList<String> result2 = test.shufflePrintNamesReturnArray(new String[] {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"});
        System.out.println(result2);

        System.out.println();
        
        String[] alpha = {"a","b","c","d","e","f","g","h","i",
                        "j","k","l","m","n","o","p","q","r","s","t",
                        "u","v","w","x","y","z"};
        test.shuffleAlphabet(alpha);

        System.out.println();

        System.out.println(test.random10Ints());

        System.out.println();

        System.out.println(test.random10IntsSorted());
        
        System.out.println();
        
        System.out.println(test.randomString());

        System.out.println();

        System.out.println(test.randomStringArray());
        
        
        
    }
}