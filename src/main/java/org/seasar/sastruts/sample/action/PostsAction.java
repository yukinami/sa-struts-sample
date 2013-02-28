package org.seasar.sastruts.sample.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.seasar.framework.beans.util.Beans;
import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.BindingType;
import org.seasar.sastruts.sample.entity.Post;
import org.seasar.sastruts.sample.form.PostForm;
import org.seasar.sastruts.sample.repository.PostsRepository;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;


public class PostsAction {

	public long id;

	public String name;

	public String title;

	public String content;

	public List<Post> posts;

	@Binding( bindingType=BindingType.MUST)
	private PostsRepository postsRepository;

	@ActionForm
	@Resource
	public PostForm postForm;

	@Execute(validator = false)
	public String index(){
		posts = postsRepository.findAll();
		return "index.jsp";
	}

	@Execute(validator = false)
	public String create(){
		return "create.jsp";
	}

	@Execute(validator = true, input="create.jsp")
	public String save(){
		Post post = Beans.createAndCopy(Post.class, postForm).execute();
		postsRepository.save(post);
		return "/posts/" + post.id +"?redirect=true";
	}
	
	@Execute(validator = false, urlPattern="{id}")
	public String show(){
		Post post = postsRepository.findOne(Long.valueOf(postForm.id));
		id = post.id;
		name = post.name;
		title = post.title;
		content = post.content;
		return "show.jsp";
	}

	@Execute(validator = false, urlPattern="{id}/edit")
	public String edit(){
		Post post = postsRepository.findOne(Long.valueOf(postForm.id));
		Beans.copy(post, postForm).execute();
		return "edit.jsp";
	}

	@Execute(validator = true, input="edit.jsp")
	public String update(){
		Post post = Beans.createAndCopy(Post.class, postForm).execute();
		postsRepository.save(post);
		return "/posts/" + postForm.id +"?redirect=true";
	}

	@Execute(validator = false, urlPattern="{id}/destroy")
	public String destroy(){
		postsRepository.delete(Long.valueOf(postForm.id));
		return "/posts?redirect=true";
	}
}
