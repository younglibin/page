package com.om.common.page.tags.pageLink;

import com.om.common.page.tags.base.ForwardPageTagBase;

public class PreviousPageTag extends ForwardPageTagBase{

	@Override
	protected String getPageUrl() {
		if(this.page.getCurrentPage() == this.page.getPreviousPage()){
			return null;
		}
		return this.page.getPreviousPageUrl();
	}

}
