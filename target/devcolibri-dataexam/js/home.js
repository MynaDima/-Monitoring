$( document ).ready(function() {
    console.log( "ready!" );

    var load = false;

$( ".colours").one( "click", function( event ) {

  $('.home-block').animate({
        left: "-=100%",
      }, 1000 );
 $('.colours').animate({
        left: "-=45%",
      }, 1000 );
$('.circle').animate({
        left: "-=100%",
      }, 1000 );
 });


$( ".map").one( "click", function( event ) {
  $(".content-box").load("/view/map.jsp");
    load = true;

  col = $('.map').css('background-color');
  $("body").css("background-color", col);
 });

    //docker
    var easing_type = 'easeOutBounce';
    var default_dock_height = '40';
    var expanded_dock_height = $('#dock').height();
    var body_height = $(window).height() - default_dock_height;
    $('#fake-body').height(body_height);
    $('#dock').css({'height': default_dock_height, 'position':'absolute', 'top': body_height});
    $(window).resize(function () {
        updated_height = $(window).height() - default_dock_height;
        $('#fake-body').height(updated_height);
        $('#dock').css({'top': updated_height});
    });
    $('#dock').mouseover(function () {
        expanded_height = $(window).height() - expanded_dock_height;
        $(this).animate({'height':expanded_dock_height,'top': expanded_height},{queue:false, duration:800, easing: easing_type});
    }).mouseout(function () {
        body_height = $(window).height() - default_dock_height;
        $(this).animate({'height':default_dock_height,'top': body_height},{queue:false, duration:800, easing: easing_type});
    });



    //if(load=true){
    //    $('.colour_link').animate({
    //        left: "-=38%",
    //    }, 1000);
    //};

});