package com.laptrinhjavaweb.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.service.INewService;
import com.laptrinhjavaweb.utils.HttpUtil;

@WebServlet(urlPatterns = {"/api-admin-new"})
public class NewAPI extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private INewService newService;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//add
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8"); //nhan tieng viet
		
		resp.setContentType("application/json"); //để client bt kiểu trả xuống là json
		
		NewModel newModel =  HttpUtil.of(req.getReader()).toModel(NewModel.class);   //convert từ file json mapping NewModel
		
		newModel = newService.save(newModel);
		
		mapper.writeValue(resp.getOutputStream(), newModel);  //convert sang file json
		 
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//modify
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8"); //nhan tieng viet
		resp.setContentType("application/json"); //để client bt kiểu trả xuống là json
		NewModel updateNew =  HttpUtil.of(req.getReader()).toModel(NewModel.class);   //convert từ file json mapping NewModel
		updateNew = newService.update(updateNew);
		mapper.writeValue(resp.getOutputStream(), updateNew);  //convert sang file json
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//delete
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8"); //nhan tieng viet
		resp.setContentType("application/json"); //để client bt kiểu trả xuống là json
		NewModel newModel =  HttpUtil.of(req.getReader()).toModel(NewModel.class);   //convert từ file json mapping NewModel
		newService.delete(newModel.getIds());
		mapper.writeValue(resp.getOutputStream(), "{}");  //convert sang file json
	}
	
}
