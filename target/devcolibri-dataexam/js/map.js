/**
 * Created by dima on 1/12/16.
 */

$( document ).ready(function() {

    function initMap() {
        var map = new google.maps.Map(document.getElementById('map'), {
            zoom: 12,
            center: {lat: 50.4501, lng: 30.5234}
        });
        var geocoder = new google.maps.Geocoder();

        document.getElementById('submit').addEventListener('click', function() {
            geocodeAddressSearch(geocoder, map);
        });

        if(document.getElementById("autoStationCheckBox").checked = true){
            geocodeAddressCheckBox(geocoder,map);
        }else{
            console.log("else");
        }
    }

    function geocodeAddressSearch(geocoder, resultsMap) {
        var address = document.getElementById('address').value;
        geocoder.geocode({'address': address}, function(results, status) {
            if (status === google.maps.GeocoderStatus.OK) {
                resultsMap.setCenter(results[0].geometry.location);
                var marker = new google.maps.Marker({
                    map: resultsMap,
                    position: results[0].geometry.location,
                    animation: google.maps.Animation.DROP
                });
            } else {
                alert('Geocode was not successful for the following reason: ' + status);
            }
        });
    }

    function geocodeAddressCheckBox(geocoder, resultsMap) {
        geocoder.geocode({'address': addressT}, function(results, status) {
            if (status === google.maps.GeocoderStatus.OK) {
                resultsMap.setCenter(results[0].geometry.location);
                var marker = new google.maps.Marker({
                    map: resultsMap,
                    position: results[0].geometry.location,
                    animation: google.maps.Animation.DROP
                });
            } else {
                alert('Geocode was not successful for the following reason: ' + status);
            }
        });
    }


    
    var addressT;
    var number;

    $.ajax({
        url: '/auto',
        dataType : "json",
        success: function (data, textStatus) {
            var obj = data;
            $.each(obj, function (key, value) {
                addressT = value.address;
                number = value.number;
                console.log(addressT);
                console.log(number);
            });
        }
    });

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

});
