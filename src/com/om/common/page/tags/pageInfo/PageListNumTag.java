package com.om.common.page.tags.pageInfo;

import com.om.common.page.tags.base.PageInfoTagBase;


/**
 * 
  * @ClassName: PageListNumTag  
  * @Description: TODO 
  * @author: libin 
  * @date:Nov 6, 2012 2:38:03 PM
 */
public class PageListNumTag extends PageInfoTagBase{

	@Override
	protected Object getPageInfo() {
		// TODO Auto-generated method stub
		return Integer.valueOf(this.page.getPageListNum());
	}

}
