/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackathonCode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author U6032545
 */
public class MinimumSum {

    public static List<Integer> commonPrefix(List<String> inputs) {
        List output = new ArrayList();
        for (String s : inputs) {
            
            int length = s.length();
            int count = length;
            for (int i = 0; i < length; i++) {
                if (s.substring(i).startsWith(s.substring(0, i))) {
                    count = count + i;
                }

            }
            output.add(count);

        }
        return output;

    }
    public static void main(String args[]){
        List l = new ArrayList();
        l.add("abcabcd");
        l.add("bababcd");
        List la =commonPrefix(l);
        for(Object inf: la){
        System.out.println(inf);
        }
    
    }
}
