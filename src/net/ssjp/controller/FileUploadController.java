package net.ssjp.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.primefaces.model.UploadedFile;

public class FileUploadController {


	
	public void saveData(UploadedFile file) throws IOException {
		

		

		System.out.println(1);
		File directory = new File("uploads");
		if(!directory.exists()){
			directory.mkdir();
		}else{
			
		}
		
		InputStream stream = file.getInputstream();
		File parsedFile= new File(file.getFileName());
		FileUtils.copyInputStreamToFile(stream, new File(directory.toString(), parsedFile.getName()));
		

		System.out.println(2);
    }
	

}
