<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="/WEB-INF/views/kjh/main/header.jsp" %>

<head>
<script>
 function check(){
	 if($.trim($("#u_id").val())==""){
		 alert("로그인 아이디를 입력하세요!");
		 $("#u_id").val("").focus();
		 return false;
	 }
	 if($.trim($("#u_pwd").val())==""){
		 alert("비밀번호를 입력하세요!");
		 $("#u_pwd").val("").focus();
		 return false;
	 }
 }
 
 /*비번찾기 공지창*/
 function pwd_find(){
	 window.open("","비번찾기","width=450,height=500");
	 //자바 스크립트에서 window객체의 open("공지창경로와 파일명","공지창이름","공지창속성")
	 //메서드로 새로운 공지창을 만듬.폭이 400,높이가 400인 새로운 공지창을 만듬.단위는 픽셀
 }
</script>
</head>
<br><br><br><br><br>
<div id="login_wrap">
	<h2 class="login_title">로그인</h2>
	<form method="post" action=""
		onsubmit="return check()">
		<table id="login_table">

			<div class="mb-3 row">
				<label for="u_id" class="col-sm-2 col-form-label">아이디</label>
				<div class="col-sm-5">
					<input type="text" class="form-control" id="u_id" name="u_id">
				</div>
			</div>
			<div class="mb-3 row">
				<label for="u_pwd" class="col-sm-2 col-form-label">비밀번호</label>
				<div class="col-sm-5">
					<input type="password" class="form-control" id="u_pwd" name="u_pwd">
				</div>
			</div>
		</table>
		<div id="login_menu">
			<input type="submit" value="로그인" class="input_button" />
		</div>
	</form>
</div>

<br>
<tr>
	<td>아직 회원이 아니신가요?</td>
	<td><input type="button" value="회원가입" class="input_button"
		onclick="location.href='JOIN'" /></td>
<tr>
	<br>
	<br>
	<td>비밀번호가 기억이 안나나요?</td>
	<input type="button" value="비번찾기" class="input_button"
		onclick="pwd_find()" />
<br><br><br><br><br>
		
		
<%@ include file="/WEB-INF/views/kjh/main/footer.jsp" %>