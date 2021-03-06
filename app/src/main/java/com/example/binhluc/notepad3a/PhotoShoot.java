package com.example.binhluc.notepad3a;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "photoshoots")
public class PhotoShoot {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "title")
    private String noteTitle;

    @ColumnInfo(name = "text")
    private String noteText;

    @ColumnInfo(name = "date")
    private String noteDate;

    @ColumnInfo(name = "image")
    private byte[] noteImage;

    public PhotoShoot(String noteTitle, String noteText, String noteDate, byte[] noteImage)
    {
        this.noteTitle = noteTitle;
        this.noteText = noteText;
        this.noteDate = noteDate;
        this.noteImage = noteImage;
    }
    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public String getNoteDate() {
        return noteDate;
    }

    public void setNoteDate(String noteDate) {
        this.noteDate = noteDate;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public byte[] getNoteImage() {
        return noteImage;
    }

    public void setNoteImage(byte[] noteImage) {
        this.noteImage = noteImage;
    }
}
