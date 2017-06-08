package net.ssjp.view;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
 
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import net.ssjp.controller.FileUploadController;
 
@ManagedBean
public class FileUploadView {
     
    private UploadedFile file;
 
    public UploadedFile getFile() {
        return file;
    }
 
    public void setFile(UploadedFile file) {
        this.file = file;
    }
     
    public void upload() {
        if(file != null) {
        	System.out.println(42342);
        	FacesMessage message;
        	FileUploadController controller = new FileUploadController();
            try {
				controller.saveData(file);
				message = new FacesMessage("Success", file.getFileName() + " is uploaded.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				message = new FacesMessage("Failure", "Upload of" + file.getFileName() + " failed.");
				e.printStackTrace();
			}
            
            FacesContext.getCurrentInstance().addMessage(null, message);
            

        }
    }
}
