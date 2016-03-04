$(document).ready(function(){

    var result =[];

    $.ajax({
        url: '/getUserSettings',
        dataType : "json",
        async:false,
        success: function (data) {
            result = data;
            $.each( data, function( key, val ) {
                if(val==true){
                   document.getElementById(key).checked = true;
                }

            });
        }
    });

    var checkedBox=[];

    $("ul").hide();
    $("ul li:odd").css("background-color", "#efefef");
    $("h3 span").click(function(){
        $(this).parent().next().slideToggle();
    });

    function checkBoxCheckedReq(){

        $('.questions input:checkbox:checked').each(function(){
            checkedBox.push(this.id);
        });

    };



    $('#save').click(function(){

        //$.each(checkedBox, function( key, val ) {
        //    console.log(key,val);
        //});

        checkBoxCheckedReq();

        $.each( result, function( key0, val0 ) {
            $.each( checkedBox, function( key1, val1 ) {
                if(key0==val1){
                    console.log(key0, val0);
                    val0 = true;
                    console.log(key0, val0);
                }
                else {
                    val0 = false;
                }
            });
        });


        $.each( result, function( key, val ) {
            console.log(key,val);
        });





        $.ajax({
            url: '/setUserSettings',
            dataType : "json",
            type: 'POST',
            crossDomain: true,
            contentType: 'application/json',
            data: result,
            success: function (data) {
                console.log("succes save")
            }
        });

    });

});


