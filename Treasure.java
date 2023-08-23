public class Treasure {
    private int tier;
    private int value;
    private int xPos;
    private int yPos;
    public Treasure(){
        xPos = 0;
        yPos = 0;
        tier = 0;
        value= 0;
    }
    public Treasure(int i){
        tier = i;
    }
    public Treasure(int i, int a){
        tier = i; 
        value = a;
    }
    public int getValue(){
        return value;
    }
}
