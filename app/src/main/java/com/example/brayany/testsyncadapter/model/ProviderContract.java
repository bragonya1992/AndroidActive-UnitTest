package com.example.brayany.testsyncadapter.model;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public class ProviderContract {
    public static final String AUTHORITY = "com.example.brayany.testsyncadapter.provider";
    public static final Uri BASE_URI = Uri.parse("content://" + AUTHORITY);
    public static final Uri FAVORITES_URI = Uri.withAppendedPath(ProviderContract.BASE_URI,
            "/favorites");
    public static final String URI_TYPE_STUDENT_DIR = ContentResolver.CURSOR_DIR_BASE_TYPE +
            "/vnd.com.example.brayany.provider.favorites";
    public static final String URI_TYPE_STUDENT_ITEM = ContentResolver.CURSOR_ITEM_BASE_TYPE +
            "/vnd.com.example.brayany.provider.favorites";

    public static final class StudentsColumns implements BaseColumns {
        private StudentsColumns(){}

    }
    public static final String NAME = "name";

}
