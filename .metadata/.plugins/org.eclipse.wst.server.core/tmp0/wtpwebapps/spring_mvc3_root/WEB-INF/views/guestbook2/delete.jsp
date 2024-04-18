<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삭제하기</title>
<style type="text/css">
	a { text-decoration: none;}
	table{width: 600px; border-collapse:collapse; text-align: center;}
	table,th,td{border: 1px solid black; padding: 3px}
	div{width: 600px; margin:auto; text-align: center;}
</style>
<!-- 제이쿼리 사용하기 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		let pwdchk = "${pwdchk}";
		if (pwdchk == 'fail') {
			alert("비밀번호틀림");
			return;
		}
	})
</script>
<script type="text/javascript">
	function delete_go(f) {
		f.action = "gb2_delete_ok.do";
		f.submit();
	}
</script>

</head>
<body>
<div>
<h2>방명록2 삭제하기</h2>
<hr>
<p>[<a href="gb2_list.do">목록으로 이동</a>]</p>
<form method="post">
	<table>
		<tr align="center">
			<td bgcolor="#99ccff">비밀번호</td>
			<td><input type="password" name="pwd" size="20"></td>
		</tr>
		<tfoot>
		<tr align="center">
			<td colspan="2">
				<input type="hidden" name="idx" value="${vo2.idx}">
				<input type="button" value="삭제" onclick="delete_go(this.form)">
				<input type="reset" value="취소"> 
			</td>
		</tr>
		</tfoot>
	</table>
</form>
</div>2
</body>
</html>