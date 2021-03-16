<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/views/kjh/main/header.jsp"%>
<head>
<script>
</script>
</head>
<body>
	<br><br><b>회원정보</b><br><br>

	<b>기본정보</b><br><br>

	<form  method="post" action="joinAction">
		<table id=basic-info border="1">
			<div class="mb-3 row">
				<label for="u_id" class="col-sm-2 col-form-label">아이디</label>
				<div class="col-sm-5">
					<input type="text" class="form-control" id="u_id" name="u_id"  maxlength="20">
				</div>
			</div>
			<div class="mb-3 row">
				<label for="u_pwd" class="col-sm-2 col-form-label">비밀번호</label>
				<div class="col-sm-5">
					<input type="password" class="form-control" id="u_pwd" name="u_pwd" maxlength="15">
				</div>
			</div>
			<div class="mb-3 row">
				<label for="u_pwd" class="col-sm-2 col-form-label">비밀번호 확인</label>
				<div class="col-sm-5">
					<input type="password" class="form-control" id="u_pwd" name="u_pwd" maxlength="15">
				</div>
			</div>
			<div class="mb-3 row">
				<label for="u_name" class="col-sm-2 col-form-label">이름</label>
				<div class="col-sm-5">
					<input type="text" class="form-control" id="u_name" name="u_name" maxlength="20">
				</div>
			</div>
			<div class="mb-3 row">
				<label for="u_email" class="col-sm-2 col-form-label">이메일</label>
				<div class="col-sm-5">
					<input type="text" class="form-control" id="u_email" name="u_email" maxlength="40">				
				</div>
			</div>
			
			<div class="mb-3 row">
				<label for="u_tel" class="col-sm-2 col-form-label">전화번호</label>
				<div class="col-sm-5">
					<input type="text" class="form-control" id="u_tel" name="u_tel" maxlength="20">
				</div>
			</div>
			
			<div class="mb-3 row">
				<label for="u_address" class="col-sm-2 col-form-label">주소</label>
				<div class="col-sm-5">
					<input type="text" class="form-control" id="u_address" name="u_address" maxlength="40">
				</div>
			</div>
		</table> <br><br>
		<b>추가정보</b> <br><br>
		
		<table id=basic-info border="1">
			<div class="mb-3 row">
				<label for="u_birth_yy" class="col-sm-2 col-form-label">생일</label>
				<div class="col-sm-5">
					<input type="text" class="form-control" id="u_birth_yy" name="u_birth_yy" maxlength="40">
				</div>
			</div>
			<div class="mb-3 row">
				<label for="u_birth_yy" class="col-sm-2 col-form-label">결혼기념일</label>
				<div class="col-sm-5">
					<input type="text" class="form-control" id="u_wedding" name="u_wedding" maxlength="40">
				</div>
			</div>
			<div class="mb-3 row">
				<label for="u_birth_yy" class="col-sm-2 col-form-label">배우자생일</label>
				<div class="col-sm-5">
					<input type="text" class="form-control" id="u_p_birth" name="u_p_birth" maxlength="40">
				</div>
			</div>

		</table>
		<br>
		<br>
		<b>전체 동의</b><br>
		<br> <br> <input type="submit" value="가입" id="testBt"/> 
		<input type="button" value="취소" >

	</form>

	<%@ include file="/WEB-INF/views/kjh/main/footer.jsp"%>