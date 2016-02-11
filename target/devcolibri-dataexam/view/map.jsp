<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<%--
  Created by IntelliJ IDEA.
  User: dima
  Date: 1/12/16
  Time: 9:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="//code.jquery.com/jquery-1.12.0.min.js"></script>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
    <title>Map</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/map.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/bootstrap.min.css"/>">

    <script src="//cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js"></script>
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
    <script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="/js/map.js"></script>
</head>
<body>
<div id="map"></div>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCVUE15kTd5xGvciLtyoXTctuCt64EiDSA&callback=initMap"
        async defer></script>

<div id="site-wrapper">
    <nav class="menu" role="navigation">
        <div id="menu-content">
        <nav class="navbar navbar-inverse">
            <ul class="nav navbar-nav ">
                <li><a href="#">AUTO</a></li>
                <li><a href="#">EDUCATION</a></li>
                <li><a href="#">MEDICINE</a></li>
                <li><a href="#">RECREATION</a></li>
                <li><a href="#">SHOP</a></li>
                <li><a href="#">SPORT</a></li>
                <li><a href="#">WELL</a></li>
                <div class="col-lg-6">
                    <div class="input-group">
                        <input type="text" class="form-control" id = "address" placeholder="Search for...">
                            <span class="input-group-btn">
                                <button class="btn btn-default" id = "submit" type="button">Go!</button>
                            </span>
                    </div>
                </div>
            </ul>
        </nav>
        </div>
        <div id="floating-panel">
            <label>Parking<input type="checkbox" id="autoStationCheckBox"></label>
            <label>FuelStation<input type="checkbox" id="fuelStationCheckBox"></label>
            <label>AutoService<input type="checkbox" id="autoServiceCheckBox"></label>
            <label>School<input type="checkbox" id="schoolCheckBox"></label>
        </div>
    </nav>
    <a href="#" class="nav-toggle"><span class="fa fa-bars"></span></a>
        <div class="home-n">
            <a href="/" ><img src="/image/main-logo.png" alt="Go home" width="60" height="20"></a>
        </div>
</div>
</body>
</html>
