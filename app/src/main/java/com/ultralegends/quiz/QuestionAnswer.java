package com.ultralegends.quiz;


public class QuestionAnswer {
    public static String questions[] = {
            "Which enables us to send the same letter to different persons?",
            "Which key deletes the character to the left of the cursor?",
            "Which key deletes the character to the right of the cursor?",
            "Which would you choose to save a document with a new name?",
            "Which would you choose to move selected text from one place to another?",
            "How do you magnify your document?",
            "Which enables you to move directly to specific location in a document?",
            "What are inserted as cross-reference in Word?",
            "Which keystroke is used for updating a field?",
            "A master document contains ………, each of which contains a pointer to a file on a disk?"


};
    public static String choices[][] = {
            {"macros ","template","mail merge","none"},
            {"End","Backspace","Home","Delete"},
            {"End","Backspace","Home","Delete"},
            {"Press Ctrl+S","Click File, Save","Click Tools, Options, Save","Click File, Save As"},
            {"Move and Paste","Copy and Paste","Cut and Paste","Delete and Paste"},
            {"View, Zoom","Format, Font","Tools, Options","Tools, Options"},
            {"Subdocuments","Bookmarks","Cross-references","Outlines"},
            {"Placeholders","Bookmarks","Objects","Word fields"},
            {"Placeholders","subdocuments","bookmarks","references"},
    };
    public static String correctAnswer[] = {
            "mail merge",
            "Backspace",
            "Delete",
            "Click File, Save As",
            "Cut and Paste",
            "View, Zoom",
            "Bookmarks",
            "Word fields",
            "subdocuments"
    };
}