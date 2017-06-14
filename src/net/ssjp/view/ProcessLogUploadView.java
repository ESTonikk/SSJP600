package net.ssjp.view;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.model.UploadedFile;

import net.ssjp.controller.ProcessLogUploadController;

@ManagedBean
public class ProcessLogUploadView extends FileUploaderView{

	public ProcessLogUploadView(UploadedFile file){
		super(file);
	}
	
	
	@Override
	public void upload() {
		// TODO Auto-generated method stub
        if(getFile() != null) {
        	System.out.println(42342);
        	FacesMessage message;
        	ProcessLogUploadController controller = new ProcessLogUploadController();
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
