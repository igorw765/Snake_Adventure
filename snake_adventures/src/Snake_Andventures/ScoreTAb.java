package Snake_Andventures;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ScoreTAb {
	public String NickFromK;
	
	
	FileWriter fileWriter = null;{
	try {
		Scanner keyboard = new Scanner(System.in);
		String nick = "Enter your nick name";
		NickFromK = keyboard.next();
		String content = NickFromK;;
		File newTextFile = new File("C:\\Users\\50223\\Desktop\\Snake Players list\\score.txt");
		fileWriter = new FileWriter(newTextFile);
		fileWriter.write(content);
		fileWriter.close();
		
	
		
	}catch (IOException ex) {
		
		Logger.getLogger(Top.class.getName()).log(Level.SEVERE, null, ex);
	}finally{
		try {
			fileWriter.close();
		}catch (IOException ex) {
			Logger.getLogger(Top.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
}
