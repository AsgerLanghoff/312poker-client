import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			Socket socket = new Socket("localhost", 6969);
			DataOutputStream output = new DataOutputStream(socket.getOutputStream());
			DataInputStream input = new DataInputStream(socket.getInputStream());


			System.out.println("Successfully joined the server");
			System.out.print("Type your user name: ");

			output.writeUTF(scan.nextLine());
			output.flush();

			new Thread(() -> {
				while (true) {
					try {
						output.writeUTF(scan.nextLine());
						output.flush();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}).start();

			new Thread(() -> {
				while (true) {
					try {
						System.out.println(input.readUTF());
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}).start();

			scan.close();
			socket.close();
		} catch (IOException ex) {
			System.out.println(ex.toString() + '\n');
		}
	}

}
