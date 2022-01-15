import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class InputBoard {
        
    Board board = new Board();
    ArrayList<Integer> intBoard = new ArrayList<Integer>();
    //staticをつけることで後に作る判定メソットでも使用できるようにする。
    static List<String> strBoard = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i");
    /*public void addstrBoard(){
        strBoard.add("a");
        strBoard.add("b");
        strBoard.add("c");
        strBoard.add("d");
        strBoard.add("e");
        strBoard.add("f");
        strBoard.add("g");
        strBoard.add("h");
        strBoard.add("i");
    }*/

    
    
    
    public void input(String Player){
        
        
        

        int num;

        
        if(Player == "o"){
            
            System.out.println("0~8を入力してください"); 
            Scanner scan = new Scanner(System.in);     
            num = scan.nextInt(); 
        }
        else{
            num = (int)(Math.random()*9);

        }


        

        if(strBoard.get(num) == "x" || strBoard.get(num) == "o"){
            System.out.println("そこにはすでに値が入っています。もう一度入力してください");
            
            this.input(Player);
            

        }
        

        else {
            strBoard.set(num, Player);
            System.out.println(strBoard);

        }

    }
}
