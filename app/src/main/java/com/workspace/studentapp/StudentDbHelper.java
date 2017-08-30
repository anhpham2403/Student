package com.workspace.studentapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static android.R.attr.version;

/**
 * Created by workspace on 29/08/2017.
 */

public class StudentDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "student.db";
    private static final String TEXT_TYPE = "TEXT";
    private static final String INTEGER_TYPE = "INTEGER";
    private static final String BOOLEAN_TYPE = "BOOLEAN";
    private static final String COMMA_SEP = ",";

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + StudentsPersistenceContract.TaskEntry.TABLE_NAME + " (" +
                    StudentsPersistenceContract.TaskEntry._ID + INTEGER_TYPE + " PRIMARY KEY," +
                    StudentsPersistenceContract.TaskEntry.COLUMN_NAME_ENTRY_ID + TEXT_TYPE + COMMA_SEP +
                    StudentsPersistenceContract.TaskEntry.COLUMN_NAME_NAME + TEXT_TYPE + COMMA_SEP +
                    StudentsPersistenceContract.TaskEntry.COLUMN_NAME_EMAIL + TEXT_TYPE + COMMA_SEP +
                    StudentsPersistenceContract.TaskEntry.COLUMN_NAME_AGE + INTEGER_TYPE +
                    " )";

    public StudentDbHelper(Context context) {
        super(context, DATABASE_NAME, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onDowngrade(db, oldVersion, newVersion);
    }
}
