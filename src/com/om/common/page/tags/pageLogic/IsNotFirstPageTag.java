package com.om.common.page.tags.pageLogic;

import javax.servlet.jsp.JspException;

import com.om.common.page.tags.base.PageTagBase;

public class IsNotFirstPageTag extends PageTagBase{
	@Override
	public int doStartTag() throws JspException {
		if (this.page.getCurrentPage() > 1) {
			return 1;
		}
		return 0;
	}

	public int doAfterBody() throws JspException {
		return 0;
	}

	public int doEndTag() throws JspException {
		return 6;
	}

}
