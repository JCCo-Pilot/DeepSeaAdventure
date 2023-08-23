import java.util.*;
public class Player {
    private ArrayList<Treasure>stack;
    private int count;
    public Player(){
        stack = new ArrayList<Treasure>();
        count = 0;
    }
    public int getNumberOfTreasure(){
        return stack.size();
    }
    public void addTreasure(Treasure t){
        stack.add(t);
    }
    public int getValue(){
        int result = 0;
        for (int i =0; i<stack.size();i++){
            result +=stack.get(i).getValue();
        }
        return result;
    }
}
