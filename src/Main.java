import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        }
    static int find(int[] integers){
       int coutner=0;
        List<Integer> odd= new ArrayList<>();
        List<Integer> even= new ArrayList<>();


        for (int i = 0; i < integers.length; i++) {
            if (integers[i]%2 ==0) {
                odd.add(integers[i]);
            }
            else {
                even.add(integers[i]);}

            }

        if (odd.size() == 1) {
            return odd.get(0);
        } else {
            return even.get(0);
        }
        }
    }
