
$(function () {

    // $(document).ajaxStart(function() {
    //     $("#loader").show();
    // }).ajaxStop(function() {
    //     $("#loader").hide();
    // });

    $("#loader").hide();
    $("#submit").click(function (e) {
        $("#loader").hide();
        $.ajax({
            url : 'addBook',
            type : 'GET',
            data : {
                bookTittle : $('#bookTittle').val(),
                isbn : $('#isbn').val()
            },
            success : function (data) {

               //  let bookTittle = $("<td>").text(data.bookTittle);
               //  let isbn = $("<td>").text(data.isbn);
               // let row =  $("<tr>").append(bookTittle, isbn);
               // $("#bookTable").append(row);

                // for(Book of data){
                //      let bookTittle = $("<td>").text(bo.bookTittle);
                //      let isbn = $("<td>").text(data.isbn);
                //     let row =  $("<tr>").append(bookTittle, isbn);
                //     $("#bookTable").append(row);
                // }


            },
            error : function (xhr ,status ,exception ) {
                console.log('Error happened');
            },
            complete : function () {
                $("#loader").hide();
            }
        });
    });
});