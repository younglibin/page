package com.om.common.page.tags.base;

import java.io.IOException;

import javax.servlet.jsp.JspException;

/**
 * 获得页面信息
  * @ClassName: PageInfoTagBase  
  * @Description: TODO 
  * @author: libin 
  * @date:Nov 6, 2012 2:01:09 PM
 */
public abstract class PageInfoTagBase extends PageTagBase {
	
	/**
	 * 获得页面信息
	  * @Title: getPageInfo  
	  * @Description: TODO 
	  * @return 
	  * @return Object 
	  * @author: libin  
	  * @date:Nov 6, 2012 2:29:55 PM 
	  * @throws
	 */
	protected abstract Object getPageInfo();

	public int doEndTag() throws JspException {
		try {
			this.pageContext.getOut().write(getPageInfo().toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doEndTag();
	}
}
