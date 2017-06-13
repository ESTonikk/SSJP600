package net.ssjp.view;

import javax.faces.bean.ManagedBean;
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
