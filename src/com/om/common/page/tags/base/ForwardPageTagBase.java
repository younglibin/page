package com.om.common.page.tags.base;

import java.io.IOException;

import javax.servlet.jsp.JspException;

/**
 * 转向使用的缺省类
  * @ClassName: ForwardPageTagBase  
  * @Description: TODO 
  * @author: libin 
  * @date:Nov 6, 2012 2:22:07 PM
 */
public abstract class ForwardPageTagBase extends PageTagBase {
	
	/**
	 * 获得页面转向的url
	  * @Title: getPageUrl  
	  * @Description: TODO 
	  * @return 
	  * @return String 
	  * @author: libin  
	  * @date:Nov 6, 2012 2:26:41 PM 
	  * @throws
	 */
	protected abstract String getPageUrl();

	/**
	 *  初始化标签 ，绑定专业的js方法
	 */
	public int doStartTag() throws JspException {
		try {
			if (getPageUrl() != null) {
				this.pageContext.getOut().write(
						"<a href=\"javascript:fGotoPage('" + getPageUrl()
								+ "')\">");
			} else {
				this.pageContext.getOut().write("<a>");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 1;
	}

	public int doAfterBody() throws JspException {
		return 0;
	}

	public int doEndTag() throws JspException {
		try {
			this.pageContext.getOut().write("</a>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 6;
	}
}