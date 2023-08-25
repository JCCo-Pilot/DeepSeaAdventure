import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame.*;
import java.awt.Graphics;
import java.lang.*;
public class fillTreasure {
    private int zeros,ones,twos,threes;
    private int fours, fives, sixes, sevens;
    private int eights, nines, tens, elevens;
    private int twelves, thirteens, fourteens, fifteens;
    public fillTreasure(){
        zeros = 2;
        ones = 2;
        twos = 2;
        threes = 2;
        fours = 2;
        fives = 2;
        sixes = 2;
        sevens = 2;
        eights = 2;
        nines = 2;
        tens = 2;
        elevens = 2;
        twelves =2;
        thirteens = 2;
        fourteens = 2;
        fifteens = 2;
    }
    public ArrayList fill(ArrayList<Treasure> t){
        ArrayList<Treasure> answer = fillTier(t);
        return answer;
    }
    public ArrayList fillTier(ArrayList<Treasure> t){
        for (int i = 0; i<8; i++){
            int seed = (int)(Math.random()*4)+0;
            if(seed == 0&&zeros>0){
                t.get(i).setValue(seed);
                zeros--;
            }
            if(seed == 1&&ones>0){
                t.get(i).setValue(seed);
                ones--;
            }
            if(seed == 2&&twos>0){
                t.get(i).setValue(seed);
                twos--;
            }
            if(seed == 3&&threes>0){
                t.get(i).setValue(seed);
                threes--;
            }
        }
        for (int i = 8; i<16; i++){
            int seed = (int)(Math.random()*4)+4;
            if(seed == 4&&fours>0){
                t.get(i).setValue(seed);
                fours--;
            }
            if(seed == 5&&fives>0){
                t.get(i).setValue(seed);
                fives--;
            }
            if(seed == 6&&sixes>0){
                t.get(i).setValue(seed);
                sixes--;
            }
            if(seed == 7&&sevens>0){
                t.get(i).setValue(seed);
                sevens--;
            }
        }
        for (int i = 16; i<24; i++){
            int seed = (int)(Math.random()*4)+8;
            if(seed == 0&&zeros>0){
                t.get(i).setValue(seed);
                eights--;
            }
            if(seed == 1&&ones>0){
                t.get(i).setValue(seed);
                nines--;
            }
            if(seed == 2&&twos>0){
                t.get(i).setValue(seed);
                tens--;
            }
            if(seed == 3&&threes>0){
                t.get(i).setValue(seed);
                elevens--;
            }
        }
        for (int i = 24; i<32; i++){
            int seed = (int)(Math.random()*4)+12;
            if(seed == 0&&zeros>0){
                t.get(i).setValue(seed);
                zeros--;
            }
            if(seed == 1&&ones>0){
                t.get(i).setValue(seed);
                ones--;
            }
            if(seed == 2&&twos>0){
                t.get(i).setValue(seed);
                twos--;
            }
            if(seed == 3&&threes>0){
                t.get(i).setValue(seed);
                threes--;
            }
        }
    }
}
