package com.om.common.page.tags.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyTagSupport;

import com.om.common.page.util.Page;
import com.om.common.page.util.PageUtil;

/**
 * jsp自定义标签 基类
  * @ClassName: PageTagBase  
  * @Description: TODO 
  * @author: libin 
  * @date:Nov 6, 2012 10:27:47 AM
 */
public class PageTagBase  extends BodyTagSupport {
	  protected PageUtil pu;
	  protected Page page;
	  
	  public void setPageContext(PageContext pageContext) {
	    super.setPageContext(pageContext);
	    this.pu = new PageUtil((HttpServletRequest)pageContext.getRequest());
	    this.page = this.pu.getPage();
	  }

	  
	  public int doAfterBody() throws JspException {
	    return super.doAfterBody();
	  }

	  public int doEndTag() throws JspException {
	    return super.doEndTag();
	  }

	  public int doStartTag() throws JspException {
	    return super.doStartTag();
	  }
}
