package org.openhouse.web.taglib;

import javax.servlet.jsp.tagext.TagSupport;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openhouse.api.context.Context;

public class UserPropertyTag extends TagSupport {
	
	private static final long serialVersionUID = 121L;
	
	private final Log log = LogFactory.getLog(getClass());
	
	private String key = "";
	
	private String defaultValue = "";
	
	private String var = null;
	
	public int doStartTag() {
		
		String value = defaultValue;
		// If user is logged in
		if (Context.isAuthenticated()) {
			String prop = Context.getAuthenticatedUser().getUserProperty(key);
			if (prop != null && !prop.equals(""))
				value = prop;
		}
		
		try {
			if (var != null)
				pageContext.setAttribute(var, value);
			else
				pageContext.getOut().write(value);
			
		}
		catch (Exception e) {
			log.error("error getting global property", e);
		}
		return SKIP_BODY;
	}
	
	public String getKey() {
		return this.key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public String getDefaultValue() {
		return this.defaultValue;
	}
	
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	
	public String getVar() {
		return var;
	}
	
	public void setVar(String var) {
		this.var = var;
	}
	
}
