<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--引入jstl标签库  -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
      <h3>用户列表</h3>
      <h4>${message}</h4>
      <table border="1" style="border-collapse:collapse;">
            <tr>
                 <th>编号</th>
                 <th>用户名</th>
                 <th>密码</th>
                 <th>年龄</th>
                 <th>电话</th>
                 <th>邮箱</th>
                 <th>时间</th>
                 <th>操作</th>
            </tr>
            <c:forEach items="${users}"  var="user" varStatus="vs">
                 <!--style="${vs.index%2 eq 0 ? 'background-color:gray':''}"  -->
                 <tr >
                     <td>${user.id}</td>
                     <td>${user.username}</td>
                     <td>${user.password}</td>
                     <td>${user.age}</td>
                     <td>${user.phone}</td>
                     <td>${user.email}</td>
                     <td>${user.time}</td>
                     <td>
                         <a onclick="deleteUser(${user.id})"  href="javascript:void(0);">删除</a>&nbsp;&nbsp;
                         <a href="#">修改</a>
                     </td>
                 </tr>
            </c:forEach>
      </table>
      <script  type="text/javascript">
             /*1.定义一个方法  */
             function deleteUser(userId){
            	if(confirm("您,确定要删除此条数据吗？")){
            		  window.location.href="${pageContext.request.contextPath}/user/delete.do?userId="+userId
            	}
             }
             
      </script>
</body>
</html>