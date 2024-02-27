package State;

public class TCPConnection {
	TCPConnectionState state;
	
	String strState;
	public void open() {
		state.open();
	}
	
	public void close() {
			state.close();
		}
	
}
