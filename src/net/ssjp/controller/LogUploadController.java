package net.ssjp.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.primefaces.model.UploadedFile;

public class LogUploadController implements FileUploadInterface{

	@Override
	public void saveData(UploadedFile file) throws IOException {
		

		File directory = new File("uploads");
		if(!directory.exists()){
			directory.mkdir();
		}else{
			
		}
		
		InputStream stream = file.getInputstream();
		File parsedFile= new File(file.getFileName());
		FileUtils.copyInputStreamToFile(stream, new File(directory.toString(), parsedFile.getName()));
		
	}

}
