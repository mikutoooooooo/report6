import java.util.Arrays;
public class Board {
    public  void startBoard(){
    int[][] threearray = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
    for(int[] ary : threearray) {
        for(int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + " ");
        }
        System.out.println();
    }

   
    }
    
    
    
}
