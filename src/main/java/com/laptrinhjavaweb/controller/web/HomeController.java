package com.laptrinhjavaweb.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.model.UserModel;
import com.laptrinhjavaweb.service.ICategoryService;
import com.laptrinhjavaweb.service.INewService;
import com.laptrinhjavaweb.service.IUserService;

@WebServlet(urlPatterns = { "/trang-chu"})
public class HomeController extends HttpServlet {

	/**
	 * 
	 */	
	@Inject
	private ICategoryService categoryService;
	
	@Inject
	private INewService newService;
	
	@Inject
	private IUserService userService;
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		NewModel newModel = new NewModel();
		UserModel userModel = new UserModel();
		
//		String taile = "Bài viết 8";
//		String content = "Bai viet 8";
//		Long categoryId = 1L;
//		newModel.setTitle(taile);
//		newModel.setContent(content);
//		newModel.setCategoryId(categoryId);
//		newService.save(newModel);
//				Long id = 1L;
//		newModel.setId(id);
//		newService.update(newModel);
//		req.setAttribute("categories", categoryService.findAll());
//		String userName= "nguyenvana";
//		userModel.setUserName(userName);
//		userService.findByUserName(userName);
//		
//		req.setAttribute("username", userService.findByUserName(userName));
		
		RequestDispatcher rd = req.getRequestDispatcher("/views/web/home.jsp");
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}
}
