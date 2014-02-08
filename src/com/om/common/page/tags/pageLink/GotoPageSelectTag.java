package com.om.common.page.tags.pageLink;

import java.io.IOException;

import javax.servlet.jsp.JspException;

import com.om.common.page.tags.base.PageTagBase;

public class GotoPageSelectTag extends PageTagBase {
	private static final long serialVersionUID = -1744693547L;

	public int doStartTag() throws JspException {
		StringBuffer selectHTML = new StringBuffer();
		try {
			if (this.page.getPageCount() > 99) {
				selectHTML.append("<script type=\"text/javascript\">\n");
				selectHTML.append("   var _pageNo="
						+ this.page.getCurrentPage() + ";\n");
				selectHTML
						.append("    document.write(\"<input type=\\\"text\\\" id=\\\"_pageInput\\\" value=\\\""
								+ this.page.getCurrentPage()
								+ "\\\" style=\\\"width:50px\\\" onKeyDown=\\\"javascript:if(event.keyCode==13)fGotoPage('"
								+ this.page.getPageUrlWithoutPageNo()
								+ "_pageNo"
								+ "='+_pageInput.value)\\\"/>\");\n");

				selectHTML.append("</script>");
			} else {
				selectHTML.append("<script type=\"text/javascript\">\n");
				selectHTML.append("    var _pageNo="
						+ this.page.getCurrentPage() + ";\n");
				selectHTML
						.append("    document.write(\"<select id=\\\"_selectPage\\\" style=\\\"width:50px\\\" onchange=\\\"fGotoPage('"
								+ this.page.getPageUrlWithoutPageNo()
								+ "_pageNo" + "='+this.value)\\\">\");\n");

				selectHTML.append("    for(var i=1;i<="
						+ this.page.getPageCount() + ";i++)\n");
				selectHTML.append("    {\n");
				selectHTML.append("\t      if(_pageNo==i)\n");
				selectHTML
						.append("\t\t      document.write(\"<option value=\"+i+\" selected>\"+i+\"</option>\");\n");
				selectHTML.append("\t      else\n");
				selectHTML
						.append("\t\t      document.write(\"<option value=\"+i+\">\"+i+\"</option>\");\n");
				selectHTML.append("    }\n");
				selectHTML.append("    document.write(\"</select>\");\n");
				selectHTML.append("    \n");
				selectHTML.append("</script>");
			}

			this.pageContext.getOut().write(selectHTML.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 1;
	}

	public int doAfterBody() throws JspException {
		return 0;
	}

	public int doEndTag() throws JspException {
		return 6;
	}
}