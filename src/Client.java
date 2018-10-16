import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean chat = true;

		try {
			Socket socket = new Socket("localhost", 6969);

			DataOutputStream output = new DataOutputStream(socket.getOutputStream());
			DataInputStream input = new DataInputStream(socket.getInputStream());

			System.out.println("Successfully joined the server");
			System.out.print("Type your user name: ");

			output.writeUTF(scan.nextLine());
			output.flush();

			Thread write = new Thread(() -> {
				boolean connect = true;
				while (connect) {
					try {
						String message = scan.nextLine();
						output.writeUTF(message);
						output.flush();

						if (message.equalsIgnoreCase("quit")) {
							socket.close();
							connect = false;
						}

						if (message.equalsIgnoreCase("ready")) {
							connect = false;
						}

					} catch (IOException e) {
						e.printStackTrace();
					}
				}

			});
			write.start();

			Thread read = new Thread(() -> {
				boolean connect = true;
				while (connect) {
					try {
						String message = input.readUTF();
						System.out.println(message);
						if (message.equalsIgnoreCase("Game started")) {
							connect = false;
						}
					} catch (IOException e) {
						System.out.println(e + " SocketException expected, do not worry");
						break;
					}
				}

				boolean actingTurn = false;
				Scanner scan1 = new Scanner(System.in);
				while (true) {
					try {
						actingTurn = input.readBoolean();
						if (actingTurn) {
							System.out.println(input.readUTF());
							String command = "default";

							command = scan1.nextLine();

							output.writeUTF(command);
							output.flush();
							System.out.println(input.readUTF());
						} else {
							System.out.println(input.readUTF());
							System.out.println(input.readUTF());
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			read.start();

		} catch (IOException ex) {
			System.out.println(ex.toString() + '\n');
		}

	}

}
