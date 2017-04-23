package javase01.t01.notepad;

import java.util.ArrayList;

/**
 * Created by m-levin on 24.04.2017.
 */
public class Notepad {

    private ArrayList<NotepadRecord> contents = new ArrayList<>();

    /**
     * Adds a new record after the last record using NotepadRecord parameterized constructor
     * @param text What your record actually says
     */
    public void addRecord(String text) {
        contents.add(new NotepadRecord(text));
    }

    /**
     * User can choose a place to write in, but some rows might not be empty
     * One can also make a lot of free space in between rows
     * @param index Place to insert the record in
     * @param text Record itself
     */
    public void addRecord(int index, String text) {
        if (contents.size() <= index) {
            while (index - contents.size() > 0)
                addRecord("");
            contents.add(index, new NotepadRecord(text));
        } else if (contents.get(index).getText().equals("")) {
            contents.add(index, new NotepadRecord(text));
        } else
            System.out.println("This row is not empty. Choose another space to write.");
    }

    /**
     * Removes a record from specified row and leaves it open
     * @param index Row with what number you want to erase
     */
    public void removeRecord(int index) {
        updateRecord(index, "");
    }

    /**
     * Change record
     * @param index Record with what number will be changed
     * @param text New record's text
     */
    public void updateRecord(int index, String text) {
        contents.get(index).setText(text);
    }

    /**
     * Simple output
     */
    public void showRecords() {
        for (int i = 0; i < contents.size(); ++i)
            System.out.println(contents.get(i).getText());
    }

    /**
     * Demonstration procedure
     * @param args
     */
    public static void main(String[] args) {

        Notepad notepad = new Notepad();
        notepad.addRecord("Hello");
        notepad.addRecord("World");
        notepad.addRecord("!!!");
        notepad.showRecords();
        notepad.removeRecord(1);
        notepad.showRecords();
        notepad.addRecord(5, "The end");
        notepad.showRecords();
    }
}

