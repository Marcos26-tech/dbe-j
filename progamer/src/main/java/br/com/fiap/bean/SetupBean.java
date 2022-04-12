package br.com.fiap.bean;

import java.util.List;

import javax.inject.Named;

import br.com.fiap.dao.SetupDao;
import br.com.fiap.model.Setup;

@Named
public class SetupBean {

	private Setup setup = new Setup();
	
	public void save() {
		System.out.println(this.setup);
		new SetupDao().create(setup);
	}
	
	public List<Setup> getAll(){
		return new SetupDao().listAll();
	}

	public Setup getSetup() {
		return setup;
	}

	public void setSetup(Setup setup) {
		this.setup = setup;
	}

}
