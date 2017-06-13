package net.ssjp.view;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
 
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;
 
@ManagedBean
public abstract class FileUploadView {
     
    private UploadedFile file;
 
    
    
    public FileUploadView(UploadedFile file) {
		super();
		this.file = file;
	}

	public  UploadedFile getFile() {
        return file;
    }
 
    public void setFile(UploadedFile file) {
        this.file = file;
    }
     
    public abstract void upload();
}
