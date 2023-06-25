<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.crm.app.pojo.Ball" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hello</title>
    <link href="/css/styles.css" rel="stylesheet">
</head>
<body>
<div>
    Hello World !!! <br/>
    <% ArrayList<Ball> balls = (ArrayList<Ball>)request.getAttribute("listofballs"); %>
    <table border="1px solid black">
    
    	<tr>
			<th>Ball Id</th>
			<th>Ball Color</th>
			<th>Ball Size</th>
    	
    	</tr>
    	<% for(int index = 0; index < balls.size(); index++){ 
    		Ball ball = balls.get(index);
    	%>
    	 	<tr>
    			<td><%=ball.getBallId()%></td>
    			<td><%=ball.getBallColor()%></td>
    			<td><%=ball.getBallSize()%></td>
    	
    		</tr>
    	<%}%>
    
    </table>
    
    
    
</div>
</body>
</html>