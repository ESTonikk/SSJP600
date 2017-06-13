package net.ssjp.view;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.model.UploadedFile;

import net.ssjp.controller.LogUploadController;

public class LogUploadview extends FileUploadView{

	
	public LogUploadview(UploadedFile file){
		super(file);
		System.out.println("test");
	}
	
	
	@Override
	public void upload() {
		System.out.println("test");
		// TODO Auto-generated method stub
        if(getFile() != null) {
        	System.out.println(42342);
        	FacesMessage message;
        	LogUploadController controller = new LogUploadController();
            try {
				controller.saveData(getFile());
				message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", getFile().getFileName() + " is uploaded.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Failure", "Upload of" + getFile().getFileName() + " failed or no file.");
				e.printStackTrace();
			}
            
            FacesContext.getCurrentInstance().addMessage(null, message);
            

        }
	}


}
