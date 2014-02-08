package com.om.common.page.tags.pageInfo;

import com.om.common.page.tags.base.PageInfoTagBase;


/**
 * 
  * @ClassName: PageListStartTag  
  * @Description: TODO 
  * @author: libin 
  * @date:Nov 6, 2012 2:38:56 PM
 */
public class PageListStartTag extends PageInfoTagBase {

	@Override
	protected Object getPageInfo() {
		// TODO Auto-generated method stub
		return Integer.valueOf(this.page.getFirstResult());
	}
}
