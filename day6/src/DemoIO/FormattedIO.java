package DemoIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FormattedIO {
	// DataOutput and DataInputStream for formatted data
	public static void main(String[] args) {
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("foo.txt"))) {
			for (int i = 0; i < 10; i++) {
				dos.writeByte(i);
				dos.writeShort(i);
				dos.writeInt(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (DataInputStream dis = new DataInputStream(new FileInputStream("foo.txt"))) {
			for (int i = 0; i < 10; i++) {
				System.out.printf("%d %d %d", dis.readByte(), dis.readShort(), dis.readInt());
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
