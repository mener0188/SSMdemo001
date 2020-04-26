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
 * ҵ��˵��:emp��,job(��λ),depart,����
 * ���˵��: web.xmlΪ����
 *   1.spring.xml
 *     ����mybatis.xml
 *   2.springmvc.xml
 *     ����ǰ׺�ͺ�׺
 *     ��@Contrller,@RequestMappingע����Ч
 *   3.jspҳ��ʹ��axios ajax��post
 *   
 */
@Controller
public class EmpController {
	@Autowired
	EmpMapper empMapper;
	
	/**
	 * ����ҳ��ѧϰ�ĵ�һ��,�ǳ���Ҫ
	 */
	@RequestMapping("listAll")
	public String listAll(HttpServletRequest request, String empname){
		
		List<Emp> empList = empMapper.selectEmp(empname);
		System.out.println(empList.size()+"-----------");
		request.setAttribute("empList", empList);
		//����jsp
		return "list";
	}
	
	/**
	 * ����ҳ������,ѧϰ��ҳ�ķ�֧,ע��Ͳ���ҳ��������Ա�
	 * �������Ƕ��һ�İ���
	 */
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="1") int pageNum, Model model,
			HttpServletRequest request, String empname){
//		if(empname==null || empname.equals("null")){
//			empname="";
//		}
		
		PageHelper.startPage(pageNum, 5);
		
		List<Emp> empList = empMapper.selectEmp(empname);//ע��mapper�ļ�������#��,ֻ����$
		System.out.println(empList.size()+"-----------"+empname);
		PageInfo<Emp> page=new PageInfo<Emp>(empList);
		
		
		PageUtils.page(pageNum, page, model, "&empname="+empname);
		
		//��ֵ���浽jspҳ��
		model.addAttribute("empList", empList);
		model.addAttribute("page", page);
		model.addAttribute("empname", empname);
		//����jsp
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
		//ȡ��ȫ��depart������
		List<Depart> departList = empMapper.getDepartList();
		return departList;
	}
	
	@RequestMapping("getJobList")
	@ResponseBody
	public List<Job> getJobList(){
		//ȡ��ȫ��depart������
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
