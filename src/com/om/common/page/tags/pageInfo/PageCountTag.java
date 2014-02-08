package com.om.common.page.tags.pageInfo;

import com.om.common.page.tags.base.PageInfoTagBase;

/**
 * 
  * @ClassName: PageCountTag  
  * @Description: TODO 
  * @author: libin 
  * @date:Nov 6, 2012 2:35:09 PM
 */
public class PageCountTag extends PageInfoTagBase{

	@Override
	protected Object getPageInfo() {
		// TODO Auto-generated method stub
		return Integer.valueOf(this.page.getPageCount());
	}

}
