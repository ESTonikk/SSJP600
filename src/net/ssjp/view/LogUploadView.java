package net.ssjp.view;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import net.ssjp.controller.LogUploadController;

@RequestScoped
@ManagedBean(name="logUploadBean")
public class LogUploadView extends FileUploaderView{

	public UploadedFile file;



	public LogUploadView(){

		
	}
	
	public LogUploadView(UploadedFile file){
		super(file);
	}
	
	public  UploadedFile getFile() {
        return file;
    }
 
    public void setFile(UploadedFile file) {
        this.file = file;
    }
     
    public void upload(FileUploadEvent event) {
    	this.setFile(event.getFile());
		System.out.println("test");
		System.out.println(this.file.getFileName());
		// TODO Auto-generated method stub
        if(this.getFile() != null) {
        	System.out.println(42342);
        	FacesMessage message;
        	LogUploadController controller = new LogUploadController();
            try {
				controller.saveData(this.getFile());
				message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", this.getFile().getFileName() + " is uploaded.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Failure", "Upload of" + this.getFile().getFileName() + " failed or no file.");
				e.printStackTrace();
			}
            
            FacesContext.getCurrentInstance().addMessage(null, message);
            
        }
    }


}
	




