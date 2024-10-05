package thread.timer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Timer;
import java.util.TimerTask;

public class ThreadingMain {

	/**
	 * Every 5 seconds a file is getting created,....
	 */
	public static void main(String[] args) throws IOException {
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				long fileName = System.currentTimeMillis();
				File textFile = new File("C:\\Users\\veera\\DevWorks\\files\\" + fileName + ".txt");
				try {
					if (textFile.createNewFile()) {
						System.out.println("File is created with name--> "+ fileName);
						try {
							Files.writeString(textFile.toPath(),
									"abcdefghijklmnopqrstuvwxyz  abcdefghijklmnopqrstuvwxyz  abcdefghijklmnopqrstuvwxyz",
									StandardOpenOption.APPEND);
						} catch (IOException e) {
							e.printStackTrace();
						}
					} else {
						System.err.println("File creation failed");
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}, 2000, 5000);
		
	}

}
