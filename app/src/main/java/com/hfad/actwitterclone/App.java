package com.hfad.actwitterclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("1H4zUdNOR0no0lrtUo3dxAWinosUooqxwtrPqctb")
                // if defined
                .clientKey("F1IUhYVZPJ96UtHwV3IvLa7YhSqQOAUog3L8iRQX")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }
}
