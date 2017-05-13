package javase01.t02.Enums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Map;

/**
 * Created by m-levin on 13.05.2017.
 */
public interface MainMenuOption {

    public void chooseOption() throws IOException, NumberFormatException ;

}

class ChoosingShowGroups implements MainMenuOption {

    public void chooseOption() {
        System.out.println("All registered groups:");
        for (Map.Entry e: SubjectsApp.integerGroupHashMap.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}

class ChoosingShowStudents implements MainMenuOption {

    public void chooseOption() {
        System.out.println("All registered students:");
        for(Map.Entry e: SubjectsApp.integerStudentHashMap.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}

class ChoosingRemoveGroup implements MainMenuOption {

    public void chooseOption() throws IOException, NumberFormatException {
        System.out.println("Here's the list of all groups:");
        new ChoosingShowGroups().chooseOption();
        System.out.println("Which group would You like to remove?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int index = Integer.parseInt(reader.readLine());

    }
}

