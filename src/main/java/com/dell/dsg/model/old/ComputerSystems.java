package com.dell.dsg.model.old;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ComputerSystems {

	private Collection<ComputerSystem> computerSystems;

	@XmlElement(name = "ComputerSystem")
	public Collection<ComputerSystem> getComputerSystems() {
		return computerSystems;
	}

	public void setComputerSystems(Collection<ComputerSystem> computerSystems) {
		this.computerSystems = computerSystems;
	}

}
