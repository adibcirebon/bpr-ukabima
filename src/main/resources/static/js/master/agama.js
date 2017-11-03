$(document).ready(function () {
    console.log("Jquery is works!");
    $('#myTable').dataTable({
        serverSide: true,
        ajax: {
            url: 'private/api/data',
            data: function (value) {
            }
        }
    });
});