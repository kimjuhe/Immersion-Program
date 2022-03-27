<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="room.RoomManager" %>
<%@ page import="java.io.PrintWriter" %>
<jsp:useBean id="user" class="user.User" scope="page" /> 
<jsp:setProperty name="user" property="userID" /> 
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type"
	    	content="text/html; charset=UTF-8">
	    	<title>confirming...</title>
	</head>
	<body>
   	 	<%
    		RoomManager rmanager = new RoomManager();
		String userID = (String)session.getAttribute("userID");
		String roomName = request.getParameter("roomname");
		int result = -2;
		if ( userID != null && roomName != null) {
			out.println(user);
			result = rmanager.makeRoom(userID, roomName);
		}
		if (result == 1) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("location.href = 'index.jsp'");
			script.println("</script>");
		} else if( result==-1){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('DB오류')");
			script.println("history.back()");
			script.println("</script>");
		} else if (result == 0) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('파일 생성 오류')");
			script.println("history.back()");
			script.println("</script>");
		} else if (result == -2) {
			PrintWriter script = response.getWriter();
                        script.println("<script>");
                        script.println("alert('디렉터리 생성 오류')");
                        script.println("history.back()");
                        script.println("</script>");
		}
		%>
	</body>
</html>

