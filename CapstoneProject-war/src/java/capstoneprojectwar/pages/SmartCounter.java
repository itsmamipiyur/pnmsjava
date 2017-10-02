/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package capstoneprojectwar.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Acer
 */
public final class SmartCounter {
    public static String generate(String id)
    {
        char[] lastID = id.toCharArray();
        int ctr = 0;
        char tempID = '\0';
        List<Character> characterList = new ArrayList<Character>();
        String newID = "";
        boolean add = true;
        for(ctr = lastID.length - 1; ctr >= 0; ctr--){
            tempID = lastID[ctr];
            if(add){
                if(Character.isDigit(tempID) || tempID == '0'){
                    if(tempID == '9'){
                        tempID = '0';
                        // System.out.println(tempID + " - i entered");
                        characterList.add(tempID);
                    }else{
                        tempID = Character.forDigit((Character.digit(tempID, 10) + 1), 10);
                        characterList.add(tempID);

                        add = false;
                    }
                }else{
                    characterList.add(tempID);
                }
            }else{
            	characterList.add(tempID);
            }
        }

        Collections.reverse(characterList);
        for(ctr = 0; ctr < lastID.length; ctr++){
            newID += characterList.get(ctr);
        }

        return newID;
    }
}
