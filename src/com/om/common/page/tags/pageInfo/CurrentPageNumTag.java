package com.om.common.page.tags.pageInfo;

import com.om.common.page.tags.base.PageInfoTagBase;

/**
 * 
  * @ClassName: CurrentPageNumTag  
  * @Description: TODO 
  * @author: libin 
  * @date:Nov 6, 2012 2:34:54 PM
 */
public class CurrentPageNumTag extends PageInfoTagBase{

	@Override
	protected Object getPageInfo() {
		// TODO Auto-generated method stub
		return Integer.valueOf(this.page.getCurrentPage());
	}

}
