package CompileTime;// overload- same method name with different parameter

public class MessageSenderCompiletime {
void sendMessage(String message) {
	System.out.println("Sending message to:" +message);
}
void sendMessage(String message,String recipient) {
	System.out.println("Sending message to "+recipient+":" +message);
}
void sendMessage(String message,boolean isUrgent) 
{
	if(isUrgent)
		System.out.println("Urgent:"+message);
	else
		System.out.println("Sending message:"+message);
}
	public static void main(String[] args) {
	MessageSenderCompiletime sender= new MessageSenderCompiletime();// new MessageSenderCompiletime()-Default Constructor
	sender.sendMessage("Hello");
	sender.sendMessage("Hello","vaishali");
	sender.sendMessage("Server down",true);

	}

}
