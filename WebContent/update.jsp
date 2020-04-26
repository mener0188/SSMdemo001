<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/resource/css/css.css">
<script type="text/javascript" src="<%=request.getContextPath() %>/resource/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/resource/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath() %>/resource/js/axios.min.js"></script>
<script type="text/javascript">
$(function(){
	
	//注意强行修改为同步ajax
	//可以使用野路子,记一次请求,把数据全查回来,不正规,不符合开发规范
	
	//下拉框回显步骤1
	//先测试接口
	axios.get("getDepartList?").then(function(res){//部门下拉
		console.log(res.data);
		for(var i=0; i<res.data.length; i++){
			var tmp=res.data[i];
			$("select[name='departid']").append("<option value='"+tmp.departid+"' >"+tmp.departname+"</option>")
		}
		
		axios.get("getJobList").then(function(res){//岗位下拉
			console.log(res.data);
			for(var i=0; i<res.data.length; i++){
				var tmp=res.data[i];
				$("select[name='jobid']").append("<option value='"+tmp.jobid+"' >"+tmp.jobname+"</option>")
			}
			
			//基本数据回显
			var empid = $("[name='empid']").val();
			$.post("getUpdate",{empid:empid},function(json){
				//获取对象
				var m = json;
				console.log(json);
				$("[name='empname']").val(json.empname);
				$("[name='empdesc']").val(json.empdesc);
				$("[name='birth']").val(json.birth);
				$("[name='departid']").val(json.departid);
// 				alert(json.jobid);
				;
// 				alert($("[name='jobid']").html());
				$("[name='jobid']").val(json.jobid);
			},"json")
			
			
		});
		
	});
		
	
	
	
})


 //修改
 function update() {
	var param = $("form").serialize();
	$.post("update",param,function(res){
		alert(res);
		if(res=="success"){
			alert("修改成功!");
			location = "list";
		}else {
			alert("修改失败!");
		}
		
	});
}
</script>
</head>
<body>

<form>
<table>
   <tr>
      <td>empid:</td>
      <td>
         <input type="hidden" name="empid" value="${param.empid }">
      </td>
   </tr>
   
<tr>
	<td>empname:</td>
	<td><input type="text" name="empname"></td>
</tr>
<tr>
	<td>empdesc:</td>
	<td><input type="text" name="empdesc"></td>
</tr>
<tr>
	<td>birth:</td>
	<td><input type="text" name="birth" onclick="WdatePicker()">
</td>
<tr>
	<td>depart:</td>
	<td><select name="departid" >
		<option value="">空</option>
	</select>
	</td>
</tr>
<tr>
	<td>job:</td>
	<td><select name="jobid" >
		<option value="">空</option>
	</select>
	</td>
</tr>
<tr>
	<td></td>
	<td><input type="button" value="修改" onclick="update()"></td>
	</tr>
</table>
</form>

</body>
</html>