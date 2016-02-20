/**
 * Created by dima on 1/12/16.
 */

$( document ).ready(function() {

    var wrapper    = $("#site-wrapper"),
        menu       = $(".menu"),
        menuLinks  = $(".menu ul li a"),
        toggle     = $(".nav-toggle"),
        toggleIcon = $(".nav-toggle span");

    function toggleThatNav() {
        if (menu.hasClass("show-nav")) {
            if (!Modernizr.csstransforms) {
                menu.removeClass("show-nav");
                toggle.removeClass("show-nav");
                menu.animate({
                    right: "-=300"
                }, 500);
                toggle.animate({
                    right: "-=300"
                }, 500);
            } else {
                menu.removeClass("show-nav");
                toggle.removeClass("show-nav");
            }

        } else {
            if (!Modernizr.csstransforms) {
                menu.addClass("show-nav");
                toggle.addClass("show-nav");
                menu.css("right", "0px");
                toggle.css("right", "330px");
            } else {
                menu.addClass("show-nav");
                toggle.addClass("show-nav");
            }
        }
    }

    function changeToggleClass() {
        toggleIcon.toggleClass("fa-times");
        toggleIcon.toggleClass("fa-bars");
    }

    $(function() {
        toggle.on("click", function(e) {
            e.stopPropagation();
            e.preventDefault();
            toggleThatNav();
            changeToggleClass();
        });

        // Keyboard Esc event support
        $(document).keyup(function(e) {
            if (e.keyCode == 27) {
                if (menu.hasClass("show-nav")) {
                    if (!Modernizr.csstransforms) {
                        menu.removeClass("show-nav");
                        toggle.removeClass("show-nav");
                        menu.css("right", "-300px");
                        toggle.css("right", "30px");
                        changeToggleClass();
                    } else {
                        menu.removeClass("show-nav");
                        toggle.removeClass("show-nav");
                        changeToggleClass();
                    }
                }
            }
        });
    });


    var removeMarkers = [];

    var dataValues = [];

    var resultSearch = [];


    function ajax(url,DATA,image,map,index){
        $.ajax({
            url: url,
            dataType : "json",
            success: function (data) {
                $.each( data, function( key, val ) {
                    DATA.push({"lat": val.lat, "lng": val.lng, "address": val.address, "number": val.number,"type": val.type});
                    console.log("success");
                });
                checkBoxes(map, image,index);
            }
        });
    }

    function checkBoxClick(map,id, urlImage,url,removeIndex){
        var c = document.querySelector(id);
        c.onclick = function() {
            var image = {
                url: urlImage ,
            };

            if (c.checked) {
                ajax(url,dataValues,image,map,removeIndex);
                dataValues.length = 0;
            } else {
                remove(removeIndex);
            }
        }
    }

   window.initMap = function(){

        var map = new google.maps.Map(document.getElementById('map'), {
            zoom: 12,
            center: {lat: 50.4501, lng: 30.5234}
        });
        var geocoder = new google.maps.Geocoder();

        document.getElementById('submit').addEventListener('click', function() {
            addressSearch(geocoder,map);
        });

        //auto
        checkBoxClick(map,'#autoStationCheckBox','/image/auto/autoParking.png','/autoParking',1);
        checkBoxClick(map,'#fuelStationCheckBox', '/image/auto/fuel.jpg', '/fuelStation',2);
        checkBoxClick(map,'#autoServiceCheckBox', '/image/auto/carService.png', '/serviceStation',3);

       //education
        checkBoxClick(map,'#libraryCheckBox', '/image/education/library.png', '/library',4);
        checkBoxClick(map,'#boardingSchoolCheckBox', '/image/education/boarding-school.jpg', '/boardingSchool',5);
        checkBoxClick(map,'#highSchoolCheckBox', '/image/education/high-school.png', '/highSchool',6);
        checkBoxClick(map,'#playSchoolCheckBox', '/image/education/play-school.png', '/playSchool',7);
        checkBoxClick(map,'#collegeCheckBox', '/image/education/ptu.jpg', '/ptu',8);
        checkBoxClick(map,'#sportSchoolCheckBox', '/image/education/sport-school.png', '/sportSchool',9);
        checkBoxClick(map,'#schoolCheckBox', '/image/education/school.jpg', '/school',10);
        checkBoxClick(map,'#artSchoolCheckBox', '/image/education/art-school.png', '/artschool',11);

       //medicine

    }

    function sendCoordinates(){

    }


    function addressSearch(geocoder, resultsMap) {
        var address = document.getElementById('address').value;
        geocoder.geocode({'address': address}, function(results, status) {
            if (status === google.maps.GeocoderStatus.OK) {
                resultsMap.setCenter(results[0].geometry.location);
                var marker = new google.maps.Marker({
                    map: resultsMap,
                    position: results[0].geometry.location,
                    animation: google.maps.Animation.DROP
                });
                $.ajax({
                    type: 'POST',
                    dataType: 'json',
                    contentType: 'application/json',
                    url: '/monitorCoordinates',
                    data: JSON.stringify(results[0].geometry.location.toJSON()),
                    success: function(result) {
                        console.log("success");
                        console.log(result);
                    }
                });
                console.log(results[0].geometry.location.toJSON());

            } else {
                alert('Geocode was not successful for the following reason: ' + status);
            }
        });
    }



    function checkBoxes(resultsMap, image, statusId) {
        console.log("checked");
        $.each( dataValues, function( key, val ) {
            var contentString = '<div id="content">'+
                '<div id="siteNotice">'+
                '</div>'+val.address+
                val.number+
                '</div>'+
                '</div>';
            var infoWindow = new google.maps.InfoWindow({ content: contentString });
            //console.log(val.lat, val.lng);
            var marker = new google.maps.Marker({
                map: resultsMap,
                position: {lat:parseFloat(val.lat), lng:parseFloat(val.lng)},
                animation: google.maps.Animation.DROP,
                title: "Information about place",
                info:  contentString,
                icon: image
            });

            google.maps.event.addListener( marker, 'click', function() {
                infoWindow.setContent( this.info );
                infoWindow.open( resultsMap, this );
            });
            removeMarkers.push( {"markerName" : marker, "statusId" : statusId });
        })
    }


    function remove(idvalue){
        $.each( removeMarkers, function( key, val ) {
            if (val.statusId == idvalue) {
                val.markerName.setMap(null);
            }
        });
    }

    //load content in menu-nav
    function loadContent(urlToLoad, container) {
        $.ajax({
            url: urlToLoad,
            cache: false,
            beforeSend: function() { $(container).html('<div class="loader">Loading...</div>'); },
            success: function(html) { $(container).hide(); $(container).html(html); $(container).show('slow'); }
        });
    }

    $("#auto").click(function() {
      loadContent("/auto","#menuContent")
    });


    //hide - show checkbox
    $(document).ready(function() {
        $('.contain').hide();
        $('.btn-group li').click(function(){
            var target = "#" + $(this).data("target");
            console.log(target);
            $(".contain").not(target).hide();
            $(target).show();
        });
    });


});



