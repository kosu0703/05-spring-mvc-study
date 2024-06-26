<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카카오 지도 두번째 연습(내위치)</title>
<script type="text/javascript" 
		src="//dapi.kakao.com/v2/maps/sdk.js?appkey=d514432bb9f7ee5d4a28d62d4ccba6b8">
</script>
<script type="text/javascript">
	//	현재위치의 위도(latitude)와 경도(longitude) 구하기
	//	navigator.geolocation.getCurrentPosition();
	navigator.geolocation.getCurrentPosition(function(position) {
		let lat = position.coords.latitude;
		let lng = position.coords.longitude;
		//	함수 호출
		geo_map(lat, lng);
	});	
</script>
</head>
<body>

	<!-- 지도를 표시할 div 입니다 -->
	<div id="map" style="width:100%;height:350px;"></div>
	
	<script>
		//	함수로 만들어주고 호출하자
		function geo_map(lat, lng) {
			var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
			    mapOption = { 
			        center: new kakao.maps.LatLng(lat, lng), // 지도의 중심좌표(위도, 경도)
			        level: 3 // 지도의 확대 레벨
			    };
			
			// 지도를 표시할 div와  지도 옵션으로  지도를 생성합니다
			var map = new kakao.maps.Map(mapContainer, mapOption); 
		}
	</script>
	
</body>
</html>