package com.om.common.page.tags.pageInfo;

import com.om.common.page.tags.base.PageInfoTagBase;

/**
 * 
  * @ClassName: ListCountTag  
  * @Description: TODO 
  * @author: libin 
  * @date:Nov 6, 2012 2:34:57 PM
 */
public class ListCountTag extends PageInfoTagBase {

	@Override
	protected Object getPageInfo() {
		// TODO Auto-generated method stub
		return Integer.valueOf(this.page.getListCount());
	}
	
}
