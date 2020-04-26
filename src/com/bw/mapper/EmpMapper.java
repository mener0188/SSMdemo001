package com.bw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bw.entity.Depart;
import com.bw.entity.Emp;
import com.bw.entity.Job;

/**
 * 
 * @ClassName: MovieMapper 
 * @Description: mapper�ӿ�
 * @author:��ԲԲ
 * @date: 2019��7��5�� ����2:12:33
 */
public interface EmpMapper {
	
	public List<Emp> selectEmp(@Param("empname")String empname);
	
	public Emp selectEmpById(Integer empid);
	
	public List<Depart> getDepartList();
	
	public List<Job> getJobList();
	
	public int insertEmp(Emp emp);
	
	public int deleteEmp(int empid);
	
	public int updateEmp(Emp emp);
	
	
//	��¼
//	User login(User u);
//	
////	�б�չʾ
//	List getMovieList(@Param("mname")String mname);
//	
////	��ѯ��������
//	List getTypeList();
////	����ӵ���Ӱ��
//	void addMovie(Movie m);
////	����ӵ��м��
//	void addCenter(@Param("mid")Integer mid,@Param("tid")int tid);
//	
////	 ����id��ѯ��Ӱ����
//	Movie getMovieById(Integer mid);
////	��ѯ�������
//	List getTid(Integer mid);
////	���޸ĵ�Ӱ��
//	void updateMovie(Movie m);
////	ɾ���м��
//	void delCenter(Integer mid);
//	
////	��ɾ���м��(����ɾ��)
//	void delCenter02(String mid);
////	��ɾ����Ӱ��
//	void delMovie(String mid);
	

}
