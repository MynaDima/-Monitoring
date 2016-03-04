<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dima
  Date: 2/22/16
  Time: 10:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/user.css"/>">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.3/jquery.min.js" type="text/javascript"></script>
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script type="text/javascript" src="/js/user.js"></script>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/bootstrap.min.css"/>">

    <link href="https://gitcdn.github.io/bootstrap-toggle/2.2.0/css/bootstrap-toggle.min.css" rel="stylesheet">
    <script src="https://gitcdn.github.io/bootstrap-toggle/2.2.0/js/bootstrap-toggle.min.js"></script>

</head>
<body>
<div class="questions">

   <div class="radiusH"><h2>Для більш точного підбору місця потрібно відмітити об'єкти,які будуть враховані під час пошуку</h2></div>

    <div id="auto">
        <div class="box">
            <h3>Авто<span class="expand">+</span></h3>
            <ul>
                <li>СТО і мийка для авто  <input type="checkbox" data-toggle="toggle" id="autoservice"/></li>
                <li>Автостоянка  <input type="checkbox" data-toggle="toggle" id="autoparking"/></li>
            </ul>
        </div>
    </div>

    <div id="education">
        <div class="box">
            <h3>Освіта<span class="expand">+</span></h3>
            <ul>
                <li>Бібліотека  <input type="checkbox" data-toggle="toggle" id="library"/></li>
                <li>Дитячий садок  <input type="checkbox" data-toggle="toggle"  id="playschool"/></li>
                <li>Коледжи  <input type="checkbox" data-toggle="toggle" id="ptu"/></li>
                <li>Спортивні школи  <input type="checkbox" data-toggle="toggle" id="sportschool"/></li>
                <li>Школи, гімназії, ліцеї  <input type="checkbox" data-toggle="toggle" id="school"/></li>
                <li>Школи мистецтв  <input type="checkbox" data-toggle="toggle" id="artschool"/></li>
            </ul>
        </div>
    </div>

    <div id="recreation">
        <div class="box">
            <h3>Відрочинок<span class="expand">+</span></h3>
            <ul>
                <li>Ресторани  <input type="checkbox" data-toggle="toggle"  id="restoraun"/></li>
                <li>Боулінг та більярд  <input type="checkbox" data-toggle="toggle" id="bouling"/></li>
                <li>Нічні клуби  <input type="checkbox" data-toggle="toggle" id="club"/></li>
                <li>Кафе  <input type="checkbox" data-toggle="toggle" id="cafe"/></li>
                <li>Музеї та галереї  <input type="checkbox" data-toggle="toggle" id="musiem"/></li>
                <li>Кінотеатри  <input type="checkbox" data-toggle="toggle" id="cinema"/></li>
                <li>Театри  <input type="checkbox" data-toggle="toggle" id="thieter"/></li>
                <li>Парки відпочинку  <input type="checkbox" data-toggle="toggle" id="parks"/></li>
            </ul>
        </div>
    </div>

    <div id="shops">
        <div class="box">
            <h3>Покупки<span class="expand">+</span></h3>
            <ul>
                <li>Базари  <input type="checkbox" data-toggle="toggle" id="market"/></li>
                <li>Супермаркети  <input type="checkbox" data-toggle="toggle" id="superMarket"/></li>
                <li>Дитячі магазини  <input type="checkbox" data-toggle="toggle" id="childrenshop"/></li>
                <li>Торгові центри  <input type="checkbox" data-toggle="toggle" id="shopcenter"/></li>
            </ul>
        </div>
    </div>


    <div id="sport">
        <div class="box">
            <h3>Спорт, здоров'я та краса<span class="expand">+</span></h3>
            <ul>
                <li>Басейни  <input type="checkbox" data-toggle="toggle" id="swimmingpool"/></li>
                <li>Тренажерні та фітнес зали  <input type="checkbox" data-toggle="toggle" id="gum"/></li>
                <li>Танцювальні студії  <input type="checkbox" data-toggle="toggle" id="dancingstudio"/></li>
                <li>Перукарня  <input type="checkbox" data-toggle="toggle" id="head"/></li>
                <li>Салони краси  <input type="checkbox" data-toggle="toggle" id="beautysaloon"/></li>
                <li>Бювети з чистою водою  <input type="checkbox" data-toggle="toggle" id="well"/></li>
            </ul>
        </div>
    </div>

    <div class="save">
       <button id="save" class="btn-success">Save</button>
    </div>

    <div class="quick-links tk-source-sans-pro">

        <a href="/">Home</a>

    </div>

</div>
</body>
</html>
