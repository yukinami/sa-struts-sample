package org.seasar.sastruts.sample.form;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.struts.annotation.Required;


@Component
public class PostForm {

	public String id;

	@Required(target="save,update")
	public String name;

	@Required(target="save,update")
	public String title;

	public String content;
	
}
