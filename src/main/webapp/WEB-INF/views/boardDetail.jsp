<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/boardDetail.css" rel="stylesheet" />
<title>Insert title here</title>
</head>
<body>
	<div id="blank"></div>
	<div id="blank_5vh"></div>

	<form action="boardWrite">
		<%-- <input type="hidden" name="boardno" value="${boardList.boardno }"> --%>
		<div class="wrap">
			<h4>치즈 일상</h4>
			<hr />
			<div id="reg_btn" class="d-flex justify-content-end">
				<button type="button" class="btn btn-warning mx-1" id="revise">
					수정</button>
				<button type="button" class="btn btn-warning mx-1" id="delete">
					삭제</button>
			</div>
			<h5>${board.id }</h5>
			<p>${board.boardcontent }</p>
			<p id="view">조회 72</p>
			<hr />
			<!-- 상세글 출력 -->
			<h6>댓글</h6>
			<input type="text" id="comment_input" placeholder="내용을 입력해주세요" />
			<div class="d-flex justify-content-end">
				<button type="button" id="register">등록</button>
			</div>
			<hr />
		</div>
		<div id="blank"></div>
	</form>
	<div id="blank"></div>
	<%@ include file="footer.jsp"%>
</body>

</html>