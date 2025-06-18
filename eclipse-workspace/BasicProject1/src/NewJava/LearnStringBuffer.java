package NewJava;

public class LearnStringBuffer {

	public static void main(String[] args) {
		// Simulating a chat history using StringBuffer
		StringBuffer chatHist = new StringBuffer();

		chatHist.append("Sonu : Hi Manu \n");
		chatHist.append("Manu : Hi, How are You \n");
		chatHist.append("Sonu : I am fine\n");

		// Print the chat history
		System.out.println(chatHist.toString());
	}
}
