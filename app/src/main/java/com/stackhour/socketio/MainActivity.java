package com.stackhour.socketio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
	
	private Socket connectSocket {
		
		try{
			connectSocket = IO.socket("");
		} catch(IOException e){
			e.printStackTrace();
		}
	}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       socket.connect();
    }
	
	
}
