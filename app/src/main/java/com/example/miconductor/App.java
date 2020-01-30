package com.example.miconductor;

import android.app.Application;

import io.socket.client.IO;
import io.socket.client.Socket;

public class App  extends Application {
    private static Socket mSocket;
    @Override
    public void onCreate() {
        super.onCreate();
//Se crea un socket que apunta a la ruta que se muestra
        try {
            mSocket = IO.socket("http://arlynupttaxi.eu-4.evennode.com/");
        }
        catch (Exception e){
        }
    }
    public static Socket getSocket() {
        return mSocket;
    }
}

