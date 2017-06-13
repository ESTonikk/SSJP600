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

public interface FileUploadInterface {


	
	public void saveData(UploadedFile file) throws IOException;
	

}
