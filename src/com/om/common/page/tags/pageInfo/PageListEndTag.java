package com.om.common.page.tags.pageInfo;

import com.om.common.page.tags.base.PageInfoTagBase;


/**
 * 
  * @ClassName: PageListEndTag  
  * @Description: TODO 
  * @author: libin 
  * @date:Nov 6, 2012 2:35:50 PM
 */
public class PageListEndTag extends PageInfoTagBase {

	@Override
	protected Object getPageInfo() {
		// TODO Auto-generated method stub
		return Integer.valueOf(this.page.getFirstPage()+this.page.getCurrentPageListNum()-1);
	}

}
