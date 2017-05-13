package javase01.t02.Enums;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by m-levin on 12.05.2017.
 */
public class SubjectsApp {

    enum Subjects { BIOLOGY, ALGEBRA, GEOMETRY, PHYSICS, INFORMATICS, HISTORY }

    private static int groupsAmount;
    private static int studentsAmount;

    static HashMap<Integer, Group> integerGroupHashMap = new HashMap<>();
    static HashMap<Integer, Student> integerStudentHashMap = new HashMap<>();
    static HashMap<Integer, MainMenuOption> integerMainMenuOptionHashMap = new HashMap<>();

    public static void main(String[] args) {

    }

    static <K, V> void showMap(HashMap<K, V> map) {

        for (Map.Entry e : map.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

    }

    static void initializeMainMenu() {

    }

    public void showMainMenu() {

        System.out.println("Available options:");
        System.out.println("1 - add a group");
        System.out.println("2 - add a student");
        System.out.println("3 - show all students");
        System.out.println("4 - show all groups");
        System.out.println("5 - show student info");
        System.out.println("6 - show group info");
        System.out.println("7 - remove a student from a group");
    }

    static class Group<Subjects, Double> {

        private int groupId;
        private TreeMap<Student, Double> studentTTreeMap;

    }

    static class Student {

        private TreeMap<Group, Double> groupDoubleTreeMap;
        private int studentId;

    }

    static <K, V> void checkIndex(HashMap<K, V> map) {



    }
}
