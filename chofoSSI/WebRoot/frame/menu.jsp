<%@page contentType="text/html;charset=GBK"%>
<%@ taglib prefix = "s"  uri = "/struts-tags" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=gbk"> 
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
    <link rel="StyleSheet" href="<%=path%>/css/dtree.css" type="text/css" />   
    <script type="text/javascript" src="<%=path%>/js/dtree.js"></script> 
  </head>
  <body>
  <script type="text/javascript">   
         d = new dTree("d"); 
         d.add(0,-1,"菜单");  
         <s:iterator value="menulist" id="menu"> 
            d.add(<s:property value="menuid"/>,<s:property value="parentid"/>,'<s:property value="menuname"/>',"url");
            </s:iterator>
         document.write(d);   
     </script>   
  </body>
</html>
