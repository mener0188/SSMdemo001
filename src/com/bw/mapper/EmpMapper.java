package com.bw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bw.entity.Depart;
import com.bw.entity.Emp;
import com.bw.entity.Job;

/**
 * 
 * @ClassName: MovieMapper 
 * @Description: mapper接口
 * @author:王圆圆
 * @date: 2019年7月5日 下午2:12:33
 */
public interface EmpMapper {
	
	public List<Emp> selectEmp(@Param("empname")String empname);
	
	public Emp selectEmpById(Integer empid);
	
	public List<Depart> getDepartList();
	
	public List<Job> getJobList();
	
	public int insertEmp(Emp emp);
	
	public int deleteEmp(int empid);
	
	public int updateEmp(Emp emp);
	
	
//	登录
//	User login(User u);
//	
////	列表展示
//	List getMovieList(@Param("mname")String mname);
//	
////	查询所有类型
//	List getTypeList();
////	先添加到电影表
//	void addMovie(Movie m);
////	再添加到中间表
//	void addCenter(@Param("mid")Integer mid,@Param("tid")int tid);
//	
////	 根据id查询电影对象
//	Movie getMovieById(Integer mid);
////	查询所属类别
//	List getTid(Integer mid);
////	先修改电影表
//	void updateMovie(Movie m);
////	删除中间表
//	void delCenter(Integer mid);
//	
////	先删除中间表(批量删除)
//	void delCenter02(String mid);
////	再删除电影表
//	void delMovie(String mid);
	

}
