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


$( ".map").on( "click", function( event ) {
  $(".content-box").load("/view/map.jsp");
    load = true;

  col = $('.map').css('background-color');
  $("body").css("background-color", col);
 });


    $( ".faq").on( "click", function( event ) {
        $(".content-box").load("/view/faq.jsp");
        load = true;

        col = $('.faq').css('background-color');
        $("body").css("background-color", col);
    });





    //if(load=true){
    //    $('.colour_link').animate({
    //        left: "-=38%",
    //    }, 1000);
    //};

});