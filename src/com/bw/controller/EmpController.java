package com.bw.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

import com.bw.entity.Depart;
import com.bw.entity.Emp;
import com.bw.entity.Job;
import com.bw.mapper.EmpMapper;
import com.bw.util.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 业务说明:emp表,job(岗位),depart,部门
 * 框架说明: web.xml为核心
 *   1.spring.xml
 *     管理mybatis.xml
 *   2.springmvc.xml
 *     管理前缀和后缀
 *     让@Contrller,@RequestMapping注解生效
 *   3.jsp页面使用axios ajax和post
 *   
 */
@Controller
public class EmpController {
	@Autowired
	EmpMapper empMapper;
	
	/**
	 * 不分页是学习的第一步,非常重要
	 */
	@RequestMapping("listAll")
	public String listAll(HttpServletRequest request, String empname){
		
		List<Emp> empList = empMapper.selectEmp(empname);
		System.out.println(empList.size()+"-----------");
		request.setAttribute("empList", empList);
		//返回jsp
		return "list";
	}
	
	/**
	 * 不分页熟练后,学习分页的分支,注意和不分页的情况做对比
	 * 本案例是多对一的案例
	 */
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="1") int pageNum, Model model,
			HttpServletRequest request, String empname){
//		if(empname==null || empname.equals("null")){
//			empname="";
//		}
		
		PageHelper.startPage(pageNum, 5);
		
		List<Emp> empList = empMapper.selectEmp(empname);//注意mapper文件不能用#号,只能用$
		System.out.println(empList.size()+"-----------"+empname);
		PageInfo<Emp> page=new PageInfo<Emp>(empList);
		
		
		PageUtils.page(pageNum, page, model, "&empname="+empname);
		
		//把值保存到jsp页面
		model.addAttribute("empList", empList);
		model.addAttribute("page", page);
		model.addAttribute("empname", empname);
		//返回jsp
		return "list";
	}
	
	@RequestMapping("toAdd")
	public String toAdd(){
		return "add";
	}
	
	@RequestMapping("toUpdate")
	public String toUpdate(){
		return "update";
	}
	
	
	@RequestMapping("getDepartList")
	@ResponseBody
	public List<Depart> getDepartList(){
		//取得全部depart的数据
		List<Depart> departList = empMapper.getDepartList();
		return departList;
	}
	
	@RequestMapping("getJobList")
	@ResponseBody
	public List<Job> getJobList(){
		//取得全部depart的数据
		List<Job> jobList = empMapper.getJobList();
		return jobList;
	}
	
	@RequestMapping("addEmp")
	@ResponseBody
	public String addEmp(Emp emp){
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println(emp);
		int i = empMapper.insertEmp(emp);
		System.out.println(i);
		return "success";
	}
	
	@RequestMapping("deleteEmp")
	@ResponseBody
	public String deleteEmp(String empid){
		empMapper.deleteEmp(Integer.parseInt(empid));
		return "success";
	}
	
	@RequestMapping("plsc")
	@ResponseBody
	public String plsc(String[] ids){
		System.out.println(ids+"-----------");
		for (String empid : ids) {
			empMapper.deleteEmp(Integer.parseInt(empid));
		}
		return "success";
	}
	
	@RequestMapping("getUpdate")
	@ResponseBody
	public Emp getUpdate(Integer empid){
		Emp emp = empMapper.selectEmpById(empid);
		return emp;
		
	}
	
	@RequestMapping("update")
	@ResponseBody
	public String update(Emp emp) {
		empMapper.updateEmp(emp);
		return "success";
	}
	
	
	

}
