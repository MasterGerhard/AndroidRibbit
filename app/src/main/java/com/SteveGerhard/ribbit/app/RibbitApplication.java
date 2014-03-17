package com.SteveGerhard.ribbit.app;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by SteveG on 3/17/14.
 */
public class RibbitApplication extends Application {


    @Override
    public void onCreate() {
        Parse.initialize(this,"QZAJEHXqkDBD7YinkY5lSsbsX3uLnEEOGRZdZTPo","4a8z2pjGv7pTdMtn0WsI6udDOuWNTg9CLQxWm9Sm");


    }

}
