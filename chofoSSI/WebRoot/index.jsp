<%@page contentType="text/html;charset=GBK"%>
<%@ taglib prefix = "s"  uri = "/struts-tags" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String msg = "";
if(request.getAttribute("msg")!=null)
{
  msg = (String)request.getAttribute("msg");
}
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=gbk"> 
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
  </head>
  
  <body onload='setRefresh();'>
    This is my JSP page. <br>
    <s:form action ="login.action"> 
         <table width='50%' align ='center'>
         <tr align = 'center'>
         <td align = 'right'>
                                   用户名                               
         </td>
         <td align = 'left'>
              <input type="text" name="user.username" value=""/> 
         </td>
         </tr>
         <tr align = 'center'>
         <td align = 'right'>  
                                       密码                               
         </td>
         <td align = 'left'>  
              <input type="password" name="user.password" value=""/>  
         </td>
         </tr> 
         <tr align = 'center'>
         <td align = 'right'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <input type="button" onclick ="doLogin();" value="登录"/>
         <td align = 'left'> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <input type="button" onclick ="" value="返回"/></td>
          </tr>
          </table>     
      </s:form > 
  </body>
  <script>
  function doLogin()
  {
      document.forms[0].action = '<%=path%>/'+'login!login.action'; 
      document.forms[0].submit();
  }
  function setRefresh()
  {
    var msg = '<%=msg%>';
    if(msg!="")
    {
      alert(msg);
    }
  }
  </script>
</html>
