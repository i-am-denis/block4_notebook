package ua.notebook;

import java.util.ArrayList;

public class NoteBook {
    private ArrayList<Entry> entries;

    NoteBook() {
        entries = new ArrayList<Entry>();
    }

    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    public Entry getEntry(int index) {
        return entries.get(index);
    }
}
