import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class InputBoard {
        
    Board board = new Board();
    ArrayList<Integer> intBoard = new ArrayList<Integer>();
    //staticをつけることで後に作る判定メソットでも使用できるようにする。
    static List<String> strBoard = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i");
    
    //キーボード入力を受け付けるためのメソッド
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
            //座標に値が入っている場合にもう一度メソッドを呼び出す（擬似ループ）
            this.input(Player);
        }
        //指定した座標に代入
        else {
            strBoard.set(num, Player);
        }
    }

    //番を作成
    public void StrBoard(){

        for (int i = 0; i < 9; i++) {
            
            if(i%3 == 2){
                System.out.println(strBoard.get(i));
            }
            else{ 
                System.out.print(strBoard.get(i));
            } 
        


        }
    }
}
