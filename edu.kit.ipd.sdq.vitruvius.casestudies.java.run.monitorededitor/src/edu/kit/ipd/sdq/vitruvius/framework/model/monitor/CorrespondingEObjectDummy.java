package edu.kit.ipd.sdq.vitruvius.framework.model.monitor;

import org.eclipse.emf.ecore.impl.EObjectImpl;

public class CorrespondingEObjectDummy extends EObjectImpl {

	private String name;

	public CorrespondingEObjectDummy(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}