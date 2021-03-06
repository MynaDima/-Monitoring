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
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyD0STQBkTqhfX0sv1By1wW-Rz7wtly_2xQ&callback=initMap"
        async defer></script>

<%--"https://maps.googleapis.com/maps/api/js?key=AIzaSyD0STQBkTqhfX0sv1By1wW-Rz7wtly_2xQ&callback=initMap"--%>

<%--AIzaSyDIakV4lN2i8qnRdV4rAGcm0DBKg2as1NQ !!!!!home--%>



<div id="site-wrapper">
    <nav class="menu" role="navigation">
        <div id="menu-content">
        <nav class="navbar navbar-inverse">
            <ul class="nav navbar-nav btn-group">
                <li data-target="auto-container"><a id="auto" href="#">AUTO</a></li>
                <li data-target="education-container" id="education"><a href="#">EDUCATION</a></li>
                <li data-target="medicine-container" id="medicine"><a href="#">MEDICINE</a></li>
                <li data-target="recreation-container" id="recreation"><a href="#">RECREATION</a></li>
                <li data-target="shop-container" id="shop"><a href="#">SHOP</a></li>
                <li data-target="sport-container" id="sport"><a href="#">SPORT</a></li>
                <li data-target="well-container" id="well"><a href="#">WELL</a></li>
                <div class="col-lg-6">
                    <div class="input-group">
                        <input type="text" class="form-control" id = "address" placeholder="Search for...">
                            <span class="input-group-btn">
                                <button class="btn btn-default"  href = "/monitorCoordinates" id = "submit" type="button">Go!</button>
                            </span>
                    </div>
                    <button id="clearAll" class="btn btn-danger" type="button">Clear all</button>
                </div>
            </ul>
        </nav>
        </div>

        <div  id="auto-container" class="contain" >
            <label>Parking<input type="checkbox"  id="autoStationCheckBox"></label>
            <label>FuelStation<input type="checkbox" id="fuelStationCheckBox"></label>
            <label>AutoService<input type="checkbox" id="autoServiceCheckBox"></label>
        </div>

        <div class="contain" id="medicine-container" >
            <label>Pharmacy<input type="checkbox"  id="pharmacyCheckBox"></label>
            <label>Hospital<input type="checkbox" id="hospitalCheckBox"></label>
            <label>Tooth-Hospital<input type="checkbox" id="toothHospitalCheckBox"></label>
            <label>Maternity-Hospital<input type="checkbox" id="maternityHospitalCheckBox"></label>
        </div>

        <div class="contain" id="education-container" >
            <label>Library<input type="checkbox" id="libraryCheckBox"></label>
            <label>Boarding school<input type="checkbox" id="boardingSchoolCheckBox"></label>
            <label>Play school<input type="checkbox" id="playSchoolCheckBox"></label>
            <label>Art school<input type="checkbox" id="artSchoolCheckBox"></label>
            <label>Specialization school<input type="checkbox" id="schoolCheckBox"></label>
            <label>PTU<input type="checkbox" id="collegeCheckBox"></label>
            <label>High school<input type="checkbox" id="highSchoolCheckBox"></label>
            <label>Sport school<input type="checkbox" id="sportSchoolCheckBox"></label>
        </div>

        <div  id="recreation-container" class="contain" >
            <label>Cafe<input type="checkbox" id="cafeCheckBox"></label>
            <label>Restaurant<input type="checkbox" id="restaurantCheckBox"></label>
            <label>Club<input type="checkbox" id="clubCheckBox"></label>
            <label>Bouling-Biliard<input type="checkbox" id="boulingBiliardCheckBox"></label>
            <label>Museum and Art Galery<input type="checkbox" id="artCheckBox"></label>
            <label>Parks<input type="checkbox" id="parkCheckBox"></label>
        </div>

        <div  id="sport-container" class="contain" >
            <label>Beauty Saloon<input type="checkbox" id="beautyCheckBox"></label>
            <label>Swimming pool<input type="checkbox" id="swimmingPoolCheckBox"></label>
            <label>Dancing studio<input type="checkbox" id="dancingCheckBox"></label>
            <label>Gum and Fitness<input type="checkbox" id="gumFitnessCheckBox"></label>
            <label>Hairdressing<input type="checkbox" id="hairdressingCheckBox"></label>
        </div>

        <div  id="shop-container" class="contain" >
            <label>Furniture<input type="checkbox" id="furnitureCheckBox"></label>
            <label>Clothing & Shoes<input type="checkbox" id="clothingCheckBox"></label>
            <label>Supermarkets<input type="checkbox" id="supermarketsCheckBox"></label>
            <label>Products for children<input type="checkbox" id="childrenProductCheckBox"></label>
            <label>Shopping centers<input type="checkbox" id="shoppingCentersCheckBox"></label>
        </div>

        <div id="menuContent">

        </div>
    </nav>
    <a href="#" class="nav-toggle"><span class="fa fa-bars"></span></a>
        <div class="home-n">
            <a href="/" ><img src="/image/main-logo.png" alt="Go home" width="60" height="20"></a>
        </div>
</div>
</body>
</html>
