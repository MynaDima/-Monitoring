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


    var addressLat = [];

    var addressLng = [];

    var addressName = [];

    var number = [];

    var removeMarkers = [];

    var type;

    var DATA = [];


    function ajax(url,addressLat,addressLng,addressName,number,type,image,map,index){
        $.ajax({
            url: url,
            dataType : "json",
            success: function (data) {
                $.each( data, function( key, val ) {
                    DATA.push(val.lat, val.lng, val.address,val.number, val.type);
                    addressLat.push(val.lat);
                    addressLng.push(val.lng);
                    addressName.push(val.address);
                    number.push(val.number);
                    type = val.type;
                    console.log("success");

                });
                checkBoxes(map, image,index);
            }
        });
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



        var c = document.querySelector('#autoStationCheckBox');
        c.onclick = function() {
            var image = {
                url: '/image/autoParking.png',
            };

            if (c.checked) {
                var index = 1;
                ajax('/autoParking',addressLat,addressLng,addressName,number,type,image,map,index);
                addressLat.length = 0;
                addressLng.length = 0;
                addressName.length = 0;
                number.length = 0;
            } else {
                remove(1);
            }
        }


       var d = document.querySelector('#fuelStationCheckBox');
       d.onclick = function() {
           var image = {
               url: '/image/fuel.jpg',
           };
           if (d.checked) {
               var index = 2;
               ajax('/fuelStation',addressLat,addressLng,addressName,number,type,image,map,index);
               addressLat.length = 0;
               addressLng.length = 0;
               addressName.length = 0;
               number.length = 0;
           } else {
               remove(2);
           }
       }
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
            } else {
                alert('Geocode was not successful for the following reason: ' + status);
            }
        });
    }


    function checkBoxes(resultsMap, image, statusId) {
        console.log("checked");
        for(var i=0; i<addressName.length; i++){
            var contentString = '<div id="content">'+
                '<div id="siteNotice">'+
                '</div>'+addressName[i].toString()+
                number[i].toString()+
                '</div>'+
                '</div>';
            var infoWindow = new google.maps.InfoWindow({ content: contentString });
            console.log(addressLat[i], addressLng[i]);
            var marker = new google.maps.Marker({
                map: resultsMap,
                position: {lat:parseFloat(addressLat[i]), lng:parseFloat(addressLng[i])},
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
        }
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



