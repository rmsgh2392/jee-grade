<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적관리 시스템(1학년)</title>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.4.1.min.js"></script>
</head>
<body>
<h1>성적관리 시스템</h1>
<form id="grade_form" action="<%=request.getContextPath()%>/grade.do">
	주민번호<input type="text" name="ssn"/><br/>
	이름<input type="text" name="name"/><br/>
	국어<input type="text" name="kor"/><br/>
	영어<input type="text" name="eng"/><br/>
	수학<input type="text" name="math"/><br/>
	사회<input type="text" name="soceity"/><br/>
	<input type="submit" value="전송"/>
</form>

<script>
$('#grade_form'),submit(function(){
	alert('설정테스트 완료 ');
});
</script>

</body>
</html>