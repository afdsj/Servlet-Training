<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>도이미네 떡볶이</title>
</head>
<body>
  <h1>떡볶이 주문 받는 웹 키오스크</h1>
  <form action="tteokbokki" method="post">
    <label>사용자 이름</label><input type="text" name="name">
    <br/>
    <label>종류</label>
    <input type="radio" name="kind" id="kind1" value="일반 떡볶이"><label for="kind1">일반 떡볶이</label>
    <input type="radio" name="kind" id="kind2" value="로제 떡볶이"><label for="kind2">로제 떡볶이</label>
    <input type="radio" name="kind" id="kind3" value="짜장 떡볶이"><label for="kind3">짜장 떡볶이</label>
    <br/>
    <label>맵기</label>
    <input type="radio" name="spicy" id="spicy1" value="일반"><label for="spicy1">일반</label>
    <input type="radio" name="spicy" id="spicy2" value="중간"><label for="spicy2">중간</label>
    <input type="radio" name="spicy" id="spicy3" value="매움"><label for="spicy3">매움</label>
    <br/>
    <label>토핑종류</label>
    <input type="radio" name="topping" id="topping1" value="중국당면"><label for="topping1">중국당면</label>
    <input type="radio" name="topping" id="topping2" value="바싹치즈만두"><label for="topping2">바싹치즈만두</label>
    <input type="radio" name="topping" id="topping3" value="김말이"><label for="topping3">김말이</label>
    <input type="radio" name="topping" id="topping4" value="주먹밥"><label for="topping4">주먹밥</label>
    <br/>
    <input type="submit" value="확인">
  </form>
  <a href="kyochon">치킨 주문</a>
</body>
</html>