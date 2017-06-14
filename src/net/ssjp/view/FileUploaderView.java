package net.ssjp.view;


import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;
 

public abstract class FileUploaderView {
     
    private UploadedFile file;
 
    
    
    public FileUploaderView(UploadedFile file) {
		super();
		this.file = file;
	}

	public FileUploaderView() {
		// TODO Auto-generated constructor stub
	}

	public  UploadedFile getFile() {
        return file;
    }
 
    public void setFile(UploadedFile file) {
        this.file = file;
    }
     
    public abstract void upload(FileUploadEvent event);
}
