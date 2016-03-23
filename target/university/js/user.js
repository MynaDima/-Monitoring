$(document).ready(function(){

    var result;

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



    $("ul").hide();
    $("ul li:odd").css("background-color", "#efefef");
    $("h3 span").click(function(){
        $(this).parent().next().slideToggle();
    });

    var allChecked = [];

    var checkedBox=[];


    function checkBoxCheckedReq(){

        var allCheckboxes = $(".questions input:checkbox:enabled");


        $('.questions input:checkbox:checked').each(function(){
            checkedBox.push(this.id);
        });

        $.each( allCheckboxes, function( key0, val0 ) {
            allChecked.push(this.id);
        });

        $.each( allChecked, function( key0, val0 ) {
            $.each( checkedBox, function( key1, val1 ) {
                if(val0==val1){
                    delete allChecked[key0];
                }
            });
        });

    };

    $('#save').click(function(){

        checkBoxCheckedReq();


        $.each( result, function( key0, val0 ) {
            $.each( checkedBox, function( key1, val1 ) {
                if(key0==val1){
                   result[key0]= true;
                }
            });
        });

        $.each( result, function( key0, val0 ) {
            $.each(allChecked, function( key1, val1 ) {

                if(key0==val1){
                    result[key0]= false;
                }
            });
        });


        $.ajax({
            url: '/setUserSettings',
            dataType : "json",
            type: 'POST',
            crossDomain: true,
            contentType: 'application/json',
            data: JSON.stringify(result),
            success: function (data) {
                console.log("succes save")
            }
        });

        checkedBox.length = 0;
        allChecked.length = 0;

    });

});


