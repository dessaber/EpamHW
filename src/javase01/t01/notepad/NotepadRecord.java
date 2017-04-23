package javase01.t01.notepad;

/**
 * Created by m-levin on 24.04.2017.
 */

class NotepadRecord {
    private String text;

    /**
     * Parameterized constructor.
     * @param text New record's text
     */
    NotepadRecord(String text) {
        this.text = text;
    }

    /**
     * Internal method to change record's text
     * @param text The text itself
     */
    void setText(String text) {
        this.text = text;
    }

    /**
     * Internal method to get to the record's text
     * @return Actual text
     */
    String getText() {
        return text;
    }
}
