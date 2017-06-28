package net.ssjp.controller;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import net.ssjp.model.Hersteller;
import net.ssjp.services.HerstellerService;
import net.ssjp.view.HerstellerEditView;
 
@ManagedBean(name="dtHerstellerView")
@ViewScoped
public class HerstellerView implements Serializable {
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 385408116639817753L;

	private List<Hersteller> addr;
     
    @ManagedProperty("#{herstellerService}")
    private HerstellerService herstellerService;
 
    public HerstellerService getHerstellerService() {
		return herstellerService;
	}

	public void setHerstellerService(HerstellerService herstellerService) {
		this.herstellerService = herstellerService;
	}

	@PostConstruct
    public void init() {
		this.setHerstellerService(new HerstellerService());
        addr = herstellerService.getHersteller();
    }
	
	public String edit(int id){
		System.out.println("entered edit");
		for(Hersteller h:addr){
			if(h.getId() == id){
				System.out.println("found!");
				HerstellerEditView.setHersteller(h);
				return "/NewAdress.jsp?faces-redirect=true"; 
			}
		}
		System.out.println("nothing found");
		return ""; 
	}

	public String delete(int id){
		return "";
	}
	
	public List<Hersteller> getAddr() {
		return addr;
	}

	public void setAddr(List<Hersteller> addr) {
		this.addr = addr;
	}
}
