package com.om.common.page.tags.pageLinkUri;

import com.om.common.page.tags.base.PageInfoTagBase;

public class FirstPageURITag extends PageInfoTagBase{

	@Override
	protected Object getPageInfo() {
		// TODO Auto-generated method stub
		return this.pu.getFirstPageUrl();
	}

}
