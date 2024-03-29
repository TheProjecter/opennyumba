package org.openhouse.web.taglib.fieldgen;

import org.openhouse.api.database.model.Concept;

public class ConceptHandler extends AbstractFieldGenHandler implements FieldGenHandler {
	
	private String defaultUrl = "concept.field";
	
	public void run() {
		htmlInclude("/scripts/dojoConfig.js");
		htmlInclude("/scripts/dojo/dojo.js");
		
		setUrl(defaultUrl);
		checkEmptyVal((Concept) null);
		if (fieldGenTag != null) {
			Object initialValue = this.fieldGenTag.getVal();
			setParameter("initialValue", initialValue == null ? "" : initialValue.toString());
			
		}
	}
}
