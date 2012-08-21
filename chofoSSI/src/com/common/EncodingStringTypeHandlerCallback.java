package com.common;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.ibatis.sqlmap.client.extensions.ParameterSetter;
import com.ibatis.sqlmap.client.extensions.ResultGetter;
import com.ibatis.sqlmap.client.extensions.TypeHandlerCallback;

public class EncodingStringTypeHandlerCallback implements TypeHandlerCallback {

public Object getResult(ResultGetter arg0) throws SQLException 
{
   //return StringUtils.isoTOGBK(arg0.getString());
   String s = null;
   try 
   {              
	   s = new String((arg0.getString()).getBytes("iso-8859-1"), "GBK");          
   } 
   catch (Exception e) 
   { 
	   
   } 
   return s;
}

public void setParameter(ParameterSetter setter, Object arg1) throws SQLException {
   if(arg1 instanceof String)
   {
	   String s = (String)arg1;
	   try 
	   {              
		   s = new String(s.getBytes("GBK"), "iso-8859-1");          
	   } 
	   catch (Exception e) 
	   { 
		   
	   } 
	   setter.setString(s);
   }
}

public Object valueOf(String arg0) 
{
	   try 
	   {              
		   arg0 = new String(arg0.getBytes("iso-8859-1"), "GBK");          
	   } 
	   catch (Exception e) 
	   { 
		   
	   } 
	   return arg0;
   }
}
