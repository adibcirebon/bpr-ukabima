$(document).ready(function () {
    grid();
});

function grid() {
    $('#listAgama').show();
    if (typeof myTable == 'undefined') {
        myTable = $('#listAgama').dataTable({
            "bPaginate": true,
            "pagingType": "full_numbers",
            "bJQueryUI": false,
            "bProcessing": true,
            "bServerSide": true,
            "bInfo": true,
            "bFilter": false,
            "sAjaxSource": "/private/api/agama/list",
            "aaSorting": [[1, "asc"]],
            "fnServerParams": function (aoData) {
                aoData.push(
                    {name: "nama", value: null}
                );
            },
            "fnServerData": function (sSource, aoData, fnCallback) {
                $.ajax({
                    "dataType": 'json',
                    "type": "GET",
                    "url": sSource,
                    "data": aoData,
                    "success": fnCallback
                });
            },
            "aoColumns": [
                {"mDataProp": "id", "bSortable": false, sClass: "center"},
                {"mDataProp": "nama", "bSortable": true, sDefaultContent: "-"},
                {"mDataProp": "id", "bSortable": false, sClass: "-"}
            ]
        });
    } else {
        myTable.fnClearTable(0);
        myTable.fnDraw();
    }

}