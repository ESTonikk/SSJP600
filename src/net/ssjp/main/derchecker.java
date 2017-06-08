package net.ssjp.main;

import java.io.File;
import java.io.IOException;

import net.ssjp.data.UserLogMapper;

public class derchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("testLog.csv");
		try {
			UserLogMapper ulm = new UserLogMapper(f);
			System.out.println(ulm.checkFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
