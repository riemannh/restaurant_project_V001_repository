<%@page contentType="text/html;charset=GBK"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=gbk"> 
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
  </head>
  
  <FRAMESET cols="100%" rows="10%,90%" > 
      <FRAME src="" noresize="noresize"> 
  <FRAMESET cols="20%,80%" rows="100%"> 
      <FRAME src="<%=path%>/menu!initMenu.action" noresize="noresize"> 
      <FRAME src=""> 
  </FRAMESET>  
</FRAMESET> 
  
</html>
