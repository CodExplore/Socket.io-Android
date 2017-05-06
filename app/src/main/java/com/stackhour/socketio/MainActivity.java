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

socket = IO.socket("192.168.1.1");
socket.on(Socket.EVENT_CONNECT, new Emitter.Listener() {

  @Override
  public void call(Object... args) {
    socket.emit("test", "hi");
    socket.disconnect();
  }

}).on("event", new Emitter.Listener() {

  @Override
  public void call(Object... args) {}

}).on(Socket.EVENT_DISCONNECT, new Emitter.Listener() {

  @Override
  public void call(Object... args) {
	  new Runnable(
	  
	  )
  }

});
socket.connect();
    }
	
	@Override
	protected void onDestroy(){
		super.onDestroy();
		socket.disconnect();
	}
	
}
